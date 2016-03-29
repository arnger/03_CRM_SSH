package com.ada.iwan.service.album;

import com.ada.album.entity.PhotoFeed;
import com.ada.album.service.PhotoFeedService;
import com.ada.iwan.apps.ObjectFactory;

public class PhotoFeedApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhotoFeedService service=ObjectFactory.get().getBean(PhotoFeedService.class);
		
		PhotoFeed bean=new PhotoFeed();
		service.save(bean);
		try {
			Thread.sleep(3000l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		service.update(bean);
	}

}
