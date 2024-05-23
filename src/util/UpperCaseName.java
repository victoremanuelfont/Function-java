package util;

import java.util.function.Function;

import entities.Product;

/*
 * Function<TIPO, SAÍDA>
 * o método retorna o mesmo tipo da SAÍDA.
 */
public class UpperCaseName implements Function <Product, String>{

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
