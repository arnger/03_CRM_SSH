package org.iwan.rpc;

import com.ada.activity.entity.Activity;
import com.ada.activity.entity.ActivityCatalog;
import com.ada.activity.service.ActivityService;
import com.ada.iwan.apps.ObjectFactory;

public class ActivityApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ActivityService service = RpcUtils.get(ActivityService.class);
		for (int i = 0; i < 100; i++) {
			Activity bean = new Activity();
			bean.setName("这是测试数据" + i);

			ActivityCatalog parent = new ActivityCatalog();
			parent.setId(3);
			bean.setCatalog(parent);
			bean=service.save(bean);
			System.out.println(bean.getId());
		}

	}

}
