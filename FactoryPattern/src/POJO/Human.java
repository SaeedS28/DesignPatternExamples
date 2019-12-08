package POJO;

public class Human extends Enemy {

	public Human(String specialAttack, int attackDamage, String name) {
		super(specialAttack, attackDamage, name);
	}

	@Override
	public void attack() {
		System.out.println(this.getName() + " used " + this.getSpecialAttack()+ " at the enemy and caused " + this.getRandomDamage() + " damage");
	}

	@Override
	public void heal() {
		System.out.println(this.getName() + " used a medkit to fully heal themselves");		
	}

	@Override
	public void dodge() {
		System.out.println(super.getName() + " ran away as fast as they could to avoid certain doom");			
	}

}
