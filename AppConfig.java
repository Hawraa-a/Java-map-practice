import java.util.HashMap;
import java.util.Map;

class AppConfig {
    /**
     * TO-DO: Merge 'updatedConfig' into 'mainConfig'.
     * If a key exists in both, the value from 'updatedConfig' should be used.
     * \*
     *
     * @param mainConfig    The primary configuration map (will be modified).
     * @param updatedConfig The map with new or updated settings.
     */
    public void mergeConfigurations(Map<String, String> mainConfig, Map<String, String> updatedConfig) {
        mainConfig.putAll(updatedConfig);
    }
}