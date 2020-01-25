import Domain.*;
import static  org.junit.Assert.*;
import org.junit.Test;


public class AppTest {

    @Test
    public void crearItem() {
        // Test para la clase Item, comprueba que el objeto se crea correctamente.

        Item item = new Item("+5 Dexterity Vest", 10, 20);

        assertEquals("+5 Dexterity Vest", item.getName());
        assertEquals("10", item.getSell_in().toString());
        assertEquals("20", item.getQuality().toString());

    }

    @Test
    public void crearNormalItem() {
        //Test clase NormalItem, comprueba que el objeto se crea correctamente.

        NormalItem elixir = new NormalItem("Elixir of the Mongoose", 5, 7);

        assertEquals("Elixir of the Mongoose", elixir.getName());
        assertEquals("5", elixir.getSell_in().toString());
        assertEquals("7", elixir.getQuality().toString());
    }
}
