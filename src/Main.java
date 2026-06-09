// Main.java

import java.util.Scanner;

void main() {

    Jail superSecureJail = new Jail(5);

    Prisoner[] prisoners = {
            new Prisoner("Oli"),
            new Prisoner("Jasmine"),
            new Prisoner("Oli")
    };

    superSecureJail.setPrisoners(prisoners);

    Scanner input = new Scanner(System.in);

    while (true) {

        System.out.println("Aktuelle Insassen:");

        for (Prisoner prisoner : superSecureJail.getPrisoners()) {

            System.out.println(
                    prisoner.getNumber()
                            + " "
                            + prisoner.getName()
            );
        }

        System.out.println(
                "\nAktuelle Belegung: "
                        + superSecureJail.getPrisonerCount()
                        + "/5"
        );

        if (superSecureJail.getPrisonerCount() >= 5) {
            System.out.println("Gefängnis ist voll!");
            break;
        }

        System.out.print("\nNeuen Insassen eingeben (oder exit): ");

        String name = input.nextLine();

        if (name.equalsIgnoreCase("exit")) {
            break;
        }

        superSecureJail.addPrisoner(name);
    }
}