package composite.pojo;

import java.util.ArrayList;
import java.util.List;

import composite.commoninterface.Component;

public class Internal extends Composite {

	private List<Component> components;
	
	public Internal(double price, String name) {
		super(price, name);
		this.components = new ArrayList<>();
	}
	
	public void addComponent(Component component) {
		this.components.add(component);
	}
	
	@Override
	public void showComponents() {
		System.out.println(this.getName() + " | " + "$" + this.getPrice());
		
		// DFS of all the nodes
		for (Component component : components) {
			component.showComponents();
		}
	}

	@Override
	public double showComponentsPrice() {
		double subComponentPrice = 0;
		
		// gets the children nodes' price
		for (Component component : components) {
			subComponentPrice += component.showComponentsPrice();
		}
		return (subComponentPrice + this.getPrice());
	}

}
