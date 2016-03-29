package org.iwan.rpc;

import com.ada.question.entity.QuestionCatalog;
import com.ada.question.service.QuestionCatalogService;

public class QuestionCatalogApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionCatalogService service=RpcUtils.get(QuestionCatalogService.class);
		QuestionCatalog bean=new QuestionCatalog();
		QuestionCatalog parent=new QuestionCatalog();
		parent.setId(1);
		bean.setParent(parent);
		bean.setName("旅行策略");
		bean=service.save(bean);
		System.out.println(bean);
	}

}
