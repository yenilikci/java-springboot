package Concrete;

import Abstract.BaseCategoryManager;
import Entities.Category;

public class CategoryManager extends BaseCategoryManager {

	void getAllCategory(Category[] categories) {
		for (Category category : categories) {
			System.out.println(category);
		}
	}

}
