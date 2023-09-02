package Rewards.Coal;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class CoalGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new CoalRewards();
    }
}
