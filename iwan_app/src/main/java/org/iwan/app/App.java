package org.iwan.app;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.ada.factory.ObjectFactory;
import com.ada.iwan.plugs.qiniu.QiNiuStoragePlugin;
import com.ada.iwan.utils.FreemarkerUtils;
import com.ada.plugin.api.StoragePlugin;

import freemarker.template.TemplateException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Map<String, String> model = new HashMap<String, String>();
		try {
			String path = FreemarkerUtils.process("/upload/media/${.now?string('yyyyMM')}/", model);
			System.out.println(path);
			StoragePlugin p = new QiNiuStoragePlugin();
			System.out.println(p.getUrl(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
