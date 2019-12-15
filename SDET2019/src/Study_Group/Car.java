package Study_Group;

public class Car {

	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String colour;

	// Methods
	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return this.model;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getEngine() {
		return this.engine;

	}

	String validModel = model.toLowerCase();
	{
		if (validModel.equals("correra") || validModel.equals("commodore")) {
			this.model = model;
		} else {
			this.model = "Unknown";
		}

		/*
		 * 
		 * 
		 * // methods public void setmodel(String model) { // what this does update the
		 * variable in the class with // content permeative model. // why we use setter
		 * and getter. lets do some validation
		 * 
		 * /* }
		 * 
		 * public String getModel() { return this.model; } }
		 */

	}
}