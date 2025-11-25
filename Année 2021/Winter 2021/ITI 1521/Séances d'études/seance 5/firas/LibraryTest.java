import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void buyCalculator_buyOneCalculator() {
        Library library = new Library();
        Calculator calculator = new Calculator();

        int result = library.buyCalculator(calculator);

        assertEquals(1, result);
    }

    @Test
    public void buyCalculator_buy15Calculators() {
        Library library = new Library();

        for(int i = 0; i<15; i++){
            library.buyCalculator(new Calculator());
        }

        int result = library.calculators.length;

        assertEquals(10, result);
    }

    @Test
    public void buyCalculator_buyNull() {
        Library library = new Library();

        int result = library.buyCalculator(null);

        assertEquals(0, result);
    }

    @Test
    public void buyCalculator_buyNullAfter5NonNull() {
        Library library = new Library();

        for(int i = 0; i<5; i++){
            library.buyCalculator(new Calculator());
        }


        int result = library.buyCalculator(null);

        assertEquals(5, result);
    }

    @Test
    public void sellLastCalculator() {
    }

    @Test
    public void setName(){
        String name = "happy library";
        String defaultName = "default library";
        Library library = new Library();

        assertEquals(defaultName, library.getName());

        library.setName(name);

        assertEquals(name, library.getName());
    }
}