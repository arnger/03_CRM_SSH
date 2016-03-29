package com.ada.iwan.controller.admin;



import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ada.article.entity.ArticleTag;
import com.ada.article.service.ArticleTagService;
import com.ada.data.page.Order;
import com.ada.data.page.Page;
import com.ada.data.page.Pageable;
@Controller
public class ArticleTagAction {
	private static final Logger log = LoggerFactory.getLogger(ArticleTagAction.class);

	@RequestMapping("/admin/articletags/view_list")
	public String list(Pageable pageable, HttpServletRequest request, ModelMap model) {
	
		if (pageable==null) {
			pageable=new Pageable();
		}
		if (pageable.getOrders()==null||pageable.getOrders().size()==0) {
			pageable.getOrders().add(Order.desc("id"));
		}
		Page<ArticleTag> pagination = manager.findPage(pageable);
		model.addAttribute("list", pagination.getContent());
		model.addAttribute("page", pagination);
		return "admin/articletags/list";
	}

	@RequestMapping("/admin/articletags/view_add")
	public String add(ModelMap model) {
		return "admin/articletags/add";
	}

	@RequestMapping("/admin/articletags/view_edit")
	public String edit(Long id, Integer pageNo, HttpServletRequest request, ModelMap model) {
		model.addAttribute("model", manager.findById(id));
		model.addAttribute("pageNo", pageNo);
		return "admin/articletags/edit";
	}

	@RequestMapping("/admin/articletags/model_save")
	public String save(ArticleTag bean, HttpServletRequest request, ModelMap model) {
		bean = manager.save(bean);
		log.info("save Teacher id={}", bean.getId());
		return "redirect:view_list.htm";
	}

	@RequestMapping("/admin/articletags/model_update")
	public String update(Pageable pageable, ArticleTag bean,HttpServletRequest request, ModelMap model) {
		bean = manager.update(bean);
		log.info("update Teacher id={}.", bean.getId());
		return list(pageable, request, model);
	}

	@RequestMapping("/admin/articletags/model_delete")
	public String delete(Pageable pageable, Long id, HttpServletRequest request, ModelMap model) {
			 
				manager.deleteById(id);
			 
		return list(pageable, request, model);
	}
	@RequestMapping("/admin/articletags/model_deletes")
	public String deletes(Pageable pageable, Long[] ids, HttpServletRequest request, ModelMap model) {
			 
				manager.deleteByIds(ids);
			 
		return list(pageable, request, model);
	}
	@Autowired
	private ArticleTagService manager;
}