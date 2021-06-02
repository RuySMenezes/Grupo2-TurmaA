package RPG;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;

public class Intro {
	static double HP = 100;
	static int Itaipava = 0;
	static Scanner entrada = new Scanner(System.in); // SCANNER DE ESCOPO GLOBAL, NÃO É NECESSÁRIO INSTANCIAR NENHUM
														// OUTRO.
	
	static int d20 = new Random().nextInt(20) + 1; //Dado de 20 lados
	static int d6 = new Random().nextInt(6) + 1; //Dado de 6 lados

	// TEMPO DE DELAY DAS MENSAGENS: MODIFIQUE PARA ZERO PARA JOGAR SEM DELAY.
	// PADRÃO 70,150,25
	static int temp_dialog = 0, temp_narrativa = 0, temp_transicao = 0;

	public static void main(String[] args) throws Exception {

		Digita("\nABANDONAI TODA A ESPERANÇA, Ó VÓS QUE ENTRAIS...\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(".::: THE ARCHITECT - A BRAZILIAN CHRONIQUE :::.\n", TimeUnit.MILLISECONDS, temp_dialog);
		menu();
	}

	static void menu() throws Exception { // metodo para puxar as escolhas do menu
		String escolha_menu;
		System.out.println("\n1 - Jogar\n2 - Capitulos\n3 - Instruções\n4 - Créditos\n5 - Sair");
		escolha_menu = entrada.next();
		// EM FORMA DE STRING PARA CASO SEJA DIGITADO UM TIPO DIFERENTE DE INT.

		do {
			switch (escolha_menu) {
			case "1":
				jogo();
				break;
			case "2":
				escolhaCapitulo();
				break;
			case "3":
				instrucoes();
				break;
			case "4":
				creditos();
			case "5":
				System.exit(0);
			default:
				System.out.println("ERROOOOOOU! Tente novamente, meu consagrado.\n");
				System.out.println("1 - Jogar\n2 - Instruções\n3 - Créditos\n4 - Sair");
				escolha_menu = entrada.next();
			}
		} while (!escolha_menu.equals("1") && !escolha_menu.equals("2") && !escolha_menu.equals("3")
				&& !escolha_menu.equals("4"));

	}

	static void jogo() throws Exception { // metodo de inicio do jogo
		
		intro();
		capitulo_1();
		capitulo_2();
		capitulo_3();

	}

	static void escolhaCapitulo() throws Exception {
		String escolha_cap;

		Digita("\n0 - Introdução\n1 - Capítulo I - A ACEITAÇÃO\n2 - Capítulo II - A DESCOBERTA\n3 - Capítulo III - O CONFRONTO FINAL\n4 - Menu Principal",
				TimeUnit.MILLISECONDS, temp_dialog);
		escolha_cap = entrada.next();

		do {
			switch (escolha_cap) {
			case "0":
				intro();
			case "1":
				capitulo_1();
				break;
			case "2":
				capitulo_2();
				break;
			case "3":
				capitulo_3();
			case "4":
				menu();
			default:
				System.out.println("\nERROOOOU! Tente novamente, meu consagrado.");
				escolhaCapitulo();
			}

		} while (!escolha_cap.contentEquals("0") && !escolha_cap.contentEquals("1") && !escolha_cap.contentEquals("2")
				&& !escolha_cap.contentEquals("3"));
	}

	static void intro() throws Exception {
		String escolha;
		Digita("\n[MESTRE]: O ano é 2018."
				+ "\n[MESTRE]: Toninho finaliza seu dia de trabalho. Entra em seu Ford Belina e dá partida no motor.\n"
				+ "\nVRUM...\n" + "\n[MESTRE]: ele está com seu amigo e colega de empreitada, Cleytinho.\n"
				+ "\nCleytinho: Bora tomar uma lá no bar do Bira ?\n"
				+ "\nSelecione a sua resposta de acordo com o numero correspondente: " + "\n[1] AEHOOOO, bora!"
				+ "\n[2] Tô afim não, Cleytinho\n", TimeUnit.MILLISECONDS, temp_dialog);
		escolha = entrada.next();

		do {
			switch (escolha) {

			case "1":
				Digita("\nCleytinho: AEHOOOO, hoje o couro vai cochar!\n"
						+ "\n[MESTRE]: Cleytinho entra no carro e já vai aumentando o som.\n"
						+ "[MESTRE]: É uma tarde de sexta-feria e o sol começa a se pôr.\n"
						+ "[MESTRE]: Os amigos chegam ao bar do Bira\n"
						+ "\nToninho: AOWWWW BIRA VEIO, DESCE AQUELA GELADA QUE HOJE VOU VER VÍDEO NO ZAPZAP!\n"
						+ "Bira: É pra já, campeão!\n"
						+ "\n[MESTRE]: Os amigos sentam-se a mesa de plástico e discutem mundanindades.\n"
						+ "\n[3 horas e muitas itaipavas depois...]\n" + "\nCleytinho: Ô TONINHO, LEVANTA HOMEM!\n"
						+ "Toninho: To não.\n"
						+ "Cleytinho: Eu falo que você não aguenta beber, daqui a pouco vai começar a chorar pela ex de novo.\n"
						+ "Toninho: To não.\n" + "\n***Toninho desmaia***\n"
						+ "\n[MESTRE]: Cleytinho, vendo ser infrutíferas suas tentativas de ajudar o colega, o arrasta para o carro e leva Toninho à sua casa."
						+ "\n[MESTRE]: Toninho continua desmaiado e dormindo como se não houvesse o amanhã.",
						TimeUnit.MILLISECONDS, temp_dialog);
				break;
			case "2":
				Digita("\nCleytinho: Sai dessa, homi! Eu sei que você vai voltar para casa e ficar ligando pra Lucilene.\r\n"
						+ "Toninho: Vou nada, amanhã vou assar umas bistecas logo cedo.\r\n" + "Cleytinho:... \r\n"
						+ "\n[MESTRE]: Toninho segue para sua casa.\n"
						+ "[MESTRE]: somente ele e a solidão em seu coração que já não é mais o mesmo após anos de consumo indiscriminado de gordura saturada.\r\n"
						+ "[MESTRE]: Ao chegar, pensa consigo mesmo...\r\n"
						+ "\nToninho: Vou tomar só uma pois sou merecedor. \r\n"
						+ "\n[3 horas e muitas Itaipavas depois...]\r\n"
						+ "\n[MESTRE]:  Em uma ligação com sua amada...\r\n" + "\nToninho: Volta pra mim, Lucilene!\r\n"
						+ "Lucilene: Me esquece, ‘disgraça’!\r\n" + "BIP BIP BIP...\r\n"
						+ "\n***Toninho desmaia após chorar copiosamente***", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			default:
				System.out.println("\nOpção inválida!");
				Digita("\nSelecione a sua resposta de acordo com o numero correspondente: " + "\n[1] AEHOOOO, bora!"
						+ "\n[2] Tô afim não, Cleytinho\n", TimeUnit.MILLISECONDS, temp_dialog);
				escolha = entrada.next();
			}
		} while (!escolha.equals("1") && !escolha.equals("2"));

	}

	static void capitulo_1() throws Exception {
		String escolha;
		Digita("\n[horas depois...]\r\n"
				+ "\n[MESTRE]:  Toninho acorda, ainda meio desorientado pelos eventos da noite anterior e não se lembra de nada exceto seu nome e sua profissão.\r\n"
				+ "[MESTRE]: Acorda dentro de seu carro embora não o reconheça, coberto por uma densa neblina.\r\n"
				+ "[blablablabla – inserir algo depois]\r\n"
				+ "[MESTRE]: Em meio a neblina, aproxima-se uma figura de arquétipo feminino... \r\n"
				+ "\nSheylla: Estávamos à sua espera, Toninho.\r\n" + "Toninho: Quem é você? Onde estou?\r\n"
				+ "Sheylla: Eu sou Sheylla com dois l’s, guardiã de Diademmor. \r\n" + "Toninho: Diademmor? \r\n"
				+ "Sheylla: Sim, Antônio. Diademmor. Esta realidade não é acessível para humanos comuns.\r\n"
				+ "Toninho: Com todo respeito dona Shirley, mas eu sou um mero pedreiro. Acho que você está me tomando por outra pessoa. \r\n"
				+ "Sheylla: É Sheylla, não Shirley. E não, tenho certeza de que você é o escolhido.\r\n"
				+ "Toninho: Escolhido para quê, minha senhora? Só quero assar minhas bistecas hoje, se quiser que eu bata a laje da sua casa me chama no ZAPZAP que a gente combina o orçamento. \r\n"
				+ "\n[MESTRE]: Toninho vira as costas e segue em direção ao seu carro...\r\n"
				+ "[MESTRE]: Sheylla, visivelmente irada, assume a sua real forma de Erínia e avança em direção ao pedreiro\r\n"
				+ "\nSheylla: NÃO OUSE ME IGNORAR, HUMANO!\r\n" + "Toninho: Eita, que viajem é essa vei\r\n"
				+ "Sheylla: ACEITE O SEU DESTINO, MORTAL. \r\n", TimeUnit.MILLISECONDS, temp_dialog);

		Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
				+ "Toninho[1]: Pois bem, que seja. \r\n" + "Toninho[2]: Sem tempo, irmão.\r\n", TimeUnit.MILLISECONDS,
				temp_dialog);
		escolha = entrada.next();

		do {
			switch (escolha) {
			case "1":
				Digita("\nSheylla: Ótimo. Venha, vou guia-lo por essa realidade.\r\n"
						+ "Sheylla: Não é seguro que caminhe só.\r\n"
						+ "Sheylla: Há armadilhas por todo o percurso.\r\n", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			case "2":
				Digita("\nSheylla: Você não está na posição de decidir coisa alguma, Antônio.\r\n",
						TimeUnit.MILLISECONDS, temp_dialog);
				break;
			default:
				System.out.println("\nOpção inválida!");
				Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
						+ "Toninho[1]: Pois bem, que seja. \r\n" + "Toninho[2]: Sem tempo, irmão.\r\n",
						TimeUnit.MILLISECONDS, temp_dialog);
				escolha = entrada.next();
			}

		} while (!escolha.equals("1") && !escolha.equals("2"));

		Digita("[MESTRE]: Sheylla, com um estalar de dedos, invoca seu Del Rey 1988\r\n"
				+ "Toninho: Eita, um carro que anda sozinho? É aquele carro do Elton Muska? \r\n"
				+ "Sheylla: Não, é um Del Rey. Já lhe disse Antônio, há muito mais nessa realidade que tua vivência ordinária lhe permite compreender. \r\n"
				+ "\n[MESTRE]: Toninho aceita a resposta de forma silente e ambos entram no Del Rey.\r\n"
				+ "[MESTRE]: Ambos entram no veículo com direção às entranhas de Diademmor.\r\n"
				+ "[MESTRE]: Um arco com a inscrição “Abandonai toda esperança, ó vos que entrais” chama a atenção de nosso guerreiro. \r\n"
				+ "\nToninho: Ô dona Shirley, qual é dessa frase aí?\r\n"
				+ "Sheylla: Pela última vez, é Sheylla, não Shirley. Creio que a sentença tenha sido clara o suficiente.\r\n"
				+ "Sheylla: Esta realidade há muito abandonada por seu criador virou morada das mais horrendas criaturas e guarda os mais lúgubres segredos.\r\n"
				+ "Sheylla: Prepare-se, meu caro. \r\n", TimeUnit.MILLISECONDS, temp_dialog);

		Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n" + "Toninho[1]: Criador?\r\n"
				+ "Toninho[2]: Criaturas? \r\n" + "Toninho[3]: Segredos? \r\n", TimeUnit.MILLISECONDS, temp_dialog);
		escolha = entrada.next();

		do {
			switch (escolha) {
			case "1":
				Digita("Sheylla: Pouco se sabe sobre ele, mas os boatos são de que esta é a última obra de Dédalo antes de sua derrocada. \r\n",
						TimeUnit.MILLISECONDS, temp_dialog);

				Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
						+ "Toninho[1]: Criaturas?\r\n" + "Toninho[2]: Segredos? \r\n", TimeUnit.MILLISECONDS,
						temp_dialog);
				escolha = entrada.next();

				do {
					switch (escolha) {
					case "1":
						Digita("Sheylla: existem 3 grandes criaturas que guardam o segredo dessa masmorra\r\n"
								+ "Sheylla:A Esfinge é um monstro alado com corpo de muher e leão que afligia a cidade de Tebas, e quem erra seus enigmas é devorado!\r\n"
								+ "Sheylla:O Minotauro, um monstro com cabeça e cauda de touro e corpo de homem, possue um grande machado e uma força fisica descomunal\r\n"
								+ "Sheylla:E a ultima e mais perigosa, Medusa uma criatura do sexo feminino, uma das três Górgonas, com cabelos de serpente e quem quer que olhe diretamente para ela, vira pedra em instantes\r\n",
								TimeUnit.MILLISECONDS, temp_dialog);

						Digita("\n[MESTRE]: Segredos", TimeUnit.MILLISECONDS, temp_dialog);

						Digita("Sheylla: Há boatos de que antes de abandonar Diademmor, o criador escondeu algo de extremo valor (depois pensamos nisso)\r\n",
								TimeUnit.MILLISECONDS, temp_dialog);
						break;
					case "2":
						Digita("Sheylla: Há boatos de que antes de abandonar Diademmor, o criador escondeu algo de extremo valor (depois pensamos nisso)\r\n",
								TimeUnit.MILLISECONDS, temp_dialog);

						Digita("\n[MESTRE]: Criaturas", TimeUnit.MILLISECONDS, temp_dialog);

						Digita("Sheylla: existem 3 grandes criaturas que guardam o segredo dessa masmorra\r\n"
								+ "Sheylla:A Esfinge é um monstro alado com corpo de muher e leão que afligia a cidade de Tebas, e quem erra seus enigmas é devorado!\r\n"
								+ "Sheylla:O Minotauro, um monstro com cabeça e cauda de touro e corpo de homem, possue um grande machado e uma força fisica descomunal\r\n"
								+ "Sheylla:E a ultima e mais perigosa, Medusa uma criatura do sexo feminino, uma das três Górgonas, com cabelos de serpente e quem quer que olhe diretamente para ela, vira pedra em instantes\r\n",
								TimeUnit.MILLISECONDS, temp_dialog);
						break;
					default:
						System.out.println("Opção Invalida");
						Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
								+ "Toninho[1]: Criaturas?\r\n" + "Toninho[2]: Segredos? \r\n", TimeUnit.MILLISECONDS,
								temp_dialog);
						escolha = entrada.next();
					}
				} while (!escolha.equals("1") && !escolha.equals("2"));
				break;
			case "2":
				Digita("Sheylla: existem 3 grandes criaturas que guardam o segredo dessa masmorra\r\n"
						+ "Sheylla:A Esfinge é um monstro alado com corpo de muher e leão que afligia a cidade de Tebas, e quem erra seus enigmas é devorado!\r\n"
						+ "Sheylla:O Minotauro, um monstro com cabeça e cauda de touro e corpo de homem, possue um grande machado e uma força fisica descomunal\r\n"
						+ "Sheylla:E a ultima e mais perigosa, Medusa uma criatura do sexo feminino, uma das três Górgonas, com cabelos de serpente e quem quer que olhe diretamente para ela, vira pedra em instantes\r\n",
						TimeUnit.MILLISECONDS, temp_dialog);

				Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
						+ "Toninho[1]: Criador?\r\n" + "Toninho[2]: Segredos? \r\n", TimeUnit.MILLISECONDS,
						temp_dialog);
				escolha = entrada.next();
				do {
					switch (escolha) {
					case "1":
						Digita("Sheylla: Pouco se sabe sobre ele, mas os boatos são de que esta é a última obra de Dédalo antes de sua derrocada. \r\n",
								TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n[MESTRE]: Segredos", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Sheylla: Há boatos de que antes de abandonar Diademmor, o criador escondeu algo de extremo valor (depois pensamos nisso)\r\n",
								TimeUnit.MILLISECONDS, temp_dialog);
						break;
					case "2":
						Digita("Sheylla: Há boatos de que antes de abandonar Diademmor, o criador escondeu algo de extremo valor (depois pensamos nisso)\r\n",
								TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n[MESTRE]: Criador", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Sheylla: Pouco se sabe sobre ele, mas os boatos são de que esta é a última obra de Dédalo antes de sua derrocada. \r\n",
								TimeUnit.MILLISECONDS, temp_dialog);
						break;
					default:
						System.out.println("Opção Invalida");
						Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
								+ "Toninho[1]: Criador?\r\n" + "Toninho[2]: Segredos? \r\n", TimeUnit.MILLISECONDS,
								temp_dialog);
						escolha = entrada.next();
					}
				} while (!escolha.equals("1") && !escolha.equals("2"));
				break;
			case "3":
				Digita("Sheylla: Há boatos de que antes de abandonar Diademmor, o criador escondeu algo de extremo valor (depois pensamos nisso)\r\n",
						TimeUnit.MILLISECONDS, temp_dialog);

				Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
						+ "Toninho[1]: Criador?\r\n" + "Toninho[2]: Criaturas? \r\n", TimeUnit.MILLISECONDS,
						temp_dialog);
				escolha = entrada.next();
				do {
					switch (escolha) {
					case "1":
						Digita("Sheylla: Pouco se sabe sobre ele, mas os boatos são de que esta é a última obra de Dédalo antes de sua derrocada. \r\n",
								TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n[MESTRE]: Criatura", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Sheylla: existem 3 grandes criaturas que guardam o segredo dessa masmorra\r\n"
								+ "Sheylla:A Esfinge é um monstro alado com corpo de muher e leão que afligia a cidade de Tebas, e quem erra seus enigmas é devorado!\r\n"
								+ "Sheylla:O Minotauro, um monstro com cabeça e cauda de touro e corpo de homem, possue um grande machado e uma força fisica descomunal\r\n"
								+ "Sheylla:E a ultima e mais perigosa, Medusa uma criatura do sexo feminino, uma das três Górgonas, com cabelos de serpente e quem quer que olhe diretamente para ela, vira pedra em instantes\r\n",
								TimeUnit.MILLISECONDS, temp_dialog);
						break;
					case "2":
						Digita("Sheylla: existem 3 grandes criaturas que guardam o segredo dessa masmorra\r\n"
								+ "Sheylla:A Esfinge é um monstro alado com corpo de muher e leão que afligia a cidade de Tebas, e quem erra seus enigmas é devorado!\r\n"
								+ "Sheylla:O Minotauro, um monstro com cabeça e cauda de touro e corpo de homem, possue um grande machado e uma força fisica descomunal\r\n"
								+ "Sheylla:E a ultima e mais perigosa, Medusa uma criatura do sexo feminino, uma das três Górgonas, com cabelos de serpente e quem quer que olhe diretamente para ela, vira pedra em instantes\r\n",
								TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n[MESTRE]: Criador", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("Sheylla: Pouco se sabe sobre ele, mas os boatos são de que esta é a última obra de Dédalo antes de sua derrocada. \r\n",
								TimeUnit.MILLISECONDS, temp_dialog);
						break;
					default:
						System.out.println("Opção Invalida");
						Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
								+ "Toninho[1]: Criador?\r\n" + "Toninho[2]: Criaturas? \r\n", TimeUnit.MILLISECONDS,
								temp_dialog);
						escolha = entrada.next();
					}
				} while (!escolha.equals("1") && !escolha.equals("2"));
				break;
			default:
				System.out.println("\nOpção inválida!");
				Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
						+ "Toninho[1]: Criador?\r\n" + "Toninho[2]: Criaturas? \r\n" + "Toninho[3]: Segredos? \r\n",
						TimeUnit.MILLISECONDS, temp_dialog);
				escolha = entrada.next();
			}
		} while (!escolha.equals("1") && !escolha.equals("2") && !escolha.equals("3"));

		Digita("[MESTRE]: Toninho digere apreensivamente as novas informações... \r\n"
				+ "\nSheylla: Você está bem, Antônio? Parece meio... pálido. \r\n" + "Toninho: Melhor impossível.\r\n"
				+ "Sheylla: Bom, precisarei de você atento de agora em diante. \r\n"
				+ "\n[MESTRE]: Ouve-se um estrondo do lado de fora e pouco a pouco o Del Rey começa a perder velocidade.\r\n"
				+ "\nToninho: AAAAAAAAAAA É O DEMÔNIO!!!\r\n" + "Sheylla: RECOMPONHA-SE! \r\n"
				+ "\n[MESTRE]: Sheylla, em sua frieza habitual, estaciona o carro em meio a densa neblina, e sai para checar o que houve. \r\n"
				+ "\nSheylla: Furou o pneu do carro. Você deve sair e trocar.\r\n"
				+ "Toninho: E eu que tenho de ficar atento, né? Deus me ajude... \r\n", TimeUnit.MILLISECONDS,
				temp_dialog);

		// INSERIR AS ALTERNATIVAS NESTE ARRAYLIST. MUDAR O NOME PARA QUEST E O NÚMERO
		// DA QUESTÃO
		ArrayList<String> quest1 = new ArrayList<String>();
		quest1.add("57");
		quest1.add("-71");
		quest1.add("-7");
		quest1.add("137");
		quest1.add("185");

		// COLOCAR O NOVO NOME AQUI TAMBÉM
		Collections.shuffle(quest1);
		Collections.shuffle(quest1);
		Collections.shuffle(quest1);

		// ESSAS VARIÁVEIS SÃO NECESSÁRIAS. SUBSTITUA O NÚMERO 1 PELO NÚMERO DA QUESTÃO
		// CORRESPONDENTE
		int i = 1;
		String resp1;
		String continue1;
		String respSistema1 = null;
		boolean exit1 = false;
		do {
			System.out.println(
					"Sabendo que a largura em milímetros do Del Rey de Sheylla é 185, determine o valor de x na seguinte expressão:\n"
							+ "(2^4 : 4^2) . (16^1 * 2^3) + x = 185"); // ENUNCIADO DA QUESTÃO
			i++;
			System.out.println("a) " + quest1.get(0) + "\n" + "b) " + quest1.get(1) + "\n" + "c) " + quest1.get(2)
					+ "\n" + "d) " + quest1.get(3) + "\n" + "e) " + quest1.get(4) + "\n");
			resp1 = entrada.next().toLowerCase();

			// COLOQUE A ALTERNATIVA CORRETA DENTRO DO .CONTENTEQUALS PARA COMPARAÇÃO
			switch (resp1) {
			case "a":
				respSistema1 = (quest1.get(0).contentEquals("57")) ? "Acertou, mizeravi!" : "ERROOOOOU";
				System.out.println(respSistema1);
				exit1 = (respSistema1.contentEquals("Acertou, mizeravi!")) ? true : false;
				break;
			case "b":
				respSistema1 = (quest1.get(1).contentEquals("57")) ? "Acertou, mizeravi!" : "ERROOOOOU";
				System.out.println(respSistema1);
				exit1 = (respSistema1.contentEquals("Acertou, mizeravi!")) ? true : false;
				break;
			case "c":
				respSistema1 = (quest1.get(2).contentEquals("57")) ? "Acertou, mizeravi!" : "ERROOOOOU";
				System.out.println(respSistema1);
				exit1 = (respSistema1.contentEquals("Acertou, mizeravi!")) ? true : false;
				break;
			case "d":
				respSistema1 = (quest1.get(3).contentEquals("57")) ? "Acertou, mizeravi!" : "ERROOOOOU";
				System.out.println(respSistema1);
				exit1 = (respSistema1.contentEquals("Acertou, mizeravi!")) ? true : false;
				break;
			case "e":
				respSistema1 = (quest1.get(4).contentEquals("57")) ? "Acertou, mizeravi!" : "ERROOOOOU";
				System.out.println(respSistema1);
				exit1 = (respSistema1.contentEquals("Acertou, mizeravi!")) ? true : false;
				break;
			default:
				System.out.println("DIGITE UMA OPÇÃO VÁLIDA!");
			}

			if (i == 1 && exit1 == true) {
				Digita("[MESTRE]: Seus esforços foram bem recompensados! Você recebeu uma Itaipava!",
						TimeUnit.MILLISECONDS, temp_dialog);
				Itaipava = Itaipava + 1;
			}
			if (!(resp1.equals("a") || resp1.equals("b") || resp1.equals("c") || resp1.equals("d")
					|| resp1.equals("e"))) {
				i = i - 1;
			}
			// ESTRUTURA QUE PERMITE O JOGADOR ESCOLHER TENTAR RESPONDER NOVAMENTE OU NÃO.
			if (resp1.equals("a") || resp1.equals("b") || resp1.equals("c") || resp1.equals("d")
					|| resp1.equals("e") && i <= 3 && exit1 == false) {
				HP = HP - 10;
				if (respSistema1.equals("ERROOOOOU") && i <= 3) {
					System.out.println("\nTentar novamente?\n1 - SIM\n2 - NÃO");
					continue1 = entrada.next();
					if (!continue1.contentEquals("1")) {
						break;
					}
				}
			}

		} while (!exit1 && i <= 3);

		Digita("[MESTRE] Após o conserto, Toninho e Sheylla seguem viagem. \r\n"
				+ "Sheylla: Não foi tão ruim assim, foi, Antônio? \r\n" + "[blablabla]\r\n"
				+ "\n[MESTRE] Após uma breve jornada, Sheylla e Toninho chegam ao destino pretendido. Observa-se uma cratera intransponível à frente, e o conteúdo que guarda o outro lado é obstruído pela ainda densa névoa.\r\n"
				+ "\nSheylla: Chegamos. Sabe o porquê de eu trazê-lo aqui, Antônio?\r\n"
				+ "Toninho: Nem sei se quero saber...\r\n" + "Sheylla: Preciso que você construa uma ponte. \r\n"
				+ "Toninho: O que há do outro lado? \r\n" + "Sheylla: Nada que você precise saber por enquanto. \r\n"
				+ "Toninho: Ouch, grossa. Eu sou pedreiro, não engenheiro. Meu negócio é bater laje. \r\n"
				+ "Sheylla: Você tem o necessário. \r\n"
				+ "Toninho: Se você está dizendo... Mas como espera que eu construa uma ponte sem recursos ou mão de obra?\r\n"
				+ "Sheylla: Você terá toda a mão de obra necessária a seu dispor. Quanto aos materiais, eu o instruirei de onde achá-los por Diademmor.\r\n"
				+ "\n[MESTRE] Sheylla entrega um mapa nas mãos de Toninho e ele analisa o mesmo atentamente.\r\n"
				+ "\nSheylla: Neste primeiro momento, o conduzirei ao nosso primeiro local de busca para que tenha a mínima noção do que irá enfrentar. O resto ficará a seu encargo.\r\n"
				+ "Toninho: Que Deus me ajude... \r\n"
				+ "\n[MESTRE] Toninho, agora ciente e quase conformado de seu destino, segue uma curta viagem com Sheylla.\r\n"
				+ "\n[10 minutos depois...]\r\n"
				+ "\n[MESTRE] Toninho e Sheylla chegam em uma rua sem saída, com um prédio aparentemente abandonado no fim desta. \r\n"
				+ "\nToninho: O que encontraremos aqui?\r\n"
				+ "Sheylla: Os boatos são de que aqui está guardado o projeto original da ponte, este é o primeiro passo. \r\n"
				+ "Toninho: E como espera que eu interprete esse projeto? Minha senhora, minhas habilidades matemáticas são restritas à divisão da conta do bar.\r\n"
				+ "Sheylla: Não se preocupe, há alguém que irá auxiliá-lo. \r\n"
				+ "\n[MESTRE] Em meio a névoa, surge uma ave que voa em direção ao herói. \r\n"
				+ "\nSheylla: Falando neste alguém, aí vem. \r\n" + "[MESTRE] A ave pousa nos ombros de Sheylla. \r\n"
				+ "Ave[Perdix]: E chega-se o momento que todos esperávamos. \r\n" + "Sheylla: De fato.\r\n"
				+ "Toninho: Isso é um papagaio? \r\n"
				+ "Ave[Perdix]: ... era esse humano medíocre a quem estávamos à espera?  \r\n"
				+ "Sheylla: Sim, o próprio. \r\n"
				+ "Toninho: Qual foi dona Sheylla, vai deixar esse papagaio me ofender desse jeito? \r\n"
				+ "Ave[Perdix]: Eu sou um perdiz e não um papagaio, seu iletrado. Nunca ouvira da lenda de Perdix, sobrinho de Dédalo?  \r\n"
				+ "Toninho: Não conheço e não ligo, só sei que vai você virar frango a passarinho se continuar com gracinha. \r\n"
				+ "\n[MESTRE] A discussão é interrompida por um som de trotes oriundos do prédio abandonado. Emerge da escuridão dos corredores uma criatura com corpo de leão e cabeça de mulher, conhecida como Esfinge. Perdix, ao notar a criatura, alça voo e abandona Sheylla e Toninho a sua própria sorte. \r\n"
				+ "\nToninho: Estou bêbado ainda ou...\r\n" + "Sheylla: CALADO. Deixe-me cuidar disso.\r\n"
				+ "Esfinge: O QUE PROCURAS AQUI?\r\n" + "Sheylla: Viemos em busca do projeto para...\r\n"
				+ "Esfinge: CALADA, DIRIGI A PALAVRA AO MORTAL QUE VOS ACOMPANHA. \r\n", TimeUnit.MILLISECONDS,
				temp_dialog);

		Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n" + "[1] Diplomacia\r\n"
				+ "[2] Sair no soco com a Esfinge.\r\n"
				+ "Toninho estará munido de um tijolo que achou entre os escombros.\r\n", TimeUnit.MILLISECONDS,
				temp_dialog);
		escolha = entrada.next();

		do {
			switch (escolha) {
			case "1":
				System.out.println(" - Resolver uma questão proposta pela Esfinge.");
				break;
			case "2":
				Digita("[MESTRE]: Toninho, num instinto de sobrevivência tipicamente brasileiro resolveu enfrentar a Esfinge. Valeu-se de um tijolo que estava perto e num átimo de desespero, atirou-o contra a criatura.",
						TimeUnit.MILLISECONDS, temp_dialog);
				System.out.println("Lançando o dado de 20 lados(D20)...");
				Thread.sleep(1000);
				System.out.println("Resultado: " + d20);

				if (d20 >= 1 && d20 <= 10) {
					Digita("", TimeUnit.MILLISECONDS, temp_dialog);
					// Toninho erra a tijolada, é atacado por Esfinge e perde 20 pontos de vida.
					// Sheylla intervém.
					HP = HP - 20;
				} else if (d20 > 10 && d20 <= 15) {
					Digita("", TimeUnit.MILLISECONDS, temp_dialog);
					// A tijolada é suficiente para nocautear a Esfinge temporariamente.
				} else if (d20 > 15) {
					Digita("", TimeUnit.MILLISECONDS, temp_dialog);
					// A tijolada mata a Esfinge.

				}

			}

		} while (!escolha.equals("1") && !escolha.equals("2"));

		Digita("[MESTRE]: Após os acontecimentos, Sheylla e Toninho adentram o prédio.\r\n"
				+ "[MESTRE]: É um ambiente mal iluminado, mas pode-se notar várias salas e lances de escada que levam aos andares superiores.\r\n"
				+ "\nSheylla: Acho mais prudente nos separarmos, seremos mais rápidos desta forma. \r\n"
				+ "Toninho: E se eu encontrar alguma outra criatura? \r\n"
				+ "Sheylla: A Esfinge era a única guardiã destas ruínas, você ficará bem... eu acho.\r\n"
				+ "Sheylla: Em todo caso, valha-se de alguma arma se achar, pode ser de grande valia. Em último caso, corra. Há uma miríade de opções. \r\n"
				+ "Toninho: Você sabe muito bem como tranquilizar alguém... \r\n"
				+ "Sheylla: Confia. Procure por um papiro ou qualquer outra coisa que se assemelhe a isso. \r\n"
				+ "Toninho: Papiro? \r\n"
				+ "Sheylla: Um pergaminho, Antônio. Apenas procure por algo que pareça um papel."
				+ " Cheque toda e qualquer sala e encontre-me na entrada do prédio quando terminar. Recomendo que comece pelo piso superior. \r\n"
				+ "Toninho: Ok, mas se aparecer alguma outra criatura diga adeus ao seu Del Rey.\r\n"
				+ "Sheylla: Justo. \r\n"
				+ "\n[MESTRE]: E assim eles se separam. Toninho, ainda abalado com tudo que sucedera momentos antes, cantarola para se encorajar enquanto perambula pelos soturnos corredores. \r\n"
				+ "\nToninho: Entra na minha casaaa, entra na minha vidaaa, mexe com minha estrutura...\r\n"
				+ "\n[MESTRE] Após a infrutífera checagem de várias salas e descendo em direção a outro andar, uma voz misteriosa ascende em meio a escuridão.\r\n"
				+ "\nVoz: Cuida-te com aqueles a quem tu depositas tua confiança. \r\n"
				+ "Toninho: TÁ REPREENDIDO EM NOME DO SENHOR, QUEM ESTÁ AÍ? \r\n"
				+ "Voz: Logo saberás... não sou eu aquele a quem tu deves temer.\r\n"
				+ "Toninho: EU TE COMANDO E ORDENO SATANÁS, MOSTRA TUA FACE\r\n" + "Voz: Logo...\r\n"
				+ "\n[MESTRE]: Tão misteriosamente quanto surgiu, a voz se esvai pelos longos corredores, apenas contribuindo para a tensão do pedreiro. \r\n"
				+ "\nToninho: ALÔ...? ... UÉ.\r\n"
				+ "\n[MESTRE] Algo neste corredor chama a atenção do herói. Uma porta distinta de qualquer outra que tenha visto neste edifício, com o batente e a maçaneta feitas em ouro puro, não por acaso atrativas à vista. \r\n"
				+ "\nToninho: Interessante... parece que há algo escrito. \r\n"
				+ "“””Tens o que é necessário para abrir a minha porta? “””\r\n", TimeUnit.MILLISECONDS, temp_dialog);

		// desafio 2

		Digita("[MESTRE]: A porta se abre lentamente e revela apenas uma incessante escuridão. \r\n" + "Toninho: \r\n"
				+ "[MESTRE] Toninho se apossa do pergaminho e encontra um bilhete entre este\r\n"
				+ "\n“”” Este pergaminho contém apenas metade daquilo que projetei, e o local em que se encontra a outra metade cairá no esquecimento assim como eu, ao decorrer do tempo. Prefiro a morte a permitir que minhas obras sejam usadas para propósitos escusos. \r\n"
				+ "Dirijo-me agora a ti, ó ser perspicaz que fora capaz de evadir-se da criatura que guarda este solo e ao mesmo tempo desvendar o enigma que, como último recurso, guardava estes segredos. \r\n"
				+ "Saúdo-te. Fora suficientemente sagaz até aqui, mas duvido que esteja à altura do que o destino lhe reserva. \r\n"
				+ "- Dédalo “””\r\n"
				+ "Toninho: Será que é o mesmo homem, tio daquela pomba que conheci mais cedo? Ô mundinho estranho.\r\n"
				+ "\n[MESTRE] Toninho, com a obra em mãos, dirige-se à saída onde encontra Sheylla com um ar de quem falhou em seu objetivo.\r\n"
				+ "\nToninho: Ô dona Shirlley, veja se é isso o que você queria. \r\n"
				+ "Sheylla: Devo admitir Antônio, você excedeu minhas expectativas! Até pensei que estaria mor... er... digo, mortificado pela arquitetura do prédio. \r\n"
				+ "Toninho: Que nada, já construí casa muito “mais melhor” que isso. – detalhe nas aspas\r\n"
				+ "Sheylla: Tenho certeza que sim.\r\n" + "Toninho: Também achei esse bilhete no meio.\r\n"
				+ "\n[MESTRE]: Sheylla silencia-se enquanto lê atentamente. \r\n"
				+ "\nSheylla: Aqui diz que isso é apenas uma parte do projeto. \r\n"
				+ "Toninho: É o que diz. Sabe onde pode estar a outra parte? \r\n"
				+ "Sheylla: Tenho uma ideia, mas caberá a ti obtê-lo. \r\n" + "Toninho: Só achei algo estranho...\r\n"
				+ "Sheylla: O que seria?\r\n"
				+ "Toninho: Uma voz falou comigo. Não sei se aconteceu de verdade ou ainda é efeito das cervejas da noite anterior, mas... \r\n"
				+ "Sheylla: E o que essa voz disse? \r\n"
				+ "Toninho: Alguma coisa sobre confiar no meu potencial eu acho, não lembro direito pois me assustei um pouco.\r\n"
				+ "Sheylla: Conte-me mais. \r\n"
				+ "Toninho: Mas eu me impus e chamei ele pra briga, não fui um covarde. Ah, e esse cheiro estranho não está vindo de mim não. \r\n"
				+ "Sheylla: Meu herói. Creio que tenha provado o seu valor hoje, poderá descansar por hoje se quiser. \r\n",
				TimeUnit.MILLISECONDS, temp_dialog);

		Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
				+ "[1 - DESCANSAR] Nois é merecedor. \r" + "+ 10HP\r\n"
				+ "[2 – PROSSEGUIR] Confia que o pai tá monstro.\r\n"
				+ "O jogador receberá um “buff” no seu ataque ou na defesa, vou analisar melhor depois.\r\n",
				TimeUnit.MILLISECONDS, temp_dialog);
		escolha = entrada.next();

		do {
			switch (escolha) {
			case "1":
				Digita("[MESTRE]: Toninho e Sheylla entram no Del Rey, e Toninho aproveita a viagem para descansar seus olhos.\r\n"
						+ "[MESTRE]:Nosso herói dorme tranquilo, apesar de tudo que vivenciou nestas últimas horas.\r\n"
						+ "\n[ALGUMAS HORAS DEPOIS...]\r\n", TimeUnit.MILLISECONDS, temp_dialog);
				HP = HP + 10;
				break;
			case "2":
				Digita("Else if (escolha == 2) {\r\n"
						+ "[MESTRE]: Toninho e Sheylla entram no Del Rey em rumo à sua próxima aventura\r\n"
						+ "Sheylla: Creio que você mereça uma recompensa. Olhe no banco de trás, tenho uma surpresa para ti.\r\n"
						+ "Toninho: UMA ITAIPAVA? MAS RAPAZ, ERA TUDO O QUE EU ESTAVA PRECISANDO!\r\n"
						+ "[MESTRE]: Toninho degusta aquela cerveja como se fosse a melhor que bebera em toda sua vida enquanto da vidraça do Del Rey"
						+ " observa a caótica paisagem que se condensa para ser vista depressa.\r\n",
						TimeUnit.MILLISECONDS, temp_dialog);
				break;
			default:
				System.out.println("\nOpção inválida!");
				Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
						+ "[1 - DESCANSAR] Nois é merecedor. \r" + "+ 10HP\r\n"
						+ "[2 – PROSSEGUIR] Confia que o pai tá monstro.\r\n"
						+ "O jogador receberá um “buff” no seu ataque ou na defesa, vou analisar melhor depois.\r\n",
						TimeUnit.MILLISECONDS, temp_dialog);
				escolha = entrada.next();
			}

		} while (!escolha.equals("1") && !escolha.equals("2"));

		Digita("Horas se passam, e ao momento que ambos chegam em seu próximo destino, a escuridão da noite já começa a pairar.\r\n"
				+ "Sheylla: Antônio, creio que esteja mais ou menos inteirado dos perigos que aqui habitam. De agora em diante você deverá"
				+ "prosseguir sozinho.\r\n" + "Toninho: A senhora não virá por quê?\r\n"
				+ "Sheylla: É que... é... hm... eu tenho coisas a fazer. Estou contando com sua bravura.\r\n"
				+ "[MESTRE]: Sheylla sai do carro e vai em direção ao porta-malas. Toninho ouve os passos e percebe que ela retorna com algo em mãos."
				+ "Sheylla: Leve isso contigo, creio que lhe será útil.\r\n"
				+ "Toninho: Um machado, dona Sheylla? Para que eu precisaria disso?\r\n"
				+ "Sheylla: Eu pensei que você já estivesse ciente do porquê... E não é um machado qualquer, dizem que pertenceu a Hefesto, filho de Zeus e ferreiro dos deuses.\r\n"
				+ "Toninho: Você tem o zapzap dele? Estava precisando de uma grelha nova para minha churrasqueira.\r\n"
				+ "Sheylla: Zapzap? O que?\r\n" + "Toninho: Ué dona Sheylla, aquele negócio do celular que...\r\n"
				+ "Sheylla: SILÊNCIO! FOCO! Você me distraiu tanto que até perdi o fio da meada\r\n"
				+ "Toninho: Mas...\r\n" + "Sheylla: SEM MAIS!\r\n" + "Toninho: Perdão pelo vacilo, dona Sheylla.\r\n"
				+ "Sheylla: Enfim, o que eu estava dizendo mesmo... Isso, sobre o machado. Será útil. Já enfatizei que há criaturas por todos os cantos e dessa vez"
				+ "não estarei aqui para te defender. Não abaixe sua guarda em nenhum momento.\r\n"
				+ "Toninho: Sim, senhora. Só mais uma coisa...\r\n" + "Sheylla: O que?\r\n"
				+ "[MESTRE]: Um breve momento de tensão e silêncio se passa e os olhares de ambos se cruzam, antes que nosso herói quebre-o com sua pergunta.\r\n",
				TimeUnit.MILLISECONDS, temp_dialog);
		Thread.sleep(700);
		Digita("Toninho: Não tem uma Itaipavinha pra 'nois' aí não?\r\n"
				+ "Sheylla: MAS QUE DIABOS! E EU ESPERANDO QUE FOSSE ALGO SÉRIO! Já nem sei por que eu ainda me impressiono com sua futilidade.\r\n"
				+ "Toninho: Mas e aí, tem?\r\n" + "Sheylla: NÃO! VÁ LOGO!\r\n"
				+ "Toninho: Ouch, mas não precisava gritar também!\r\n"
				+ "Sheylla: Faça tua parte e eu providenciarei, está bom assim?\r\nnnnn" + "Toninho: Justo.\r\n"
				+ "Sheylla: Boa sorte.\r\n"
				+ "[MESTRE]: Sheylla entra em seu Del Rey e volta pelo mesmo caminho que percorrera anteriormente, enquanto Toninho observa os faróis "
				+ "se estreitarem na escuridão.\r\n"
				+ "[MESTRE]: Agora sozinho, o herói contempla o bosque dentre as ruínas a sua frente e se indaga sobre as provações vindouras, lembrando-se de uma "
				+ "canção que o conforta nos momentos de soledade.\r\n"
				+ "Toninho: Acrediteeeei no seu amor, e olha só como estooooou...\r\n"
				+ "Toninho: SOZINHOOOO, SOZINHOOOO... CHEGA DE TANTAS MENTIRAS, CHEGA DE BRINCAR COM MEU AMOR\r\n"
				+ "* CRACK *\r\n"
				+ "[MESTRE]: A cantoria é subitamente interrompida por um som de galhos quebrando em meio ao aparentemente inóspito bosque, assustando o pobre pedreiro.\r\n"
				+ "Toninho: AAAAAAAAAAAAAAAAAA!\r\n"
				+ "Toninho: QUEM ESTÁ AÍ? 'TEJE' CIENTE DE QUE TENHO UM MACHADO E NÃO TENHO MEDO DE USÁ-LO!\r\n"
				+ "* CRACK CRACK CRACK *\r\n" + "Toninho: REVELA TUA FACE, TINHOSO!\r\n"
				+ "[MESTRE]: O som misterioso se dissipa, mas a tensão se mantém. Agora alerta, Tonihno adentra as ruínas com o machado em mãos, "
				+ "preparado para enfrentar o que quer que seja que o destino lhe reserva.\r\n", TimeUnit.MILLISECONDS,
				temp_dialog);

	}

	static void capitulo_2() throws InterruptedException {

		String escolha;
		
		Digita("\n[MESTRE]: Toninho continua avançando em direção ao som misterioso com seu machado em mãos.\r\n"
				+ "\nToninho: Sou Toninho pedreiro matador de demônio. Aqui tem coragem!\r\n"
				+ "\n[MESTRE:] Toninho vê uma latinha de Brahma duplo malte próximo a uma arvore e já vai em sua direção.\r\n"
				+ "\nToninho: Opa!! Já tava com sede!\r\n"
				+ "\n[MESTRE]: Toninho tenta pegar a cerveja e acaba pisando em uma armadilha de laço e fica pendurado de ponta cabeça.\r\n"
				+ "[MESTRE]: Pequenas silhuetas começam a aparecer e se mostram como pequenos indivíduos, pigmeus e um deles fala.\r\n"
				+ "\nPigmeu: Estão deixando a gente sonha!\r\n"
				+ "\n[MESTRE]: O pigmeu com um pedaço de madeira, acerta a cabeça de Toninho e ele desmaia.\r\n"
				+ "[MESTRE]: Toninho acorda com um forte dor de cabeça e se vê amarrado em um tronco sendo levado até um labirinto em ruína.\r\n"
				+ "\nToninho: Me solta diacho!\r\n"
				+ "Pigmeu: Você nos salvara da Ira do Minotauro, então trate de ficar quieto e seja devorado.\r\n"
				+ "Toninho: Devo-que.\r\n"
				+ "Pigmeu: Com esse bucho de Ambrosia, vai saciar a fome dele por um século.\r\n"
				+ "Toninho: HAHAHA! Isso aqui é muita Itaipaiva, ah que saudade de um breja agora.\r\n"
				+ "Toninho: Mas ai seus cotocos, tem como soltar não, talvez eu posso ajuda-los.\r\n"
				+ "Pigmeu: Mas você vai sendo devorado pelo Minotauro.\r\n"
				+ "\n[MESTRE]: Toninho se vê em um pico de desespero amarrado, e sem o que fazer, então volta a tentar argumentar com os pigmeus.\r\n"
				+ "\nToninho: Então eu conheço a Sheylla, a gente derrotou a esfinge, assim sabe, talvez assim, eu posso tentar falar com esse pro player de free fire.\r\n"
				+ "\n[MESTRE]: Ao ouvir o Toninho os pigmeus de assustam e um deles começa a falar de forma assustada\r\n"
				+ "\nPigmeu: Sheeeylla!!!!! Você a conhece? \r\n"
				+ "Toninho: Foi ela que me puxou pra cá!\r\n"
				+ "\n[MESTRE]: Os pigmeus largam o tronco onde o Toninho estava amarrado e ele bruscamente no chão.\r\n"
				+ "\nToninho: Ai! Caceta.\r\n"
				+ "\n[MESTRE]: OS pigmeus correm de volta ao bosque e deixam o Toninho, mas um volta e corta as cordas que o amarravam e corre novamente para o bosque.\r\n"
				+ "[MESTRE]: Toninho se solta e se levanta e vai em direção ao portão do labirinto em ruinas e nele se encontra um aviso.\r\n", TimeUnit.MILLISECONDS, temp_dialog);
		
		// DESAFIO 1
		desafioC2I();
		
		Digita("\n[MESTRE]: O portão se abre e Toninho adentra no labirinto em busca (pedaço do pergaminho?).\r\n"
				+ "\n[MESTRE]: No primeiro cruzamento Toninho encontra ourto desafio\r\n", TimeUnit.MILLISECONDS, temp_dialog);
		
		//DESAFIO 2
		desafioC2II();
		
		Digita("\n[MESTRE]: Toninho avança seguindo o rastro e encontra o final do labirinto\r\n", TimeUnit.MILLISECONDS, temp_dialog);
		
		//DESAFIO 3
		desafioC2III();
		
		Digita("[MESTRE]:Toninho entra na porta final e ve aquela criatura se alimentando de um pigmeu\n"
				+ "\nToninho: kkk eae man! \n" + "\n[MESTRE]: O minotauro volta seu olhar para o Toninho e berra\n"
				+ "Minotauro: hahahaha! Opa parece que chegou a sobremesa\n" + "Toninho: Mas o que é isso!\n"
				+ "\n[MESTRE]: Minotauro avança em direção ao toninho com seu machado! "
				+ "\n .::::::::::::: A BATALHA COMEÇA ::::::::::::.\\n",TimeUnit.MILLISECONDS, temp_dialog);
		
		//BATALHA CONTRA O MINOTAURO
		batalha();
		
	}

	static void capitulo_3() {

	}

	static void instrucoes() throws Exception {
		Digita("", TimeUnit.MILLISECONDS, temp_dialog);
	}

	// CRÉDITOS FINAIS
	static void creditos() throws Exception {

		Digita(".::: CRÉDITOS :::.\n> Alex Gama\n> Bruno Souza\n> Rafael Pereira Elias\n> Ruy Menezes \n",
				TimeUnit.MILLISECONDS, temp_dialog);
		menu();
	}

	// MÉTODO PARA DELAY NAS MENSAGENS
	public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {

		for (char caractere : mensagem.toCharArray()) {
			System.out.print(caractere);
			unit.sleep(tempo_mensagem);
		}
	}
	public static void desafioC2I() throws InterruptedException {


		boolean acertou = false;
		int contador = 0;
		String alternativa;
		ArrayList<String> r = new ArrayList<String>();
		r.add("Literal -  x / a^2 b^2 / x^2 x \n" + "Coficiente - 3 / 1 1 / 1 3 7\n"); // resposta correta
		r.add("Literal -  3 / y^2 a^2 / 2^6 t \n" + "Coficiente - x / 2 0 / a b c\n");
		r.add("Literal -  3 / 1 1 / 1 3 7 \n" + "Coficiente - x / a^2 b^2 / x^2 x\n");
		r.add("Literal -  3x / 2a^2 1^2 / 0^2 1 \n" + "Coficiente - 3 / 0 0 / x c 7\n");
		r.add("Literal -  0 / a b / x x \n" + "Coficiente - 2 / 1 1 / 1 3\n");

		do {

			Digita(
					"\nOs polinômios são expressões algébricas formadas por números (coeficientes) e letras (partes literais).\r\n "
							+ "Sabendo disso determine quais são as parte literais e os coefiencias das expressôes:\r\n"
							+ "3x / a^2 - b^2 / x^2 + 3x + 7 \n",TimeUnit.MILLISECONDS, temp_dialog);
			System.out.println("a) " + r.get(0));
			System.out.println("b) " + r.get(1));
			System.out.println("c) " + r.get(2));
			System.out.println("d) " + r.get(3));
			System.out.println("e) " + r.get(4));
			System.out.print("\nEscolha uma alternativa: ");
			alternativa = entrada.next();

			switch (alternativa) {

			case "a":
			case "A":
				if (r.get(0) == "Literal -  x / a^2 b^2 / x^2 x \n" + "Coficiente - 3 / 1 1 / 1 3 7\n") {
					System.out.println("Resposta correta!\n");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
				}
				break;
			case "b":
			case "B":
				if (r.get(1) == "Literal -  x / a^2 b^2 / x^2 x \n" + "Coficiente - 3 / 1 1 / 1 3 7\n") {
					System.out.println("Resposta correta!\n");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
				}
				break;
			case "c":
			case "C":
				if (r.get(2) == "Literal -  x / a^2 b^2 / x^2 x \n" + "Coficiente - 3 / 1 1 / 1 3 7\n") {
					System.out.println("Resposta correta!\n");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
				}
				break;
			case "d":
			case "D":
				if (r.get(3) == "Literal -  x / a^2 b^2 / x^2 x \n" + "Coficiente - 3 / 1 1 / 1 3 7\n") {
					System.out.println("Resposta correta!\n");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
				}
				break;
			case "e":
			case "E":
				if (r.get(4) == "Literal -  x / a^2 b^2 / x^2 x \n" + "Coficiente - 3 / 1 1 / 1 3 7\n") {
					System.out.println("Resposta correta!\n");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
				}
				break;

			default:
				System.out.println("Escolha invalida!\n");
				Collections.shuffle(r);
			}

		} while (!acertou);
			Itaipava++;
		
	}
	
	public static void desafioC2II() throws InterruptedException {

		Scanner entrada = new Scanner(System.in);
		boolean acertou = false;
		int contador = 0;
		String alternativa;
		ArrayList<String> r = new ArrayList<String>();
		r.add("Binômio / Trinômio / Monômio"); // resposta correta
		r.add("Binômio / Binômio / Monômio");
		r.add("Trinômio / Monômio / Binômio");
		r.add("Monômio / Trinômio / Binômio");
		r.add("Monômio / Monômio / Monômio");

		do {

			Digita("Os polinômios são formados por termos.\n"
					+ "A única operação entre os elementos de um termo é a multiplicação"
					+ "chegando em até 3 termos sendo  monomio(1 termo), binomio(2 termos) e trinomo(3 termos).\n"
					+ "Sabendo disso termine qual é o polinomio das expressões:\n" + "3x+y / 3ab-4xy-10y / 5abc\n",TimeUnit.MILLISECONDS, temp_dialog);
			System.out.println("a) " + r.get(0));
			System.out.println("b) " + r.get(1));
			System.out.println("c) " + r.get(2));
			System.out.println("d) " + r.get(3));
			System.out.println("e) " + r.get(4));
			System.out.print("\nEscolha uma alternativa: ");
			alternativa = entrada.next();

			switch (alternativa) {

			case "a":
			case "A":
				if (r.get(0) == "Binômio / Trinômio / Monômio") {
					System.out.println("Resposta correta!\n");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
				}
				break;
			case "b":
			case "B":
				if (r.get(1) == "Binômio / Trinômio / Monômio") {
					System.out.println("Resposta correta!\n");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
				}
				break;
			case "c":
			case "C":
				if (r.get(2) == "Binômio / Trinômio / Monômio") {
					System.out.println("Resposta correta!\n");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
				}
				break;
			case "d":
			case "D":
				if (r.get(3) == "Binômio / Trinômio / Monômio") {
					System.out.println("Resposta correta!\n");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
				}
				break;
			case "e":
			case "E":
				if (r.get(4) == "Binômio / Trinômio / Monômio") {
					System.out.println("Resposta correta!\n");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
				}
				break;

			default:
				System.out.println("Escolha invalida!");
				Collections.shuffle(r);
			}

		} while (!acertou);
		Itaipava++;
	}

	public static void desafioC2III() throws InterruptedException {


		boolean acertou = false;
		int contador = 0;
		String alternativa;
		ArrayList<String> r = new ArrayList<String>();
		r.add("3x^3+5x^2-5x+3"); // resposta correta
		r.add("5x^3-3x^2-6x-1");
		r.add("2x^3-2x^2+4x+18");
		r.add("x^3-3x^2+5x-7");
		r.add("10x^3+2x^2+3x+1");

		do {

			Digita("Some os polinômios:\n" + "a(x)=2x^3+2x^2-3x+1\n" + "b(x)=x^3+3x^2-2x+2\n",TimeUnit.MILLISECONDS, temp_dialog);
			System.out.println("a) " + r.get(0));
			System.out.println("b) " + r.get(1));
			System.out.println("c) " + r.get(2));
			System.out.println("d) " + r.get(3));
			System.out.println("e) " + r.get(4));
			System.out.print("\nEscolha uma alternativa: ");
			alternativa = entrada.next();

			switch (alternativa) {

			case "a":
			case "A":
				if (r.get(0) == "3x^3+5x^2-5x+3") {
					System.out.println("Resposta correta!\n");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
				}
				break;
			case "b":
			case "B":
				if (r.get(1) == "3x^3+5x^2-5x+3") {
					System.out.println("Resposta correta!\n");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
				}
				break;
			case "c":
			case "C":
				if (r.get(2) == "3x^3+5x^2-5x+3") {
					System.out.println("Resposta correta!\n");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
				}
				break;
			case "d":
			case "D":
				if (r.get(3) == "3x^3+5x^2-5x+3") {
					System.out.println("Resposta correta!\n");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
				}
				break;
			case "e":
			case "E":
				if (r.get(4) == "3x^3+5x^2-5x+3") {
					System.out.println("Resposta correta!\n");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
				}
				break;

			default:
				System.out.println("\nEscolha invalida!");
				Collections.shuffle(r);
			}

		} while (!acertou && contador < 3);
		Itaipava++;
	}
	
	public static void batalha() throws InterruptedException {
		boolean morreu = false;
		int hpI = 100;
		String escolha;
		
		int d6 = new Random().nextInt(6) + 1;
		do {
			if(hpI <= 0) {
				morreu = true;
				break;
			}else if (HP <= 0) {
				morreu = true;
				break;
			}
			int d20 = new Random().nextInt(20) + 1;
			int n=d20;
			System.out.println("\nO que deseja fazer:\n"
					+ "[1] - Atacar.\n"
					+ "[2] - Beber Itaipiva\n");
			escolha = entrada.next();

			switch(escolha) {
			case "1":
				Digita("\nJogando os dados...\n"
						+ "O numero do dado: "+n,TimeUnit.MILLISECONDS, temp_dialog);
				if(n > 15 && n <= 25) {
					hpI = hpI - 20;
					Digita("\nToninho causou 20 de dano no inimigo\n"
							+ "\nHP do Toninho = " +HP
							+ "\nHP do Inimigo = "+hpI,TimeUnit.MILLISECONDS, temp_dialog);
									
				}else if(n > 10 && n <= 15) {
					hpI = hpI - 10;
					Digita("\nToninho causou 10 de dano no inimigo\n"
							+ "\nHP do Toninho = " +HP
							+ "\nHP do Inimigo = "+hpI,TimeUnit.MILLISECONDS, temp_dialog);
						
				}else if(n > 5 && n <= 10) {
					HP = HP - 5;
					Digita("\nToninho errou o ataque causou 0 de dano no inimigo e tomou 5 de dano\n"
							+ "\nHP do Toninho = " +HP
							+ "\nHP do Inimigo = "+hpI,TimeUnit.MILLISECONDS, temp_dialog);
					
				}else if(n >= 0 && n <= 5) {
					HP = HP - 10;
					Digita("\nToninho errou o ataque causou 0 de dano no inimigo e tomou 10 de dano\n"
							+ "\nHP do Toninho = " +HP
							+ "\nHP do Inimigo = "+hpI,TimeUnit.MILLISECONDS, temp_dialog);
						
				}
				
				break;
			case "2":
				if (Itaipava > 0) {
					Itaipava --;
					n = n +5;
					Digita("\nJogando os dados...\n"
							+ "O numero do dado: "+n,TimeUnit.MILLISECONDS, temp_dialog);
					if(n > 15 && n <= 25) {
						hpI = hpI - 20;
						Digita("\nToninho causou 20 de dano no inimigo\n"
								+ "\nHP do Toninho = " +HP
								+ "\nHP do Inimigo = "+hpI,TimeUnit.MILLISECONDS, temp_dialog);
						break;	
					}else if(n > 10 && n <= 15) {
						hpI = hpI - 10;
						Digita("\nToninho causou 10 de dano no inimigo\n"
								+ "\nHP do Toninho = " +HP
								+ "\nHP do Inimigo = "+hpI,TimeUnit.MILLISECONDS, temp_dialog);
						break;	
					}else if(n > 5 && n <= 10) {
						HP = HP - 5;
						Digita("\nToninho errou o ataque causou 0 de dano no inimigo e tomou 5 de dano\n"
								+ "\nHP do Toninho = " +HP
								+ "\nHP do Inimigo = "+hpI,TimeUnit.MILLISECONDS, temp_dialog);
						break;	
					}else if(n >= 0 && n <= 5) {
						HP = HP - 10;
						Digita("\nToninho errou o ataque causou 0 de dano no inimigo e tomou 10 de dano\n"
								+ "\nHP do Toninho = " +HP
								+ "\nHP do Inimigo = "+hpI,TimeUnit.MILLISECONDS, temp_dialog);
						break;	
					}
				} else {
					System.out.println("Toninho não possui itaipaiva");
					break;
				}
				
				break;

			default:
				System.out.println("\nOpção invalida!");
			}
			
			
		}while(morreu == false);
		
		System.out.println("\nProximo estagio");
		if(hpI <= 0) {
			Digita("\nVoce matou o boss",TimeUnit.MILLISECONDS, temp_dialog);
		}else if (HP <= 0) {
			Digita("Você morreu!\n"
					+ "GAME OVER!!!",TimeUnit.MILLISECONDS, temp_dialog);
			System.exit(0);;
		}
	}
	
	public static void batalhaMino() throws InterruptedException {
		int hpMino = 100;
		String escolha="", decisao ="", decisao1="";
		
		// int d20 = rand.nextInt(21); // DADO DE 20 FACES - GLOBAL
		// int d6 = rand.nextInt(7); // DADO DE 6 FACES - GLOBAL


		do {

			System.out.println("Escolha:\n" + "[1 - jogar os dados]\n" + "[2 - Usar itaipava]\n");
		escolha = entrada.next();
			int n;
			switch (escolha) {
			case "1":
				n = d20;
				System.out.println("\nO numero do dado: "+n);
				if (n >= 15 && n <= 20) {
					Digita(
							"[MESTRE]: Toninho esquiva do ataque do minotauro passando por de baixo de suas pernas e acerta um golpe certeiro na bunda do minotauro o fazendo cair\n"
									+ "[MESTRE]: Toninho aproveita a oportunidade e decepa a cabeça da criatura\n ",TimeUnit.MILLISECONDS, temp_dialog);
					break;
				} else if (n >= 10 && n < 15) {
					hpMino = hpMino - 50;
					Digita(
							"[MESTRE]: Toninho esquiva do ataque do minotauro passando por de baixo de suas pernas e acerta um golpe certeiro na bunda do minotauro o fazendo cair\n"
									+ "\n HP Minotauro - 50 = " + hpMino
									+ "\n[MESTRE]: Toninho vai finalizar a criatura, mas escorrega e da tempo do minotauro se levantar\n",TimeUnit.MILLISECONDS, temp_dialog);

					

					do {
						Digita("Escolha:\n" + "[1 - jogar os dados]\n" + "[2 - Usar itaipava]\n",TimeUnit.MILLISECONDS, temp_dialog);
						decisao = entrada.next();
						switch (decisao) {
						case "1":
							n = d20;
							Digita("\nO numero do dado: "+n,TimeUnit.MILLISECONDS, temp_dialog);
							if (n >= 10 && n <= 20) {
								Digita(
										"[MESTRE]: Minotauro enfurecido pega seu machado em tenta acertar o Toninho, mas o mesmo consegue esquivar e decepa a cabeça da criatura",TimeUnit.MILLISECONDS, temp_dialog);
								break;
							} else if (n >= 0 && n < 10) {
								HP = HP - 20;
								Digita("[MESTRE]: O minotauro erra machadada, mas o impacto joga toninho a parede\n"
										+ "\n HP Toninho - 20 = \" + hpMino" + HP,TimeUnit.MILLISECONDS, temp_dialog);
								

								Digita("Escolha:\n" + "[1 - jogar os dados]\n" + "[2 - Usar itaipava]\n",TimeUnit.MILLISECONDS, temp_dialog);
								decisao1 = entrada.next();

								do {
									switch (decisao1) {
									case "1":
										n = d20;
										Digita("\nO numero do dado: "+n,TimeUnit.MILLISECONDS, temp_dialog);
										if (n >= 5 && n <= 20) {
											Digita("[MESTRE]: O minotauro avança novamente em direção a Toninho, mas se levanta rapidamente e se esquiva no tempo exato, fazendo o minotauro acertar a parede, ficando atordoado\n"
													+ "[MESTRE]: Aproveitando a situação Toninho e acerta a cabeça do minotauro, dacapitando-a\n",TimeUnit.MILLISECONDS, temp_dialog);
											break;
										} else if (n < 5) {
											Digita("Toninho morre ou perde e a sheylla o ajuda!",TimeUnit.MILLISECONDS, temp_dialog);
											System.exit(0);
											break;
										}
									case "2":
										if (Itaipava > 0) {
											Itaipava --;
											n = d20 + 3;
											Digita("\nO numero do dado: "+n,TimeUnit.MILLISECONDS, temp_dialog);
											if (n >= 5 && n <= 20) {
												Digita("[MESTRE]: O minotauro avança novamente em direção a Toninho, mas se levanta rapidamente e se esquiva no tempo exato, fazendo o minotauro acertar a parede, ficando atordoado\n"
														+ "[MESTRE]: Aproveitando a situação Toninho e acerta a cabeça do minotauro, dacapitando-a\n",TimeUnit.MILLISECONDS, temp_dialog);
												break;
											} else if (n < 5) {
												Digita("Toninho morre ou perde e a sheylla o ajuda!\n"
														+ "GAME OVER!!!!",TimeUnit.MILLISECONDS, temp_dialog);
												System.exit(0);
												break;
											}
										} else {
											Digita("Toninho não possui itaipaiva",TimeUnit.MILLISECONDS, temp_dialog);
											decisao1 = "a";
											break;
										}
									default:
										System.out.println("\nOpção invalida!");
										
									}

								} while (!decisao1.equals("1") && !decisao1.equals("2"));

								break;
							}
							break;
						case "2":
							if (Itaipava > 0) {
								Itaipava --;
								n = d20 + 3;
								Digita("\nO numero do dado: "+n,TimeUnit.MILLISECONDS, temp_dialog);
								if (n >= 5 && n <= 20) {
									Digita(
											"[MESTRE]: Toninho esquiva do ataque do minotauro passando por de baixo de suas pernas e acerta um golpe certeiro na bunda do minotauro o fazendo cair\n"
													+ "[MESTRE]: Toninho aproveita a oportunidade e decepa a cabeça da criatura\n ",TimeUnit.MILLISECONDS, temp_dialog);
									break;
								} else if (n < 5) {
									Digita("Toninho morre ou perde e a sheylla o ajuda!",TimeUnit.MILLISECONDS, temp_dialog);
									System.exit(0);
									break;
								}
							} else {
								Digita("Toninho não possui itaipaiva",TimeUnit.MILLISECONDS, temp_dialog);
								decisao = "a";
								break;
							}

						default:
							System.out.println("\nOpção invalida!");
							
						}

					} while (!decisao.equals("1") && !decisao.equals("2"));
					break;
				}else if (n >= 0 && n < 10) {
					Digita("[MESTRE]: colocar algo do toninho tomando dano",TimeUnit.MILLISECONDS, temp_dialog);
					HP = HP - 20;

					

					do {
						Digita("Escolha:\n" + "[1 - jogar os dados]\n" + "[2 - Usar itaipava]\n",TimeUnit.MILLISECONDS, temp_dialog);
						decisao1 = entrada.next();
						switch (decisao1) {
						case "1":
							n = d20;
							Digita("\nO numero do dado: "+n,TimeUnit.MILLISECONDS, temp_dialog);
							if (n >= 5 && n <= 20) {
								Digita(" fazer algo que o toninho ganhe",TimeUnit.MILLISECONDS, temp_dialog);
								break;
							} else if (n < 5) {
								Digita("Toninho morre ou perde e a sheylla o ajuda!",TimeUnit.MILLISECONDS, temp_dialog);
								System.exit(0);
								break;
							}
						case "2":
							if (Itaipava > 0) {
								Itaipava --;
								n = d20 + 3;
								Digita("\nO numero do dado: "+n,TimeUnit.MILLISECONDS, temp_dialog);
								if (n >= 5 && n <= 20) {
									Digita(" fazer algo que o toninho ganhe",TimeUnit.MILLISECONDS, temp_dialog);
									break;
								} else if (n < 5) {
									Digita("Toninho morre ou perde e a sheylla o ajuda!",TimeUnit.MILLISECONDS, temp_dialog);
									System.exit(0);
									break;
								}
							} else {
								Digita("Toninho não possui itaipaiva",TimeUnit.MILLISECONDS, temp_dialog);
								decisao1 = "a";
								break;
							}
						default:
							System.out.println("\nOpção invalida!");
							
						}

					} while (!decisao1.equals("1") && !decisao1.equals("2"));
				}
				break;
			case "2":
				if (Itaipava > 0) {
					Itaipava --;
					n = d20 + 3;
					Digita("\nO numero do dado: "+n,TimeUnit.MILLISECONDS, temp_dialog);
					if (n >= 5 && n <= 30) {
						Digita(" fazer algo que o toninho ganhe",TimeUnit.MILLISECONDS, temp_dialog);
						break;
					} else if (n < 5) {
						Digita("Toninho morre ou perde e a sheylla o ajuda!",TimeUnit.MILLISECONDS, temp_dialog);
						System.exit(0);
						break;
					}
				} else {
					Digita("Toninho não possui itaipaiva sdadsaddads",TimeUnit.MILLISECONDS, temp_dialog);
					
					escolha = "a";
					break;
				}
			default:
				System.out.println("\nOpção invalida!");
				
			}
			
		} while (!escolha.equals("1") && !escolha.equals("2"));
		System.out.println("\nToninho foi para o proximo desafio");
	}
	
	
}

