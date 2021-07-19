package com.manager.system.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Mybatis config
 * transaction
 * @author cbigd
 * @date 2018/02/05
 */
@MapperScan(basePackages="com.manager.system.dao")
@Configuration
public class DateSourceConfig {
	private static final Logger logger = LoggerFactory.getLogger(DateSourceConfig.class);
    
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholder() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    /**
     * 配置数据源
     * @return DuridDataSource
     */
    @Bean
    public DataSource dataSource() {
        logger.info("load DruidDataSource");
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/本地数据库?useSSL=false&serverTimezone=UTC");
        dataSource.setUsername("用户名");
        dataSource.setPassword("密码");
        try {
			dataSource.addFilters("stat");
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return dataSource;
    }
    
    /**
     * 配置sessionFactory，
//     * @param dataSource 自动注入
     * @return SqlSessionFactory
     * @throws Exception 异常
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactory.setDataSource(dataSource());
//        sqlSessionFactory.setConfigLocation(resolver.getResource("classpath:sqlMapConfig.xml"));
        sqlSessionFactory.setMapperLocations(resolver.getResources("classpath:Mapping/*Mapper.xml"));
        return sqlSessionFactory.getObject();
    }

//    /**
//     * TransactionManager
//     * @return
//     */
//    @Bean(name = "transactionManager")
//    public DataSourceTransactionManager dataSourceTransactionManager(){
//        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
//        dataSourceTransactionManager.setDataSource(dataSource());
//        return dataSourceTransactionManager;
//    }
//
//    /**
//     * TransactionInterceptor
//     * @return
//     */
/*    @Bean(name="transactionInterceptor")
    public TransactionInterceptor transactionInterceptor(){
        TransactionInterceptor interceptor = new TransactionInterceptor();
        interceptor.setTransactionManager(dataSourceTransactionManager());
        Properties transactionAttributes = new Properties();
        transactionAttributes.setProperty("save*", "PROPAGATION_REQUIRED");
        transactionAttributes.setProperty("del*", "PROPAGATION_REQUIRED");
        transactionAttributes.setProperty("update*", "PROPAGATION_REQUIRED");
        transactionAttributes.setProperty("get*", "PROPAGATION_REQUIRED,readOnly");
        transactionAttributes.setProperty("find*", "PROPAGATION_REQUIRED,readOnly");
        //transactionAttributes.setProperty("*", "PROPAGATION_REQUIRED");
        interceptor.setTransactionAttributes(transactionAttributes);
        return interceptor;
    }*/
    

}
