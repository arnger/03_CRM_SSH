package com.ada.iwan.controller.home;

import org.apache.shiro.authz.annotation.RequiresUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ada.iwan.controller.BaseController;
import com.ada.question.entity.Question;
import com.ada.question.page.QuestionPage;
import com.ada.question.service.QuestionCatalogService;
import com.ada.question.service.QuestionService;
import com.ada.shiro.utils.UserUtil;


@Controller
@RequestMapping(value = "question")
public class QuestionController extends BaseController {

	@Autowired
	QuestionCatalogService catalogService;
	
	
	@Autowired
	QuestionService questionService;
	
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index( @RequestParam(value = "curpage", required = true, defaultValue = "1") int curpage,
			@RequestParam(value = "pagesize", required = true, defaultValue = "20") int pagesize,Model model) {
		
		QuestionPage page =questionService.getPage(curpage, pagesize);
		model.addAttribute("catalogs", catalogService.findChild(1));
		model.addAttribute("questions", page.getList());

		
		return getView("question/index");
	}
	@RequestMapping(value = "/type/{catalog}", method = RequestMethod.GET)
	public String type(@PathVariable("catalog")String catalog, @RequestParam(value = "curpage", required = true, defaultValue = "1") int curpage,
			@RequestParam(value = "pagesize", required = true, defaultValue = "10") int pagesize,Model model) {
		if (catalog==null) {
			catalog="new";
		}
		QuestionPage page=null;
		if ("my".equals(catalog)) {
			 page =questionService.pageByUser(UserUtil.getCurrentUser().getId(), curpage, pagesize);

		}else{
			 page =questionService.pageByType(catalog,curpage, pagesize);

		}
		model.addAttribute("catalogs", catalogService.findChild(1));
		model.addAttribute("questions", page.getList());
		model.addAttribute("catalog", catalog);

		model.addAttribute("page", page);
		model.addAttribute("curpage", curpage);
		model.addAttribute("pagesize", pagesize);
		return getView("question/index");
	}
	
	@RequestMapping(value = "/catalog", method = RequestMethod.GET)
	public String catalog(Integer id, @RequestParam(value = "curpage", required = true, defaultValue = "1") int curpage,
			@RequestParam(value = "pagesize", required = true, defaultValue = "20") int pagesize, Model model) {
		QuestionPage page = questionService.pageByCatalog(id, curpage, pagesize);
		model.addAttribute("catalog", catalogService.findById(id));
		model.addAttribute("questions", page.getList());
		model.addAttribute("catalogs", catalogService.findChild(1));
		model.addAttribute("page", page);
		model.addAttribute("id", id);
		model.addAttribute("curpage", curpage);
		model.addAttribute("pagesize", pagesize);

		return getView("question/catalog");
	}
	
	@RequiresUser
	@RequestMapping(value = "/ask")
	public String ask( Model model) {
		
		model.addAttribute("catalogs", catalogService.findChild(1));
		return getView("question/ask");
	}
	
	
	@RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
	public String view(@PathVariable("id")Long id, Model model) {
		model.addAttribute("question", questionService.findById(id));
		model.addAttribute("catalogs", catalogService.findChild(1));
		return getView("question/view_view");
	}
	
	@RequiresUser
	@RequestMapping(value = "/model_add")
	public String model_add( Model model,Question question) {
		question.setUser(UserUtil.getCurrentUser());
		question.setState(0);
		question.setViews(0);
		questionService.save(question);
		
		return redirect("/question/view/"+question.getId()+".htm");
	}
	
}
