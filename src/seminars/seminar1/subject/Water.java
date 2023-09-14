package seminars.seminar1.subject;

public class Water extends Product {
    protected Integer volume;
    protected String flavor;

    public Water(String name, Integer price, Integer volume, String flavor) {
        super(name, price);
        this.volume = volume;
        this.flavor = flavor;
    }

    public Water() {
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String toString() {
        return String.format("Наименование: %s, Цена: %dр., Объём: %dмл, Вкус: %s", name, price, volume, flavor);
    }
}
