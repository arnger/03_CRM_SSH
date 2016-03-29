/*
 * 
 * 
 * 
 */
package com.ada.iwan.plugs.localfile;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ada.iwan.controller.BaseController;
import com.ada.plugin.entity.PluginConfig;
import com.ada.plugin.service.PluginConfigService;

/**
 * Controller - localfile
 * 
 * 
 * 
 */
@Controller("localFileController")
@RequestMapping("/admin/storage_plugin/localfile")
public class LocalFileController extends BaseController {

	@Resource(name = "localFilePlugin")
	private LocalFilePlugin localFilePlugin;
	@Resource(name = "pluginConfigServiceImpl")
	private PluginConfigService pluginConfigService;

	/**
	 * 安装
	 */
	@RequestMapping(value = "/install")
	public String install() {
		if (!localFilePlugin.getIsInstalled()) {
			PluginConfig pluginConfig = new PluginConfig();
			pluginConfig.setPluginId(localFilePlugin.getId());
			pluginConfig.setIsEnabled(false);
			pluginConfigService.save(pluginConfig);
		}
		return "redirect:/admin/storage_plugin/list.htm";
	}

	/**
	 * 卸载
	 */
	@RequestMapping(value = "/uninstall")
	public String uninstall() {
		if (localFilePlugin.getIsInstalled()) {
			PluginConfig pluginConfig = localFilePlugin.getPluginConfig();
			pluginConfigService.deleteById(pluginConfig.getId());
		}
		return "redirect:/admin/storage_plugin/list.htm";
	}

	/**
	 * 设置
	 */
	@RequestMapping(value = "/setting", method = RequestMethod.GET)
	public String setting(ModelMap model) {
		PluginConfig pluginConfig = localFilePlugin.getPluginConfig();
		model.addAttribute("pluginConfig", pluginConfig);
		return "/admin/plugs/localfile";
	}

	/**
	 * 更新
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(String diskpath, Integer order,String urlPrefix, @RequestParam(defaultValue = "false") Boolean isEnabled,  RedirectAttributes redirectAttributes) {
		PluginConfig pluginConfig = localFilePlugin.getPluginConfig();
		pluginConfig.setAttribute("diskpath", diskpath);
		pluginConfig.setAttribute("urlPrefix", StringUtils.removeEnd(urlPrefix, "/"));
		pluginConfig.setIsEnabled(isEnabled);
		pluginConfig.setSortnum(order);
		pluginConfigService.update(pluginConfig);
		//addFlashMessage(redirectAttributes, SUCCESS_MESSAGE);
		return "redirect:/admin/storage_plugin/list.htm";
	}

}