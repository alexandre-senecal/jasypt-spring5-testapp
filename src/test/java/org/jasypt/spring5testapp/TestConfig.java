package org.jasypt.spring5testapp;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.spring4.properties.EncryptablePropertySourcesPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:some.properties")
public class TestConfig {

    @Bean
    static EncryptablePropertySourcesPlaceholderConfigurer propertyConfigurer() {
        StandardPBEStringEncryptor stringEncrypt = new StandardPBEStringEncryptor();
        stringEncrypt.setPassword("leiro");
        return new EncryptablePropertySourcesPlaceholderConfigurer(stringEncrypt);
    }

}
