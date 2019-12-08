package POJO;

public class Plant {
	private String name;
	
	public Plant(String name) {
		this.name = name;
	}
	
	public void absorbNutrients() {
		System.out.println(name + " absorbed nutrients and water from the soil");
	}
	
	public void photosynthesize() {
		System.out.println(name + " photosynthesized and converted CO2 into oxygen");
	}
	
	public void metabolize() {
		System.out.println(name + " performed cellular respiration and produced energy in the form of ATP during the night");
	}
	
	public void releaseToxins() {
		System.out.println(name+ " performed allelopaty and killed other plants in the area");
	}
}
