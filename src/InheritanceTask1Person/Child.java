package InheritanceTask1Person;

public class Child extends Person{
	private String name;
	private int age;
	public Child(String name, int age) {
		this.setAge(age);
		this.setName(name);
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return this.age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
