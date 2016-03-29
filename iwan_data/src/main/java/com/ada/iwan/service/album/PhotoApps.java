package com.ada.iwan.service.album;

import java.util.List;

import jodd.http.HttpRequest;

import com.ada.album.entity.Category;
import com.ada.album.service.CategoryService;
import com.ada.iwan.apps.ObjectFactory;
import com.ada.iwan.utils.RpcUtils;
import com.google.gson.Gson;

public class PhotoApps {

	public static void main(String[] args) {

		CategoryService service = RpcUtils.get(CategoryService.class);
		
		
		HttpRequest request = HttpRequest
				.get("http://service.picasso.adesk.com/v1/wallpaper/category?adult=false&first=1");
		String body = request.send().body();
        System.out.println(body);
        Gson gson=new Gson();
        DataBack back=     gson.fromJson(body, DataBack.class);
        System.out.println(back);
        List<Category> cs=     back.getRes().getCategory();
        for (Category category : cs) {
			System.out.println(category);
			service.save(category);
		}
	}

}
