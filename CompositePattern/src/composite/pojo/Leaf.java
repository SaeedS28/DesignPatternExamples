package composite.pojo;


public class Leaf extends Composite {

	public Leaf(double price, String name) {
		super(price, name);
	}

	@Override
	public void showComponents() {
		System.out.println(this.getName() + " | " + "$" + this.getPrice());
	}

	@Override
	public double showComponentsPrice() {
		return this.getPrice();
	}

}
