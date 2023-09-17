package com.ken.forest.configuration;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;
/**
 * 线上SQLServer 10.182.2.12
 * @Auther: ken
 */
@Configuration
@MapperScan(value = "com.ken.forest.mapper.onlineSqlServer",sqlSessionTemplateRef =  "onlineSqlServerSqlSessionTemplate")
public class MybatisPlusConfigThree {
    //@Resource annotation is used to indicate that the class is a managed bean and should be injected
    @Resource
    private DataSource dataSource;

    //@Bean annotation is used to indicate that the class is a bean and should be created
    @Bean("sqlSessionFactory3")
    public SqlSessionFactory SqlSessionFactory() throws Exception {
        //SqlSessionFactoryBean is a bean definition that defines the configuration of a SqlSessionFactory
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        //dataSource is the data source that is used to configure the SqlSessionFactory
        sqlSessionFactoryBean.setDataSource(dataSource);
        //return the SqlSessionFactory
        return sqlSessionFactoryBean.getObject();
    }

    //@Bean annotation is used to indicate that the class is a bean and should be created
    @Bean("onlineSqlServerSqlSessionTemplate")
    public SqlSessionTemplate SqlSessionTemplate() throws Exception {
        //SqlSessionTemplate is a bean definition that defines the configuration of a SqlSessionTemplate
        return new SqlSessionTemplate(SqlSessionFactory());
    }
}
