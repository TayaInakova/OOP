package homework.hw3.obj;

/**
 * Сотрудник
 */
public abstract class Employee implements Comparable<Employee> {
    /**
     * Фамилия
     */
    protected String surName;
    /**
     * Имя
     */
    protected String name;
    /**
     * Возраст
     */
    protected int age;
    /**
     * Ставка заработной платы
     */
    protected double salary;

    public Employee(String surName, String name, double salary, int age) {
        this.surName = surName;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return String.format("%s %s", surName, name);
    }

    @Override
    public int compareTo(Employee o) {
        int res = surName.compareTo(o.surName);
        if (res == 0) {
            return name.compareTo(o.name);
        }
        return res;
    }
}
