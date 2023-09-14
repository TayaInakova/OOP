package seminars.seminar1;

import seminars.seminar1.subject.*;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Product drink1 = new Water("Бутылка воды", 50, 500, "Лимон");
        Product drink2 = new Water("Бутылка воды", 150, 1000, "Яблоко");
        Product drink3 = new Milk("Бутылка молока", 200, 1000, 3.2);
        Product drink4 = new Milk("Бутылка молока", 100, 1000, 2.5);
        Product drink5 = new Milk("Бутылка молока", 80, 1000, 1.0);
        Product snack1 = new Chips("Чипсы", 100, 150, "Бекон");
        Product snack2 = new Chips("Чипсы", 200, 225, "Сыр");
        Product snack3 = new Chocolate("Шоколад", 100, 150, 60);
        Product snack4 = new Chocolate("Шоколад", 150, 150, 95);
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(drink1);
        productList.add(drink2);
        productList.add(drink3);
        productList.add(drink4);
        productList.add(drink5);
        VendingMachine automaton = new VendingMachine(productList);
        automaton.addProduct(snack1);
        automaton.addProduct(snack2);
        automaton.addProduct(snack3);
        automaton.addProduct(snack4);
        Product item1 = automaton.buyWater("Бутылка воды", 1000, "Лимон");
        Product item2 = automaton.buyMilk("Бутылка молока", 1000, 3.2);
        Product item3 = automaton.buyChips("Чипсы", 225, "Сыр");
        Product item4 = automaton.buyChocolate("Шоколад", 150, 95);

    }
}