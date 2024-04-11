package com.test.layout.sitemesh;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.layout.sitemesh.SitemeshFilter;

@Configuration
public class ServletFilterConfig {
		@Bean
		public FilterRegistrationBean siteMeshFilter() {
			FilterRegistrationBean filter = new FilterRegistrationBean();
			filter.setFilter(new SitemeshFilter());
			return filter;
		}
}

