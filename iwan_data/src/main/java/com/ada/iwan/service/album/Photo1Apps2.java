package com.ada.iwan.service.album;

import java.util.List;

import jodd.http.HttpRequest;

import com.ada.album.entity.Category;
import com.ada.album.entity.Photo;
import com.ada.album.entity.Tag;
import com.ada.album.page.CategoryPage;
import com.ada.album.service.CategoryService;
import com.ada.album.service.PhotoService;
import com.ada.album.service.TagService;
import com.ada.iwan.apps.ObjectFactory;
import com.ada.iwan.utils.RpcUtils;
import com.google.gson.Gson;

public class Photo1Apps2 {

	
	public static void main(String[] args) {
		CategoryService service = ObjectFactory.get().getBean(CategoryService.class);
		CategoryPage page = service.getPage(1, 100);
		List<Category> cs = page.getList();
		if (cs != null) {
			for (Category category : cs) {
				int max = category.getCount() / 30;
				for (int i = 0; i < max; i++) {
					try {
						add(0 + i * 30,category.getId());
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}

		}

	}

	private static void add(int start, String cata) {
		PhotoService service = ObjectFactory.get().getBean(PhotoService.class);
		TagService tagservice =ObjectFactory.get().getBean(TagService.class);

		HttpRequest request = HttpRequest
				.get("http://service.picasso.adesk.com/v1/wallpaper/category/"
						+ cata + "/wallpaper");
		request.query("order", "new");
		request.query("adult", "false");
		request.query("first", "0");
		request.query("skip", "" + start);
		request.query("limit", "30");

		String body = request.send().body();
		System.out.println(body);
		Gson gson = new Gson();
		WallpaperBack back = gson.fromJson(body, WallpaperBack.class);
		System.out.println(back);
		List<PhotoVo> cs = back.getRes().getWallpaper();
		for (PhotoVo photot : cs) {
			System.out.println(photot);
			List<String> tags = photot.getTag();
			Photo photo = new Photo();
			if (tags != null) {
				try {
					for (String string : tags) {
						if (string!=null&&string.length()>0) {
							tagservice.save(Tag.fromName(string));
							photo.getTags().add(Tag.fromName(string));
						}
						
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			photo.setName(photot.getDesc());
			photo.setThumb(photot.getThumb());
			photo.setImg(photot.getImg());
			photo.setId(photot.getId());
			Category category1=new Category();
			category1.setId(cata);
			photo.setCategory(category1);
			try {
				service.save(photo);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
