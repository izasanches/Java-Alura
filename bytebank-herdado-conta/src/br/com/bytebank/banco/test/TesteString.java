package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Teste";
		String outro = "Alura";
	    String novo = outro.replace("A", "a");
	    novo = nome.toLowerCase(); 
	    char c = nome.charAt(3); //char i
	    System.out.println(c);

	    int pos = nome.indexOf("est");
	    System.out.println(pos);

	    String sub = nome.substring(1);
	    System.out.println(sub);
	    for(int i = 0; i < nome.length(); i++) {
	        System.out.println(nome.charAt(i));
	    } 

	    System.out.println(novo);
	}
}
