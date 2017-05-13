package pl.medgit.medgit.persistance.shared_prefs;

/**
 * Created by hp on 2017-05-13.
 */

public interface SharedPreferencesFacade {

    void putString(String key, String value);

    String getString(String key);

    void putObject(String key, Object object);

    <T> T getObject(String key, Class<T> object);


}
