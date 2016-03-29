package com.tongna.shopdeals.apps;

import com.tongna.shopdeals.api.DataApi;
import com.tongna.shopdeals.api.impl.DataApiImpl;
import com.tongna.shopdeals.domain.Data;
import com.tongna.shopdeals.domain.DataBack;

public class DataApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataApi api = new DataApiImpl();
		DataBack back = api.findData(100010000, "326", "962,994", "394,395", "1322,1328", " 116.4374,39.8719", "金鼎轩",
				3000, 0, 1, 10, 0);
		System.out.println(back + " data");
		Data data = back.getData();
		System.out.println(data);
	}

}
