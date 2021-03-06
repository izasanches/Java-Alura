package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		System.out.println("Tamanho da lista: " + lista.size());
		
		Conta ref = lista.get(0);
		
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho da lista: " + lista.size());
		
		Conta cc3 = new ContaCorrente(22, 1100);
		lista.add(cc3);

		Conta cc4 = new ContaCorrente(22, 2200);
		lista.add(cc4);
		
		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
			
		}
		
		for (Conta oRef : lista) {
			System.out.println(oRef);
		}
		
	    List<Conta> listaVector = new Vector<Conta>(); 	
		
		
	}

}
