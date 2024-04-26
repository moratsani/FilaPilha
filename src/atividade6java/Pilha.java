package atividade6java;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		/*
		 * Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da
		 * Classe String, para organizar a retirada de livros em uma pilha. O programa
		 * deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
		 * 
		 * 1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro. 2:
		 * Listar todos os livros da Pilha 3: Retirar um livro da pilha 0: O programa
		 * deve ser finalizado. Caso a pilha esteja vazia e o atendente tente retirar um
		 * livro da pilha, ele deverá informar que a pilha está vazia.
		 * 
		 */

		Scanner leia = new Scanner(System.in);
		Stack<String> livros = new Stack<String>();

		String elemento;
		int opcao, verificacao;

		do {
			System.out.println("****************************************");
			System.out.println("1 - Adicionar livro na pilha\n2 - Listar todos os Livros"
					+ "\n3 - Retirar Livro da pilha\n0 - Sair\n");
			System.out.println("****************************************");
			System.out.println("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 0:
				System.out.println("Programa finalizado.");
				break;
			case 1:
				System.out.println("Digite o nome: ");
				elemento = leia.nextLine();
				livros.push(elemento);
				System.out.println();
				for (String livro : livros) {
					System.out.println(livro);
				}
				System.out.println();
				System.out.println("Livro adicionado!");
				System.out.println();
				break;
			case 2:
				System.out.println("Lista de livros na pilha: ");
				System.out.println();
				for (String livro : livros) {
					System.out.println(livro);
				}
				System.out.println();
				break;
			case 3:
				if (livros.isEmpty()) {
					System.out.println("A Pilha esta vazia!");
					leia.nextLine();
				} else {
					System.out.println("O último Livro da Pilha é: " + livros.peek());
					System.out.println("Deseja retirar este livro da pilha? \nDigite 1 para sim e 2 para não");
					verificacao = leia.nextInt();
					if (verificacao == 1) {
						livros.pop();
						System.out.println("Pilha: \n");
						for (String livro : livros) {
							System.out.println(livro);
						}
						System.out.println("\nUm Livro foi retirado da pilha!\n");
					} else {
						System.out.println("Nenhum livro foi retirado! ");
						System.out.println("Pilha: \n");
						for (String livro : livros) {
							System.out.println(livro);
						}

					}

				}
				System.out.println();
				for (String livro : livros) {
					System.out.println(livro);
				}
				System.out.println();
				break;
			default:
				System.out.println("Entre com uma opção válida! ");
				break;
			}

		} while (opcao != 0);

	}

}
