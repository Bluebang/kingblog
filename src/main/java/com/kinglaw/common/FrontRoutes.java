package com.kinglaw.common;

import com.jfinal.config.Routes;
import com.kinglaw.index.IndexController;
/**
 * 前台路由
 */
public class FrontRoutes extends Routes{

	@Override
	public void config() {
	
		setBaseViewPath("/_view");
		
		add("/", IndexController.class,"/index");
	}

}
