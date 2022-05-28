package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 1234);
		ContaPoupanca cp = new ContaPoupanca(222, 9876); 
		
		System.out.println(cc);
		System.out.println(cp);
		
	}
}
