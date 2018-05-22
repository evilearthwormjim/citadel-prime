package com.rsa.demo.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.rsa.demo"})
@EnableJpaRepositories(basePackages = {"com.rsa.demo.repositories"})
@EnableTransactionManagement
public class RepositoryConfig {
}
