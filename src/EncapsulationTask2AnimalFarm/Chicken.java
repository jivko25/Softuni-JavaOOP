package EncapsulationTask2AnimalFarm;

public class Chicken {
	//-	name: String
	private String name;
	//-	age: int
	private int age;
	//+	Chicken(String, int)
	public Chicken(String name, int age){
		setName(name);
		setAge(age);
	}
	//-	setName(String) : void
	private String getName() {
		return name;
	}
	private void setName(String name) {
		if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
		this.name = name;
	}
	//-	setAge (int): void
	private int getAge() {
		return age;
	}
	private void setAge(int age) {
		if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
		this.age = age;
	}
	//+	productPerDay (): double
	public double productPerDay() {
		return calculateProductPerDay();
	}
	//+	toString(): Override
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Chicken %s (age %d) can produce %.2f eggs per day.", this.name, this.age, this.calculateProductPerDay());
	}
	//-	calculateProductPerDay() : double
	public double calculateProductPerDay () {
		if(this.age <= 0) {
			return 0;
		}
		else if(this.age > 0 && this.age < 6) {
			return 2;
		}
		else if(this.age >5 && this.age <= 11) {
			return 1;
		}
		return 0.75;
	}

}
