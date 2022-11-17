package oopWithNLayeredApp_3;

import oopWithNLayeredApp_3.business.ProductManager;
import oopWithNLayeredApp_3.core.loging.DatabaseLogger;
import oopWithNLayeredApp_3.core.loging.FileLogger;
import oopWithNLayeredApp_3.core.loging.Logger;
import oopWithNLayeredApp_3.dataAccess.JdbcProductDao;
import oopWithNLayeredApp_3.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "IPhone XR", 9000);
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
		ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);
		productManager.add(product1);
	}

}
