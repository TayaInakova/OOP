package homework.hw3;

import homework.hw3.obj.*;

import java.util.Arrays;
import java.util.Random;

public class Main {

    private static final Random random = new Random();

    /**
     * Метод генерирует случайного сотрудника типа Worker или Freelancer
     *
     * @return экземпляр типа типа Worker или Freelancer
     */
    public static Employee generateEmployee() {

        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};

        int salaryIndex = random.nextInt(500, 900);
        int employeeAge = random.nextInt(20, 40);
        int check = random.nextInt(1, 3);
        switch (check) {
            case 1 -> {
                return new Worker(surnames[random.nextInt(surnames.length)],
                        names[random.nextInt(names.length)], salaryIndex * 100, employeeAge);
            }
            case 2 -> {
                return new Freelancer(surnames[random.nextInt(surnames.length)],
                        names[random.nextInt(names.length)], salaryIndex * 100, employeeAge);
            }
            default -> throw new IllegalStateException("Unexpected value: " + check);
        }
    }

    /**
     * Список сотрудников типа Worker и Freelancer
     *
     * @param counter количество сотрудников в списке
     * @return массив сотрудников
     */
    public static Employee[] generateEmployees(int counter) {

        Employee[] employees = new Employee[counter];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }
        return employees;
    }

    public static void main(String[] args) {

        Employee[] employees = generateEmployees(7);

        System.out.println("\nСортировка по имени:\n");
        Arrays.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("\nСортировка по зарплате:\n");
        Arrays.sort(employees, new SalaryComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("\nСортировка по возрасту:\n");
        Arrays.sort(employees, new AgeComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
