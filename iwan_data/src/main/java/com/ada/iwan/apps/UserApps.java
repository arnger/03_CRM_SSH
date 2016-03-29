package com.ada.iwan.apps;

import com.ada.user.entity.UserInfo;
import com.ada.user.service.UserInfoService;

public class UserApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserInfoService service = ObjectFactory.get().getBean(
				UserInfoService.class);
		UserInfo user = service.findById(1l);
		System.out.println(user);
		user.getAttributes().put("sex", "男1");
		user.getAttributes().put("age", "1");
		service.update(user);
		user.getAttributes().clear();
		user.getAttributes().put("age", "1");
		service.update(user);
	}

}
