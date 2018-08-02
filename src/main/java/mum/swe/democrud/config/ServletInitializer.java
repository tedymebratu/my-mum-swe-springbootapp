package mum.swe.democrud.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import mum.swe.democrud.DemocrudApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemocrudApplication.class);
	}

}