public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario nico = new Gerente();

		nico.setNome("Izabele Medeiros");
		nico.setCpf("000000000-00");
		nico.setSalario(1000.50);

		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());

	}

}