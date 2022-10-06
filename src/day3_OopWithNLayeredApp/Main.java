package day3_OopWithNLayeredApp;

import day3_OopWithNLayeredApp.business.ProductManager;
import day3_OopWithNLayeredApp.core.logging.DataBaseLogger;
import day3_OopWithNLayeredApp.core.logging.FileLogger;
import day3_OopWithNLayeredApp.core.logging.Logger;
import day3_OopWithNLayeredApp.core.logging.MailLogger;
import day3_OopWithNLayeredApp.dataAccess.HibernateProductDao;
import day3_OopWithNLayeredApp.dataAccess.JdbcProductDao;
import day3_OopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "Samsung A52", 620);
		
		Logger[] loggers = {new DataBaseLogger(), new FileLogger(), new MailLogger()};
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);

	}

}
