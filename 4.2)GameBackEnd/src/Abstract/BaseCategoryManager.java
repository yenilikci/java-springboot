package Abstract;

import Entities.Category;

public abstract class BaseCategoryManager implements CategoryService{

	@Override
	public void save(Category entity) {
		System.out.println(entity.getName() + " kategorisi eklendi");	
	}

	@Override
	public void update(Category entity) {
		System.out.println(entity.getName() + " kategorisi güncellendi");
	}

	@Override
	public void delete(Category entity) {
		System.out.println(entity.getName() + " kategorisi silindi");
	}

}
