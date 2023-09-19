package homework.hw4;

import homework.hw4.obj.Apple;
import homework.hw4.obj.Box;
import homework.hw4.obj.Orange;

import java.util.ArrayList;


public class Program {

    public static void main(String[] args) {
        ArrayList<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple());
        appleList.add(new Apple());
        appleList.add(new Apple());
        appleList.add(new Apple());
        appleList.add(new Apple());
        appleList.add(new Apple());
        ArrayList<Orange> orangeList = new ArrayList<>();
        orangeList.add(new Orange());
        orangeList.add(new Orange());
        orangeList.add(new Orange());
        Box<Apple> appleBox1 = new Box<>(appleList);
        appleBox1.addFruits(new Apple());
        appleBox1.addFruits(new Apple());
        appleBox1.addFruits(new Apple());
        System.out.println(appleBox1);
        Box<Orange> orangeBox = new Box<>(orangeList);
        orangeBox.addFruits(new Orange());
        orangeBox.addFruits(new Orange());
        orangeBox.addFruits(new Orange());
        System.out.println(orangeBox);
        System.out.println(appleBox1.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox1.compare(orangeBox));
        Box<Apple> appleBox2 = new Box<>();
        appleBox1.removeTo(appleBox2,9);
        System.out.println(appleBox1);
        System.out.println(appleBox2);
        appleBox2.removeFruits(3);
        System.out.println(appleBox2);

    }

}
