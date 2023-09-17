package com.ken.forest.configuration;

import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * 本地Myusql连接配置
 * @Auther: ken
 */
@Configuration
@MapperScan(value = "com.ken.forest.mapper.localMysql",sqlSessionTemplateRef =  "localMysqlSqlSessionTemplate")
public class MybatisPlusConfigOne {
    //@Resource annotation is used to indicate that the class is a managed bean and should be injected
    @Resource
    private DataSource dataSource;

    //@Bean annotation is used to indicate that the class is a bean and should be created
    @Bean("sqlSessionFactory1")
    public SqlSessionFactory SqlSessionFactory() throws Exception {
        //SqlSessionFactoryBean is a bean definition that defines the configuration of a SqlSessionFactory
        MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
        //dataSource is the data source that is used to configure the SqlSessionFactory
        sqlSessionFactoryBean.setDataSource(dataSource);
        //return the SqlSessionFactory
        return sqlSessionFactoryBean.getObject();
    }

    //@Bean annotation is used to indicate that the class is a bean and should be created
    @Bean("localMysqlSqlSessionTemplate")
    public SqlSessionTemplate SqlSessionTemplate() throws Exception {
        //SqlSessionTemplate is a bean definition that defines the configuration of a SqlSessionTemplate
        return new SqlSessionTemplate(SqlSessionFactory());
    }
}