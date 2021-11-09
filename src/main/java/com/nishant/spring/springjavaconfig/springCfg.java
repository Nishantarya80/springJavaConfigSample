package com.nishant.spring.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DaoConfig.class)
public class springCfg {
	

	@Bean
	public Service service() {
		return new Service();
	}

}
