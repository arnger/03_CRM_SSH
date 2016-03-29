package com.ada.iwan.controller.home;

import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ada.iwan.controller.BaseController;


@Controller
@RequestMapping(value = "home")
public class HomeController extends BaseController{

	@RequiresAuthentication
	@RequiresUser
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return getView("home/index");
	}
}
