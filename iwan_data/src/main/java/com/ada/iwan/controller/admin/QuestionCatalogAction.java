package com.ada.iwan.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ada.data.page.Filter;
import com.ada.data.page.Order;
import com.ada.data.page.Page;
import com.ada.data.page.Pageable;
import com.ada.question.entity.QuestionCatalog;
import com.ada.question.service.QuestionCatalogService;

@Controller
public class QuestionCatalogAction {
	private static final Logger log = LoggerFactory.getLogger(QuestionCatalogAction.class);

	@RequestMapping("/admin/questioncatalog/view_list")
	public String list(@RequestParam(value = "id", required = true, defaultValue = "1") int id, Pageable pageable,
			HttpServletRequest request, ModelMap model) {

		if (pageable == null) {
			pageable = new Pageable();
		}
		if (pageable.getOrders() == null || pageable.getOrders().size() == 0) {
			pageable.getOrders().add(Order.desc("id"));
		}
		pageable.getFilters().add(Filter.eq("parent.id", id));
		model.addAttribute("id", id);
		model.addAttribute("tops", manager.findTop(id));
		 Page<QuestionCatalog> pagination = manager.findPage(pageable);
		 model.addAttribute("list", pagination.getContent());
		model.addAttribute("page", pagination);
		return "admin/questioncatalog/list";
	}

	@RequestMapping("/admin/questioncatalog/view_add")
	public String add(ModelMap model) {
		return "admin/questioncatalog/add";
	}

	@RequestMapping("/admin/questioncatalog/view_edit")
	public String edit(Integer id,Pageable pageable, HttpServletRequest request, ModelMap model) {
		model.addAttribute("model", manager.findById(id));
		model.addAttribute("pageable", pageable);
		return "admin/questioncatalog/edit";
	}

	@RequestMapping("/admin/questioncatalog/model_save")
	public String save(QuestionCatalog bean, HttpServletRequest request, ModelMap model) {
		bean = manager.save(bean);
		Integer parid =bean.getParentId();

		log.info("save Teacher id={}", bean.getId());
		if (bean.getParentId() != null) {
			return "redirect:/admin/questioncatalog/view_list.htm?id=" + bean.getParentId();

		} else {
			return "redirect:/admin/questioncatalog/view_list.htm";

		}	}

	@RequestMapping("/admin/questioncatalog/model_update")
	public String update(Pageable pageable, QuestionCatalog bean, HttpServletRequest request, ModelMap model) {
		bean = manager.update(bean);
		log.info("update Teacher id={}.", bean.getId());
		if (bean.getParentId() != null) {
			return "redirect:/admin/questioncatalog/view_list.htm?id=" + bean.getParentId();

		} else {
			return "redirect:/admin/questioncatalog/view_list.htm";

		}
	}

	@RequestMapping("/admin/questioncatalog/model_delete")
	public String delete(Pageable pageable, Integer id, HttpServletRequest request, ModelMap model) {

		Integer parid = manager.findById(id).getParentId();
		manager.deleteById(id);

		if (parid != null) {
			return "redirect:/admin/questioncatalog/view_list.htm?id=" + parid;

		} else {
			return "redirect:/admin/questioncatalog/view_list.htm";

		}
	}

	@RequestMapping("/admin/questioncatalog/model_deletes")
	public String deletes(Pageable pageable, Integer[] ids, HttpServletRequest request, ModelMap model) {
		Integer parid = manager.findById(ids[0]).getParentId();

		manager.deleteByIds(ids);

		if (parid != null) {
			return "redirect:/admin/questioncatalog/view_list.htm?id=" + parid;
		} else {
			return "redirect:/admin/questioncatalog/view_list.htm";

		}
	}

	@Autowired
	private QuestionCatalogService manager;
}