package homework.hw1.subject;

public class Chips extends Product {
    protected Integer weight;
    protected String flavor;

    public Chips(String name, Integer price, Integer weight, String flavor) {
        super(name, price);
        this.weight = weight;
        this.flavor = flavor;
    }

    public Chips() {

    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s, Цена: %dр., Вес: %dг, Вкус: %s", name, price, weight, flavor);

    }
}
