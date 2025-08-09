package io.github.mcengine.api.essential.extension.library;

import org.bukkit.plugin.Plugin;

/**
 * Represents a library module for Essential extensions that can be loaded into MCEngine.
 * <p>
 * Libraries typically back service/infrastructure logic without direct player interaction.
 */
public interface IMCEngineEssentialLibrary {

    /**
     * Called when the library is loaded by the engine.
     *
     * @param plugin the plugin instance providing context; must not be {@code null}
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the library is unloaded or disabled by the engine.
     * <p>
     * Implementations should release any services or dependencies registered during {@link #onLoad(Plugin)}.
     *
     * @param plugin the {@link Plugin} instance providing context; must not be {@code null}
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this library module.
     *
     * @param id the unique ID assigned by the engine; must not be {@code null} or empty
     */
    void setId(String id);
}
