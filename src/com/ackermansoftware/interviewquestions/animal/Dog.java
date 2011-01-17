package com.ackermansoftware.interviewquestions.animal;

import com.ackermansoftware.interviewquestions.MufflableDog;
import com.ackermansoftware.interviewquestions.bark.BarkBehavior;
import com.ackermansoftware.interviewquestions.muffle.MuffleBehavior;

public class Dog extends Animal implements MuffleBehavior, BarkBehavior {
	private final MufflableDog dog = new MufflableDog();

	@Override
	public void muffle() {
		dog.muffle();
	}

	@Override
	public String bark() {
		return dog.bark();
	}

}
