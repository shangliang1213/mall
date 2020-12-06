package com.macro.mall.security.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 用于配置白名单资源路径
 * Created by macro on 2018/11/5.
 */
@Getter
@Setter
//@Component
@ConfigurationProperties(prefix = "secure.ignored")
@EnableConfigurationProperties(IgnoreUrlsConfig.class)
public class IgnoreUrlsConfig {

    private List<String> urls = new ArrayList<>();

}