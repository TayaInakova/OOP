package homework.hw7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JobAgency implements Publisher {

    private List<Observer> observers = new ArrayList<>();


    @Override
    public void sendOffer(String companyName, int salary, Vacancy vacancy) {

        for (Iterator<Observer> iterator = observers.iterator(); iterator.hasNext(); ) {
            Observer observer = iterator.next();
            if (!observer.getHasJob()) {
                observer.receiveOffer(companyName, salary, vacancy);
                if (observer.getHasJob()) {
                    System.out.printf("Эту работу получил %s\n", observer.getName());
                    iterator.remove();
                    break;
                }
            }
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
