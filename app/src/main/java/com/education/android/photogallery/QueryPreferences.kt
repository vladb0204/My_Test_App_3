package com.education.android.photogallery

import android.content.Context
import android.preference.PreferenceManager

private const val PREF_SEARCH_QUERY = "searchQuery"

object QueryPreferences {

    public fun getStoredQuery(context: Context): String {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context) // deprecated
        return prefs.getString(PREF_SEARCH_QUERY, "")!!
    }

    public fun getStored(context: Context, query: String) {
        PreferenceManager.getDefaultSharedPreferences(context)
                .edit().putString(PREF_SEARCH_QUERY, query).apply()
    }
}