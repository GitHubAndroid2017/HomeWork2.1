package ua.softgroup.homework21;

import android.content.Context;
import android.preference.PreferenceManager;

class QueryPreferences {

    static String getStoredQuery(Context context, String var) {
        return PreferenceManager.getDefaultSharedPreferences(context)
                .getString(var, null);
    }

    static void setStoredQuery(Context context, String var, String query) {
        PreferenceManager.getDefaultSharedPreferences(context)
                .edit()
                .putString(var, query)
                .apply();
    }
}
