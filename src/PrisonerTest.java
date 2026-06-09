// PrisonerTest.java

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrisonerTest {

    @Test
    void numberIsIncremented() {

        Prisoner p1 = new Prisoner("Max");
        Prisoner p2 = new Prisoner("Tom");

        assertEquals(
                p1.getNumber() + 1,
                p2.getNumber()
        );
    }

    @Test
    void nameIsStoredCorrectly() {

        Prisoner prisoner = new Prisoner("Oli");

        assertEquals(
                "Oli",
                prisoner.getName()
        );
    }
}