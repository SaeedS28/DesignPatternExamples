package POJO;

public class Robot extends Enemy {

	public Robot(String specialAttack, int attackDamage, String name) {
		super(specialAttack, attackDamage, name);
	}

	@Override
	public void attack() {
		System.out.println(this.getName() + " used " + this.getSpecialAttack()+ " on its target and caused " + this.getRandomDamage() + " damage");
	}

	@Override
	public void heal() {
		System.out.println(this.getName() + " used a charging port to fully heal itself");		
	}

	@Override
	public void dodge() {
		System.out.println(this.getName() + " used its treads to roll away from certain doom");			
	}

}
