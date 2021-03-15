package EncapsulationTask3ShoppingSpree;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String [] personsArr = sc.nextLine().split(";");
		String [] productsArr = sc.nextLine().split(";");
//		List<Person> persons = new ArrayList<>();
//		List<Product> products = new ArrayList<>();
		Map<String, Person> persons = new LinkedHashMap<String, Person>();
		Map<String, Product> products = new HashMap<>();
		for(int i = 0;i<personsArr.length;i++) {
			String [] splitArr = personsArr[i].split("=");
			Person person = new Person(splitArr[0], Double.parseDouble(splitArr[1]));
			persons.put(person.getName(), person);
		}
		for(int i = 0;i<personsArr.length;i++) {
			String [] splitArr = productsArr[i].split("=");
			Product product = new Product(splitArr[0], Double.parseDouble(splitArr[1]));
			products.put(product.getName(),product);
		}
		String command = sc.nextLine();
		while(!"END".equals(command)) {
			String [] arr = command.split("\\s+");
			Person ps = persons.get(arr[0]);
			ps.buyProduct(products.get(arr[1]));
			command = sc.nextLine();
		}
		for(String person : persons.keySet()) {
			Person personT = persons.get(person);
			personT.printProducts();
		}
		
	}
}
