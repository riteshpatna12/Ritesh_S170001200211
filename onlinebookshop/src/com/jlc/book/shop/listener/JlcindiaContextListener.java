package com.jlc.book.shop.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.jboss.logging.Logger;

public class JlcindiaContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent cxtEvent) {
			

	}

	@Override
	public void contextInitialized(ServletContextEvent ctxEvent) {
		// TODO Auto-generated method stub
		ServletContext ctx= ctxEvent.getServletContext();
		String path=ctx.getRealPath("/") + "logs\\";
		System.setProperty("jlcindia.root.path", path);
		String str=ctx.getRealPath("/WEB-INF/classes/com/jlc/jlc-log4j.properties");
		PropertyConfigurator.configure(str);
		Logger log=Logger.getLogger(this.getClass());
		log.info("Properties file:"+str);
		

	}

}
