package homework.hw7;

public interface Publisher {

    void sendOffer(String companyName, int salary, Vacancy vacancy);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);
}
