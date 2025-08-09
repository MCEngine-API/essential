package io.github.mcengine.api.essential.database;

import java.sql.Connection;

/**
 * Minimal persistence contract for the Essential module.
 * <p>
 * For now, only a JDBC {@link Connection} is exposed; higher-level
 * operations can be added later without breaking existing code.
 */
public interface IMCEngineEssentialDB {

    /**
     * Returns the active JDBC connection for the Essential database.
     *
     * @return an open {@link Connection}, or {@code null} if unavailable
     */
    Connection getDBConnection();
}
