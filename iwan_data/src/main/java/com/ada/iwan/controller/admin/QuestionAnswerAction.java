package com.ada.iwan.controller.admin;



import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ada.data.page.Order;
import com.ada.data.page.Page;
import com.ada.data.page.Pageable;
import com.ada.question.entity.QuestionAnswer;
import com.ada.question.service.QuestionAnswerService;
@Controller
public class QuestionAnswerAction {
	private static final Logger log = LoggerFactory.getLogger(QuestionAnswerAction.class);

	@RequestMapping("/admin/questionanswer/view_list")
	public String list(Pageable pageable, HttpServletRequest request, ModelMap model) {
	
		if (pageable==null) {
			pageable=new Pageable();
		}
		if (pageable.getOrders()==null||pageable.getOrders().size()==0) {
			pageable.getOrders().add(Order.desc("id"));
		}
		Page<QuestionAnswer> pagination = manager.findPage(pageable);
		model.addAttribute("list", pagination.getContent());
		model.addAttribute("page", pagination);
		return "admin/questionanswer/list";
	}

	@RequestMapping("/admin/questionanswer/view_add")
	public String add(ModelMap model) {
		return "admin/questionanswer/add";
	}

	@RequestMapping("/admin/questionanswer/view_edit")
	public String edit(Pageable pageable,Long id, Integer pageNo, HttpServletRequest request, ModelMap model) {
		model.addAttribute("model", manager.findById(id));
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("page", pageable);
		return "admin/questionanswer/edit";
	}

	@RequestMapping("/admin/questionanswer/model_save")
	public String save(QuestionAnswer bean, HttpServletRequest request, ModelMap model) {
		bean = manager.save(bean);
		log.info("save Teacher id={}", bean.getId());
		return "redirect:view_list.htm";
	}

	@RequestMapping("/admin/questionanswer/model_update")
	public String update(Pageable pageable, QuestionAnswer bean,HttpServletRequest request, ModelMap model) {
		bean = manager.update(bean);
		log.info("update Teacher id={}.", bean.getId());
		return "redirect:/admin/questionanswer/view_list.htm?pageNumber="+pageable.getPageNumber();
	}

	@RequestMapping("/admin/questionanswer/model_delete")
	public String delete(Pageable pageable, Long id, HttpServletRequest request, ModelMap model) {
			 
				manager.deleteById(id);
			 
		return "redirect:/admin/questionanswer/view_list.htm?pageNumber="+pageable.getPageNumber();
	}
	@RequestMapping("/admin/questionanswer/model_deletes")
	public String deletes(Pageable pageable, Long[] ids, HttpServletRequest request, ModelMap model) {
			 
				manager.deleteByIds(ids);
			 
		return "redirect:/admin/questionanswer/view_list.htm?pageNumber="+pageable.getPageNumber();
	}
	@Autowired
	private QuestionAnswerService manager;
}