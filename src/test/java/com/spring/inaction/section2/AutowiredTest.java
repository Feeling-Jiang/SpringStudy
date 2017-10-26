package com.spring.inaction.section2;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.inaction.section2.config.AutowiredConfig;
import com.spring.inaction.section2.interfaces.base.CompactDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AutowiredConfig.class)
public class AutowiredTest {

	/*
	 * Spring对于Map(List、Set也一样)的自动装配，若CompactDisc各个实现类的@Component注解中未注明实例化Bean名称，
	 * 则默认按照各个类名首字母小写的形式赋值
	 */
	@Autowired
	private Map<String, CompactDisc> cds;

	// @Autowired
	// private Map<String, MediaPlayer> mps;

	@Test
	public void cdShouldNotBeNull() {
		if (cds != null) {
			System.out.println("CD NOT NULL!");
			System.out.println("cds = " + cds.keySet());
		}
	}

	// @Test
	// public void mpShouldNotBeNull() {
	// if (mps != null) {
	// System.out.println("MP NOT NULL");
	// System.out.println("mps = " + mps.keySet());
	// }
	// }
}
