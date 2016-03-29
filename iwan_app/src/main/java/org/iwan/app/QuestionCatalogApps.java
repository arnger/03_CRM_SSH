package org.iwan.app;

import com.ada.activity.entity.ActivityCatalog;
import com.ada.iwan.apps.ObjectFactory;
import com.ada.question.entity.QuestionCatalog;
import com.ada.question.service.QuestionCatalogService;

public class QuestionCatalogApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QuestionCatalogService service=ObjectFactory.get().getBean(QuestionCatalogService.class);
		
		
		QuestionCatalog bean=new 	QuestionCatalog();
			ActivityCatalog parent=new ActivityCatalog();
			parent.setId(1);
			bean.setName("问答分类");
			service.save(bean);
	}

}
