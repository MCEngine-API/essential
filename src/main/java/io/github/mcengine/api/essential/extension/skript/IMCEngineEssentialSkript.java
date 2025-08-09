package io.github.mcengine.api.essential.extension.skript;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Skript-based Essential module that can be dynamically loaded into MCEngine.
 * <p>
 * These modules encapsulate scripted behaviors that extend server logic.
 */
public interface IMCEngineEssentialSkript {

    /**
     * Called when the Skript module is loaded by the engine.
     *
     * @param plugin the plugin instance providing context; must not be {@code null}
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Skript module is unloaded or disabled by the engine.
     * <p>
     * Use this to unregister handlers, cancel tasks, and free memory created during {@link #onLoad(Plugin)}.
     *
     * @param plugin the {@link Plugin} instance providing context; must not be {@code null}
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Skript module.
     *
     * @param id the unique ID assigned by the engine; must not be {@code null} or empty
     */
    void setId(String id);
}
