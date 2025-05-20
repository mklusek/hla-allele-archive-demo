package com.mklusek.hla.allele.archive.config;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class JdbiProvider {
    @Autowired
    protected Logger logger;

    @Bean
    public Jdbi jdbi(final DataSource dataSource) {
        final Jdbi jdbi = Jdbi.create(dataSource);
        jdbi.installPlugin(new SqlObjectPlugin());

        logger.info("Jdbi initialized: {}", jdbi);
        return jdbi;
    }
}
