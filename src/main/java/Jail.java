// Jail.java

import java.util.Arrays;

public class Jail {

    private final int maxSize;
    private Prisoner[] prisoners = new Prisoner[0];

    public Jail(int maxSize) {
        this.maxSize = maxSize;
    }

    public Prisoner[] getPrisoners() {
        return Arrays.copyOf(prisoners, prisoners.length);
    }

    public void setPrisoners(Prisoner[] prisoners) {
        this.prisoners = prisoners;
    }

    public int getPrisonerCount() {
        return prisoners.length;
    }

    public void addPrisoner(String name) {

        if (prisoners.length >= maxSize) {
            System.out.println("Gefängnis ist voll!");
            return;
        }

        Prisoner[] newArray = new Prisoner[prisoners.length + 1];

        for (int i = 0; i < prisoners.length; i++) {
            newArray[i] = prisoners[i];
        }

        newArray[prisoners.length] = new Prisoner(name);

        prisoners = newArray;
    }

    public void removePrisoner(int number) {

        int index = -1;

        for (int i = 0; i < prisoners.length; i++) {

            if (prisoners[i].getNumber() == number) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return;
        }

        Prisoner[] newArray = new Prisoner[prisoners.length - 1];

        int j = 0;

        for (int i = 0; i < prisoners.length; i++) {

            if (i != index) {
                newArray[j] = prisoners[i];
                j++;
            }
        }

        prisoners = newArray;
    }
}