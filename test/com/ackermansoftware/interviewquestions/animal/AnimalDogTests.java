package com.ackermansoftware.interviewquestions.animal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.ackermansoftware.interviewquestions.animal.Dog;


public class AnimalDogTests {
	private Dog d;

	@Before
	public void init() {
		d = new Dog();
	}

	@Test
	public void dogCanPoop() {
		String poo = d.poop();
		assertEquals("plop.", poo);
	}

	@Test
	public void dogCanBark() {
		String dogSpeak = d.bark();
		assertEquals("woof!", dogSpeak);
	}

	@Test
	public void dogCanBeMuffled() {
		String normalBark = d.bark();
		assertEquals("woof!", normalBark);

		d.muffle();

		String muffledBark = d.bark();
		assertEquals("**mmmmmf**", muffledBark);
	}
}
