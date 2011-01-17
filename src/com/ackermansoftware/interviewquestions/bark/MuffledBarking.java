package com.ackermansoftware.interviewquestions.bark;

public class MuffledBarking implements BarkBehavior {

	@Override
	public String bark() {
		return "**mmmmmf**";
	}

}
