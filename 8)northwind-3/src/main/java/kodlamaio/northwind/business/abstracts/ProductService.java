package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {

	// Product Listesi
	DataResult<List<Product>> getAll();

	//Pagination
	DataResult<List<Product>> getAll(int pageNumber, int pageSize);

	//Sorted
	DataResult<List<Product>> getAllSorted();

	// Product Ekleme
	Result add(Product product);


	//custom operations
	DataResult<Product> getByProductName(String productName);

    DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);

    DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);

	DataResult< List<Product>> getByCategoryIdIn(List<Integer> categories);

    DataResult<List<Product>> getByProductNameContains(String productName);

    DataResult<List<Product>> getByProductNameStartsWith(String productName);

	DataResult<List<Product>> GetByNameAndCategory(String productName, int categoryId);
	
}
