package com.alvinlkk.cfg;

import com.atomikos.jdbc.AtomikosDataSourceBean;
import com.atomikos.jdbc.AtomikosSQLException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * 第一个数据源配置
 *
 * @author alvinkk
 * @create 2018-05-22 16:48
 **/
@Configuration
public class DataSourceCfg {

    //jta数据源1
    @Bean(initMethod="init", destroyMethod="close", name="jtaDataSource1")
    @Primary
    @ConfigurationProperties(prefix = "ds1.jdbc")
    public DataSource jtaDataSource1() throws AtomikosSQLException {
        return new AtomikosDataSourceBean();
    }

    //jta数据源1
    @Bean(initMethod="init", destroyMethod="close", name="jtaDataSource2")
    @ConfigurationProperties(prefix = "ds2.jdbc")
    public DataSource jtaDataSource2() throws AtomikosSQLException {
        return new AtomikosDataSourceBean();
    }

    @Bean
    public JdbcTemplate ds1JdbcTemplate(@Qualifier("jtaDataSource1") DataSource jtaDataSource1) {
        return new JdbcTemplate(jtaDataSource1);
    }

    @Bean
    public JdbcTemplate ds2JdbcTemplate(@Qualifier("jtaDataSource2") DataSource jtaDataSource2) {
        return new JdbcTemplate(jtaDataSource2);
    }
}
