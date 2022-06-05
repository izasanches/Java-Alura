package br.com.bytebank.banco.test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {
	
	public static void main(String[] args) {
	    boolean conditionA = true;
	    boolean conditionB = false;
	    boolean verifyConditions = conditionA && !conditionB;
	    IntStream.of(1, 2, 3, 4, 5)
	        .filter(i -> verifyConditions && i > 2)
	        .forEach(System.out::println);
	}
}
