package com.ljw.android.dlog

import android.util.Log
import java.lang.StringBuilder

/**
 * Created by LJW on 9/9/21.
 *
 * Description :
 */
class Dlog {

    /**
     * Log Level Error
     */
    companion object {
        val TAG = "DLOG::"

        fun e(message: String?) {
            if (BuildConfig.DEBUG) Log.e(TAG, buildLogMsg(message)!!)
        }

        /**
         * Log Level Warning
         */
        fun w(message: String?) {
            if (BuildConfig.DEBUG) Log.w(TAG, buildLogMsg(message)!!)
        }

        /**
         * Log Level Information
         */
        fun i(message: String?) {
            if (BuildConfig.DEBUG) Log.i(TAG, buildLogMsg(message)!!)
        }


        /**
         * Log Level Debug
         */
        fun d(message: String?) {
            if (BuildConfig.DEBUG) Log.d(TAG, buildLogMsg(message)!!)
        }

        /**
         * Log Level Verbose
         */
        fun v(message: String?) {
            if (BuildConfig.DEBUG) Log.v(TAG, buildLogMsg(message)!!)
        }

        fun buildLogMsg(message: String?): String? {
            val ste = Thread.currentThread().stackTrace[4]
            val sb = StringBuilder()
            sb.append("[")
            sb.append(ste.fileName.replace(".java", ""))
            sb.append("::")
            sb.append(ste.methodName)
            sb.append("]")
            sb.append(message)
            return sb.toString()
        }
    }
}