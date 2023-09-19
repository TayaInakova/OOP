package homework.hw4.obj;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private T item;
    private ArrayList<T> fruits = new ArrayList<>();

    public Box(ArrayList<T> fruits) {
        this.item = fruits.get(0);
        this.fruits = fruits;
    }

    public Box() {
    }

    /**
     * Добавляем фрукт в коробку
     *
     * @param item новый фрукт
     */
    public void addFruits(T item) {
        fruits.add(item);
    }

    /**
     * Убираем фрукт из коробки
     *
     * @param count количество фруктов, которые хотим убрать
     */
    public void removeFruits(int count) {
        if (count <= 0) System.out.println("невалидное число.");
        else if (count > 0) {
            if (count > fruits.size()) count = fruits.size();
            for (int i = count; i > 0; i--) {
                fruits.remove(fruits.get(i - 1));
            }
            if (!fruits.isEmpty()) {
                System.out.printf("Вы убрали из коробки %d %s\n", count, item.getFruitName(count));
            } else String.format("Вы убрали из коробки все фрукты.\n");
        }
    }

    /**
     * Перекладывам фрукты из одной коробки в другую
     *
     * @param b     новая коробка
     * @param count количество фруктов, которые хотим переложить
     */
    public void removeTo(Box<T> b, int count) {
        if (fruits.isEmpty()) {
            System.out.println("Исходная коробка пуста.");
        } else {
            b.item = item;
            if (count <= 0) {
                System.out.println("невалидное число.");
            } else if (count > 0) {
                if (count >= fruits.size()) {
                    count = fruits.size();
                    System.out.printf("Вы переместили из одной коробки в другую все фрукты.\n");
                } else
                    System.out.printf("Вы переместили из одной коробки в другую %d %s\n", count, item.getFruitName(count));
            }
            for (int i = 0; i < count; i++) {
                b.addFruits(fruits.get(fruits.size() - 1));
                fruits.remove(fruits.get(fruits.size() - 1));
            }
        }
    }

    /**
     * @return вес коробки исходя из того, что все фрукты в коробке одинакового веса.
     */
    public float getWeight() {
        if (!fruits.isEmpty()) {
            return fruits.get(0).getWeight() * fruits.size();
        } else {
            return 0.00f;
        }
    }

    @Override
    public String toString() {
        if (!fruits.isEmpty()) return String.format("Коробка содержит %d %s, общим весом %.2f.",
                fruits.size(), item.getFruitName(fruits.size()), getWeight());
        else {
            return "Коробка пуста.";
        }
    }

    /**
     * Сравниваем коробки по весу, независимо от наполнения
     *
     * @param o коробка, с которой сравниваем текущую.
     * @return результат сравнения
     */
    public boolean compare(Box<Orange> o) {
        return this.getWeight() == o.getWeight();
    }
}
