package POJO;

import java.util.Random;

import Target.Activities;

public class Human implements Activities {
	private String name;
	private Random rand;
	
	public Human(String name) {
		this.name = name;
		rand = new Random();
	}

	@Override
	public void eat() {
		System.out.println(name+ " ate " +(rand.nextInt(10)+1) + " pieces of chicken");
	}

	@Override
	public void work() {
		System.out.println(name+ " worked for " +(rand.nextInt(10)+1) + " hours");
	}

	@Override
	public void kill() {
		System.out.println(name+ " killed " +(rand.nextInt(10)+1) + " other humans because they stole his lottery winnings");
	}

	@Override
	public void sleep() {
		System.out.println(name+ " slept for " +(rand.nextInt(10)+1) + " hours");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
