package day3_OopWithNLayeredApp.business;

import java.util.List;

import day3_OopWithNLayeredApp.core.logging.Logger;
import day3_OopWithNLayeredApp.dataAccess.HibernateProductDao;
import day3_OopWithNLayeredApp.dataAccess.JdbcProductDao;
import day3_OopWithNLayeredApp.dataAccess.ProductDao;
import day3_OopWithNLayeredApp.entities.Product;

public class ProductManager {
	
	private ProductDao productDao;
	private Logger[] loggers;
	
		public ProductManager(ProductDao productDao, Logger[] loggers2) {
		this.productDao = productDao;
		this.loggers = loggers2;
	}

		
		
		public void add(Product product) throws Exception {
			//business rules
			if(product.getUnitPrice()< 10) {
				throw new Exception("Ürün fiyatı 10dan küçük olamaz");
			}
			productDao.add(product);
			
			for(Logger logger: loggers) {  //db, mail
				logger.log(product.getName());
			}
		}
}
