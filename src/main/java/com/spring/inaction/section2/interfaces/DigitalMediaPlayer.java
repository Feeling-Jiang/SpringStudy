package com.spring.inaction.section2.interfaces;

import org.springframework.stereotype.Component;

import com.spring.inaction.section2.interfaces.base.MediaPlayer;

@Component
public class DigitalMediaPlayer implements MediaPlayer {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("I'm digitalMediaPlayer ...");
	}

}
