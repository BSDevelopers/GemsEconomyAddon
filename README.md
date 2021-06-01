# GemsEconomyAddon
This is an addon for the SimplePets v5 plugin, This allows the plugin to support purchasing pets using economy (aka the GemsEconomy Plugin) 

### Requirements:
- [GemsEconomy](https://www.spigotmc.org/resources/19655/) `(At least v4.9)`

### Default configuration (Located in `plugins/SimplePets/Addons/GemsEconomy.yml`)
```yaml
# This is the bypass permission, who ever has this permission will not have to pay
bypass_permission: pet.gemseconomy.bypass

# Disabling this will make the items show the price, but if the player has bypass permissions he wont have to pay
# Default: true
Hide-Price-If-Bypassed: true

# Should players have to pay each time they spawn a pet?
# Default: false
Pay-Per-Use-Enabled: false
Price:
  # If a pet is free this will be in the place of the price in the lore
  # Default: 'Free'
  Free: Free
  # If the player has the bypass permission, will be in the place of the price in the lore
  # Default: 'BYPASSED'
  Bypassed: BYPASSED

# Here is where you can set the translations for the 2 boolean values (true/false)
Boolean:
  'true': '&#92fc98true'
  'false': '&#fa7d7dfalse'
Messages:
  prefix: '&eSimplePets &6>>'
  PurchaseSuccessful:
    # This message will be sent if the purchase it successful
    # Placeholders:
    # - {prefix} (uses the customized prefix)
    # - {type} (will get what type of pet it is)
    # - {price} (what price the pet is)
    One-Time-Purchase: '{prefix} &7You have Successfully Purchased the {type} Pet.'
    # This message will be sent if the purchase it successful while Pay-Per-Use is set to true
    # Placeholders:
    # - {prefix} (uses the customized prefix)
    # - {type} (will get what type of pet it is)
    # - {price} (what price the pet is)
    Pay-Per-Use: '{prefix} &7You have Successfully Paid for the {type} Pet.'
  # This message will be sent if the player does not have enough money to buy the pet
  # Placeholders:
  # - {prefix} (uses the customized prefix)
  # - {type} (will get what type of pet it is)
  # - {price} (what price the pet is)
  InsufficientFunds: '{prefix} &cYou do not have enough money to buy this pet, you
    need to have {price}'
  Lore-Lines:
    # These Lore Lines will only be used if 'Pay-Per-Use' is set to false
    # Placeholders:
    # - {price} (price of the pet)
    # - {purchased} (true/false if the player purchased the pet)
    One-Time-Purchase:
    - '&#ffbf5ePrice: &#99ffac{price}'
    - '&#ffbf5ePurchased: {purchased}'
    # These lines get added to the pet items when the GUI is opened
    # Placeholders:
    # - {price} (price of the pet)
    # - {purchased} (true/false if the player purchased the pet)
    Pay-Per-Use:
    - '&#ffbf5ePrice: &#99ffac{price}'
type:
  # The price of the armor_stand pet
  armor_stand: 200
  # The price of the bat pet
  bat: 200
  # The price of the bee pet
  bee: 200
  # The price of the blaze pet
  blaze: 200
  # The price of the cat pet
  cat: 200
  # The price of the cave_spider pet
  cave_spider: 200
  # The price of the chicken pet
  chicken: 200
  # The price of the cod pet
  cod: 200
  # The price of the cow pet
  cow: 200
  # The price of the creeper pet
  creeper: 200
  # The price of the dolphin pet
  dolphin: 200
  # The price of the donkey pet
  donkey: 200
  # The price of the drowned pet
  drowned: 200
  # The price of the elder_guardian pet
  elder_guardian: 200
  # The price of the enderman pet
  enderman: 200
  # The price of the endermite pet
  endermite: 200
  # The price of the evoker pet
  evoker: 200
  # The price of the fox pet
  fox: 200
  # The price of the ghast pet
  ghast: 200
  # The price of the giant pet
  giant: 200
  # The price of the guardian pet
  guardian: 200
  # The price of the hoglin pet
  hoglin: 200
  # The price of the horse pet
  horse: 200
  # The price of the husk pet
  husk: 200
  # The price of the illusioner pet
  illusioner: 200
  # The price of the iron_golem pet
  iron_golem: 200
  # The price of the llama pet
  llama: 200
  # The price of the magma_cube pet
  magma_cube: 200
  # The price of the mooshroom pet
  mooshroom: 200
  # The price of the mule pet
  mule: 200
  # The price of the ocelot pet
  ocelot: 200
  # The price of the panda pet
  panda: 200
  # The price of the parrot pet
  parrot: 200
  # The price of the phantom pet
  phantom: 200
  # The price of the pig pet
  pig: 200
  # The price of the piglin pet
  piglin: 200
  # The price of the piglin_brute pet
  piglin_brute: 200
  # The price of the pillager pet
  pillager: 200
  # The price of the polarbear pet
  polarbear: 200
  # The price of the pufferfish pet
  pufferfish: 200
  # The price of the rabbit pet
  rabbit: 200
  # The price of the ravager pet
  ravager: 200
  # The price of the salmon pet
  salmon: 200
  # The price of the sheep pet
  sheep: 200
  # The price of the shulker pet
  shulker: 200
  # The price of the silverfish pet
  silverfish: 200
  # The price of the skeleton pet
  skeleton: 200
  # The price of the skeleton_horse pet
  skeleton_horse: 200
  # The price of the slime pet
  slime: 200
  # The price of the snowman pet
  snowman: 200
  # The price of the spider pet
  spider: 200
  # The price of the squid pet
  squid: 200
  # The price of the stray pet
  stray: 200
  # The price of the strider pet
  strider: 200
  # The price of the trader_llama pet
  trader_llama: 200
  # The price of the tropical_fish pet
  tropical_fish: 200
  # The price of the turtle pet
  turtle: 200
  # The price of the vex pet
  vex: 200
  # The price of the villager pet
  villager: 200
  # The price of the vindicator pet
  vindicator: 200
  # The price of the wandering_trader pet
  wandering_trader: 200
  # The price of the witch pet
  witch: 200
  # The price of the wither pet
  wither: 200
  # The price of the wither_skeleton pet
  wither_skeleton: 200
  # The price of the wolf pet
  wolf: 200
  # The price of the zoglin pet
  zoglin: 200
  # The price of the zombie pet
  zombie: 200
  # The price of the zombie_horse pet
  zombie_horse: 200
  # The price of the zombie_villager pet
  zombie_villager: 200
  # The price of the zombified_piglin pet
  zombified_piglin: 200

```
