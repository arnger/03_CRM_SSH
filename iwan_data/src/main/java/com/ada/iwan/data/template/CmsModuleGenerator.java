package com.ada.iwan.data.template;

import com.ada.template_ace.ModuleMavenGenerator;

public class CmsModuleGenerator {
	private static String packName = "com.ada.iwan.data.template";
private static String fileName = "p_album.properties"; 

	public static void main(String[] args) {
		new ModuleMavenGenerator(packName, fileName).generate();
		System.out.println("ok");
	}
}
