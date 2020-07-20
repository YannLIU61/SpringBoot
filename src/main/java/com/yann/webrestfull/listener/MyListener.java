package com.yann.webrestfull.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Initialized application web....");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Destroy application web.....");
    }
}
