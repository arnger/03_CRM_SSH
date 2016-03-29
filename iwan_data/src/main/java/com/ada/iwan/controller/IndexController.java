package com.ada.iwan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ada.article.service.ArticleCatalogService;
import com.ada.article.service.ArticleService;

@Controller
public class IndexController extends BaseController {

	@Autowired
	ArticleService articleService;
	
	
	@Autowired
	ArticleCatalogService articleCatalogService;
	
	
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("articles", articleService.getPage(1, 10).getList());
		model.addAttribute("catalogs", articleCatalogService.findChild(1));
		return getView("index");
	}
}
