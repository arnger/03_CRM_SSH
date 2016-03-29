/*
 * 
 * 
 * 
 */
package com.ada.iwan.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ada.iwan.service.file.FileService;
import com.ada.iwan.utils.JsonUtils;
import com.ada.plugin.vo.FileInfo;
import com.ada.plugin.vo.FileInfo.FileType;
import com.ada.plugin.vo.FileInfo.OrderType;

/**
 * Controller - 文件处理
 * 
 * 
 * 
 */
@Controller("fileController")
@RequestMapping("files")
public class FileController extends BaseController {

	@Resource(name = "fileServiceImpl2")
	private FileService fileService;



	/**
	 * 上传
	 */
	@RequestMapping(value = "/upload", method = RequestMethod.POST, produces = "text/html; charset=UTF-8")
	public void upload(FileType fileType, MultipartFile file, HttpServletResponse response) {
		Map<String, Object> data = new HashMap<String, Object>();
		if (!fileService.isValid(fileType, file)) {
			data.put("message", "");
		} else {
			String url = fileService.upload(fileType, file, false);
			if (url == null) {
				data.put("message", "");
			} else {
				data.put("message", "");
				data.put("url", url);
			}
		}
		try {
			response.setContentType("text/html; charset=UTF-8");
			JsonUtils.writeValue(response.getWriter(), data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	/**
	 * 浏览
	 */
	@RequestMapping(value = "/browser", method = RequestMethod.GET)
	public @ResponseBody List<FileInfo> browser(String path, FileType fileType, OrderType orderType) {
		return fileService.browser(path, fileType, orderType);
	}

}