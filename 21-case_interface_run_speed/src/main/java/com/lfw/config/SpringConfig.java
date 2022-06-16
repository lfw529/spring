package com.lfw.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.lfw")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}
