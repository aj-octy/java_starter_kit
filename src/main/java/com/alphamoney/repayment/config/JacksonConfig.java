package com.alphamoney.repayment.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JacksonConfig {

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(
                VisibilityChecker.Std.defaultInstance()
                        .withFieldVisibility(JsonAutoDetect.Visibility.ANY) // Use fields directly
                        .withGetterVisibility(JsonAutoDetect.Visibility.NONE) // Ignore getters
                        .withSetterVisibility(JsonAutoDetect.Visibility.NONE) // Ignore setters
                        .withCreatorVisibility(JsonAutoDetect.Visibility.NONE) // Ignore creators
        );
        mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS); // Prevent empty object error
        return mapper;
    }
}
