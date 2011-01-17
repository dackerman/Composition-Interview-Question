package com.ackermansoftware.interviewquestions;

import com.ackermansoftware.interviewquestions.dog.DogBehavior;
import com.ackermansoftware.interviewquestions.robot.RobotBehavior;


public class RoboticDog implements RobotBehavior, DogBehavior {
	private final MufflableDog muffleBehavior = new MufflableDog();

	@Override
	public String bark() {
		return muffleBehavior.bark();
	}

	@Override
	public void muffle() {
		muffleBehavior.muffle();
	}

	@Override
	public double calculatePi() {
		return Math.PI;
	}

}
