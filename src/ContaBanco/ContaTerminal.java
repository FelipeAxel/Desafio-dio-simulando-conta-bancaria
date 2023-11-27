package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);

		System.out.println("Olá bem vindo ao banco Mhoraga");

		System.out.println("Digite seu nome");
		String nome = ler.next();

		System.out.println("Digite seu agencia");
		String agencia = ler.next();
		
		System.out.println("Digite sua conta");
		String conta = ler.next();
		
		System.out.println("Digite seu saldo");
		String saldo = ler.next();

		
		System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
	}

}
