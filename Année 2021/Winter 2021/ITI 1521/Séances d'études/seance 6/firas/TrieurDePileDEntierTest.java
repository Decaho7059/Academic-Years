import static org.junit.Assert.*;

public class TrieurDePileDEntierTest {

    @org.junit.Test
    public void triPileDEntier() {
        ListePile<Integer> listePileEntier = new ListePile<>();
        listePileEntier.push(4);
        listePileEntier.push(2);
        listePileEntier.push(6);
        listePileEntier.push(5);

        TrieurDePileDEntier trieur = new TrieurDePileDEntier();

        Pile<Integer> pileTriee = trieur.triPileDEntier(listePileEntier);

        assertEquals(6, pileTriee.pop().intValue());
        assertEquals(5, pileTriee.pop().intValue());
        assertEquals(4, pileTriee.pop().intValue());
        assertEquals(2, pileTriee.pop().intValue());
    }
}