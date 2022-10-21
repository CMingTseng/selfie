package com.group.selfie

import android.app.Application
import com.flurry.android.FlurryAgent
import timber.log.Timber

class App : Application() {

    companion object {
        lateinit var self: Application
        fun applicationContext(): Application {
            return self
        }
    }

    init {
        self = this
    }

    override fun onCreate() {
        super.onCreate()


        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
            FlurryAgent.Builder()
                .withLogEnabled(true)
                .build(this, "PGX2XZSFZWYTQD4XKCCP")
        }
    }
}