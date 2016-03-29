package org.iwan.app;

import com.ada.activity.entity.Activity;
import com.ada.activity.entity.ActivityCatalog;
import com.ada.activity.service.ActivityService;
import com.ada.iwan.apps.ObjectFactory;

public class ActivityApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ActivityService service=ObjectFactory.get().getBean(ActivityService.class);
		for (int i = 0; i < 100; i++) {
			Activity bean=new Activity();
			bean.setName("dsfsd");
			
			ActivityCatalog parent=new ActivityCatalog();
			parent.setId(1);
			bean.setCatalog(parent);
			service.save(bean);
		}
		
	}

}
