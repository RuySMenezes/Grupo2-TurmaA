package RPG;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Intro {
	static double HP = 100;
	static Scanner entrada = new Scanner(System.in); // SCANNER DE ESCOPO GLOBAL, NÃO É NECESSÁRIO INSTANCIAR NENHUM
														// OUTRO.
	static Random rand = new Random(21);
	static int D20 = rand.nextInt(21); // DADO DE 20 FACES - GLOBAL
	static int D6 = rand.nextInt(7); // DADO DE 6 FACES - GLOBAL

	// TEMPO DE DELAY DAS MENSAGENS: MODIFIQUE PARA ZERO PARA JOGAR SEM DELAY. PADRÃO 70,150,25
	static int temp_dialog = 0, temp_narrativa = 00, temp_transicao = 0;

	public static void main(String[] args) throws Exception {

		Digita("\nABANDONAI TODA A ESPERANÇA, Ó VÓS QUE ENTRAIS...\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(".::: THE ARCHITECT - A BRAZILIAN CHRONIQUE :::.\n", TimeUnit.MILLISECONDS, temp_dialog);
		menu();
	}

	static void menu() throws Exception { // metodo para puxar as escolhas do menu
		String escolha_menu;
		System.out.println("\n1 - Jogar\n2 - Instruções\n3 - Créditos\n4 - Sair");
		escolha_menu = entrada.next();
		// EM FORMA DE STRING PARA CASO SEJA DIGITADO UM TIPO DIFERENTE DE INT.

		do {
			switch (escolha_menu) {
			case "1":
				jogo();
				break;
			case "2":
				instrucoes();
				break;
			case "3":
				creditos();
				break;
			case "4":
				System.exit(0);
			default:
				System.out.println("ERROOOOOOU! Tente novamente, meu caro.");
				System.out.println("1 - Jogar\n2 - Instruções\n3 - Créditos\n4 - Sair");
				escolha_menu = entrada.next();
			}
		} while (!escolha_menu.equals("1") && !escolha_menu.equals("2") && !escolha_menu.equals("3")
				&& !escolha_menu.equals("4"));

	}

	static void jogo() throws Exception { // metodo de inicio do jogo
		escolha_capitulo();
		//intro();
		//capitulo_1();
		//capitulo_2();
		//capitulo_3();

	}

	static void escolha_capitulo() throws Exception {
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
				escolha_capitulo();
			}

		} while (!escolha_cap.contentEquals("0") && !escolha_cap.contentEquals("1") && !escolha_cap.contentEquals("2")
				&& !escolha_cap.contentEquals("3"));
	}

	static void instrucoes() { // instrução do jogo

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
				+ "Toninho[1]: Pois bem, que seja. \r\n" 
				+ "Toninho[2]: Sem tempo, irmão.\r\n", TimeUnit.MILLISECONDS,
				temp_dialog);
		escolha = entrada.next();

		do {
			switch (escolha) {
			case "1":
				Digita("\nSheylla: Ótimo. Venha, vou guia-lo por essa realidade.\r\n"
						+ "Sheylla: Não é seguro que caminhe só.\r\n" 
						+ "Sheylla: Há armadilhas por todo o percurso.\r\n",
						TimeUnit.MILLISECONDS, temp_dialog);
				break;
			case "2":
				Digita("\nSheylla: Você não está na posição de decidir coisa alguma, Antônio.\r\n", TimeUnit.MILLISECONDS,
						temp_dialog);
				break;
			default:
				System.out.println("\nOpção inválida!");
				Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
						+ "Toninho[1]: Pois bem, que seja. \r\n"
						+ "Toninho[2]: Sem tempo, irmão.\r\n",
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

		Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
				+ "Toninho[1]: Criador?\r\n"
				+ "Toninho[2]: Criaturas? \r\n"
				+ "Toninho[3]: Segredos? \r\n", TimeUnit.MILLISECONDS, temp_dialog);
		escolha = entrada.next();

		do {
			switch (escolha) {
			case "1":
				Digita("Sheylla: Pouco se sabe sobre ele, mas os boatos são de que esta é a última obra de Dédalo antes de sua derrocada. \r\n", TimeUnit.MILLISECONDS, temp_dialog);
				
				Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
						+ "Toninho[1]: Criaturas?\r\n"
						+ "Toninho[2]: Segredos? \r\n", TimeUnit.MILLISECONDS, temp_dialog);
				escolha = entrada.next();
				
				do {
				switch(escolha) {
				case "1":
					Digita("Sheylla: existem 3 grandes criaturas que guardam o segredo dessa masmorra\r\n"
							+ "Sheylla:A Esfinge é um monstro alado com corpo de muher e leão que afligia a cidade de Tebas, e quem erra seus enigmas é devorado!\r\n"
							+ "Sheylla:O Minotauro, um monstro com cabeça e cauda de touro e corpo de homem, possue um grande machado e uma força fisica descomunal\r\n"
							+ "Sheylla:E a ultima e mais perigosa, Medusa uma criatura do sexo feminino, uma das três Górgonas, com cabelos de serpente e quem quer que olhe diretamente para ela, vira pedra em instantes\r\n", TimeUnit.MILLISECONDS, temp_dialog);
					
					Digita("\n[MESTRE]: Segredos", TimeUnit.MILLISECONDS, temp_dialog);
					
					Digita("Sheylla: Há boatos de que antes de abandonar Diademmor, o criador escondeu algo de extremo valor (depois pensamos nisso)\r\n", TimeUnit.MILLISECONDS, temp_dialog);
					break;
				case "2":
					Digita("Sheylla: Há boatos de que antes de abandonar Diademmor, o criador escondeu algo de extremo valor (depois pensamos nisso)\r\n", TimeUnit.MILLISECONDS, temp_dialog);
					
					Digita("\n[MESTRE]: Criaturas", TimeUnit.MILLISECONDS, temp_dialog);
					
					Digita("Sheylla: existem 3 grandes criaturas que guardam o segredo dessa masmorra\r\n"
							+ "Sheylla:A Esfinge é um monstro alado com corpo de muher e leão que afligia a cidade de Tebas, e quem erra seus enigmas é devorado!\r\n"
							+ "Sheylla:O Minotauro, um monstro com cabeça e cauda de touro e corpo de homem, possue um grande machado e uma força fisica descomunal\r\n"
							+ "Sheylla:E a ultima e mais perigosa, Medusa uma criatura do sexo feminino, uma das três Górgonas, com cabelos de serpente e quem quer que olhe diretamente para ela, vira pedra em instantes\r\n", TimeUnit.MILLISECONDS, temp_dialog);
					break;
					default:
						System.out.println("Opção Invalida");
						Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
								+ "Toninho[1]: Criaturas?\r\n"
								+ "Toninho[2]: Segredos? \r\n", TimeUnit.MILLISECONDS, temp_dialog);
						escolha = entrada.next();
				}
				}while(!escolha.equals("1") && !escolha.equals("2"));
				break;
			case "2":
				Digita("Sheylla: existem 3 grandes criaturas que guardam o segredo dessa masmorra\r\n"
						+ "Sheylla:A Esfinge é um monstro alado com corpo de muher e leão que afligia a cidade de Tebas, e quem erra seus enigmas é devorado!\r\n"
						+ "Sheylla:O Minotauro, um monstro com cabeça e cauda de touro e corpo de homem, possue um grande machado e uma força fisica descomunal\r\n"
						+ "Sheylla:E a ultima e mais perigosa, Medusa uma criatura do sexo feminino, uma das três Górgonas, com cabelos de serpente e quem quer que olhe diretamente para ela, vira pedra em instantes\r\n", TimeUnit.MILLISECONDS, temp_dialog);
				
				Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
						+ "Toninho[1]: Criador?\r\n"
						+ "Toninho[2]: Segredos? \r\n", TimeUnit.MILLISECONDS, temp_dialog);
				escolha = entrada.next();
				do {
				switch(escolha) {
				case "1":
					Digita("Sheylla: Pouco se sabe sobre ele, mas os boatos são de que esta é a última obra de Dédalo antes de sua derrocada. \r\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("\n[MESTRE]: Segredos", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Sheylla: Há boatos de que antes de abandonar Diademmor, o criador escondeu algo de extremo valor (depois pensamos nisso)\r\n", TimeUnit.MILLISECONDS, temp_dialog);
					break;
				case "2":
					Digita("Sheylla: Há boatos de que antes de abandonar Diademmor, o criador escondeu algo de extremo valor (depois pensamos nisso)\r\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("\n[MESTRE]: Criador", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Sheylla: Pouco se sabe sobre ele, mas os boatos são de que esta é a última obra de Dédalo antes de sua derrocada. \r\n", TimeUnit.MILLISECONDS, temp_dialog);
					break;
					default:
						System.out.println("Opção Invalida");
						Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
								+ "Toninho[1]: Criador?\r\n"
								+ "Toninho[2]: Segredos? \r\n", TimeUnit.MILLISECONDS, temp_dialog);
						escolha = entrada.next();
				}
				}while(!escolha.equals("1") && !escolha.equals("2"));
				break;
			case "3":
				Digita("Sheylla: Há boatos de que antes de abandonar Diademmor, o criador escondeu algo de extremo valor (depois pensamos nisso)\r\n",TimeUnit.MILLISECONDS, temp_dialog);
				
				Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
						+ "Toninho[1]: Criador?\r\n"
						+ "Toninho[2]: Criaturas? \r\n", TimeUnit.MILLISECONDS, temp_dialog);
				escolha = entrada.next();
				do {
				switch(escolha) {
				case "1":
					Digita("Sheylla: Pouco se sabe sobre ele, mas os boatos são de que esta é a última obra de Dédalo antes de sua derrocada. \r\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("\n[MESTRE]: Criatura", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Sheylla: existem 3 grandes criaturas que guardam o segredo dessa masmorra\r\n"
							+ "Sheylla:A Esfinge é um monstro alado com corpo de muher e leão que afligia a cidade de Tebas, e quem erra seus enigmas é devorado!\r\n"
							+ "Sheylla:O Minotauro, um monstro com cabeça e cauda de touro e corpo de homem, possue um grande machado e uma força fisica descomunal\r\n"
							+ "Sheylla:E a ultima e mais perigosa, Medusa uma criatura do sexo feminino, uma das três Górgonas, com cabelos de serpente e quem quer que olhe diretamente para ela, vira pedra em instantes\r\n", TimeUnit.MILLISECONDS, temp_dialog);
						break;
				case "2":
					Digita("Sheylla: existem 3 grandes criaturas que guardam o segredo dessa masmorra\r\n"
							+ "Sheylla:A Esfinge é um monstro alado com corpo de muher e leão que afligia a cidade de Tebas, e quem erra seus enigmas é devorado!\r\n"
							+ "Sheylla:O Minotauro, um monstro com cabeça e cauda de touro e corpo de homem, possue um grande machado e uma força fisica descomunal\r\n"
							+ "Sheylla:E a ultima e mais perigosa, Medusa uma criatura do sexo feminino, uma das três Górgonas, com cabelos de serpente e quem quer que olhe diretamente para ela, vira pedra em instantes\r\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("\n[MESTRE]: Criador", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Sheylla: Pouco se sabe sobre ele, mas os boatos são de que esta é a última obra de Dédalo antes de sua derrocada. \r\n", TimeUnit.MILLISECONDS, temp_dialog);
					break;
						default:
							System.out.println("Opção Invalida");
							Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
									+ "Toninho[1]: Criador?\r\n"
									+ "Toninho[2]: Criaturas? \r\n", TimeUnit.MILLISECONDS, temp_dialog);
							escolha = entrada.next();
				}
				}while(!escolha.equals("1") && !escolha.equals("2"));
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

		// criação do metodo/função Desafio 1

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
				System.out.println("Resultado: " + D20);

				if (D20 >= 1 && D20 <= 10) {
					Digita("", TimeUnit.MILLISECONDS, temp_dialog);
					// Toninho erra a tijolada, é atacado por Esfinge e perde 20 pontos de vida.
					// Sheylla intervém.
					HP = HP - 20;
				} else if (D20 > 10 && D20 <= 15) {
					Digita("", TimeUnit.MILLISECONDS, temp_dialog);
					// A tijolada é suficiente para nocautear a Esfinge temporariamente.
				} else if (D20 > 15) {
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
						+ "[MESTRE]: Toninho e Sheylla entram no Del Rey em rumo à sua próxima aventura\r\n",
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

	}

	static void capitulo_2() {

	}

	static void capitulo_3() {

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
}
