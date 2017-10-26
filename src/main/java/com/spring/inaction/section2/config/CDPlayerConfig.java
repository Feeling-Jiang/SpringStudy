package com.spring.inaction.section2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.inaction.section2.ComponentScanMark;

@Configuration
@ComponentScan(basePackageClasses = { ComponentScanMark.class })
public class CDPlayerConfig {

}
