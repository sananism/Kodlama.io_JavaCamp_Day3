package day3_OopWithNLayeredApp.dataAccess;

import day3_OopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
		//sadece ve sadece DB erişim kodları buraya yazılır.... SQL
		System.out.println("Hibernate ile veritabanina eklendi ");
	}
}
