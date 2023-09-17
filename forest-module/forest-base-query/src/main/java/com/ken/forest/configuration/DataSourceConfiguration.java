package com.ken.forest.configuration;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.alibaba.druid.support.profile.ProfileEntry;
import com.baomidou.mybatisplus.core.config.GlobalConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {

    @Primary
    @Bean(name = "local-mysql")
    @ConfigurationProperties(prefix = "spring.datasource.druid.local-mysql")
    public DataSource local_mysql() {
        return new DruidDataSource();
    }

//    @Bean(name = "test-sqlserver")
//    @ConfigurationProperties(prefix = "spring.datasource.druid.test-sqlserver")
//    public DataSource test_sqlserver() {
//        return new DruidDataSource();
//    }

    @Bean(name = "online-sqlserver")
    @ConfigurationProperties(prefix = "spring.datasource.druid.online-sqlserver")
    public DataSource online_sqlserver() {
        return new DruidDataSource();
    }

    @Bean(name = "online-backup-sqlserver")
    @ConfigurationProperties(prefix = "spring.datasource.druid.online-backup-sqlserver")
    public DataSource online_backup_sqlserver() {
        return new DruidDataSource();
    }

}
