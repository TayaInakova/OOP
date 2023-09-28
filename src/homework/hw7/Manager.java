package homework.hw7;


import java.util.ArrayList;
import java.util.List;

public class Manager implements Observer {

    private String name;

    private int salary = 70000;
    private boolean hasJob = false;
    private List<Vacancy> vacancyList = new ArrayList<>();

    public Manager(String name) {
        this.name = name;
        this.vacancyList.add(Vacancy.Secretary);
        this.vacancyList.add(Vacancy.HR);
    }

    @Override
    public void receiveOffer(String companyName, int salary, Vacancy vacancy) {
        if (this.salary <= salary && isVacancy(vacancy)) {
            System.out.printf("Менеджер: %s: Мне нужна эта работа! (Компания: %s; Вакансия: %s; Заработная плата: %d)\n",
                    name, companyName, vacancy.getName(), salary);
            this.salary = salary;
            hasJob = true;
        } else {
            System.out.printf("Менеджер: %s: Я найду работу получше! (Компания: %s; Вакансия: %s; Заработная плата: %d)\n",
                    name, companyName, vacancy.getName(), salary);
        }
    }

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
