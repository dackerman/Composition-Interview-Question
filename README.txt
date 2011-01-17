// The following interfaces define the system to be created.

interface RobotBehavior
	// Will return PI to at least the nearest 5 decimal places.
	public double calculatePi();

interface AnimalBehavior
	// Will always output "plop."
	public String poop();

interface DogBehavior
	/* By default, bark() will output “woof!”.  However, if muffle() is called, bark() will then output "**mmmmmf**" indicating that the dog cannot bark while muffled. */
	public String bark();
	public void muffle();

/*
Create two classes, AnimalDog and RoboticDog with the following properties:

AnimalDog behaves like a dog, but can also poop.
RoboticDog behaves like a dog too, but can calculate pi (and cannot poop).

In other words, AnimalDog implements AnimalBehavior and DogBehavior, and RoboticDog implements RobotBehavior and DogBehavior.

You may create any number of extra classes and interfaces to accomplish this, but you may not use any if statements (and minimize duplicate code).

*/