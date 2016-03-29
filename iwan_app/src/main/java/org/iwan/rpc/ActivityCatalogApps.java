package org.iwan.rpc;

import com.ada.activity.entity.ActivityCatalog;
import com.ada.activity.service.ActivityCatalogService;
import com.ada.iwan.apps.ObjectFactory;

public class ActivityCatalogApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ActivityCatalogService service=RpcUtils.get(ActivityCatalogService.class);
		ActivityCatalog root=new ActivityCatalog();
		root.setName("活动分类");
		service.save(root);
		for (int i = 0; i < 10; i++) {
			ActivityCatalog bean=new ActivityCatalog();
			ActivityCatalog parent=new ActivityCatalog();
			parent.setId(1);
			bean.setParent(parent);
			bean.setName("测试"+i);
			service.save(bean);
		}
	}

}
