import POJO.Human;
import Target.Activities;

public class MainApp {

	public static void main(String[] args) {
		// regular instantiation
		Activities jimmy = new Human("Jimmy");
		jimmy.eat();
		jimmy.kill();
		jimmy.sleep();
		jimmy.work();
	}

}
