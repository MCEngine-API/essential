package io.github.mcengine.api.essential.extension.agent;

import org.bukkit.plugin.Plugin;

/**
 * Represents an Essential agent module that can be dynamically loaded into MCEngine.
 * <p>
 * Agents encapsulate autonomous or background behaviors registered at runtime.
 */
public interface IMCEngineEssentialAgent {

    /**
     * Invoked when the agent is loaded by the engine.
     *
     * @param plugin the plugin instance providing the runtime context; must not be {@code null}
     */
    void onLoad(Plugin plugin);

    /**
     * Invoked when the agent is unloaded or disabled by the engine.
     * <p>
     * Implementations should release resources and revert transient state here.
     *
     * @param plugin the plugin instance providing the runtime context; must not be {@code null}
     */
    void onDisload(Plugin plugin);

    /**
     * Assigns the unique identifier for this agent instance.
     *
     * @param id the unique identifier assigned by the engine; must not be {@code null} or empty
     */
    void setId(String id);
}
