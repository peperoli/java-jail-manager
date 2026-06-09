// JailTest.java

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JailTest {

    @Test
    void prisonerCanBeAdded() {

        Jail jail = new Jail(5);

        jail.addPrisoner("Oli");

        assertEquals(
                1,
                jail.getPrisonerCount()
        );
    }

    @Test
    void maxCapacityCannotBeExceeded() {

        Jail jail = new Jail(1);

        jail.addPrisoner("A");
        jail.addPrisoner("B");

        assertEquals(
                1,
                jail.getPrisonerCount()
        );
    }

    @Test
    void prisonerCanBeRemoved() {

        Jail jail = new Jail(5);

        jail.addPrisoner("A");
        jail.addPrisoner("B");

        int number =
                jail.getPrisoners().get(0).getNumber();

        jail.removePrisoner(number);

        assertEquals(
                1,
                jail.getPrisonerCount()
        );
    }

    @Test
    void countIsCorrect() {

        Jail jail = new Jail(5);

        jail.addPrisoner("A");
        jail.addPrisoner("B");

        assertEquals(
                2,
                jail.getPrisonerCount()
        );
    }
}