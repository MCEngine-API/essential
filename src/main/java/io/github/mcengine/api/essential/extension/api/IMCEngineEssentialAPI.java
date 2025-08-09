package io.github.mcengine.api.essential.extension.api;

import org.bukkit.plugin.Plugin;

/**
 * Represents a core Essential API module that can be dynamically loaded into MCEngine.
 * <p>
 * Implement this interface to expose programmatic capabilities to other components.
 */
public interface IMCEngineEssentialAPI {

    /**
     * Called when the API module is loaded by the engine.
     *
     * @param plugin the plugin instance providing context; must not be {@code null}
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the API module is unloaded or disabled by the engine.
     * <p>
     * Use this to deregister services, cancel tasks, and clean up related resources.
     *
     * @param plugin the {@link Plugin} instance providing context; must not be {@code null}
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this API module.
     *
     * @param id the unique ID assigned by the engine; must not be {@code null} or empty
     */
    void setId(String id);
}
