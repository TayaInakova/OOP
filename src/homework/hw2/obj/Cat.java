package homework.hw2.obj;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        if (satiety) System.out.printf("Котик %s сыт\n", name);
        else System.out.printf("Котик %s голоден\n", name);
        return satiety;
    }


    public void eat(Plate plate) {
        if (getAppetite() <= plate.getFood() && !satiety) {
            plate.setFood(plate.getFood() - getAppetite());
            System.out.printf("Котик %s поел из миски.\n", name);
            satiety = true;
        } else if (getAppetite() > plate.getFood() && !satiety) System.out.println("В миске недостаточно еды!");
        else if (getAppetite() <= plate.getFood() && satiety) System.out.printf("котик %s уже сыт\n", name);
    }


    public void info() {
        System.out.printf("Котик %s с аппетитом %d\n", name, appetite);
    }
}