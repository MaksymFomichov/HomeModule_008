package program.store;

import program.flowers.Chamomile;
import program.flowers.Rose;
import program.flowers.SuperFlower;
import program.flowers.Tulip;

public class FlowerStore {

    public FlowerStore() {
    }

    public SuperFlower[] sell(int countRose, int countChamomile, int countTulip) {
        SuperFlower[] superFlower = new SuperFlower[countRose + countChamomile + countTulip];
        for (int i = 0; i < countRose; i++) {
            superFlower[i] = new Rose();
        }
        for (int i = countRose; i < countChamomile + countRose; i++) {
            superFlower[i] = new Chamomile();
        }
        for (int i = countChamomile + countRose; i < countChamomile + countRose + countTulip; i++) {
            superFlower[i] = new Tulip();
        }
        return superFlower;
    }

    public SuperFlower[] sellSequence(int countRose, int countChamomile, int countTulip) {
        SuperFlower[] superFlower = new SuperFlower[countRose + countChamomile + countTulip];
        int countFlowers = countRose + countChamomile + countTulip;
        int tempCount = 0;
        while (countFlowers > 0) {
            if (countRose > 0) {
                superFlower[tempCount] = new Rose();
                countRose--;
                tempCount++;
            }
            if (countChamomile > 0) {
                superFlower[tempCount] = new Chamomile();
                countChamomile--;
                tempCount++;
            }
            if (countTulip > 0) {
                superFlower[tempCount] = new Tulip();
                countTulip--;
                tempCount++;
            }
            countFlowers--;
        }
        return superFlower;
    }
}
