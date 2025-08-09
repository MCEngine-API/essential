package io.github.mcengine.api.essential.extension.dlc;

import org.bukkit.plugin.Plugin;

/**
 * Represents an Essential DLC module that can be dynamically loaded into MCEngine.
 * <p>
 * DLC modules typically package optional content/features that extend gameplay or systems.
 */
public interface IMCEngineEssentialDLC {

    /**
     * Called when the DLC module is loaded by the engine.
     *
     * @param plugin the plugin instance providing context; must not be {@code null}
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the DLC module is unloaded or disabled by the engine.
     * <p>
     * Use this to clean up resources or state that should not persist after disabling.
     *
     * @param plugin the plugin instance providing context; must not be {@code null}
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this DLC module.
     *
     * @param id the unique ID assigned by the engine; must not be {@code null} or empty
     */
    void setId(String id);
}
