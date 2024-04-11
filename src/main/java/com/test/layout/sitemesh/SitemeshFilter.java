package com.test.layout.sitemesh;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

public class SitemeshFilter extends ConfigurableSiteMeshFilter {
	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
		builder.addDecoratorPath("/*", "/WEB-INF/views/sitemesh/layout.jsp")
			   .addDecoratorPath("/sub/*", "/WEB-INF/views/sitemesh/sub_layout.jsp")
		       .addExcludedPath("/signin");
	}
}
