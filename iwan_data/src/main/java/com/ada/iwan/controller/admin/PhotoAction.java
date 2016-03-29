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
import com.ada.album.entity.Photo;
import com.ada.album.service.PhotoService;
@Controller
public class PhotoAction {
	private static final Logger log = LoggerFactory.getLogger(PhotoAction.class);

	@RequestMapping("/admin/photo/view_list")
	public String list(Pageable pageable, HttpServletRequest request, ModelMap model) {
	
		if (pageable==null) {
			pageable=new Pageable();
		}
		pageable.setPageSize(27);
		if (pageable.getOrders()==null||pageable.getOrders().size()==0) {
			pageable.getOrders().add(Order.desc("id"));
		}
		Page<Photo> pagination = manager.findPage(pageable);
		model.addAttribute("list", pagination.getContent());
		model.addAttribute("page", pagination);
		return "admin/photo/list";
	}

	@RequestMapping("/admin/photo/view_add")
	public String add(ModelMap model) {
		return "admin/photo/add";
	}

	@RequestMapping("/admin/photo/view_edit")
	public String edit(Pageable pageable,String id, Integer pageNo, HttpServletRequest request, ModelMap model) {
		model.addAttribute("model", manager.findById(id));
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("page", pageable);
		return "admin/photo/edit";
	}

	@RequestMapping("/admin/photo/model_save")
	public String save(Photo bean, HttpServletRequest request, ModelMap model) {
		bean = manager.save(bean);
		log.info("save Teacher id={}", bean.getId());
		return "redirect:view_list.htm";
	}

	@RequestMapping("/admin/photo/model_update")
	public String update(Pageable pageable, Photo bean,HttpServletRequest request, ModelMap model) {
		bean = manager.update(bean);
		log.info("update Teacher id={}.", bean.getId());
		return "redirect:/admin/photo/view_list.htm?pageNumber="+pageable.getPageNumber();
	}

	@RequestMapping("/admin/photo/model_delete")
	public String delete(Pageable pageable, String id, HttpServletRequest request, ModelMap model) {
			 
				manager.deleteById(id);
			 
		return "redirect:/admin/photo/view_list.htm?pageNumber="+pageable.getPageNumber();
	}
	@RequestMapping("/admin/photo/model_deletes")
	public String deletes(Pageable pageable, String[] ids, HttpServletRequest request, ModelMap model) {
			 
				manager.deleteByIds(ids);
			 
		return "redirect:/admin/photo/view_list.htm?pageNumber="+pageable.getPageNumber();
	}
	@Autowired
	private PhotoService manager;
}