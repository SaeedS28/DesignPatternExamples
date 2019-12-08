package Factory;

import java.util.Scanner;

import POJO.Alien;
import POJO.Enemy;
import POJO.Human;
import POJO.Robot;

public class EnemyFactory {
	private Scanner scan;
	
	public EnemyFactory(Scanner scan) {
		this.scan = scan;
	}
	
	public Enemy getInstance() {
		Enemy obj = null;
		System.out.println("Enter 1 for Robot, 2 for Alien, 3 for Human");
		int choice = scan.nextInt();
		if(choice>=1 && choice<=3) {
			String name;
			int maxAttackDamage;
			String specialAttack;
			
			System.out.print("Give the enemy a name: ");
			name = scan.nextLine();
			System.out.print("Give the enemy the max damage that it can inflict upon others: ");
			maxAttackDamage = scan.nextInt();
			System.out.print("Give the enemy a special attack name: ");
			specialAttack = scan.nextLine();
			
			if(choice == 1) {
				obj = new Robot(specialAttack,maxAttackDamage,name); 
			} else if(choice == 2) {
				obj = new Alien(specialAttack,maxAttackDamage,name);
			} else if(choice == 3) {
				obj = new Human(specialAttack,maxAttackDamage,name);
			}
			return obj;
		} else {
			System.out.println("Invalid choice. returning null");
		}
		return null;
	}
}
