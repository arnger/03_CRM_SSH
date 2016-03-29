package com.tongna.shopdeals.apps;

import java.util.List;

import com.tongna.shopdeals.api.CitiesApi;
import com.tongna.shopdeals.api.impl.CitiesApiImpl;
import com.tongna.shopdeals.domain.Cities;
import com.tongna.shopdeals.domain.CitiesListBack;

public class CitiesApiApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CitiesApi api = new CitiesApiImpl();
		CitiesListBack back = api.findAll();
		List<Cities> city = back.getCities();
		System.out.println(city.size());
	}

}
