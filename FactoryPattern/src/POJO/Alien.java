package POJO;

public class Alien extends Enemy {

	public Alien(String specialAttack, int attackDamage, String name) {
		super(specialAttack, attackDamage, name);
	}

	@Override
	public void attack() {
		System.out.println(this.getName() + " used " + this.getSpecialAttack()+ " at the enemy and caused " + this.getRandomDamage() + " damage");
	}

	@Override
	public void heal() {
		System.out.println(this.getName() + " ate another alien to fully heal itself");		
	}

	@Override
	public void dodge() {
		System.out.println(super.getName() + " used its tentacles to slither away from certain doom");			
	}
}
