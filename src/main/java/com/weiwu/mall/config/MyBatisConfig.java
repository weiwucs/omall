package com.weiwu.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.weiwu.mall.mbg.mapper")
public class MyBatisConfig {
}
