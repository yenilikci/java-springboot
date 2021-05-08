package Abstract;

import Entities.Product;

public abstract class BaseProductManager implements ProductService {

	@Override
	public void save(Product entity) {
		System.out.println(entity.getName() + " ürünü eklendi");
	}

	@Override
	public void update(Product entity) {
		System.out.println(entity.getName() + " ürünü güncellendi");
	}

	@Override
	public void delete(Product entity) {
		System.out.println(entity.getName() + " ürünü silindi");
	}
	

}
