package com.ackermansoftware.interviewquestions.robot;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.ackermansoftware.interviewquestions.RoboticDog;


public class RoboticDogTests {
	RoboticDog rd;

	@Before
	public void init() {
		rd = new RoboticDog();
	}

	@Test
	public void roboticDogKnowsPi() {
		double answer = rd.calculatePi();
		assertEquals(Math.PI, answer, 0.00001);
	}

	@Test
	public void roboticDogCanBark() {
		String dogSpeak = rd.bark();
		assertEquals("woof!", dogSpeak);
	}

	@Test
	public void roboticDogCanBeMuffled() {
		String normalBark = rd.bark();
		assertEquals("woof!", normalBark);

		rd.muffle();

		String muffledBark = rd.bark();
		assertEquals("**mmmmmf**", muffledBark);
	}
}
