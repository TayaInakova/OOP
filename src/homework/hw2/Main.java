package homework.hw2;

import homework.hw2.obj.Cat;
import homework.hw2.obj.Plate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Паскаль", 15));
        cats.add(new Cat("Рафэль", 30));
        cats.add(new Cat("Персиваль", 20));
        cats.add(new Cat("Вольтер", 7));
        Plate plate = new Plate(50);
        plate.info();
        for (Cat cat : cats) {
            cat.isSatiety();
            cat.eat(plate);
            if (!cat.isSatiety()) {
                plate.addFood(20);
                cat.eat(plate);
                cat.isSatiety();
            }
            plate.info();
        }
    }
}
