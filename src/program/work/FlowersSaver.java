package program.work;

import program.flowers.BaseFlower;

import java.io.FileWriter;

public abstract class FlowersSaver {

    public static void save(String link, BaseFlower[] flowersSell) {
        try {
            FileWriter writer = new FileWriter(link, false);
            writer.write("" + flowersSell.length + "\n");
            for (BaseFlower value : flowersSell) {
                writer.write(value.getClass().getSimpleName() + " ");
            }
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
