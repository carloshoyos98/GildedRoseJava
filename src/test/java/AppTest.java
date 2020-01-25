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

    //Test métodos NormalItem

    @Test
    public void logicaNormalItem(){
        NormalItem mongoose = new NormalItem("Elixir of the Mongoose", 5, 55);
        NormalItem elixir = new NormalItem("Elixir of the Mongoose", 5, -15);
        NormalItem elixir1 = new NormalItem("Elixir of the Mongoose", 5, 25);
        NormalItem elixir2 = new NormalItem("Elixir of the Mongoose", 0, 25);


        assertEquals("50", mongoose.setQuality(-1).toString());
        assertEquals("0", elixir.setQuality(-1).toString());
        elixir1.update_quality();
        elixir2.update_quality();
        assertEquals("4", elixir1.getSell_in().toString());
        assertEquals("24", elixir1.getQuality().toString());
        assertEquals("-1", elixir2.getSell_in().toString());
        assertEquals("23", elixir2.getQuality().toString());
    }

    @Test
    public void logicaConjured() {
        Conjured conjured = new Conjured("Conjured Mana Cake", 3, 6);
        Conjured cake = new Conjured("Conjured Mana Cake", -2, 8);
        Conjured mana = new Conjured("Conjured Mana Cake", -5, 3);

        conjured.update_quality();
        cake.update_quality();
        mana.update_quality();
        assertEquals("4", conjured.getQuality().toString());
        assertEquals("4", cake.getQuality().toString());
        assertEquals("0", mana.getQuality().toString());
    }
}
