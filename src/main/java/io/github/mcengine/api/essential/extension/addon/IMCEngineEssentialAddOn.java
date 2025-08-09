package io.github.mcengine.api.essential.extension.addon;

import org.bukkit.plugin.Plugin;

/**
 * Represents an Essential AddOn module that can be dynamically loaded into MCEngine.
 * <p>
 * Implement this interface to integrate non-core (but essential) features through the
 * extension system.
 */
public interface IMCEngineEssentialAddOn {

    /**
     * Called when the AddOn is loaded by the engine.
     *
     * @param plugin the plugin instance providing runtime context; must not be {@code null}
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the AddOn is unloaded or disabled by the engine.
     * <p>
     * Use this to release resources, unregister listeners, and perform any cleanup.
     *
     * @param plugin the plugin instance providing runtime context; must not be {@code null}
     */
    void onDisload(Plugin plugin);

    /**
     * Assigns the unique identifier for this AddOn instance.
     *
     * @param id the unique identifier assigned by the engine; must not be {@code null} or empty
     */
    void setId(String id);
}
