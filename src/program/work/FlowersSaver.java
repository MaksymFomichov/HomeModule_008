package program.work;

import program.flowers.SuperFlower;

import java.io.FileWriter;

public abstract class FlowersSaver {

    public static void save(String link, SuperFlower[] flowersSell) {
        try {
            FileWriter writer = new FileWriter(link, false);
            writer.write("" + flowersSell.length + "\n");
            for (SuperFlower value : flowersSell) {
                writer.write(value.getClass().getSimpleName() + " ");
            }
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
