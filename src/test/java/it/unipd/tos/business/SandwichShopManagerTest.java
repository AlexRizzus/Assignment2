////////////////////////////////////////////////////////////////////
// Alessandro Rizzo 1162429 
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business;
import it.unipd.tos.business.exception.TakeAwayBillException;
import it.unipd.tos.model.MenuItem;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SandwichShopManagerTest {
    private List<MenuItem> itemsOrdered = new ArrayList<MenuItem>();
    @Test
    public void Bill_test_with_few_items() {
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

}
