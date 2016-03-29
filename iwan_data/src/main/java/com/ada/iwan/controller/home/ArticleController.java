package com.ada.iwan.controller.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ada.article.page.ArticlePage;
import com.ada.article.service.ArticleCatalogService;
import com.ada.article.service.ArticleService;
import com.ada.iwan.controller.BaseController;

@Controller
@RequestMapping(value = "article")
public class ArticleController extends BaseController {

	@Autowired
	ArticleService articleService;

	@RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
	public String view(@PathVariable("id")Long id, Model model) {
		model.addAttribute("article", articleService.view(id));
		model.addAttribute("catalogs", articleCatalogService.findChild(1));
		return getView("article/view");
	}

	@Autowired
	ArticleCatalogService articleCatalogService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("articles", articleService.getPage(1, 10).getList());
		model.addAttribute("catalogs", articleCatalogService.findChild(1));
		return getView("article/index");
	}

	@RequestMapping(value = "/catalog", method = RequestMethod.GET)
	public String catalog(@RequestParam(value = "id", required = true, defaultValue = "1") int id,
			@RequestParam(value = "curpage", required = true, defaultValue = "1") int curpage,
			@RequestParam(value = "pagesize", required = true, defaultValue = "20") int pagesize, Model model) {
		
		ArticlePage page = articleService.pageByCatalog(id,curpage, pagesize);
		model.addAttribute("articles", page.getList());
		model.addAttribute("catalogs", articleCatalogService.findChild(1));
		model.addAttribute("page", page);
		model.addAttribute("id", id);
		model.addAttribute("curpage", curpage);
		model.addAttribute("pagesize", pagesize);
		return getView("article/catalog");
	}
}
