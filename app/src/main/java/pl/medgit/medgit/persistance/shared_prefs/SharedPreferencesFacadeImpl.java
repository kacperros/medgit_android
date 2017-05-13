package pl.medgit.medgit.persistance.shared_prefs;

import android.content.SharedPreferences;

import com.google.gson.Gson;

/**
 * Created by hp on 2017-05-13.
 */

public class SharedPreferencesFacadeImpl implements SharedPreferencesFacade {

    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    public SharedPreferencesFacadeImpl(SharedPreferences preferences){
        this.preferences = preferences;
    }

    @Override
    public void putString(String key, String value) {
        editor = preferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    @Override
    public String getString(String key) {
        return preferences.getString(key, null);
    }

    @Override
    public void putObject(String key, Object object) {
        Gson gson = new Gson();
        putString(key, gson.toJson(object));
    }

    @Override
    public <T> T getObject(String key, Class<T> object) {
        Gson gson = new Gson();
        return gson.fromJson(preferences.getString(key, ""), object);
    }
}
