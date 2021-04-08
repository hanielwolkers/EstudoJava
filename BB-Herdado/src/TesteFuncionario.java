
public class TesteFuncionario {

	public static void main(String[] args) {
		
		
		Cliente cliente = new Cliente();
		
		
		
		Gerente haniel = new Gerente();
		haniel.setNome("Haniel Wolkers");
		haniel.setCpf("17840736793");
		haniel.setSalario(1100.00);

		System.out.println(haniel.getNome());
		System.out.println(haniel.getBonificacao());
	}

}
