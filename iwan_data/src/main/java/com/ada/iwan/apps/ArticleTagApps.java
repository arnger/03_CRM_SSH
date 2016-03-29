package com.ada.iwan.apps;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.analysis.tokenattributes.OffsetAttribute;
import org.apache.lucene.analysis.tokenattributes.TypeAttribute;
import org.wltea.analyzer.lucene.IKAnalyzer;

import com.ada.article.entity.Article;
import com.ada.article.service.ArticleService;
import com.ada.data.core.Pagination;

public class ArticleTagApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArticleService service = ObjectFactory.get().getBean(ArticleService.class);

		Pagination<Article> ss = service.getPage(0, 10);
		List<Article> as = ss.getList();
		for (Article article : as) {
			service.resetTagS(article.getId(), s(article.getContents()));
		}
	}

	public static void ss() {
		// 构建IK分词器，使用smart分词模式
		String key = "这是一个中文分词的例子，你可以直接运行它！IKAnalyer can analysis english text too";
		s(key);
	}

	private static List<String> s(String key) {
		List<String> result = new ArrayList<String>();
		if (key == null) {
			return result;
		}
		Analyzer analyzer = new IKAnalyzer(true);

		// 获取Lucene的TokenStream对象
		TokenStream ts = null;
		try {
			ts = analyzer.tokenStream("myfield", new StringReader(key));
			// 获取词元位置属性
			OffsetAttribute offset = ts.addAttribute(OffsetAttribute.class);
			// 获取词元文本属性
			CharTermAttribute term = ts.addAttribute(CharTermAttribute.class);
			// 获取词元文本属性
			TypeAttribute type = ts.addAttribute(TypeAttribute.class);

			// 重置TokenStream（重置StringReader）
			ts.reset();
			// 迭代获取分词结果
			while (ts.incrementToken()) {
				System.out.println(offset.startOffset() + " - " + offset.endOffset() + " : " + term.toString() + " | "
						+ type.type());
				result.add(term.toString());
			}
			// 关闭TokenStream（关闭StringReader）
			ts.end(); // Perform end-of-stream operations, e.g. set the final
						// offset.

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 释放TokenStream的所有资源
			if (ts != null) {
				try {
					ts.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

}
