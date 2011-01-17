package com.ackermansoftware.interviewquestions;

import com.ackermansoftware.interviewquestions.animal.AnimalBehavior;
import com.ackermansoftware.interviewquestions.dog.DogBehavior;

public class AnimalDog implements AnimalBehavior, DogBehavior {
	private final MufflableDog dog = new MufflableDog();

	@Override
	public void muffle() {
		dog.muffle();
	}

	@Override
	public String bark() {
		return dog.bark();
	}

	@Override
	public String poop() {
		return "plop.";
	}

}
