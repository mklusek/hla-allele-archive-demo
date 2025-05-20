package com.mklusek.hla.allele.archive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class Application {
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    @Scope("prototype")
    Logger log(final InjectionPoint injectionPoint) {
        return LoggerFactory.getLogger(injectionPoint.getMember().getDeclaringClass());
    }
}
