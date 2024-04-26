package atividade6java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {
		/*
		 * Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da
		 * Classe String, para organizar a ordem de chegada dos Clientes de um Banco. O
		 * programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
		 * 
		 * 1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
		 * 2:Listar todos os Clientes na fila 3: Chamar (retirar) uma pessoa da fila 0:
		 * O programa deve ser finalizado. Caso a fila esteja vazia, o programa deverá
		 * informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila.
		 * 
		 */

		Scanner leia = new Scanner(System.in);
		Queue<String> clientes = new LinkedList<String>();
		String elemento;
		int opcao = -1, verificacao = 0;

		while (opcao != 0) {
			System.out.println("""
					****************************************
					
					1 - Adicionar Cliente na fila
					2 - Listar todos os Clientes
					3 - Retirar Cliente da lista
					0 - Sair
					
					****************************************
					""");
			System.out.println("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 0:
				System.out.println("\nPrograma finalizado!");
				break;
			case 1:
				System.out.println("Digite o nome: ");
				elemento = leia.nextLine();
				clientes.add(elemento);
				System.out.println();
				System.out.println("Fila: \n");
				for (String cliente : clientes) {
					System.out.println(cliente);
				}
				System.out.println("\nCliente Adicionado!\n");
				break;
			case 2:
				System.out.println("\nLista de Clientes na Fila: \n");
				for (String cliente : clientes) {
					System.out.println(cliente);
				}
				System.out.println();
				break;
			case 3:
				if (clientes.isEmpty()) {
					System.out.println("\nA fila esta vazia!\n");
					leia.nextLine();
				} else {
					System.out.println("O primeiro cliente da fila é: "+clientes.poll());
					System.out.println("Deseja chamar? Digite 1 para sim e 2 para não");
					verificacao = leia.nextInt();
					if (verificacao == 1) {
					clientes.poll();
					System.out.println("Fila: \n");
					for (String cliente : clientes) {
						System.out.println(cliente);
					}
					System.out.println("\nO Cliente foi chamado!\n");
					} else {
						System.out.println("Nenhum cliente foi chamado! ");
						System.out.println("Fila: \n");
						for (String cliente : clientes) {
							System.out.println(cliente);
						}
						
					}
				}
				break;
			default:
				System.out.println("Entre com uma opção válida!");
				break;
			}

		}
	}

}
