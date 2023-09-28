package homework.hw7;

public interface Observer {
    void receiveOffer(String companyName, int salary, Vacancy vacancy);

    String getName();

    boolean getHasJob();

    boolean isVacancy(Vacancy vacancy);
}
