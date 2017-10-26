package com.spring.inaction.section2;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.inaction.section2.config.AutowiredConfig;
import com.spring.inaction.section2.config.ManualConfig;
import com.spring.inaction.section2.interfaces.base.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ManualConfig.class, AutowiredConfig.class })
public class ManalConfigTest {
	@Autowired
	private Map<String, MediaPlayer> mps;

	@Test
	public void mpsShouldNotBeNull() {
		if (mps != null) {
			System.out.println("MPS NOT NULL ！");
			System.out.println("MPS = " + mps);
			for (String mediaPlayer : mps.keySet()) {
				mps.get(mediaPlayer).play();
			}
		}
	}
}
