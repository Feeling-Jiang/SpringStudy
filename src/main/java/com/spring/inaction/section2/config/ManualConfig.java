package com.spring.inaction.section2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.inaction.section2.interfaces.DigitalMediaPlayer;
import com.spring.inaction.section2.interfaces.base.CompactDisc;

@Configuration
public class ManualConfig {
	@Bean(name = "digitalMediaPlayer_manualConfig")
	public DigitalMediaPlayer getDigitalMediaPlayer(CompactDisc cd) {
		return new DigitalMediaPlayer();
	}
}
