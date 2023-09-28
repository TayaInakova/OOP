package homework.hw7;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observer {

    private String name;

    private int salary = 2000;
    private boolean hasJob = false;

    private List<Vacancy> vacancyList = new ArrayList<>();

    public Student(String name) {
        this.name = name;
        vacancyList.add(Vacancy.Secretary);
        vacancyList.add(Vacancy.Cleaner);
    }

    @Override
    public void receiveOffer(String companyName, int salary, Vacancy vacancy) {
        if (this.salary <= salary && isVacancy(vacancy)) {
            System.out.printf("Студент: %s: Мне нужна эта работа! (Компания: %s; Вакансия: %s; Заработная плата: %d)\n",
                    name, companyName, vacancy.getName(), salary);
            this.salary = salary;
            hasJob = true;
        } else {
            System.out.printf("Студент: %s: Я найду работу получше! (Компания: %s; Вакансия: %s; Заработная плата: %d)\n",
                    name, companyName, vacancy.getName(), salary);
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean getHasJob() {
        return hasJob;
    }

    @Override
    public boolean isVacancy(Vacancy vacancy) {
        return this.vacancyList.contains(vacancy);
    }
}
