package com.sserdiuk.topreddit.data

import com.sserdiuk.topreddit.data.Status.ERROR
import com.sserdiuk.topreddit.data.Status.SUCCESS
import com.sserdiuk.topreddit.data.Status.LOADING

class Resource<T> private constructor(val status: Status, val data: T?, val message: String?) {

    val isSuccess: Boolean
        get() = status === SUCCESS && data != null

    val isLoading: Boolean
        get() = status === LOADING

    val isLoaded: Boolean
        get() = status !== LOADING

    companion object {

        fun <T> success(data: T): Resource<T> {
            return Resource(SUCCESS, data, null)
        }

        fun <T> error(msg: String): Resource<T> {
            return Resource(ERROR, null, msg)
        }

        fun <T> loading(data: T?): Resource<T> {
            return Resource(LOADING, data, null)
        }
    }
}