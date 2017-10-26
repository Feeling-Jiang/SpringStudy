package com.spring.inaction.section2;

import org.springframework.stereotype.Component;

@Component
public class MediaPlayer implements CompactDisc {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("I'm media player !");
	}

}
