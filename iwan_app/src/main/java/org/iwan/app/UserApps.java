package org.iwan.app;

import com.ada.factory.ObjectFactory;
import com.ada.user.service.UserInfoService;

public class UserApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInfoService user = ObjectFactory.get().getBean(UserInfoService.class);
		user.reg("", "ada", "123456");
	}

}
