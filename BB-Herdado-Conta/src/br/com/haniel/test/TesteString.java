package br.com.haniel.test;

public class TesteString {

	public static void main(String[] args) {

		String vazio = "     Haniel    ";
		String outroVazio = vazio.trim();
		
		System.out.println(vazio.contains("Han"));
		System.out.println(outroVazio);
		
		String nome = "Haniel";
		
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
	}

}
