package Adapter;

import POJO.Plant;
import Target.Activities;

/**
 * The adapter class that will act as a wrapper to the plant object
 * 
 * @author Saad
 *
 */
public class PlantAdapter implements Activities {
	private Plant plant;
	
	public PlantAdapter(Plant plant) {
		this.plant = plant;
	}

	@Override
	public void eat() {
		plant.absorbNutrients();
	}

	@Override
	public void work() {
		plant.photosynthesize();
	}

	@Override
	public void kill() {
		plant.releaseToxins();
	}

	@Override
	public void sleep() {
		plant.metabolize();
	}
}
