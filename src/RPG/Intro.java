package RPG;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;

public class Intro {
	static int HP = 100;
	static int Itaipira = 0;
	static Scanner entrada = new Scanner(System.in); // SCANNER DE ESCOPO GLOBAL
	static int d20 = new Random().nextInt(20) + 1; // Dado de 20 lados

	// TEMPO DE DELAY DAS MENSAGENS: MODIFIQUE PARA ZERO PARA JOGAR SEM DELAY.
	// PADRÃO 70,150,25
	static int temp_dialog = 15, temp_narrativa = 15, temp_transicao = 5;

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

		Digita("\n0 - Introdução\n1 - Capítulo I - A ACEITAÇÃO\n2 - Capítulo II - A DESCOBERTA\n3 - Capítulo III - O CONFRONTO FINAL\n4 - Menu Principal\n",
				TimeUnit.MILLISECONDS, temp_dialog);
		escolha_cap = entrada.next();

		do {
			switch (escolha_cap) {
			case "0":
				intro();
			case "1":
				capitulo_1();
				capitulo_2();
				capitulo_3();
				break;
			case "2":
				capitulo_2();
				capitulo_3();
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
						+ "\n[3 horas e muitas itaipiras depois...]\n" + "\nCleytinho: Ô TONINHO, LEVANTA HOMEM!\n"
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
						+ "\n[3 horas e muitas Itaipiras depois...]\r\n"
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
								+ "Sheylla:E a ultima e mais perigosa, eu.\r\n",
								TimeUnit.MILLISECONDS, temp_dialog);

						Digita("\n[MESTRE]: Segredos", TimeUnit.MILLISECONDS, temp_dialog);

						Digita("Sheylla: Há boatos de que antes de abandonar Diademmor, o criador escondeu o arquétipo de sua última obra, motivo pelo qual você está aqui. \r\n",
								TimeUnit.MILLISECONDS, temp_dialog);
						break;
					case "2":
						Digita("Sheylla: Há boatos de que antes de abandonar Diademmor, o criador escondeu o arquétipo de sua obra final, motivo pelo qual você está aqui.\r\n",
								TimeUnit.MILLISECONDS, temp_dialog);

						Digita("\n[MESTRE]: Criaturas", TimeUnit.MILLISECONDS, temp_dialog);

						Digita("Sheylla: existem 3 grandes criaturas que guardam o segredo dessa masmorra\r\n"
								+ "Sheylla:A Esfinge é um monstro alado com corpo de muher e leão que afligia a cidade de Tebas, e quem erra seus enigmas é devorado!\r\n"
								+ "Sheylla:O Minotauro, um monstro com cabeça e cauda de touro e corpo de homem, possue um grande machado e uma força fisica descomunal\r\n"
								+ "Sheylla:E a ultima e mais perigosa, eu.\r\n",
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
						+ "Sheylla:E a ultima e mais perigosa, eu.\r\n",
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
						Digita("Sheylla: Há boatos de que antes de abandonar Diademmor, o criador escondeu o arquétipo de sua obra final, motivo pelo qual você está aqui.\r\n",
								TimeUnit.MILLISECONDS, temp_dialog);
						break;
					case "2":
						Digita("Sheylla: Há boatos de que antes de abandonar Diademmor, o criador escondeu o arquétipo de sua obra final, motivo pelo qual você está aqui.\r\n",
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
				Digita("Sheylla: Há boatos de que antes de abandonar Diademmor, o criador escondeu o arquétipo de sua obra final, motivo pelo qual você está aqui.\r\n",
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
								+ "Sheylla:E a ultima e mais perigosa, eu.\r\n",
								TimeUnit.MILLISECONDS, temp_dialog);
						break;
					case "2":
						Digita("Sheylla: existem 3 grandes criaturas que guardam o segredo dessa masmorra\r\n"
								+ "Sheylla:A Esfinge é um monstro alado com corpo de muher e leão que afligia a cidade de Tebas, e quem erra seus enigmas é devorado!\r\n"
								+ "Sheylla:O Minotauro, um monstro com cabeça e cauda de touro e corpo de homem, possue um grande machado e uma força fisica descomunal\r\n"
								+ "Sheylla:E a ultima e mais perigosa, eu.\r\n",
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

		// desafio 1
		desafioC1I();

		Digita("[MESTRE] Após o conserto, Toninho e Sheylla seguem viagem. \r\n"
				+ "Sheylla: Não foi tão ruim assim, foi, Antônio? \r\n" + "Toninho: Poderia ter sido pior.\r\n"
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
				+ "[2] Sair no soco com a Esfinge.\r\n", TimeUnit.MILLISECONDS,	temp_dialog);
		escolha = entrada.next();

		do {
			switch (escolha) {
			case "1":
				System.out.println(" - Resolva uma questão proposta pela Esfinge.");
				// desafio 2
				desafioC1II();
				break;
			case "2":
				Digita("[MESTRE]: Toninho, num instinto de sobrevivência tipicamente brasileiro resolveu enfrentar a Esfinge. Valeu-se de um tijolo que estava perto e num átimo de desespero, atirou-o contra a criatura.",
						TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n .::::::::::::: A BATALHA COMEÇA ::::::::::::.\n", TimeUnit.MILLISECONDS, temp_dialog);
				batalha();
				break;
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
		desafioC1III();

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
				+ "Toninho: Que nada, já construí casa muito “mais melhor” que isso.\r\n"
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
						+ "[1 - DESCANSAR] Nois é merecedor. + 10HP\r\n"
						+ "[2 – PROSSEGUIR] Confia que o pai tá monstro.\r\n", TimeUnit.MILLISECONDS, temp_dialog);
				escolha = entrada.next();
			}

		} while (!escolha.equals("1") && !escolha.equals("2"));

		Digita("Horas se passam, e ao momento que ambos chegam em seu próximo destino, a escuridão da noite já começa a pairar.\r\n"
				+ "Sheylla: Antônio, creio que esteja mais ou menos inteirado dos perigos que aqui habitam. De agora em diante você deverá "
				+ "prosseguir sozinho.\r\n" + "Toninho: A senhora não virá por quê?\r\n"
				+ "Sheylla: É que... é... hm... eu tenho coisas a fazer. Estou contando com sua bravura.\r\n"
				+ "[MESTRE]: Sheylla sai do carro e vai em direção ao porta-malas. Toninho ouve os passos e percebe que ela retorna com algo em mãos.\n"
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
				+ "Sheylla: Faça tua parte e eu providenciarei, está bom assim?\r\n" + "Toninho: Justo.\r\n"
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

		Digita("\n[MESTRE]: Toninho continua avançando em direção ao som misterioso com seu machado em mãos.\r\n"
				+ "\nToninho: Sou Toninho pedreiro matador de demônio. Aqui tem coragem!\r\n"
				+ "\n[MESTRE:] Toninho vê uma latinha de Itaipira duplo malte próximo a uma arvore e já vai em sua direção.\r\n"
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
				+ "\nPigmeu: Sheeeylla!!!!! Você a conhece? \r\n" + "Toninho: Foi ela que me puxou pra cá!\r\n"
				+ "\n[MESTRE]: Os pigmeus largam o tronco onde o Toninho estava amarrado e ele bruscamente cai no chão.\r\n"
				+ "\nToninho: Ai! Caceta.\r\n"
				+ "\n[MESTRE]: Os pigmeus correm de volta ao bosque e deixam o Toninho, mas um volta e corta as cordas que o amarravam e corre novamente para o bosque.\r\n"
				+ "[MESTRE]: Toninho se solta, sacode a poeira e vai em direção ao portão do labirinto em ruinas e nele se encontra um aviso.\r\n",
				TimeUnit.MILLISECONDS, temp_dialog);

		// DESAFIO 1
		desafioC2I();

		Digita("\n[MESTRE]: O portão se abre e Toninho adentra no labirinto em busca (pedaço do pergaminho?).\r\n"
				+ "\n[MESTRE]: No primeiro cruzamento Toninho encontra ourto desafio\r\n", TimeUnit.MILLISECONDS,
				temp_dialog);

		// DESAFIO 2
		desafioC2II();

		Digita("\n[MESTRE]: Toninho avança seguindo o rastro e encontra o final do labirinto\r\n",
				TimeUnit.MILLISECONDS, temp_dialog);

		// DESAFIO 3
		desafioC2III();

		Digita("[MESTRE]:Toninho entra na porta final e ve aquela criatura se alimentando de um pigmeu\n"
				+ "\nToninho: kkk eae man! \n" + "\n[MESTRE]: O minotauro volta seu olhar para o Toninho e berra\n"
				+ "Minotauro: hahahaha! Opa parece que chegou a sobremesa\n" + "Toninho: Mas o que é isso!\n"
				+ "\n[MESTRE]: Minotauro avança em direção ao toninho com seu machado! "
				+ "\n .::::::::::::: A BATALHA COMEÇA ::::::::::::.\n", TimeUnit.MILLISECONDS, temp_dialog);

		// BATALHA CONTRA O MINOTAURO
		batalha();

	}

	static void capitulo_3() throws Exception {

		String escolha;
		// Historia
		Digita("\n[MESTRE]: Após a intensa batalha contra o Minotauro, Toninho tenta achar a saída do labirinto. Visivelmente exausto pelos eventos que se sucederam, o pedreiro se apoia na parede para descansar.\r\n"
				+ "\nVoz misteriosa: Batalhaste bravamente até aqui. \r\n"
				+ "Toninho: AAAAAAAAAAA DIABO\r\n"
				+ "Voz misteriosa: Acalma-te. \r\n"
				+ "\n[MESTRE]: Em meio à neblina do labirinto, uma figura de dimensões diminutas se aproxima, pondo Toninho novamente em alerta. Os passos se aproximam cada vez mais.\r\n"
				+ "\n*** TAP TAP, TAP TAP, TAP TAP ***\r\n"
				+ "\nNelson: Estas enfim preparado. É chegada a hora de apresentar-me diante de ti, Toninho. \r\n"
				+ "Toninho: ANÃO! Vem tranquilo, você vai pagar pelo que sua trupe de pouca sombra fez comigo!\r\n"
				+ "Nelson: Não tenho afiliação alguma com os pigmeus que encontrara anteriormente, não se preocupe. \r\n"
				+ "Toninho: Ah é!? Então prove!\r\n"
				+ "Nelson: Como poderia fazê-lo? \r\n"
				+ "\n[MESTRE]: Toninho, claramente não esperando tal disposição, põe se a questionar e percebe que não consegue chegar a alguma resposta. \r\n"
				+ "\nToninho: Bom... é.., sei lá, não pensei tão longe assim. Deixa quieto. ÔÔÔ pouca sombra, o que tu quer de mim? \r\n"
				+ "Nelson: Estive observando-o desde a sua chegada, Antônio. Não me aproximei antes pois não era o momento adequado. Há coisas que você deve saber sobre aquela que se apresentou a vos como Sheylla, bem como sobre suas reais intenções. \r\n"
				+ "Toninho: O que tem sobre a dona Sheylla? \r\n"
				+ "Nelson: Ela não é exatamente quem diz ser, Toninho, tão pouco são nobres suas intenções. Ela pediu a vos para que fosse em busca de um pergaminho, estou certo? \r\n"
				+ "Toninho: Sim, senhor.\r\n"
				+ "Nelson: Pois bem. Ela mencionou o que pretende fazer assim que obtiver? \r\n"
				+ "Toninho: Pensando bem, ela disse que não era da minha conta. \r\n"
				+ "Nelson: Ao menos para mim, parece-me a resposta de alguém que tem objetivos escusos em seus atos. Do contrário, por que esconderia de ti suas reais intenções de construir a ponte?\r\n"
				+ "Toninho: Meu senhor, eu não sei nem o porquê de eu estar aqui ainda. Só quero terminar logo isso e voltar para a minha terra.\r\n"
				+ "Nelson: Tua realidade, tudo aquilo que tens como teu, corre perigo nas mãos de Sheylla. Acredite no que vos digo agora.\r\n"
				+ "Toninho: E se ‘por supositório’ eu acreditar em você, me dê um bom motivo.\r\n"
				+ "Nelson: Há uma razão para aquela cratera que separa Diademmor do resto. Do outro lado, há um portal que leva diretamente à sua realidade. E para que Sheylla atravesse com seu exército de criaturas, a ponte é necessária. \r\n"
				+ "Toninho: Porque a dona Sheylla faria isso? \r\n"
				+ "Nelson: Ela pretende invadir o mundo dos mortais e subjugar a raça humana a seus desatinos.  \r\n",
				TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
				+ "[1]: Acreditar em Nelson. \r\n" + "[2]: Ignorar Nelson.\r\n", TimeUnit.MILLISECONDS,
				temp_dialog);
		escolha = entrada.next();

		do {
			switch (escolha) {
			case "1":
				Digita("\nToninho: Por que você está me ajudando?\r\n"
						+ "Nelson: Não o faço por mera bondade. Como já deves ter percebido, Diademmor guarda criaturas que botam em risco a existência das demais. \r\n"
						+ "Nelson: Simplesmente há coisas que devem permanecer cativas.\r\n"
						+ "Toninho: Como a gente pode impedir essa mocreia? \r\n"
						+ "Nelson: Sheylla não é a única que detém pactos com outras criaturas, seja esta obtida por afinidade ou coerção. \r\n"
						+ "Nelson: Detenho a simpatia de algumas raças que estão dispostas a batalhar em ordem a manter as coisas como devem ser.\r\n"
						+ "Toninho: Vou confiar no senhor.\r\n"
						+ "\n[MESTRE]: Após uma longa conversa entre Nelson e nosso herói, ambos chegam em comum acordo.\r\n"
						+ "\nNelson: Haja com normalidade, não deixe que Sheylla perceba que tu estas a par das intenções dela. \r\n"
						+ "Nelson: Tudo estará preparado quando chegares à cratera novamente, e as criaturas sob meu comando agirão no momento pertinente, basta dar-lhes o sinal.\r\n",
						TimeUnit.MILLISECONDS, temp_dialog);
				break;
			case "2":
				Digita("\nNelson: Suponho que deverei agir sem tua ajuda. Mas lembra-te de caso mude de ideia, estaremos ao teu lado. \r\n",
						TimeUnit.MILLISECONDS, temp_dialog);
				break;
			default:
				System.out.println("\nOpção inválida!");
				Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
						+ "[1]: Acreditar em Nelson. \r\n" + "[2]: Ignorar Nelson.\r\n", TimeUnit.MILLISECONDS,
						temp_dialog);
				escolha = entrada.next();
			}

		} while (!escolha.equals("1") && !escolha.equals("2"));
		
		Digita("\nNelson: Pois bem, creio que tenha feito sua escolha. Siga-me, vou guiá-lo para fora deste labirinto ao menos.\r\n"
				+ "[MESTRE]: Após uma breve caminhada conduzida por Nelson, um dos únicos capazes de achar a saída do labirinto, Toninho chega a um portão de ferro. \r\n"
				+ "Toninho: Obrigado, senhor Nelson. \r\n"
				+ "Toninho: Senhor Nelson? Cadê você? \r\n"
				+ "Toninho: Eita lasqueira, sumiu...... até parece aquele mestre dos magos da caverna do dragão hehehe bons tempos.\r\n", TimeUnit.MILLISECONDS,
						temp_dialog);
		
		// Desafio 1
		desafioC3I();

		Digita("\n[MESTRE]: Após sair do labirinto, Toninho encaminha-se para o mesmo ponto onde fora deixado por Sheylla, esperando-a. \r\n"
				+ "\n*** BIIIP BIIIIIIIIP ***\r\n"
				+ "\n[MESTRE]: Ao longe, Toninho ouve sons de buzina que se assemelham a de um Del Rey. \r\n"
				+ "\nSheylla: AEHOOOOOOO! Já faz um tempo, Antônio. \r\n"
				+ "Toninho: Dona Sheylla! Nem te conto, passei vários perrengues. \r\n"
				+ "Sheylla: Faz parte do processo. Conseguiu aquilo que precisávamos? \r\n"
				+ "Toninho: Sim, senhora. Tive de matar um boi para conseguir essa porcaria, mas sim.\r\n"
				+ "Sheylla: Sabia que não iria me decepcionar. Venha, vamos embora. Temos trabalho a fazer.\r\n"
				+ "Toninho: Verdade... mas antes, dona Sheylla, tenho que perguntar uma coisa.\r\n"
				+ "Sheylla: Pergunte, meu caro.\r\n"
				+ "\n[MESTRE]: Novamente uma tensão se forma pelo ar...\r\n"
				+ "\nToninho: A senhora trouxe uma Itaipavinha pra nois? \r\n"
				+ "Sheylla: Já falei para não me assustar dessa forma, Antônio. Sim, eu trouxe. Está no banco de trás. \r\n"
				+ "Toninho: AEHOOOOO AGORA EU VOU ZOAR! \r\n"
				+ "Sheylla: Sabia que ficaria feliz. Você fez por merecer afinal, fique à vontade pois pode ser a última vez.\r\n"
				+ "Toninho: O que quer dizer com isso? \r\n"
				+ "Sheylla: Naaaaada, nunca se sabe hehehe... digo, talvez a Itaipava pare de fabricar.\r\n"
				+ "\n[MESTRE]: Toninho dá um riso frouxo, ao notar certa dubiedade na fala de Sheylla.\r\n"
				+ "\nToninho: hehehe...\r\n"
				+ "\n[MESTRE]: Embora incomodado por tudo aquilo que Nelson disse, Toninho não deixa sua desconfiança transparecer. \r\n"
				+ "\n[ALGUMAS HORAS DEPOIS...]\r\n"
				+ "\n[MESTRE] À distância, Toninho vislumbra a paisagem que lhe é familiar, e percebe que está cada vez mais próximo da cratera. Toninho suspira profundamente à medida que sua ansiedade aumenta. \r\n"
				+ "\nToninho: Sigh... \r\n"
				+ "Sheylla: Está tudo bem, Antônio? Parece meio tenso.\r\n"
				+ "Toninho: Está sim, dona Sheylla. \r\n"
				+ "Sheylla: Ótimo. Alegre-se, Antônio. Finalmente conseguiremos dominar os huma... Errr, quer dizer, construir a ponte com os manos. Depois disso você poderá voltar para casa. \r\n"
				+ "Toninho: Mal vejo a hora... \r\n"
				+ "\n[MESTRE]: Toninho e Sheylla finalmente chegam ao destino, onde Toninho se depara com uma miríade de criaturas aparentemente à espera dos dois. \r\n"
				+ "\nToninho: Quem são eles?\r\n"
				+ "Sheylla: São aqueles que farão o trabalho duro, sob sua coordenação. \r\n"
				+ "\n[MESTRE]: Um som de bater de asas se aproxima em meio a neblina. \r\n"
				+ "\nPerdix: Finalmente. Chegou a hora, Sheylla. \r\n"
				+ "Sheylla: Sim. Já perdemos muito tempo.\r\n"
				+ "Toninho: As andorinhas voltaaaram, e eu também volteeeeei.....\r\n"
				+ "Perdix: De novo esse néscio, Sheylla? \r\n"
				+ "Toninho: Ô seu papagaio do caramba, vou te enfiar a porrada.\r\n"
				+ "\n[MESTRE] Toninho corre em direção à ave e agarra seu fino pescoço.\r\n"
				+ "\nPerdix: ME AJUDA MENOR!\r\n"
				+ "Sheylla: CHEGA. OS DOIS. Antônio, pegue o outro pedaço do pergaminho no carro. \r\n"
				+ "Toninho: Tá. \r\n"
				+ "\n[MESTRE]: Enquanto Toninho caminha até o Del Rey, Sheylla cochicha com Perdix.\r\n"
				+ "\nSheylla: Creio que ele esteja desconfiando de algo.\r\n"
				+ "Perdix: Devemos manter o olho nele, se for caso até mesmo... ‘dispensá-lo’ antes da hora. \r\n"
				+ "Sheylla: Sim, temos o que precisamos afinal. Usaremos até o momento em que não nos for mais conveniente. \r\n"
				+ "\n[MESTRE]: Toninho, ignorante dos planos de Sheylla e Perdix, tenta juntar as metades do pergaminho de forma que faça sentido. \r\n", TimeUnit.MILLISECONDS,
				temp_dialog);

		// Desafio 2
		desafioC3II();

		Digita("\n[MESTRE]: Após a junção dos pedaços, Toninho segue em direção a Sheylla.\r\n"
				+ "\nToninho: Dona Sheylla, aqui está.\r\n"
				+ "Sheylla: Ótimo trabalho, Antônio. Perdix, agora é com você. \r\n"
				+ "\n[MESTRE]: Após uma análise minuciosa da planta, Perdix dá sentido ao projeto enquanto Toninho delimita as atividades de cada criatura. \r\n"
				+ "[MESTRE]: Sheylla apenas observa o decorrer dos fatos à distância. \r\n"
				+ "\nToninho: Boa tarde senhoras e senhores... ou o que quer que sejam. Sou Toninho e serei o supervisor de obra. \r\n"
				+ "\n[MESTRE]: Houve-se um protesto uníssono dentre as criaturas.\r\n"
				+ "\n- UUUUUUUUUUUUUU\r\n"
				+ "- HUMANO NEM É GENTE\r\n"
				+ "- KKKKKKK ALA SE ACHA D++++\r\n"
				+ "- ABAIXO A OPRESSÃO HUMANA\r\n"
				+ "- FORA TONINHO BARRIGUDO\r\n"
				+ "\nSheylla: SILÊNCIO! ATÉ QUE SE FINALIZE A PONTE, TODOS SEGUIRÃO AS ORDENS DE ANTÔNIO \r\n"
				+ "\n[MESTRE]: Após a intervenção de Sheylla, um silêncio incômodo toma o lugar dos protestos.\r\n"
				+ "\nToninho: Obrigado, dona Sheylla. Enfim, o que eu estava dizendo... é, eu serei o supervisor de obra. \r\n"
				+ "Toninho: Vocês, gigantes aí, carregarão as pedras e todo o alicerce necessário. Os anões ficarão encarregados de manejar o guindaste e os outros equipamentos.\r\n"
				+ "Toninho: Quanto as mulas com cabeça, vocês assentarão as pedras na ponte. O restante ajuda no que puder. Alguma pergunta?\r\n"
				+ "\n[MESTRE]: Um ciclope ergue as mãos, visivelmente interessado.\r\n"
				+ "\nToninho: Pois não, ‘zoiudo’.\r\n"
				+ "Ciclope: Os humanos soltam pum? \r\n"
				+ "Toninho: AHAHAHAHAHA\r\n"
				+ "Sheylla: Creio que nenhuma pergunta pertinente. Se isso é tudo, ao trabalho todos vocês. \r\n"
				+ "\n[MESTRE]: E a obra começa. Toninho supervisiona tudo atentamente, jamais tivera tamanha responsabilidade incumbida a ele. \r\n"
				+ "[MESTRE]: Perdix instrui sobre os cálculos feitos por Dédalo, decifráveis apenas por alguém tão ou mais prodigioso que ele. \r\n"
				+ "[MESTRE]: Sheylla, enquanto isso, perambula pela obra, visivelmente ansiosa. \r\n"
				+ "\n[ALGUNS DIAS DEPOIS...]\r\n"
				+ "\n[MESTRE]: A obra avança em ritmo acelerado e está quase concluída, se não fosse por um percalço. \r\n"
				+ "[MESTRE]: Dédalo, temendo que sua obra caísse em mãos erradas, deliberadamente subestimou a quantia de materiais necessários para conclui-la. \r\n"
				+ "\nSheylla: Maldito Dédalo... \r\n"
				+ "Toninho: Relaxa, dona Sheylla. Confia no pai que eu descubro a quantia que falta só de bater o olho.\r\n", TimeUnit.MILLISECONDS,
				temp_dialog);
		
		// Desafio 3
		desafioC3III();

		Digita("\n[MESTRE]: Após o desembaraço da situação, a obra segue seu ritmo. \r\n"
				+ "[MESTRE]: Ao passo que o fim é eminente, Toninho começa a se questionar sobre o que Nelson lhe disse anteriormente. \r\n"
				+ "[MESTRE]: Os constantes murmúrios entre Sheylla e Perdix aumentam ainda mais a desconfiança, ao ponto que ele começa a pensar consigo mesmo. \r\n"
				+ "Toninho: Será que estou fazendo o certo? E se Nelson tiver mesmo razão? \r\n"
				+ "Sheylla: Está tudo bem, Antônio? Há algo te incomodando? \r\n"
				+ "Toninho: Na verdade, tem sim. Eu sei de tudo, Sheylla! Tudo! Dos seus planos de dominar ‘nois’ humano tudo. Só por cima do meu cadáver!\r\n"
				+ "Sheylla: HAHAHAHA HUMANO INOCENTE! VOCÊ JÁ NÃO É MAIS NECESSÁRIO À NOSSA CAUSA! LOGO A SUA RAÇA SE CURVARÁ DIANTE DE NOSSOS DESIGNIOS!\r\n"
				, TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
				+ "[1]: Dar o sinal às criaturas de Nelson. \r\n" + "[2]: Atacar Sheylla.\r\n", TimeUnit.MILLISECONDS,
				temp_dialog);
		escolha = entrada.next();

		do {
			switch (escolha) {
			case "1":
				Digita("\nToninho: BORA!!!!!! HORA DO SHOW, ZORRA! BIIIIIIIIIIIIIIRL\r\n"
						+ "\n[MESTRE]: Um sem-número de criaturas emerge das ruínas que cercam a cratera, armados e prontos para a batalha sangrenta que está por vir. \r\n"
						+ "\nSheylla: MALDITO SEJA! VOCÊ SE ARREPENDERÁ DESTE DISPARATE! \r\n"
						+ "\n .::::::::::::: A BATALHA COMEÇA ::::::::::::.\n",
						TimeUnit.MILLISECONDS, temp_dialog);
				batalha();
				Digita("\nNelson: FUJA, ANTÔNIO! FOSTE BEM ATÉ AGORA, NÓS CUIDAREMOS DO RESTO!\r\n"
						+ "Toninho: ADEUS, NELSON! BOA SORTE!\r\n"
						+ "\n[MESTRE]: Toninho cruza a ponte em direção ao portal, e para sua surpresa Sheylla sai voando em direção a ele, numa tentativa final de derrotá-lo.\r\n"
						+ "\nSheylla: ANTÔNIOOOOOOOOOOO!\r\n"
						+ "Toninho: AAAAAAAAA SAI DE MIM CAPETA\r\n",
						TimeUnit.MILLISECONDS, temp_dialog);
				break;
			case "2":
				Digita("\n[MESTRE]: Toninho, munido de sua mais fiel arma, o tijolo, arremessa-o em direção a Sheylla. Os monstros entram em polvorosa. \r\n"
						+ "\n- EITAAAAAAAAAAAAAAAA!!!!!!\r\n"
						+ "- AEHOOOOOOOOOOOO!!!\r\n"
						+ "- BRIGA BRIGA BRIGA BRIGA!!\r\n"
						+ "- O LOUCO HEIN, EU NÃO DEIXAVA!\r\n"
						+ "- ALA KKKKKKKK APOSTO 10 MOEDAS DE PRATA NO PEDREIRO, MALUCO É BRABO\r\n"
						+ "- Ó O PAU QUEBRANDO PAI EITAAAAAAAAAA PREULAAAAAA, BRIGA NA PONTE PAI\r\n"
						+ "\n[MESTRE]: E assim uma confusão generalizada começa. Sheylla desvia do tijolo e voa em direção a Toninho com a intenção de matá-lo de uma vez por todas.\r\n"
						+ "\nSheylla: HAHAHAHAH HUMANO MEDÍOCRE! CURVE-SE AOS SEUS SUPERIORES\r\n"
						+ "Toninho: Ó O BICHO VINDO VEI\r\n"
						+ "Sheylla: ESTE FOI SEU ÚLTIMO ERRO!\r\n"
						+ "\n .::::::::::::: A BATALHA COMEÇA ::::::::::::.\n",
						TimeUnit.MILLISECONDS, temp_dialog);
				batalha();
				break;
			default:
				System.out.println("\nOpção inválida!");
				Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
						+ "[1]: Dar o sinal ás criaturas de Nelson. \r\n" + "[2]: Atacar Sheylla.\r\n", TimeUnit.MILLISECONDS,
						temp_dialog);
				escolha = entrada.next();
			}

		} while (!escolha.equals("1") && !escolha.equals("2"));

		Digita("\n*** TRIIIIM TRIIIM, TRIIIM TRIIIM ***\r\n"
				+ "\nToninho: AAAAAAAAAAAAAAA\r\n"
				+ "Cleytinho: HOME DO CÉU! FINALMENTE VOCÊ ACORDOU! É UM MILAGRE!\r\n"
				+ "Toninho: QUE VIAGEM É ESSA VEI\r\n"
				+ "Cleytinho: Você estava em coma alcoólico, Toninho! Dormiu quase três dias seguido loco, acabou com a glicose do hospital!\r\n"
				+ "Toninho: É o que?\r\n"
				+ "Cleytinho: To te falando, home! Você desmaiou depois da última sexta-feira que fomos para o bar, pensei que nunca mais ia acordar!\r\n"
				+ "Toninho: Mas rapaz, to lembrado disso não! Eu tive um sonho tão maluco quanto aquele quadro do Gugu, sonho maluco. Parecia tão real\r\n"
				+ "Cleytinho: Por isso você ficava falando uns negócio esquisito então! Mas não esquenta não, ao menos você acordou e isso que importa. \r\n"
				+ "Toninho: Pode ser. Foi só um sonho, nada mais.\r\n"
				+ "\n[MESTRE]: Enquanto os amigos conversam e Toninho tenta ficar à par de tudo que houve durante sua breve ausência, ouve-se a seguinte manchete na TV:\r\n"
				+ "\nTV: Na manhã desta segunda-feira, uma estranha rachadura surgiu no solo, na parte central de Diadema. \r\n"
				+ "TV: A prefeitura isolou o local e engenheiros do município investigam o ocorrido. \r\n"
				+ "TV: De acordo com informações fornecidas por funcionários da secretaria municipal de obras e infraestrutura de Diadema que preferiram ficar anônimos,\r\n"
				+ "TV: a tendência é que esta aumente caso nada seja feito, ao ponto de, em 2021, \r\n"
				+ "TV: tornar-se uma cratera intransponível, impedindo o fluxo de automóveis e transeuntes, \r\n"
				+ "TV: bem como afetando os edifícios nas redondezas. \r\n"
				+ "Toninho: ESTÁ ACONTECENDO! AAAAAAAAAA MISERICÓRDIA\r\n"
				+ "\n*** FIM ***\r\n"
				+ "\n[MESTRE]: OU NÃO? MUAHAHAHAH!\r\n", TimeUnit.MILLISECONDS,
				temp_dialog);

		// creditos finais
		creditos();
	}

	static void instrucoes() throws Exception {
		Digita("Bem-vindo(a) a Diademmor! Em The Architect, você estará encarregado(a)\n"
				+"de nosso herói Antônio, Toninho para os íntimos, um pedreiro (e brasileiro!)\n"
				+ "aguerrido que, assim como muitos de nós, aprecia uma Itaipira aos fins de semana\n"
				+ "junto da companhia de seus amigos e é claro, de um bom churrasco na laje.\r\n"
				+ "Após uma noite de algumas Itaipavas e muito sofrimento, o herói tem sua vida virada\n"
				+ "de cabeça para baixo ao acordar no ano de 2021 em Diademmor, umarealidade paralela caótica.\n"
				+ "Sua missão será auxiliá-lo durante esta jornada e salvá-lo de monstros, armadilhas, bem como\n"
				+ "resolver enigmas e questões matemáticas que obstruirão o caminho de Toninho, cuja\n"
				+ "habilidade matemática se restringe a dividir as contas do bar e estimar quantias de material para determinada obra. \r\n",
				TimeUnit.MILLISECONDS, temp_dialog);
		menu();
	}

	// CRÉDITOS FINAIS
	static void creditos() throws Exception {

		Digita(".::: CRÉDITOS :::.\n> Alex Gama\n> Bruno Sousa\n> Rafael Pereira Elias\n> Ruy Menezes \n",
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

	public static void desafioC1I() throws InterruptedException {

		boolean acertou = false;
		int contador = 3;
		String alternativa;
		ArrayList<String> r = new ArrayList<String>();
		r.add("57"); // resposta correta
		r.add("-71");
		r.add("-7");
		r.add("137");
		r.add("185");

		do {

			if (contador == 0) {
				HP = HP - 10;
				Digita("Você errou 3 vezes, por isso tonino levou dano\n" + "HP Toninho - 10 = " + HP + "\n",
						TimeUnit.MILLISECONDS, temp_dialog);
				contador = 3;
				Digita("\nSuas chances resetaram\n", TimeUnit.MILLISECONDS, temp_dialog);
			}
			if (HP <= 0) {
				Digita("Você morreu!\n" + "\n .::::::::::::: GAME OVER!!! ::::::::::::.\n", TimeUnit.MILLISECONDS,
						temp_dialog);
				System.exit(0);
			}
			Digita("\nVocê tem " + contador + " chances de acertar antes de levar dano(-10 no HP)\n"
					+ "\nSabendo que a largura em milímetros do Del Rey de Sheylla é 185, determine o valor de x na seguinte expressão:\n"
					+ "\n(2^4 : 4^2) . (16^1 * 2^3) + x = 185\n", TimeUnit.MILLISECONDS, temp_dialog);
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
				if (r.get(0) == "57") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;
			case "b":
			case "B":
				if (r.get(1) == "57") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;
			case "c":
			case "C":
				if (r.get(2) == "57") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;
			case "d":
			case "D":
				if (r.get(3) == "57") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;
			case "e":
			case "E":
				if (r.get(4) == "57") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;

			default:
				System.out.println("Escolha invalida!");
				Collections.shuffle(r);
			}

		} while (!acertou);
		Itaipira++;
	}

	public static void desafioC1III() throws InterruptedException {

		boolean acertou = false;
		int contador = 3;
		String alternativa;
		ArrayList<String> r = new ArrayList<String>();
		r.add("2"); // resposta correta
		r.add("4");
		r.add("8");
		r.add("9");
		r.add("5");
		
		Collections.shuffle(r);

		do {
			System.out.println("Ajude Toninho a resolver a seguinte equação que permitirá o acesso ao interior da sala:"
					+ "4x + 2 = 10 ");
			/*
			 * Equação 1° grau Para que o nosso Heroi Toninho possa entender o que a Mestre
			 * Sheylla tem para apresentar a ele em Diademmor, ajude ele a resolver esta
			 * questão de equação de 1° grau que nosso heroi gosta de resolver, para que ele
			 * consiga superar esta etapa Questão: 4x + 2 = 10 R. 4x = 10 – 2 x = 10 – 2 4 x
			 * = 8 4 R. x = 2
			 */

			if (contador == 0) {
				HP = HP - 10;
				Digita("Você errou 3 vezes, por isso Toninho levou dano\n" + "HP Toninho - 10 = " + HP + "\n",
						TimeUnit.MILLISECONDS, temp_dialog);
				contador = 3;
				Digita("\nSuas chances resetaram\n", TimeUnit.MILLISECONDS, temp_dialog);
			}
			if (HP <= 0) {
				Digita("Você morreu!\n" + "\n .::::::::::::: GAME OVER!!! ::::::::::::.\n", TimeUnit.MILLISECONDS,
						temp_dialog);
				System.exit(0);
			}
			Digita("\nVocê tem " + contador + " chances de acertar antes de levar dano(-10 no HP)\n"
					+ "\n 4x + 2 = 10 \r\n"
					+ "O aviso é uma equação de 1° grau que Toninho precisa resolver, para que ele possa abrir a porta\n",
					TimeUnit.MILLISECONDS, temp_dialog);
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
				if (r.get(0) == "2") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;
			case "b":
			case "B":
				if (r.get(1) == "2") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;
			case "c":
			case "C":
				if (r.get(2) == "2") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;
			case "d":
			case "D":
				if (r.get(3) == "2") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;
			case "e":
			case "E":
				if (r.get(4) == "2") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;

			default:
				System.out.println("Escolha invalida!");
				Collections.shuffle(r);
			}

		} while (!acertou);
		Itaipira++;
	}

	public static void desafioC1II() throws InterruptedException {

		boolean acertou = false;
		int contador = 3;
		String alternativa;
		ArrayList<String> r = new ArrayList<String>();
		r.add("1,8"); // resposta correta
		r.add("3");
		r.add("5,7");
		r.add("2");
		r.add("0");
		
		Collections.shuffle(r);

		/*
		 * Função do 1° grau Questão: f(x) = ax + b, sabendo-se que f(3) = 6 e f (-2) =
		 * -3 f(3) = 6 f(3) = 3a + b -- 3a + b = 6 f(-2) = -3 f(-2) = -2a + b -- -2a + b
		 * = -3 3a + b = 6 -2a + b = -3 (multiplica a segunda linha do sistema linear
		 * por -1) 3a + b = 6 2a - b = 3 (+b com -b, elimina e sobra 5a = 9) 5a = 9 R. a
		 * = 9/5 ou 1,8
		 */
		do {
			System.out.println(
					"Toninho optou pela diplomacia, não que isso facilite muito as coisas. Ajude-o no seguinte enigma proposto pela Esfinge:\n"
							+ "Uma função de 1° grau é definida pela seguinte estrutura: f(x) = a.x + b. Sabendo que f(3) = 6 e f(-2) = -3, determine o valor de x:");

			if (contador == 0) {
				HP = HP - 10;
				Digita("Você errou 3 vezes, por isso Toninho levou dano\n" + "HP Toninho - 10 = " + HP + "\n",
						TimeUnit.MILLISECONDS, temp_dialog);
				contador = 3;
				Digita("\nSuas chances resetaram\n", TimeUnit.MILLISECONDS, temp_dialog);
			}
			if (HP <= 0) {
				Digita("Você morreu!\n" + "\n .::::::::::::: GAME OVER!!! ::::::::::::.\n", TimeUnit.MILLISECONDS,
						temp_dialog);
				System.exit(0);
			}
			Digita("\nVocê tem " + contador + " chances de acertar antes de levar dano(-10 no HP)\n"
					+ "\n A esfinge apresenta a questão:"
					+ "\nQual é a função: f(x) = ax + b, sabendo-se que f(3) = 6 e f (-2) = -3", TimeUnit.MILLISECONDS,
					temp_dialog);
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
				if (r.get(0) == "1,8") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;
			case "b":
			case "B":
				if (r.get(1) == "1,8") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;
			case "c":
			case "C":
				if (r.get(2) == "1,8") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;
			case "d":
			case "D":
				if (r.get(3) == "1,8") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;
			case "e":
			case "E":
				if (r.get(4) == "1,8") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;

			default:
				System.out.println("Escolha invalida!");
				Collections.shuffle(r);
			}

		} while (!acertou);
		Itaipira++;
	}

	public static void desafioC2I() throws InterruptedException {

		boolean acertou = false;
		int contador = 3;
		String alternativa;
		ArrayList<String> r = new ArrayList<String>();
		r.add("Literal -  x / a^2 b^2 / x^2 x \n" + "Coficiente - 3 / 1 1 / 1 3 7\n"); // resposta correta
		r.add("Literal -  3 / y^2 a^2 / 2^6 t \n" + "Coficiente - x / 2 0 / a b c\n");
		r.add("Literal -  3 / 1 1 / 1 3 7 \n" + "Coficiente - x / a^2 b^2 / x^2 x\n");
		r.add("Literal -  3x / 2a^2 1^2 / 0^2 1 \n" + "Coficiente - 3 / 0 0 / x c 7\n");
		r.add("Literal -  0 / a b / x x \n" + "Coficiente - 2 / 1 1 / 1 3\n");
		
		Collections.shuffle(r);

		do {
			if (contador == 0) {
				HP = HP - 10;
				Digita("Você errou 3 vezes, por isso tonino levou dano\n" + "HP Toninho - 10 = " + HP + "\n",
						TimeUnit.MILLISECONDS, temp_dialog);
				contador = 3;
				Digita("\nSuas chances resetaram\n", TimeUnit.MILLISECONDS, temp_dialog);
			}
			if (HP <= 0) {
				Digita("Você morreu!\n" + "\n .::::::::::::: GAME OVER!!! ::::::::::::.\n", TimeUnit.MILLISECONDS,
						temp_dialog);
				System.exit(0);
			}
			Digita("\nVocê tem " + contador + " chances de acertar antes de levar dano(-10 no HP)\n"
					+ "Fora corajoso o bastante para chegar até aqui, mas esteja ciente que o que se encontra além-portão não é para os fracos de espírito"
					+ "e nem para os covardes. Nem mesmo os deuses, semi-deuses e titãs ousam vagar por estas terras sem uma boa razão.\n "
					+ "São dignos de prosseguir apenas aqueles que sejam capaz de decifrar este enigma. Prossiga a sua própria conta e risco."
					+ "\nOs polinômios são expressões algébricas formadas por números (coeficientes) e letras (partes literais).\r\n "
					+ "Sabendo disso determine quais são as parte literais e os coeficientes das expressôes a seguir:\r\n"
					+ "1) 3x / 2) a^2 - b^2 / 3) x^2 + 3x + 7 \n", TimeUnit.MILLISECONDS, temp_dialog);
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
					contador--;
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;
			case "b":
			case "B":
				if (r.get(1) == "Literal -  x / a^2 b^2 / x^2 x \n" + "Coficiente - 3 / 1 1 / 1 3 7\n") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;
			case "c":
			case "C":
				if (r.get(2) == "Literal -  x / a^2 b^2 / x^2 x \n" + "Coficiente - 3 / 1 1 / 1 3 7\n") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;
			case "d":
			case "D":
				if (r.get(3) == "Literal -  x / a^2 b^2 / x^2 x \n" + "Coficiente - 3 / 1 1 / 1 3 7\n") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;
			case "e":
			case "E":
				if (r.get(4) == "Literal -  x / a^2 b^2 / x^2 x \n" + "Coficiente - 3 / 1 1 / 1 3 7\n") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;

			default:
				System.out.println("Escolha invalida!\n");
				Collections.shuffle(r);
			}

		} while (!acertou);
		Itaipira++;

	}

	public static void desafioC2II() throws InterruptedException {

		boolean acertou = false;
		int contador = 3;
		String alternativa;
		ArrayList<String> r = new ArrayList<String>();
		r.add("Binômio / Trinômio / Monômio"); // resposta correta
		r.add("Binômio / Binômio / Monômio");
		r.add("Trinômio / Monômio / Binômio");
		r.add("Monômio / Trinômio / Binômio");
		r.add("Monômio / Monômio / Monômio");

		Collections.shuffle(r);
		
		do {

			if (contador == 0) {
				HP = HP - 10;
				Digita("Você errou 3 vezes, por isso Toninho levou dano\n" + "HP Toninho - 10 = " + HP + "\n",
						TimeUnit.MILLISECONDS, temp_dialog);
				contador = 3;
				Digita("\nSuas chances resetaram\n", TimeUnit.MILLISECONDS, temp_dialog);
			}
			if (HP <= 0) {
				Digita("Você morreu!\n" + "\n .::::::::::::: GAME OVER!!! ::::::::::::.\n", TimeUnit.MILLISECONDS,
						temp_dialog);
				System.exit(0);
			}
			Digita("\nVocê tem " + contador + " chances de acertar antes de levar dano(-10 no HP)\n"
					+ "\nOs polinômios são formados por termos.\n"
					+ "A única operação entre os elementos de um termo é a multiplicação "
					+ ", sendo  monômio(1 termo), binômio(2 termos), trinômio(3 termos) e polinômio (+ de 3 termos).\n"
					+ "Sabendo disso, termine qual é o grau das expressões a seguir:\n" + "1) 3x+y / 2) 3ab-4xy-10y / 3) 5abc\n",
					TimeUnit.MILLISECONDS, temp_dialog);
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
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;
			case "b":
			case "B":
				if (r.get(1) == "Binômio / Trinômio / Monômio") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;
			case "c":
			case "C":
				if (r.get(2) == "Binômio / Trinômio / Monômio") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;
			case "d":
			case "D":
				if (r.get(3) == "Binômio / Trinômio / Monômio") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;
			case "e":
			case "E":
				if (r.get(4) == "Binômio / Trinômio / Monômio") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;

			default:
				System.out.println("Escolha invalida!");
				Collections.shuffle(r);
			}

		} while (!acertou);
		Itaipira++;
	}

	public static void desafioC2III() throws InterruptedException {

		boolean acertou = false;
		int contador = 3;
		String alternativa;
		ArrayList<String> r = new ArrayList<String>();
		r.add("3x^3+5x^2-5x+3"); // resposta correta
		r.add("5x^3-3x^2-6x-1");
		r.add("2x^3-2x^2+4x+18");
		r.add("x^3-3x^2+5x-7");
		r.add("10x^3+2x^2+3x+1");
		
		Collections.shuffle(r);

		do {
			if (contador == 0) {
				HP = HP - 10;
				Digita("Você errou 3 vezes, por isso tonino levou dano\n" + "HP Toninho - 10 = " + HP + "\n",
						TimeUnit.MILLISECONDS, temp_dialog);
				contador = 3;
				Digita("\nSuas chances resetaram\n", TimeUnit.MILLISECONDS, temp_dialog);
			}
			if (HP <= 0) {
				Digita("Você morreu!\n" + "\n .::::::::::::: GAME OVER!!! ::::::::::::.\n", TimeUnit.MILLISECONDS,
						temp_dialog);
				System.exit(0);
			}
			Digita("\nVocê tem " + contador + " chances de acertar antes de levar dano(-10 no HP)\n"
					+ "\nSome os polinômios:\n" + "a(x) = 2x^3+2x^2-3x+1\n" + "b(x) = x^3+3x^2-2x+2\n",
					TimeUnit.MILLISECONDS, temp_dialog);
			System.out.println("\n");
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
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;
			case "b":
			case "B":
				if (r.get(1) == "3x^3+5x^2-5x+3") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;
			case "c":
			case "C":
				if (r.get(2) == "3x^3+5x^2-5x+3") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;
			case "d":
			case "D":
				if (r.get(3) == "3x^3+5x^2-5x+3") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;
			case "e":
			case "E":
				if (r.get(4) == "3x^3+5x^2-5x+3") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador--;
				} else {
					System.out.println("Resposta incorreta!\n");
					Collections.shuffle(r);
					contador--;
				}
				break;

			default:
				System.out.println("\nEscolha invalida!");
				Collections.shuffle(r);
			}

		} while (!acertou);
		Itaipira++;
	}

	public static void desafioC3I() throws InterruptedException {

		boolean acertou = false;
		int contador = 3;
		String alternativa;
		ArrayList<String> r = new ArrayList<String>();
		r.add("11000111 e FA"); // resposta correta
		r.add("11100111 e F9");
		r.add("11010111 e FA");
		r.add("11000111 e F9	");
		r.add("11100111 e FA.");
		
		Collections.shuffle(r);
		
		do {

			if (contador == 0) {
				HP = HP - 10;
				Digita("Você errou 3 vezes, por isso tonino levou dano\n" + "HP Toninho - 10 = " + HP + "\n",
						TimeUnit.MILLISECONDS, temp_dialog);
				contador = 3;
				Digita("\nSuas chances resetaram\n", TimeUnit.MILLISECONDS, temp_dialog);
			}
			if (HP <= 0) {
				Digita("Você morreu!\n" + "\n .::::::::::::: GAME OVER!!! ::::::::::::.\n", TimeUnit.MILLISECONDS,
						temp_dialog);
				System.exit(0);
			}
			Digita("\nVocê tem " + contador + " chances de acertar antes de levar dano(-10 no HP)\n"
					+ "\nOs numeros decimais 199 e 250 correspondem,\n"
					+ "nos sistemas binario e hexadecimal, as seguintes representações:\n", TimeUnit.MILLISECONDS,
					temp_dialog);
			System.out.println("\na) " + r.get(0));
			System.out.println("b) " + r.get(1));
			System.out.println("c) " + r.get(2));
			System.out.println("d) " + r.get(3));
			System.out.println("e) " + r.get(4));
			System.out.print("\nEscolha uma alternativa: ");
			alternativa = entrada.next();

			switch (alternativa) {

			case "a":
			case "A":
				if (r.get(0) == "11000111 e FA") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador - 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador - 1;
					Collections.shuffle(r);
				}
				break;
			case "b":
			case "B":
				if (r.get(1) == "11000111 e FA") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador - 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador - 1;
					Collections.shuffle(r);
				}
				break;
			case "c":
			case "C":
				if (r.get(2) == "11000111 e FA") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador - 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador - 1;
					Collections.shuffle(r);
				}
				break;
			case "d":
			case "D":
				if (r.get(3) == "11000111 e FA") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador - 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador - 1;
					Collections.shuffle(r);
				}
				break;
			case "e":
			case "E":
				if (r.get(4) == "11000111 e FA") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador - 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador - 1;
					Collections.shuffle(r);
				}
				break;

			default:
				System.out.println("\nEscolha invalida!");
				contador = contador - 1;
				Collections.shuffle(r);
			}

		} while (!acertou);

		Itaipira++;
	}

	public static void desafioC3II() throws InterruptedException {
		

		boolean acertou = false;
		int contador = 3;
		String alternativa;
		ArrayList<String> r = new ArrayList<String>();
		r.add("8 e 18");
		r.add("30 e 14");
		r.add("24 e 12"); // resposta correta
		r.add("19 e 18");
		r.add("10 e 17");
		
		Collections.shuffle(r);

		do {

			if (contador == 0) {
				HP = HP - 10;
				Digita("Você errou 3 vezes, por isso tonino levou dano\n" + "HP Toninho - 10 = " + HP + "\n",
						TimeUnit.MILLISECONDS, temp_dialog);
				contador = 3;
				Digita("\nSuas chances resetaram\n", TimeUnit.MILLISECONDS, temp_dialog);
			}
			if (HP <= 0) {
				Digita("Você morreu!\n" + "\n .::::::::::::: GAME OVER!!! ::::::::::::.\n", TimeUnit.MILLISECONDS,
						temp_dialog);
				System.exit(0);
			}
			Digita("\nVocê tem " + contador + " chances de acertar antes de levar dano(-10 no HP)\n"
					+ "\nPara juntar os pergaminhos Toninho precisa fazer um calculo. \r\n"
					+ "Toninho tem o numero 36 como resultado final. Sabendo que um possui 4 simbolos e o outro 2.\n"
					+ "Qual o valor de cada simbolo?\n", TimeUnit.MILLISECONDS,
					temp_dialog);
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
				if (r.get(0) == "24 e 12") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador - 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador - 1;
					Collections.shuffle(r);
				}
				break;
			case "b":
			case "B":
				if (r.get(1) == "24 e 12") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador - 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador - 1;
					Collections.shuffle(r);
				}
				break;
			case "c":
			case "C":
				if (r.get(2) == "24 e 12") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador - 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador - 1;
					Collections.shuffle(r);
				}
				break;
			case "d":
			case "D":
				if (r.get(3) == "24 e 12") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador - 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador - 1;
					Collections.shuffle(r);
				}
				break;
			case "e":
			case "E":
				if (r.get(4) == "24 e 12") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador - 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador - 1;
					Collections.shuffle(r);
				}
				break;

			default:
				System.out.println("\nEscolha invalida!");
				contador = contador - 1;
				Collections.shuffle(r);
			}

		} while (!acertou && contador < 3);
		Itaipira++;

	}

	public static void desafioC3III() throws InterruptedException {

		

		boolean acertou = false;
		int contador = 3;
		String alternativa;
		ArrayList<String> r = new ArrayList<String>();
		r.add("18, 22, 53, 20, 11, 4");
		r.add("14, 17, 23, 31, 48, 52");
		r.add("12, 6, 54, 55, 39, 13");
		r.add("19, 51, 7, 49, 35, 21");
		r.add("7, 60, 55, 27, 18, 10");// resposta correta
		
		Collections.shuffle(r);

		do {

			if (contador == 0) {
				HP = HP - 10;
				Digita("Você errou 3 vezes, por isso tonino levou dano\n" + "HP Toninho - 10 = " + HP + "\n",
						TimeUnit.MILLISECONDS, temp_dialog);
				contador = 3;
				Digita("\nSuas chances resetaram\n", TimeUnit.MILLISECONDS, temp_dialog);
			}
			if (HP <= 0) {
				Digita("Você morreu!\n" + "\n .::::::::::::: GAME OVER!!! ::::::::::::.\n", TimeUnit.MILLISECONDS,
						temp_dialog);
				System.exit(0);
			}
			Digita("\nVocê tem " + contador + " chances de acertar antes de levar dano(-10 no HP)\n"
					+ "\n Toninho percebeu que os numeros estão em Hexadecimal e para descobrir a quantidade que falta precisa converte-los,\n "
					+ "\n7, 3C, 37, 1B, 12, A\n"
					+ "quais numeros representam essa sequencia em decimal?\n", TimeUnit.MILLISECONDS, temp_dialog);
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
				if (r.get(0) == "7, 60, 55, 27, 18, 10") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador - 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador - 1;
					Collections.shuffle(r);
				}
				break;
			case "b":
			case "B":
				if (r.get(1) == "7, 60, 55, 27, 18, 10") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador - 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador - 1;
					Collections.shuffle(r);
				}
				break;
			case "c":
			case "C":
				if (r.get(2) == "7, 60, 55, 27, 18, 10") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador - 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador - 1;
					Collections.shuffle(r);
				}
				break;
			case "d":
			case "D":
				if (r.get(3) == "7, 60, 55, 27, 18, 10") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador - 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador - 1;
					Collections.shuffle(r);
				}
				break;
			case "e":
			case "E":
				if (r.get(4) == "7, 60, 55, 27, 18, 10") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador - 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador - 1;
					Collections.shuffle(r);
				}
				break;

			default:
				System.out.println("\nEscolha invalida!");
				contador = contador - 1;
				Collections.shuffle(r);
			}

		} while (!acertou && contador < 3);
		Itaipira++;

	}

	public static void batalha() throws InterruptedException {
		boolean morreu = false;
		int hpI = 100;
		String escolha;

		do {
			if (hpI <= 0) {
				morreu = true;
				break;
			} else if (HP <= 0) {
				morreu = true;
				break;
			}
			int d20 = new Random().nextInt(20) + 1;
			int n = d20;
			System.out.println("\nO que deseja fazer:\n" + "[1] - Atacar.\n" + "[2] - Beber Itaipira\n");
			escolha = entrada.next();

			switch (escolha) {
			case "1":
				Digita("\nJogando os dados...\n" + "O numero do dado: " + n + "\n", TimeUnit.MILLISECONDS, temp_dialog);
				if (n > 15 && n <= 25) {
					hpI = hpI - 20;
					Digita("\nToninho causou 20 de dano no inimigo\n" + "\nHP do Toninho = " + HP + "\nHP do Inimigo = "
							+ hpI, TimeUnit.MILLISECONDS, temp_dialog);

				} else if (n > 10 && n <= 15) {
					hpI = hpI - 10;
					Digita("\nToninho causou 10 de dano no inimigo\n" + "\nHP do Toninho = " + HP + "\nHP do Inimigo = "
							+ hpI, TimeUnit.MILLISECONDS, temp_dialog);

				} else if (n > 5 && n <= 10) {
					HP = HP - 5;
					Digita("\nToninho errou o ataque causou 0 de dano no inimigo e tomou 5 de dano\n"
							+ "\nHP do Toninho = " + HP + "\nHP do Inimigo = " + hpI, TimeUnit.MILLISECONDS,
							temp_dialog);

				} else if (n >= 0 && n <= 5) {
					HP = HP - 10;
					Digita("\nToninho errou o ataque causou 0 de dano no inimigo e tomou 10 de dano\n"
							+ "\nHP do Toninho = " + HP + "\nHP do Inimigo = " + hpI, TimeUnit.MILLISECONDS,
							temp_dialog);

				}

				break;
			case "2":
				if (Itaipira > 0) {
					Itaipira--;
					HP = HP + 10;
					Digita("Toninho usa a Itaipira e ganha +10 de HP e +5 na contagem de dados\n" + "\nHP do Toninho = "
							+ HP + "\n", TimeUnit.MILLISECONDS, temp_dialog);
					n = n + 5;
					Digita("\nJogando os dados...\n" + "O numero do dado: " + n + "\n", TimeUnit.MILLISECONDS,
							temp_dialog);
					if (n > 15 && n <= 25) {
						hpI = hpI - 20;
						Digita("\nToninho causou 20 de dano no inimigo\n" + "\nHP do Toninho = " + HP
								+ "\nHP do Inimigo = " + hpI, TimeUnit.MILLISECONDS, temp_dialog);
						break;
					} else if (n > 10 && n <= 15) {
						hpI = hpI - 10;
						Digita("\nToninho causou 10 de dano no inimigo\n" + "\nHP do Toninho = " + HP
								+ "\nHP do Inimigo = " + hpI, TimeUnit.MILLISECONDS, temp_dialog);
						break;
					} else if (n > 5 && n <= 10) {
						HP = HP - 5;
						Digita("\nToninho errou o ataque causou 0 de dano no inimigo e tomou 5 de dano\n"
								+ "\nHP do Toninho = " + HP + "\nHP do Inimigo = " + hpI, TimeUnit.MILLISECONDS,
								temp_dialog);
						break;
					} else if (n >= 0 && n <= 5) {
						HP = HP - 10;
						Digita("\nToninho errou o ataque causou 0 de dano no inimigo e tomou 10 de dano\n"
								+ "\nHP do Toninho = " + HP + "\nHP do Inimigo = " + hpI, TimeUnit.MILLISECONDS,
								temp_dialog);
						break;
					}
				} else {
					System.out.println("Toninho não possui Itaipira");
					break;
				}

				break;

			default:
				System.out.println("\nOpção invalida!");
			}

		} while (morreu == false);

		if (hpI <= 0) {
			Digita("\nVocê matou o boss!\n", TimeUnit.MILLISECONDS, temp_dialog);
		} else if (HP <= 0) {
			Digita("Você morreu!\n" + "\n .::::::::::::: GAME OVER!!! ::::::::::::.\n", TimeUnit.MILLISECONDS,
					temp_dialog);
			System.exit(0);
			;
		}
	}

	


}

