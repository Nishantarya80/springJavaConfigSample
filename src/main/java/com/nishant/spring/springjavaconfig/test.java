package com.nishant.spring.springjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(springCfg.class);
		ctx.refresh();
		Dao dao = ctx.getBean(Dao.class);
		dao.create();
		ctx.refresh();
		Service daoServe = ctx.getBean(Service.class);
		daoServe.save();
	}
}
