package com.manager.system.config;

import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.core.annotation.Order;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * DruidFilter
 * @author cbigd
 * @date 2018/02/05
 */
@WebFilter(filterName="druidFilter", urlPatterns="/*", initParams={
        @WebInitParam(name="exclusions", value="*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*,/admin/*")
})
@Order(1)
public class DruidStatFilter extends WebStatFilter {
}