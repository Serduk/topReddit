package com.sserdiuk.topreddit.data

import androidx.annotation.MainThread
import androidx.annotation.WorkerThread
import com.sserdiuk.topreddit.data.local.entity.PostEntity
import com.sserdiuk.topreddit.data.remote.model.RedditApiResponse
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

abstract class NetworkBoundResource<ResultType, RequestType> @MainThread
protected constructor() {
    private val asObservable: Single<Resource<ResultType>>

    init {
        val source: Single<Resource<ResultType>>
        if (shouldFetch()) {
            source = createCall()
                .subscribeOn(Schedulers.io())
                .doOnSuccess { saveCallResult(processResponse(it)!!) }
                .flatMap {
                    loadFromDb()
                        .map {
                            Resource.success(it)
                        }
                }
                .doOnError {
                    onFetchFailed()
                }
                .onErrorResumeNext { t: Throwable ->
                    loadFromDb().map {
                        Resource.error<ResultType>(t.message!!)
                    }
                }
                .observeOn(AndroidSchedulers.mainThread())
        } else {
            source = loadFromDb()
                .map { Resource.success(it) }
        }

        asObservable = Single.concat(
            loadFromDb()
                .map { Resource.loading(it) },
            source
        ).firstOrError()
    }

    fun getAsSingle(): Single<Resource<ResultType>> {
        return asObservable
    }

    private fun onFetchFailed() {}

    @WorkerThread
    protected fun processResponse(response: Resource<RequestType>): RequestType? {
        return response.data
    }

    @WorkerThread
    protected abstract fun saveCallResult(item: RequestType)

    @MainThread
    protected abstract fun shouldFetch(): Boolean

    @MainThread
    protected abstract fun loadFromDb(): Single<ResultType>

    @MainThread
    protected abstract fun createCall(): Single<Resource<RequestType>>
}