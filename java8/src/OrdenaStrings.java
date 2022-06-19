import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("editora casa dos códigos");
		palavras.add("caelum");

		/*
		 ** Como era feito antes ** Comparator<String> comparator = new
		 * ComparadorPorTamanho(); Collections.sort(palavras, comparator);
		 */

		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));		
		
		palavras.sort(Comparator.comparing(s -> s.length())); //pode ser feito assim
		palavras.sort(Comparator.comparing(String::length)); // ou ainda assim
		
		System.out.println(palavras);

		/*
		 * for (String s : palavras) { System.out.println(s); }
		 */
		
		palavras.forEach(s -> System.out.println(s)); //pode ser assim
		palavras.forEach(System.out::println);//ou ainda assim

	}
}