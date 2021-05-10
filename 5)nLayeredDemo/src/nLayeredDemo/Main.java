package nLayeredDemo;

import java.util.ArrayList;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.jLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.jLoggerManager;

public class Main {

	public static void main(String[] args) {

		// ToDo: Spring IoC ile çözülecek
		// ProductService productService = new ProductManager(new
		// HibernateProductDao());
		ProductService productService = new ProductManager(new AbcProductDao(), new jLoggerManagerAdapter());

		Product product = new Product(1, 2, "Elma", 12, 50);
		productService.add(product);

	}

}