package com.ada.iwan.web.freemaker;

import static freemarker.template.ObjectWrapper.DEFAULT_WRAPPER;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.ada.data.page.Order.Direction;
import com.ada.data.page.Page;
import com.ada.data.page.Pageable;
import com.ada.iwan.data.entity.FriendLink;
import com.ada.iwan.data.service.FriendLinkService;
import com.young.web.utils.DirectiveUtils;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

public class FriendLinkDirective implements TemplateDirectiveModel {

	public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body)
			throws TemplateException, IOException {
		Integer size = DirectiveUtils.getInt("size", params);
		if (size == null) {
			size = 10;
		}
		Pageable pageable = new Pageable();
		pageable.setPageSize(size);
		pageable.setOrderDirection(Direction.asc);
		pageable.setOrderProperty("sortnum");
		Page<FriendLink> links = linkService.findPage(pageable);
		Map<String, TemplateModel> paramWrap = new HashMap<String, TemplateModel>(params);
		if (links.getContent() != null) {
			paramWrap.put("list", DEFAULT_WRAPPER.wrap(links.getContent()));
			Map<String, TemplateModel> origMap = DirectiveUtils.addParamsToVariable(env, paramWrap);
			if (body != null) {
				body.render(env.getOut());
			}
			DirectiveUtils.removeParamsFromVariable(env, paramWrap, origMap);
		}

	}

	@Autowired
	private FriendLinkService linkService;

}
