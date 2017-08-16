package program.work;

import program.flowers.Chamomile;
import program.flowers.Rose;
import program.flowers.BaseFlower;
import program.flowers.Tulip;

import java.io.BufferedReader;
import java.io.FileReader;

public abstract class FlowersLoader {

    public static BaseFlower[] load(String link) {
        try {
            FileReader reader = new FileReader(link);
            BufferedReader br = new BufferedReader(reader);

            String line1 = br.readLine();
            String line2 = br.readLine();

            int arraySize = Integer.parseInt(line1);
            BaseFlower[] superFlowers = new BaseFlower[arraySize];

            String[] elements = line2.split(" ");
            for (int i = 0; i < superFlowers.length; i++) {
                if (elements[i].equals("Rose")) {
                    superFlowers[i] = new Rose();
                }
                if (elements[i].equals("Chamomile")) {
                    superFlowers[i] = new Chamomile();
                }
                if (elements[i].equals("Tulip")) {
                    superFlowers[i] = new Tulip();
                }
            }
            return superFlowers;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
