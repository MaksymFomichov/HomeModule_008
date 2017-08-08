package program;

import program.flowers.SuperFlower;
import program.store.FlowerStore;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // проверяем метод sell из класса FlowerStore
        SuperFlower[] flowersSell = new FlowerStore().sell(5, 3, 1);
        showFlowers(flowersSell);
        // проверяем метод sellSequence из класса FlowerStore
        SuperFlower[] flowersSellSequence = new FlowerStore().sellSequence(5, 3, 1);
        showFlowers(flowersSellSequence);
    }

    // вывод массива обьектов (имена классов) через запятую
    private static void showFlowers(SuperFlower[] flowers) {
        List<String> container = new ArrayList<>();
        for (SuperFlower flower : flowers) {
            container.add(flower.getClass().getSimpleName());
        }
        System.out.println(String.join(", ", container));
    }
}
