package com.spring.inaction.section2.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.inaction.section2.interfaces.base.CompactDisc;
import com.spring.inaction.section2.interfaces.base.MediaPlayer;

//@Component
public class DigitalMediaPlayer implements MediaPlayer {
	@Autowired
	private CompactDisc cd;

	@Override
	public void play() {
		cd.play();
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
