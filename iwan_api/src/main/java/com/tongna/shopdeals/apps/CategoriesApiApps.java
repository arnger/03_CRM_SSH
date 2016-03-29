package com.tongna.shopdeals.apps;

import java.util.List;

import com.tongna.shopdeals.api.CategoriesApi;
import com.tongna.shopdeals.api.impl.CategoriesApiImpl;
import com.tongna.shopdeals.domain.Categories;
import com.tongna.shopdeals.domain.CategoriesListBack;

public class CategoriesApiApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CategoriesApi api=new CategoriesApiImpl();
		CategoriesListBack back=	api.findCategoriesApi();
		List<Categories>  cs=	back.getCategories();
		for (Categories categories : cs) {
			System.out.println(categories);
		}
		
	}

}
