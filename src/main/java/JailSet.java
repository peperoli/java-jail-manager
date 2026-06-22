import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JailSet {

    private final int maxSize;
    private Set<Prisoner> prisoners = new HashSet<>();

    public JailSet(int maxSize) {
        this.maxSize = maxSize;
    }

    public Set<Prisoner> getPrisoners() {
        return prisoners;
    }

    public void setPrisoners(Set<Prisoner> prisoners) {
        this.prisoners = prisoners;
    }

    public int getPrisonerCount() {
        return prisoners.size();
    }

    public void addPrisoner(String name) {

        if (prisoners.size() >= maxSize) {
            System.out.println("Gefängnis ist voll!");
            return;
        }

        prisoners.add(new Prisoner(name));
    }

   
    public void removePrisoner(int index) {

        if (index < 0 || index >= prisoners.size()) {
            System.out.println("Ungültiger Index!");
            return;
        }

        Iterator<Prisoner> iterator = prisoners.iterator();
        int counter = 0;

        while (iterator.hasNext()) {
            iterator.next();

            if (counter == index) {
                iterator.remove();
                return;
            }

            counter++;
        }
    }
}
