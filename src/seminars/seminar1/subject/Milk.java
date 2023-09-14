package seminars.seminar1.subject;

public class Milk extends Product {
    protected Integer volume;
    protected double percentageOfFatContent;

    public Milk(String name, Integer price, Integer volume, double percentageOfFatContent) {
        super(name, price);
        this.volume = volume;
        this.percentageOfFatContent = percentageOfFatContent;
    }

    public Milk() {
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public double getPercentageOfFatContent() {
        return percentageOfFatContent;
    }

    public void setPercentageOfFatContent(double percentageOfFatContent) {
        this.percentageOfFatContent = percentageOfFatContent;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s, Цена: %dр., Объём: %dмл, Процент жирности: %.1f%%",
                name, price, volume, percentageOfFatContent);
    }
}
