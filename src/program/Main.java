package program;

import program.flowers.SuperFlower;
import program.store.FlowerStore;
import program.work.FlowersLoader;
import program.work.FlowersSaver;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        FlowerStore flowerStore = new FlowerStore();
        // проверяем метод sell из класса FlowerStore
        SuperFlower[] flowersSell = flowerStore.sell(2, 2, 2);
        showFlowers(flowersSell);
        // проверяем метод sellSequence из класса FlowerStore
        SuperFlower[] flowersSellSequence = flowerStore.sellSequence(5, 3, 1);
        showFlowers(flowersSellSequence);

        // выводим текущее стостояние кошелька
        System.out.println("В кошельке " + flowerStore.getPurse().getSum());

        // путь к файлу
        String link = "files/flowers.txt";
        // загружаем массив цветов в файл
        FlowersSaver.save(link, flowersSell);
        // выгружаем массив цветов из файла и для примера выводим его
        showFlowers(FlowersLoader.load(link));
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
