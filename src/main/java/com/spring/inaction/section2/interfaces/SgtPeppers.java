package com.spring.inaction.section2.interfaces;

import org.springframework.stereotype.Component;

import com.spring.inaction.section2.interfaces.base.CompactDisc;

@Component
public class SgtPeppers implements CompactDisc {

	private String title = "Sgt.Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing " + title + " by" + artist);
	}

}
