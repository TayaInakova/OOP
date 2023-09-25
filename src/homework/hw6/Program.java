package homework.hw6;

import static homework.hw6.InputFromConsole.inputFromConsole;
import static homework.hw6.SaveToJson.saveToJson;

public class Program {

    public static void main(String[] args) {

        Order order = new Order("", "", 0, 0);
        inputFromConsole(order);
        saveToJson(order);

    }

}
