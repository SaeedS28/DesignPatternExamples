package POJO;

import java.util.Random;

import Interface.EnemyAction;

public abstract class Enemy implements EnemyAction {
	private String specialAttack;
	private int attackDamage;
	private String name;
	private Random rand;

	public Enemy(String specialAttack, int attackDamage, String name) {
		super();
		this.specialAttack = specialAttack;
		this.attackDamage = attackDamage;
		this.name = name;
		rand = new Random();
	}

	public String getSpecialAttack() {
		return specialAttack;
	}

	public void setSpecialAttack(String specialAttack) {
		this.specialAttack = specialAttack;
	}

	public double getAttackDamage() {
		return attackDamage;
	}

	public void setAttackDamage(int attackDamage) {
		this.attackDamage = attackDamage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRandomDamage() {
		return rand.nextInt(attackDamage+1);
	}
	
	@Override
	public String toString() {
		return "Enemy with name: " + this.name +" does "+ this.attackDamage+" max damage using the special attack called "+ specialAttack + ".";
	}
	
	
}
