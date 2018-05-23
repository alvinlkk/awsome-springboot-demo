package com.alvinlkk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author alvinkk
 * @create 2018-05-22 17:36
 **/
@Component
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    @Qualifier("ds1JdbcTemplate")
    private JdbcTemplate jdbcTemplate1;

    @Autowired
    @Qualifier("ds2JdbcTemplate")
    private JdbcTemplate jdbcTemplate2;

    @Override
    @Transactional
    public void save() {
        jdbcTemplate1.execute("insert into user values ('alvin', 'sss', 12)");
        jdbcTemplate2.execute("insert into user values ('alvin11', 'sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss', 12)");
    }
}
