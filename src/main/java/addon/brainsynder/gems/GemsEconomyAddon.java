package addon.brainsynder.gems;

import me.xanium.gemseconomy.api.GemsEconomyAPI;
import simplepets.brainsynder.addon.presets.EconomyModule;
import simplepets.brainsynder.api.Namespace;

import java.util.UUID;

@Namespace(namespace = "GemsEconomy")
public class GemsEconomyAddon extends EconomyModule {
    private GemsEconomyAPI api = null;

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
