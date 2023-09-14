package seminars.seminar1.subject;

public class Chocolate extends Product {
    protected Integer weight;
    protected Integer cocoaPercentage;

    public Chocolate(String name, Integer price, Integer weight, Integer cocoaPercentage) {
        super(name, price);
        this.weight = weight;
        this.cocoaPercentage = cocoaPercentage;
    }

    public Chocolate() {

    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getCocoaPercentage() {
        return cocoaPercentage;
    }

    public void setCocoaPercentage(Integer cocoaPercentage) {
        this.cocoaPercentage = cocoaPercentage;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s, Цена: %dр., Вес: %dг, Процент какао: %d%%",
                name, price, weight, cocoaPercentage);

    }
}
