package oopWithNLayeredApp_3.business;

import oopWithNLayeredApp_3.core.loging.Logger;
import oopWithNLayeredApp_3.dataAccess.HibernateProductDao;
import oopWithNLayeredApp_3.dataAccess.JdbcProductDao;
import oopWithNLayeredApp_3.dataAccess.ProductDao;
import oopWithNLayeredApp_3.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	
	public ProductManager(ProductDao productDao,Logger[] loggers) {
		this.productDao = productDao;
		this.loggers=loggers;
	}




	public void add(Product product) throws Exception {
		
		if (product.getUnitPrice()<10) {
			throw new Exception ("Ürün fiyatı 10dan küçük olamaz.");
		}
		
		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
	}
}

