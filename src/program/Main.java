package program;

import program.flowers.SuperFlower;
import program.store.FlowerStore;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        FlowerStore flowerStore = new FlowerStore();
        // проверяем метод sell из класса FlowerStore
        SuperFlower[] flowersSell = flowerStore.sell(1, 1, 1);
        showFlowers(flowersSell);
        // проверяем метод sellSequence из класса FlowerStore
        SuperFlower[] flowersSellSequence = flowerStore.sellSequence(5, 3, 1);
        showFlowers(flowersSellSequence);
        // выводим текущее стостояние кошелька
        System.out.println(flowerStore.getPurse().getSum());
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
