package Core;

import Abstractions.ItemGenerator;
import Rewards.Coal.CoalGenerator;
import Rewards.Diamond.DiamondGenerator;
import Rewards.Gold.GoldGenerator;
import Rewards.Silver.SilverGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Core {
    // Логика игры
    public void run() {
        Random random = ThreadLocalRandom.current();

        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new SilverGenerator());
        generatorList.add(new CoalGenerator());
        generatorList.add(new DiamondGenerator());

        for (int i = 0; i <10;i++) {
            int indx=Math.abs(random.nextInt()%4);
            ItemGenerator myGenerator = generatorList.get(indx);
            System.out.println(myGenerator.openReward());
        }




    }
}
