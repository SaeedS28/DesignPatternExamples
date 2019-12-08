import Adapter.PlantAdapter;
import POJO.Human;
import POJO.Plant;
import Target.Activities;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("Regular human instantiation");
		System.out.println();
		// regular instantiation
		Activities jimmy = new Human("Jimmy");
		jimmy.eat();
		jimmy.kill();
		jimmy.sleep();
		jimmy.work();
		
		System.out.println();
		System.out.println("Adapter object at work");
		System.out.println();
		
		// adapter class at work
		Plant sam = new Plant("Sam");
		Activities samAdapter = new PlantAdapter(sam);
		samAdapter.eat();
		samAdapter.kill();
		samAdapter.sleep();
		samAdapter.work();
	}

}
