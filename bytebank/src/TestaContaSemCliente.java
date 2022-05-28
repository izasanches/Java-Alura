public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta(1332,456789);
		System.out.println(contaDaMarcela.getSaldo());

		contaDaMarcela.setTitular(new Cliente());
		System.out.println(contaDaMarcela.getTitular());

		contaDaMarcela.getTitular().setNome("Marcela");
		System.out.println(contaDaMarcela.getTitular().getNome());

	}
}