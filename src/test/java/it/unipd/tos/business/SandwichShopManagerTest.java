////////////////////////////////////////////////////////////////////
// Alessandro Rizzo 1162429 
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business;
import it.unipd.tos.business.exception.TakeAwayBillException;
import it.unipd.tos.model.MenuItem;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SandwichShopManagerTest {
    private List<MenuItem> itemsOrdered = new ArrayList<MenuItem>();
    @Test
    public void Bill_test_with_no_conditions() {
        itemsOrdered = new ArrayList<MenuItem>();
        SandwichShopManager bill = new SandwichShopManager();
        itemsOrdered.add(new MenuItem("Panino primavera",MenuItem.itemType.Panino, 3.50));
        itemsOrdered.add(new MenuItem("Panino vegetariano",MenuItem.itemType.Panino, 4.50));
        itemsOrdered.add(new MenuItem("Patatine",MenuItem.itemType.Fritto, 2.00));
        itemsOrdered.add(new MenuItem("Coca Cola",MenuItem.itemType.Bevanda, 1.00));
        try {
           assertEquals(11.0, bill.getOrderPrice(itemsOrdered), 0.0);
        } catch (TakeAwayBillException exc) {
            exc.getMessage();
        }
    }
    @Test
    public void Bill_test_piu_di_cinque_panini() {
    	itemsOrdered = new ArrayList<MenuItem>();
    	SandwichShopManager bill = new SandwichShopManager();
    	itemsOrdered.add(new MenuItem("Panino primavera",MenuItem.itemType.Panino, 3.50));
        itemsOrdered.add(new MenuItem("Panino vegetariano",MenuItem.itemType.Panino, 4.50));
        itemsOrdered.add(new MenuItem("Panino funghi e prosciutto",MenuItem.itemType.Panino, 3.50));
        itemsOrdered.add(new MenuItem("Panino salsiccia e peperoni",MenuItem.itemType.Panino, 4.50));
        itemsOrdered.add(new MenuItem("Panino Mozzarella e insalata",MenuItem.itemType.Panino, 3.00));
        itemsOrdered.add(new MenuItem("Panino Bertazzo",MenuItem.itemType.Panino, 6.50));
        itemsOrdered.add(new MenuItem("Patatine",MenuItem.itemType.Fritto, 2.00));
        itemsOrdered.add(new MenuItem("Coca Cola",MenuItem.itemType.Bevanda, 1.00));
        try {
            assertEquals(27.0, bill.getOrderPrice(itemsOrdered), 0.0);
         } catch (TakeAwayBillException exc) {
             exc.getMessage();
         }
    }
    @Test
    public void Bill_test_piu_di_cinquanta_euro() {
    	itemsOrdered = new ArrayList<MenuItem>();
    	SandwichShopManager bill = new SandwichShopManager();
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Piccolo",MenuItem.itemType.Panino, 4.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	try {
            assertEquals(61.0, bill.getOrderPrice(itemsOrdered), 0.0);
         } catch (TakeAwayBillException exc) {
             exc.getMessage();
         }
    	
    }
    @Rule
    public ExpectedException exception = ExpectedException.none();
    @Test
    public void Bill_test_piu_di_trenta_panini() throws TakeAwayBillException{
    	itemsOrdered = new ArrayList<MenuItem>();
    	SandwichShopManager bill = new SandwichShopManager();
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Piccolo",MenuItem.itemType.Panino, 4.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));
    	itemsOrdered.add(new MenuItem("Panino Carnivoro",MenuItem.itemType.Panino, 6.00));

    	exception.expect(TakeAwayBillException.class);
        exception.expectMessage("sono stati ordinati più di 30 panini");

        bill.getOrderPrice(itemsOrdered);
    	
    }

}
