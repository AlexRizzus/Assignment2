package it.unipd.tos.business;

import java.util.List;

import it.unipd.tos.business.exception.TakeAwayBillException;
import it.unipd.tos.model.MenuItem;

public class SandwichShopManager implements TakeAwayBill{
	
	@Override
	public double getOrderPrice(List<MenuItem> itemsOrdered) throws TakeAwayBillException{
		double total = itemsOrdered.stream().mapToDouble(x -> x.getPrice()).sum();
		return total;
	}

}
