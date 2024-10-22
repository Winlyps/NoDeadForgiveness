package winlyps.noDeadForgiveness

import org.bukkit.plugin.java.JavaPlugin

class NoDeadForgiveness : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("forgiveDeadPlayers", "false")
        }
        logger.info("NoDeadForgiveness plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("NoDeadForgiveness plugin has been disabled.")
    }
}