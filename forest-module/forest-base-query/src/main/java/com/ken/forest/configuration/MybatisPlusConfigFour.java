package com.ken.forest.configuration;


import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSessionFactory;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;
/**
 * 线上SQLServer测试库 10.182.2.23
 * @Auther: ken
 */
@Configuration
@MapperScan(value = "com.ken.forest.mapper.testSqlServer",sqlSessionTemplateRef =  "testSqlServerSqlSessionTemplate")
public class MybatisPlusConfigFour {
    //@Resource annotation is used to indicate that the class is a managed bean and should be injected

    @Bean(name = "test-sqlserver")
    @ConfigurationProperties(prefix = "spring.datasource.druid.test-sqlserver")
    public DataSource test_sqlserver() {
        return DataSourceBuilder.create().build();
    }

    //@Bean annotation is used to indicate that the class is a bean and should be created
    @Bean("sqlSessionFactory4")
    public SqlSessionFactory SqlSessionFactory(@Qualifier("test-sqlserver") DataSource dataSource) throws Exception {
        //SqlSessionFactoryBean is a bean definition that defines the configuration of a SqlSessionFactory
        MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
        //dataSource is the data source that is used to configure the SqlSessionFactory
        sqlSessionFactoryBean.setDataSource(dataSource);
        //return the SqlSessionFactory
        return sqlSessionFactoryBean.getObject();
    }

    //@Bean annotation is used to indicate that the class is a bean and should be created
    @Bean("testSqlServerSqlSessionTemplate")
    public SqlSessionTemplate SqlSessionTemplate(@Qualifier("sqlSessionFactory4") SqlSessionFactory sqlSessionFactory) throws Exception {
        //SqlSessionTemplate is a bean definition that defines the configuration of a SqlSessionTemplate
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
