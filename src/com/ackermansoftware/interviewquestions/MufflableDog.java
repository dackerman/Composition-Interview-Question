package com.ackermansoftware.interviewquestions;

import com.ackermansoftware.interviewquestions.bark.BarkBehavior;
import com.ackermansoftware.interviewquestions.bark.MuffledBarking;
import com.ackermansoftware.interviewquestions.bark.NormalBarking;
import com.ackermansoftware.interviewquestions.dog.DogBehavior;

public class MufflableDog implements DogBehavior {
	private BarkBehavior barkBehavior = new NormalBarking();

	@Override
	public String bark() {
		return barkBehavior.bark();
	}

	@Override
	public void muffle() {
		barkBehavior = new MuffledBarking();
	}
}
