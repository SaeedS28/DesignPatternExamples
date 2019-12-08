import java.util.Scanner;

import Factory.EnemyFactory;
import POJO.Enemy;

public class MainApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		EnemyFactory emf = new EnemyFactory(scan);
		
		Enemy enemy = emf.getInstance();
		
		System.out.println();
		if(enemy != null) {
			System.out.println("Enemy name: " + enemy.getName());
			System.out.println("Enemy max attack damage: " + enemy.getAttackDamage());
			System.out.println("Enemy special attack: " + enemy.getSpecialAttack());
			enemy.attack();
			enemy.heal();
			enemy.dodge();
		}
		else {
			System.out.println("Null object");
		}
	}

}
