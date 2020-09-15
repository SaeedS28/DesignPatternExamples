import composite.commoninterface.Component;
import composite.pojo.Internal;
import composite.pojo.Leaf;

public class MainApp {
	public static void main(String[] args) {
		Component hardDrive = new Leaf(120, "Sandisk Harddrive");
		Component ram = new Leaf(250, "Kingston RAM");
		Component processor = new Leaf(650, "Intel i7 Processor");
		
		Internal motherboard = new Internal(500, "ASUS Motherboard");
		motherboard.addComponent(processor);
		motherboard.addComponent(ram);
		motherboard.addComponent(hardDrive);
		
		Component monitor = new Leaf(150, "LG Monitor");
		Component keyboard = new Leaf(80, "Microsoft Keyboard");
		Component mouse = new Leaf(150, "Razer Mouse");
		
		Internal tower = new Internal(100, "Corsair Case");
		tower.addComponent(motherboard);
		
		Internal table = new Internal(250, "IKEA desk");
		table.addComponent(tower);
		table.addComponent(keyboard);
		table.addComponent(mouse);
		table.addComponent(monitor);
		
		table.showComponents();
		System.out.println(table.showComponentsPrice());
		System.out.println(motherboard.showComponentsPrice());
		
		
//		Component  = new Leaf(120, "Sandisk");
//		Component hardDrive = new Leaf(120, "Sandisk");
	}
}
