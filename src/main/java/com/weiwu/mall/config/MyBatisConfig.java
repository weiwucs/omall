package com.weiwu.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan({"com.weiwu.mall.mbg.mapper", "com.weiwu.mall.dao"})
public class MyBatisConfig {
}
