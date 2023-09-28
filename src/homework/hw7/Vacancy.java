package homework.hw7;

public enum Vacancy {
    HR("Кадровик"),
    Cleaner("Уборщик"),
    Programmer("Программист"),
    Secretary("Секретарь");
    private final String name;

    Vacancy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + "\n";
    }
}

