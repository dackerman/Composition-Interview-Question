package com.ackermansoftware.interviewquestions.robot;

import com.ackermansoftware.interviewquestions.MufflableDog;
import com.ackermansoftware.interviewquestions.bark.BarkBehavior;
import com.ackermansoftware.interviewquestions.muffle.MuffleBehavior;


public class RoboticDog extends Robot implements BarkBehavior, MuffleBehavior {
	private final MufflableDog muffleBehavior = new MufflableDog();

	@Override
	public String bark() {
		return muffleBehavior.bark();
	}

	@Override
	public void muffle() {
		muffleBehavior.muffle();
	}

}
