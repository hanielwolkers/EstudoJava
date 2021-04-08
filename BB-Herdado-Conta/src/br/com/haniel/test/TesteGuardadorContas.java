package br.com.haniel.test;

import br.com.haniel.modelo.Conta;
import br.com.haniel.modelo.ContaCorrente;
import br.com.haniel.modelo.GuardadorDeContas;

public class TesteGuardadorContas {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22, 11);
		guardador.adiciona(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(1);
		System.out.println(ref.getNumero());
		
	}

}
