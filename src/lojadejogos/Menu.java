package lojadejogos;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

import lojadejogos.util.Cores;


public class Menu {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcao;
		while (true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND

					+ "**************************************************************");
			System.out.println("                                                              ");
			System.out.println("                                                              ");
			System.out.println("                    Loja de Jogos                             ");
			System.out.println("                                                              ");
			System.out.println(" ************************************************************ ");
			System.out.println("                                                              ");
			System.out.println("                   1 - Cadastrar Produto                      ");
			System.out.println("                   2 - Listar todos os Produtos               ");
			System.out.println("                   3 - Consultar Produto por ID               ");
			System.out.println("                   4 - Atualizar Produto                      ");
			System.out.println("                   5 - Deletar Produto                        ");
			System.out.println("                   6 - Sair                                   ");
			System.out.println("                                                              ");
			System.out.println(" ************************************************************ ");
			System.out.println("                   Entre com a opção desejada:                ");
			System.out.println("                                                              " + Cores.TEXT_RESET);

			// trata erros de entrada da opcao
			try {
				opcao = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite valores inteiros!");
				sc.nextLine();
				opcao = 0;
			}
			// para sair do programa
			if (opcao == 6) {
				System.out.print(Cores.TEXT_PURPLE_BOLD +  Cores.ANSI_BLACK_BACKGROUND + "      ********************** **********************       ");
				System.out.println(
						
						Cores.TEXT_PURPLE_BOLD +  Cores.ANSI_BLACK_BACKGROUND + "\n      Viva a Diversão! obrigada por acessar                       ");
				sobre();
				sc.close();
				System.exit(0);
			}
			String nome, genero, tamanho ;
			int id, tipo = 0;
			double preco;

			switch (opcao) {
			case 1: {

				System.out.println("Digite o tipo do Produto\n1 - Jogo\n2 - Camiseta ");
				System.out.print("tipo: ");
				tipo = sc.nextInt();

				switch (tipo) {
				case 1:
					System.out.print("Digite o nome do Jogo: ");
					sc.skip("\\R");
					nome = sc.nextLine();
					System.out.print("Digite o preço do " + nome + ":");
					preco = sc.nextFloat();
					System.out.print("Digite o genero desse Jogo: ");
					sc.skip("\\R");
					genero = sc.nextLine();
					
					break;
				case 2:
					System.out.print("Digite o nome do personagem da Camiseta: ");
					sc.skip("\\R");
					nome = sc.nextLine();
					System.out.print("Digite o preço do " + nome + ":");
					preco = sc.nextFloat();
					System.out.print("Digite o tamanho da camiseta: ");
					sc.skip("\\R");
					tamanho= sc.nextLine();
					
					break;
				}
				keyPress();
				break;
			}
			case 2: {
				System.out.println("******************** Lista de Produtos ********************\n");
				
				keyPress();
				break;
			}
			case 3: {
				System.out.print("Digite o ID do Produto: ");
				id = sc.nextInt();
			
				keyPress();
				break;
			}

			case 4: {
				System.out.println("Digite o ID do Produto: ");
				id = sc.nextInt();



				
					System.out.println("Digite o novo nome do Produto: ");
					sc.skip("\\R");
					nome = sc.nextLine();
					System.out.println("Digite o novo preço do Produto: ");
					preco = sc.nextFloat();

					switch (tipo) {
					case 1:
						System.out.println("Digite o novo genero do jogo: ");
						sc.skip("\\R");
						genero= sc.nextLine();
					
						break;
					case 2:
						System.out.println("Digite o novo tamanho: ");
						sc.skip("\\R");
						tamanho = sc.nextLine();
						
						break;
					default:
						System.out.println("Tipo de Produto inválido!");

					}
				
			}
			case 5: {
				System.out.println("Digite o ID do Produto: ");
				id = sc.nextInt();
				
				keyPress();
			}
			}
		}

	}

	private static void sobre() {
		System.out.println("     ********************** **********************        ");
		System.out.println("                      Criado por                          ");
		System.out.println("                                                          ");
		System.out.println("                    Grazielle Nascimento                  ");
		System.out.println("         https://github.com/GrazielleNascimento           ");
		System.out.println("                                                          ");
		System.out.println("     ********************** **********************        ");

	}

	public static void keyPress() {
		try {
			System.out.println("\nPressione Enter para Continuar");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de Enter");
		}
	}
}