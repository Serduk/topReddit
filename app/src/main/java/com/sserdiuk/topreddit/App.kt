package com.sserdiuk.topreddit

import android.app.Application
import android.content.Context
import android.widget.Toast

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
    }

    companion object {
        lateinit var appContext: Context
            private set

        private var toast: Toast? = null
        fun showToast(
            context: Context = appContext,
            message: String,
            duration: Int = Toast.LENGTH_LONG
        ) {
            toast?.cancel()
            toast = Toast.makeText(context, message, duration)
            toast?.show()
        }
    }
}