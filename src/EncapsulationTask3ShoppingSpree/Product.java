package EncapsulationTask3ShoppingSpree;

public class Product {
	//-	name: String
	private String name;
	//-	cost: double
	private double cost;
	//+ 	Product (String,  double)
	public Product(String name, double cost) {
		this.setName(name);
		this.setCost(cost);
	}
	//-	setCost (double): void
	private void setCost(double cost) {
		this.cost = cost;
	}
	//-	setName (String): void
	private void setName(String name) {
		this.name = name;
	}
	//+	getName(): String
	public String getName() {
		return name;
	}
	//+	getCost (): double
	public double getCost() {
		return cost;
	}

}
