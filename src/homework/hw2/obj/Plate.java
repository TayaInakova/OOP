package homework.hw2.obj;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    /**
     * Добавляем еду в тарелку
     * @param moreFood количесто еды, которое хотим добавить
     */
    public void addFood(int moreFood) {
        this.food += moreFood;
    }

    public void info() {
        System.out.printf("plate: %d\n", food);
    }
}