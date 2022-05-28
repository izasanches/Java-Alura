public class TestaBanco {
	public static void main(String[] args) {
		Cliente izabele = new Cliente();
		izabele.setNome("Izabele Sanches");
		izabele.setCpf("222.222.222.-22");
		izabele.setProfissao("programadora");

		Conta contaDaIzabele = new Conta(1332,126548);
		contaDaIzabele.deposita(100);

		contaDaIzabele.setTitular(izabele);
		System.out.println(contaDaIzabele.getTitular().getNome());
		System.out.println(contaDaIzabele.getTitular());

	}
}