package org.springframework.samples.travel;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.module.sitemesh.Decorator;
import com.opensymphony.module.sitemesh.Page;
import com.opensymphony.module.sitemesh.mapper.AbstractDecoratorMapper;

public class NoLayoutDecoratorMapper extends AbstractDecoratorMapper {

	@Override
	public Decorator getDecorator(HttpServletRequest request, Page page) {
		if ("nolayout".equals(request.getParameter("htmlFormat"))) {
			return null;
		}
		return super.getDecorator(request, page);
	}
	
}
