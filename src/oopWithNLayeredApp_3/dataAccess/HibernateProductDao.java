package oopWithNLayeredApp_3.dataAccess;

import oopWithNLayeredApp_3.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
		System.out.println("Hibernate ile veritabanına eklendi.");
	}
}
