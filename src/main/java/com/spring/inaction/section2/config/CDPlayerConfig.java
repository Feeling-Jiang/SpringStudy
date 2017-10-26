package com.spring.inaction.section2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.inaction.section2.CompactDisc;

@Configuration
@ComponentScan(basePackageClasses = { CompactDisc.class })
public class CDPlayerConfig {

}
