package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("HD Case", 80.90));
		
		//CONSUMER implementação da interface
//		list.forEach(new PriceUpdate());
//		list.forEach(System.out::println);
		
		//CONSUMER reference method com metodo estatico
//		list.forEach(Product::staticPriceUpdate);
//		list.forEach(System.out::println);
		
		//CONSUMER reference method com metodo nao estatico
//		list.forEach(Product::nonStaticPriceUpdate);
//    	list.forEach(System.out::println);
		
		double factor = 1.1;
		
		//CONSUMER expressao lambda declarada
//		Consumer<Product> cons = p -> {
//			p.setPrice(p.getPrice()*factor);
//		};
//		list.forEach(cons);
//		list.forEach(System.out::println);
		
		//CONSUMER expressao lambda inline
		list.forEach( p -> p.setPrice(p.getPrice()*factor));
		list.forEach(System.out::println);

	}

}
