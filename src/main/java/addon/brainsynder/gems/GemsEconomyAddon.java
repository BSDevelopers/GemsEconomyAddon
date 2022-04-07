package addon.brainsynder.gems;

import me.xanium.gemseconomy.api.GemsEconomyAPI;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import simplepets.brainsynder.addon.presets.EconomyModule;
import simplepets.brainsynder.api.Namespace;

import java.util.UUID;

@Namespace(namespace = "GemsEconomy")
public class GemsEconomyAddon extends EconomyModule {
    private GemsEconomyAPI api = null;

    @Override
    public boolean shouldEnable() {
        Plugin plugin = Bukkit.getPluginManager().getPlugin("GemsEconomy");
        if ((plugin != null) && plugin.isEnabled()) return true;
        System.out.println("[SimplePets GemsEconomyAddon] You seem to be missing the GemsEconomy plugin...");
        System.out.println("[SimplePets GemsEconomyAddon] Download it here: https://www.spigotmc.org/resources/19655/");
        return false;
    }

    @Override
    public void init() {
        super.init();
        api = new GemsEconomyAPI();
    }

    @Override
    public void cleanup() {
        super.cleanup();
        api = null;
    }

    @Override
    public int getDefaultPrice() {
        return 200;
    }

    @Override
    public double getBalance(UUID uuid) {
        return api.getBalance(uuid);
    }

    @Override
    public void withdraw(UUID uuid, double amount) {
        api.withdraw(uuid, amount);
    }
}
