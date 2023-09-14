package seminars.seminar1.subject;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private final List<Product> productList;

    public VendingMachine(List<Product> productList) {
        if (productList == null) productList = new ArrayList<>();
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product item) {
        productList.add(item);
    }

    public void checkProduct(Product item) {
        boolean flag = false;
        for (Product i : productList)
            if (i.equals(item)) {
                flag = true;
                break;
            }
        System.out.println(flag ? "Товар есть в списке" : "Товара нет в списке");
    }

    private Water getWater(String name, Integer volume, String flavor) {
        for (Product product : productList) {
            if (product instanceof Water water) {
                if (water.getName().equals(name) && water.getVolume().equals(volume)
                        && water.getFlavor().equals(flavor)) {
                    return water;
                }
            }
        }
        return null;
    }

    private Milk getMilk(String name, Integer volume, double percent) {
        for (Product product : productList) {
            if (product instanceof Milk milk) {
                if (milk.getName().equals(name) && milk.getVolume().equals(volume)
                        && milk.getPercentageOfFatContent() == percent) {
                    return milk;
                }
            }
        }
        return null;
    }

    private Chips getChips(String name, Integer weight, String flavor) {
        for (Product product : productList) {
            if (product instanceof Chips chips) {
                if (chips.getName().equals(name) && chips.getWeight().equals(weight)
                        && chips.getFlavor().equals(flavor)) return chips;
            }
        }
        return null;
    }

    private Chocolate getChocolate(String name, Integer weight, Integer percent) {
        for (Product product : productList) {
            if (product instanceof Chocolate chocolate) {
                if (chocolate.getName().equals(name) && chocolate.getWeight().equals(weight)
                        && chocolate.getCocoaPercentage().equals(percent)) return chocolate;
            }
        }
        return null;
    }

    public Water buyWater(String name, Integer volume, String flavor) {
        Water item = getWater(name, volume, flavor);
        if (item == null) System.out.println("Товара нет в наличии");
        else System.out.println("Вы купили:\n" + item);
        return item;
    }

    public Milk buyMilk(String name, Integer volume, double percent) {
        Milk item = getMilk(name, volume, percent);
        if (item == null) System.out.println("Товара нет в наличии");
        else System.out.println("Вы купили:\n" + item);
        return item;
    }

    public Chips buyChips(String name, Integer weight, String flavor) {
        Chips item = getChips(name, weight, flavor);
        if (item == null) System.out.println("Товара нет в наличии");
        else System.out.println("Вы купили:\n" + item);
        return item;
    }

    public Chocolate buyChocolate(String name, Integer weight, Integer percent) {
        Chocolate item = getChocolate(name, weight, percent);
        if (item == null) System.out.println("Товара нет в наличии");
        else System.out.println("Вы купили:\n" + item);
        return item;
    }
}

