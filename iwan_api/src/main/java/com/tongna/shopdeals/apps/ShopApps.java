package com.tongna.shopdeals.apps;

import java.util.List;

import com.tongna.shopdeals.api.ShopsApi;
import com.tongna.shopdeals.api.impl.ShopsApiImpl;
import com.tongna.shopdeals.domain.Data2;
import com.tongna.shopdeals.domain.ShopListBack;
import com.tongna.shopdeals.domain.ShopsAndDeals;
import com.tongna.shopdeals.dto.ShopDto;

public class ShopApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopsApi api=new ShopsApiImpl();
		ShopDto dto=new ShopDto();
		dto.setCity_id(100010000);
		dto.setCat_ids("326");
		ShopListBack back = api.search(dto);
//		ShopListBack back = api.findDataApi2(100010000, "326", "962,994", "394,395", "1322,1328", "116.418993,39.915597",
//				"俏江南", 3000, 1, 5, 10);
		System.out.println(back + "  data2");
		Data2 data2 = back.getData();
		List<ShopsAndDeals> shops=	data2.getShops();
		for (ShopsAndDeals shops3 : shops) {
			System.out.println(shops3);
		}
		System.out.println(data2.getShops().size());
	}

}
