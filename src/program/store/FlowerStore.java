package program.store;

import program.flowers.Chamomile;
import program.flowers.Rose;
import program.flowers.SuperFlower;
import program.flowers.Tulip;

public class FlowerStore {
    private Purse purse = new Purse();
    private Rose rose = new Rose();
    private Chamomile chamomile = new Chamomile();
    private Tulip tulip = new Tulip();

    public FlowerStore() {
    }

    public SuperFlower[] sell(int countRose, int countChamomile, int countTulip) {
        purse.addPurse(countRose * rose.getPrice() + countChamomile * chamomile.getPrice() + countTulip * tulip.getPrice());
        SuperFlower[] superFlower = new SuperFlower[countRose + countChamomile + countTulip];
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

    public SuperFlower[] sellSequence(int countRose, int countChamomile, int countTulip) {
        purse.addPurse(countRose * rose.getPrice() + countChamomile * chamomile.getPrice() + countTulip * tulip.getPrice());
        SuperFlower[] superFlower = new SuperFlower[countRose + countChamomile + countTulip];
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

    public Purse getPurse() {
        return purse;
    }
}
