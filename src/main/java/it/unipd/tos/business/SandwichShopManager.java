////////////////////////////////////////////////////////////////////
// Alessandro Rizzo 1162429 
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business;

import java.util.List;

import it.unipd.tos.business.exception.TakeAwayBillException;
import it.unipd.tos.model.MenuItem;

public class SandwichShopManager implements TakeAwayBill{

    @Override
    public double getOrderPrice(List<MenuItem> itemsOrdered) throws TakeAwayBillException{
        double total = itemsOrdered.stream().mapToDouble(x -> x.getPrice()).sum();
        if(total > 50.0)
        {
        total = total * 0.90;
        }
        double discount = 0;
        if(itemsOrdered.stream().filter(s -> s.getType() == MenuItem.itemType.Panino).count() > 5)
        {
             discount = itemsOrdered.stream().filter(s -> s.getType() == MenuItem.itemType.Panino)
             .mapToDouble(d -> d.getPrice()).min().orElse(0.00)/ 2.0;
        }
        return total - discount;
    }
}
