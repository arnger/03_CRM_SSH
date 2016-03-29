package org.iwan.app;

import com.ada.activity.entity.ActivityCatalog;
import com.ada.activity.service.ActivityCatalogService;
import com.ada.iwan.apps.ObjectFactory;

public class ActivityCatalogApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ActivityCatalogService service=ObjectFactory.get().getBean(ActivityCatalogService.class);
		
		
		for (int i = 0; i < 10; i++) {
			ActivityCatalog bean=new ActivityCatalog();
			ActivityCatalog parent=new ActivityCatalog();
			parent.setId(1);
			bean.setParent(parent);
			bean.setName("dsfsd"+i);
			service.save(bean);
		}
	}

}
