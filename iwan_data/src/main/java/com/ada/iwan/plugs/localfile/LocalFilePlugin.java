/*
 * 
 * 
 * 
 */
package com.ada.iwan.plugs.localfile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;

import com.ada.plugin.api.StoragePlugin;
import com.ada.plugin.entity.PluginConfig;
import com.ada.plugin.vo.FileInfo;

/**
 * Plugin - 本地文件存储
 * 
 * 
 * 
 */
@Component("localFilePlugin")
public class LocalFilePlugin extends StoragePlugin {

	@Override
	public String getName() {
		return "磁盘文件存储";
	}

	@Override
	public String getVersion() {
		return "1.0";
	}

	@Override
	public String getAuthor() {
		return "ada.young";	}

	@Override
	public String getSiteUrl() {
		return null;
	}

	@Override
	public String getInstallUrl() {
		return "localfile/install.htm";
	}

	@Override
	public String getUninstallUrl() {
		return "localfile/uninstall.htm";
	}

	@Override
	public String getSettingUrl() {
		return "localfile/setting.htm";
	}

	@Override
	public void upload(String path, File file, String contentType) {
		File destFile = new File(getpath(path));
		try {
			FileUtils.copyFile(file, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String getpath(String path) {
		PluginConfig pluginConfig = getPluginConfig();
		if (pluginConfig != null) {
			String diskpath = pluginConfig.getAttribute("diskpath");
			return diskpath + path;
		}
		return null;
	}
	private String getUrlPath(String path) {
		PluginConfig pluginConfig = getPluginConfig();
		if (pluginConfig != null) {
			String diskpath = pluginConfig.getAttribute("diskpath");
			return diskpath + path;
		}
		return null;
	}
	@Override
	public String getUrl(String path) {
		return getUrlPath(path);
	}

	@Override
	public List<FileInfo> browser(String path) {
		List<FileInfo> fileInfos = new ArrayList<FileInfo>();
		File directory = new File(getpath(path));
		if (directory.exists() && directory.isDirectory()) {
			for (File file : directory.listFiles()) {
				FileInfo fileInfo = new FileInfo();
				fileInfo.setName(file.getName());
				fileInfo.setUrl(getUrlPath(path) + file.getName());
				fileInfo.setIsDirectory(file.isDirectory());
				fileInfo.setSize(file.length());
				fileInfo.setLastModified(new Date(file.lastModified()));
				fileInfos.add(fileInfo);
			}
		}
		return fileInfos;
	}

}