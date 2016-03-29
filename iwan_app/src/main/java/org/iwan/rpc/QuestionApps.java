package org.iwan.rpc;

import com.ada.question.entity.Question;
import com.ada.question.entity.QuestionCatalog;
import com.ada.question.service.QuestionService;

public class QuestionApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			QuestionService service=RpcUtils.get(QuestionService.class);
			Question bean=new Question();
			bean.setTitle("这是测试数据"+i);
			bean.setContents("这是测试内容数据");
			QuestionCatalog catalog=new QuestionCatalog();
			catalog.setId(3);
			bean.setCatalog(catalog);
			service.save(bean);
		}
	

	}

}
