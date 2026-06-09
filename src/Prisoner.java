// Prisoner.java

public class Prisoner {

    private final String name;
    private final int number;

    private static int nextNumber = 1;

    public Prisoner(String name) {
        this.name = name;
        this.number = nextNumber++;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}