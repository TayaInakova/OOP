package homework.hw4.obj;

public abstract class Fruit {
    private final float weight;
    protected String[] fruitName;

    public Fruit(float weight, String[] fruitName) {
        this.weight = weight;
        this.fruitName = fruitName;
    }

    public float getWeight() {
        return weight;
    }

    public String getFruitName(int count) {
        if (count % 10 == 1 && count % 100 != 11) return fruitName[0];
        else if ((count % 10 != 2 && count % 10 != 3 && count % 10 != 4) ||
                (count % 100 == 12 && count % 100 == 13 && count % 100 == 14)) {
            return fruitName[2];
        } else return fruitName[1];
    }
}

