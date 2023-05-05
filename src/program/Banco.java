package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import enteties.Conta;
import enteties.contaCorrente;

public class Banco {

	public static void main(String[] args) {
	
		List<Conta> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas contas voce deseja cadastrar: ");
		int nc = sc.nextInt();
		
		for(int i= 1; i<=nc; i++) {

			System.out.println("Digite seu nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Informe o numero da sua conta: ");
			int numeroConta = sc.nextInt();
			
			System.out.println("Informe seu saldo: ");
			double saldo = sc.nextDouble();
			
			contaCorrente cc1 = new contaCorrente(numeroConta, saldo, nome);
			list.add(cc1);
		
		}
		
		System.out.println("Deseja acessar qual conta: ");
		int numeroc = sc.nextInt();
		for (Conta conta : list) {
			list.get(numeroc);
			System.out.println("Qual operação desejada");
			System.out.println("opção 1: saque");
			System.out.println("opção 2: Deposito");
			int opcao = sc.nextInt();
			if(opcao ==1) {
				System.out.println("Valor do saque: ");
				double quantidade = sc.nextDouble();
				conta.sacar(quantidade);
			}else if (opcao == 2) {
				System.out.println("Valor do deposito: ");
				double quantidade1 = sc.nextDouble();
				conta.depositar(quantidade1);
			}
			System.out.println(conta);
		}
		
		
		

		
		
		
		
		System.out.println(list);
		sc.close();
		

	}


}
