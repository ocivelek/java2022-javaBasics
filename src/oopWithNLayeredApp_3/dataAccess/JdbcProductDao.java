package oopWithNLayeredApp_3.dataAccess;

import oopWithNLayeredApp_3.entities.Product;

public class JdbcProductDao implements ProductDao {
	public void add(Product product) {
		System.out.println("JDBC ile veritabanına eklendi.");
	}
}
