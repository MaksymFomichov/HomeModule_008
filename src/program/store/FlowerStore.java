package program.store;

import program.flowers.Chamomile;
import program.flowers.Rose;
import program.flowers.BaseFlower;
import program.flowers.Tulip;

import java.math.BigDecimal;

public class FlowerStore {
    private Purse purse = new Purse();
    private Rose rose = new Rose();
    private Chamomile chamomile = new Chamomile();
    private Tulip tulip = new Tulip();

    public FlowerStore() {
    }

    public BaseFlower[] sell(int countRose, int countChamomile, int countTulip) {
        addPurse(countRose, countChamomile, countTulip);
        BaseFlower[] superFlower = new BaseFlower[countRose + countChamomile + countTulip];
        for (int i = 0; i < countRose; i++) {
            superFlower[i] = rose;
        }
        for (int i = countRose; i < countChamomile + countRose; i++) {
            superFlower[i] = chamomile;
        }
        for (int i = countChamomile + countRose; i < countChamomile + countRose + countTulip; i++) {
            superFlower[i] = tulip;
        }
        return superFlower;
    }

    public BaseFlower[] sellSequence(int countRose, int countChamomile, int countTulip) {
        addPurse(countRose, countChamomile, countTulip);
        BaseFlower[] superFlower = new BaseFlower[countRose + countChamomile + countTulip];
        int countFlowers = countRose + countChamomile + countTulip;
        int tempCount = 0;
        while (countFlowers > 0) {
            if (countRose > 0) {
                superFlower[tempCount] = rose;
                countRose--;
                tempCount++;
            }
            if (countChamomile > 0) {
                superFlower[tempCount] = chamomile;
                countChamomile--;
                tempCount++;
            }
            if (countTulip > 0) {
                superFlower[tempCount] = tulip;
                countTulip--;
                tempCount++;
            }
            countFlowers--;
        }
        return superFlower;
    }

    private void addPurse(int countRose, int countChamomile, int countTulip){
        purse.addPurse(rose.getPrice().multiply(new BigDecimal(countRose)).add(chamomile.getPrice().multiply(new BigDecimal(countChamomile))).add(tulip.getPrice().multiply(new BigDecimal(countTulip))));
    }

    public Purse getPurse() {
        return purse;
    }
}
