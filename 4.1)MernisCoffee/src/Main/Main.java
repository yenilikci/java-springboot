package Main;

import java.util.GregorianCalendar;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		// new BaseCustomerManager olamaz fakat Nero... veya Starbucks... olabilir
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1, "Muhammed Melih", "Çelik", new GregorianCalendar(0000, 0, 0).getTime(),
				"tcKimlikNoVarBurada"));

	}

}
