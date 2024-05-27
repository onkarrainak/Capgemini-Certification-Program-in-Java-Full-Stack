package onkar.Core_Java_Java8;

import java.util.function.BiFunction;

class Product1 {
	private String name;
	private int price;

	public Product1(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	// Getter and setter methods
}

public class ProductEx {

	public static void main(String[] args) {
		BiFunction<String, Integer, Product1> productConstructor = Product1::new;
		Product1 product = productConstructor.apply("Apple Iphone", 1500);
		System.out.println(product.getName());
		System.out.println(product.getPrice());
	}
}