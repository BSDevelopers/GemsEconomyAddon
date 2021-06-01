package addon.brainsynder.gems;

import com.google.common.collect.Lists;
import me.xanium.gemseconomy.api.GemsEconomyAPI;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import simplepets.brainsynder.addon.presets.EconomyAddon;
import simplepets.brainsynder.api.Namespace;

import java.util.List;
import java.util.UUID;

@Namespace(namespace = "GemsEconomy")
public class GemsEconomyAddon extends EconomyAddon {
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

    @Override
    public double getVersion() {
        return 0.1;
    }

    @Override
    public String getAuthor() {
        return "brainsynder";
    }

    @Override
    public List<String> getDescription() {
        return Lists.newArrayList(
                "&7This addon links into the GemsEconomy Plugin",
                "&7To make it possible to buy pets with in-game money"
        );
    }
}
