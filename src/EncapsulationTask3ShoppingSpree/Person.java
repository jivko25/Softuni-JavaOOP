package EncapsulationTask3ShoppingSpree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
	//-	name: String
	private String name;
	//-	money:  double
	private double money;
	//-	products:  List<Product>
	private List<Product> products;
	//+ 	Person (String ,  double)
	public Person(String name, double money) {
		this.setName(name);
		this.setMoney(money);
		this.products = new ArrayList<>();
	}
	//-	setName (String) : void
	public String getName() {
		return name;
	}
	private void setName(String name) {
		if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
		this.name = name;
	}
	//-	setMoney (double) : void
	public double getMoney() {
		return money;
	}
	private void setMoney(double money) {
		if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative.");
        }
		this.money = money;
	}
	//+	buyProduct (Product) : void
	public void buyProduct(Product product) {
		double cost = product.getCost();
		if(this.money >= cost) {
			this.money -= cost;
			this.products.add(product);
			System.out.printf("%s bought %s\n", this.getName(), product.getName());
		}
		else {
//			throw new IllegalArgumentException(String.format("%s can't afford %s", this.name, product.getName()));
			System.out.printf("%s can't afford %s\n", this.name, product.getName());
		}
	}
	//+	getName(): String
	public void printProducts() {
		System.out.printf("%s - ", this.name);
		if(this.products.isEmpty()) {
			System.out.println("Nothing bought");
		} else {
		for(int i = 0;i<this.products.size();i++) {
			if(i < this.products.size()-1) {
				System.out.printf("%s, ", this.products.get(i).getName());
			}
			else {
				System.out.printf("%s\n", this.products.get(i).getName());
			}
		}
		}
	}

}
