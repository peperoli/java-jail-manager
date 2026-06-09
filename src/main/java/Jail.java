// Jail.java
import java.util.ArrayList;


public class Jail {

    private final int maxSize;
    private ArrayList<Prisoner> prisoners = new ArrayList<>();

    public Jail(int maxSize) {
        this.maxSize = maxSize;
    }

    public ArrayList<Prisoner> getPrisoners() {
        return prisoners;
    }

    public void setPrisoners(ArrayList<Prisoner> prisoners) {
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

       prisoners.remove(index);
    }
}