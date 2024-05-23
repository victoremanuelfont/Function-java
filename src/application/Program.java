package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		/*
		 * map = Aplica uma função a cada elemento de uma stream. Logo, map só funciona
		 * com Stream. Então Transformou-se a lista em stream(), depois aplicou o
		 * map(Aqui está a instanciação do método uppercaseName()), e depois transformou
		 * a stream em lista de novo. Como UpperCaseName() retorna um string, cria-se
		 * uma lista do tipo String pra receber a lista de Product alterada.
		 */
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		names.forEach(System.out::println);

	}
}