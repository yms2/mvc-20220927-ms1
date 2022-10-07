package com.study.mvc20220927ms.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
    @Bean
    public TestSetting testSetting() {
        return new TestSetting();
    }

}
