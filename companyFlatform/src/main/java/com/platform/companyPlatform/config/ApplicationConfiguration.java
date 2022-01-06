package com.platform.companyPlatform.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.nio.charset.StandardCharsets;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        source.setBasenames("messages/messages");
        source.setUseCodeAsDefaultMessage(false);
        source.setDefaultEncoding(StandardCharsets.UTF_8.name());
        return source;
    }
}
