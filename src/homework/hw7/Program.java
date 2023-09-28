package homework.hw7;

public class Program {
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency, 120000);
        Company yandex = new Company("Yandex", jobAgency, 90000);
        Company geekBrains = new Company("GeekBrains", jobAgency, 95000);

        Student student1 = new Student("Student1");
        Worker worker1 = new Worker("Worker1");
        Manager manager1 = new Manager("Manager1");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(worker1);
        jobAgency.registerObserver(manager1);

        for (int i = 0; i < 3; i++) {
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }


    }

}
