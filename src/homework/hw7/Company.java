package homework.hw7;

import java.util.Random;

public class Company {

    private Random random = new Random();

    private String name;
    private Publisher jobAgency;
    private int maxSalary;

    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
    }

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        Vacancy vacancy = Vacancy.values()[new Random().nextInt(Vacancy.values().length)];
        jobAgency.sendOffer(name, salary, vacancy);
        System.out.println();
    }

}
