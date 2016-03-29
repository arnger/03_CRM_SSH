package com.ada.iwan.controller.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ada.album.page.CategoryPage;
import com.ada.album.page.PhotoPage;
import com.ada.album.service.CategoryService;
import com.ada.album.service.PhotoService;
import com.ada.iwan.controller.BaseController;

@Controller
@RequestMapping(value = "photo")
public class PhotoController extends BaseController {

	@Autowired
	PhotoService service;

	@Autowired
	CategoryService categoryService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(@RequestParam(value = "curpage", required = true, defaultValue = "1") int curpage,
			@RequestParam(value = "pagesize", required = true, defaultValue = "20") int pagesize, Model model) {
		PhotoPage page = service.getPage(curpage, pagesize);
		model.addAttribute("photos", page.getList());
		model.addAttribute("catalogs", categoryService.getPage(1, 20).getList());
		model.addAttribute("page", page);
		model.addAttribute("curpage", curpage);
		model.addAttribute("pagesize", pagesize);
		return getView("photo/index");
	}

	@RequestMapping(value = "/catalog", method = RequestMethod.GET)
	public String catalog(String id, @RequestParam(value = "curpage", required = true, defaultValue = "1") int curpage,
			@RequestParam(value = "pagesize", required = true, defaultValue = "20") int pagesize, Model model) {
		PhotoPage page = service.pageByCatalog(id, curpage, pagesize);

		model.addAttribute("photos", page.getList());
		model.addAttribute("catalogs", categoryService.getPage(1, 20).getList());
		model.addAttribute("page", page);
		model.addAttribute("id", id);
		model.addAttribute("curpage", curpage);
		model.addAttribute("pagesize", pagesize);

		return getView("photo/catalog");
	}
}
