package com.test.layout.config;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.layout.filter.SitemeshFilter;

@Configuration
public class ServletFilterConfig {
		@Bean
		public FilterRegistrationBean siteMeshFilter() {
			FilterRegistrationBean filter = new FilterRegistrationBean();
			filter.setFilter(new SitemeshFilter());
			return filter;
		}
}

