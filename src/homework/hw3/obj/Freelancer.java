package homework.hw3.obj;

/**
 * Фрилансер (работник с почасовой оплатой)
 */
public class Freelancer extends Employee{

    public Freelancer(String surName, String name, double salary, int age) {
        super(surName, name, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary*1.5;
    }
    @Override
    public String toString() {
        return String.format("%s %s; Возраст: %d; Фрилансер; Среднемесячная заработная плата (почасовая): %.2f",
                surName, name, age, calculateSalary());
    }
}
