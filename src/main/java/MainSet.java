import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainSet {

    public static void main(String[] args) {

        JailSet superSecureJail = new JailSet(5);

        Set<Prisoner> prisoners = new HashSet<>();

        prisoners.add(new Prisoner("Oli"));
        prisoners.add(new Prisoner("Jasmine"));
        prisoners.add(new Prisoner("Oli"));

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

        input.close();
    }
}