package com.ada.iwan.controller.user;

import org.apache.shiro.authz.annotation.RequiresUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ada.iwan.controller.BaseController;
import com.ada.shiro.utils.UserUtil;
import com.ada.user.entity.UserInfo;
import com.ada.user.service.UserInfoService;

@Controller
@RequestMapping(value = "user")
public class UserController extends BaseController {

	@RequiresUser
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {
		
		model.addAttribute("user", UserUtil.getCurrentUser());
		return getView("user/index");
	}
	@Autowired
	private UserInfoService userInfoService;
	@RequiresUser
	@RequestMapping(value = "/updateuser")
	public String updateuser(Model model,UserInfo user) {
		if (user!=null&&user.getId()!=null) {
			user=userInfoService.update(user);
			UserUtil.setCurrentUser(user);
		}
		return "redirect:/user/index.htm";
	}
}
