package com.manager.system.config;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 *@author cbigd
 *@date 2018/02/05
 */
@WebServlet(name="druidMonitor", urlPatterns="/druid/*", initParams={
        //@WebInitParam(name="allow", value="127.0.0.1"),
        @WebInitParam(name="loginUsername", value="druid"),
        @WebInitParam(name="loginPassword", value="druid"),
        @WebInitParam(name="resetEnable", value="true")
})
public class DruidServletMonitor extends StatViewServlet{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
}