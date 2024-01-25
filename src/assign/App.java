package assign;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class App {

	public static void main(String args[]) {

		Scanner sc2 = new Scanner(System.in);
		ArrayList<Product> a1 = new ArrayList<Product>();
		for (int i = 0; i < 2; i++) {
			System.out.println("enter name: ");
			String name = sc2.next();
			System.out.println("enter category: ");
			String category = sc2.next();
			System.out.println("enter price: ");
			double price = sc2.nextDouble();
			System.out.println("enter quanity: ");
			int quanity = sc2.nextInt();

			Product p2 = new Product(name, price, category, quanity);

			a1.add(p2);
		}
		for(Product p : a1)System.out.println(p);
		// System.out.println(a1.get(0).getName());

		
		Stream<Product> productstream=a1.stream();
		System.out.println("Enter the name");
		String Searchname=sc2.next();
		productstream.filter(product ->product.getName().equals(Searchname))
		.forEach((product) -> System.out.println(product));
		//.sorted((p1,p2)->p2.getPrice()-p1.getPrice())
		
	}
}
