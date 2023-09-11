//package com.ken.forest.configuration;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.annotation.Resource;
//import javax.sql.DataSource;
//
//@Configuration
//@MapperScan(value = "com.ken.forest.mapper.localMysql",sqlSessionTemplateRef =  "localMysqlSqlSessionTemplate")
//public class firstConfig {
//    @Resource
//    private DataSource dataSource;
//
//    @Bean
//    public SqlSessionFactory localMysqlSqlSessionFactory() throws  Exception {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource);
//        return bean.getObject();
//    }
//
//    @Bean
//    public SqlSessionTemplate localMysqlSqlSessionTemplate() throws Exception {
//        return new SqlSessionTemplate(localMysqlSqlSessionFactory());
//    }
//}
//
//@Configuration
//@MapperScan(value = "com.ken.forest.mapper.backUpSqlServer",sqlSessionTemplateRef =  "backUpSqlServerSqlSessionTemplate")
//class secondConfig {
//    @Resource
//    private DataSource dataSource;
//
//    @Bean
//    public SqlSessionFactory localMysqlSqlSessionFactory() throws  Exception {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource);
//        return bean.getObject();
//    }
//
//    @Bean
//    public SqlSessionTemplate localMysqlSqlSessionTemplate() throws Exception {
//        return new SqlSessionTemplate(localMysqlSqlSessionFactory());
//    }
//}
//
//@Configuration
//@MapperScan(value = "com.ken.forest.mapper.onlineSqlServer",sqlSessionTemplateRef =  "onlineSqlServerSqlSessionTemplate")
//class  thirdConfig {
//    @Resource
//    private DataSource dataSource;
//
//    @Bean
//    public SqlSessionFactory localMysqlSqlSessionFactory() throws  Exception {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource);
//        return bean.getObject();
//    }
//
//    @Bean
//    public SqlSessionTemplate localMysqlSqlSessionTemplate() throws Exception {
//        return new SqlSessionTemplate(localMysqlSqlSessionFactory());
//    }
//}
//
//@Configuration
//@MapperScan(value = "com.ken.forest.mapper.testSqlServer",sqlSessionTemplateRef =  "testSqlServerSqlSessionTemplate")
//class fourthConfig {
//    @Resource
//    private DataSource dataSource;
//
//    @Bean
//    public SqlSessionFactory localMysqlSqlSessionFactory() throws  Exception {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource);
//        return bean.getObject();
//    }
//
//    @Bean
//    public SqlSessionTemplate localMysqlSqlSessionTemplate() throws Exception {
//        return new SqlSessionTemplate(localMysqlSqlSessionFactory());
//    }
//}
//
