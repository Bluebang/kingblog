package com.kinglaw.common;

import com.alibaba.druid.wall.WallFilter;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.json.MixedJsonFactory;
import com.jfinal.kit.Prop;
import com.jfinal.kit.PropKit;
import com.jfinal.template.Engine;

public class BlogConfig extends JFinalConfig{
	//private static Prop p = loadConfig();
	//private WallFilter wallFilter;
	@Override
	public void configConstant(Constants me) {
		// TODO Auto-generated method stub
		me.setDevMode(true);
		me.setJsonFactory(MixedJsonFactory.me());
	}

	@Override
	public void configEngine(Engine me) {
		// TODO Auto-generated method stub
		me.setDevMode(true);
		me.addSharedFunction("/_view/common/_layout.html");
	}

	@Override
	public void configHandler(Handlers me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configInterceptor(Interceptors me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configPlugin(Plugins me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configRoute(Routes me) {
		// TODO Auto-generated method stub
		    me.add(new FrontRoutes());
		//    me.add(new AdminRoutes());
	}
//	private static Prop loadConfig() {
//		try {
//			// 优先加载生产环境配置文件
//			return PropKit.use("jfinal_club_config_pro.txt");
//		} catch (Exception e) {
//			// 找不到生产环境配置文件，再去找开发环境配置文件
//			return PropKit.use("jfinal_club_config_dev.txt");
//		}
//	}
	
	public static void main(String[] args) {
		JFinal.start("src/main/webapp", 80, "/", 5);
	}
}
