package RPG;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;

public class Intro {
	static double HP = 100;
	static int Itaipava = 0;
	static Scanner entrada = new Scanner(System.in); // SCANNER DE ESCOPO GLOBAL, N�O � NECESS�RIO INSTANCIAR NENHUM
														// OUTRO.
	static Random rand = new Random(21);
	static int D20 = rand.nextInt(21); // DADO DE 20 FACES - GLOBAL
	static int D6 = rand.nextInt(7); // DADO DE 6 FACES - GLOBAL

	// TEMPO DE DELAY DAS MENSAGENS: MODIFIQUE PARA ZERO PARA JOGAR SEM DELAY. PADR�O 70,150,25
	static int temp_dialog = 0, temp_narrativa = 00, temp_transicao = 0;

	public static void main(String[] args) throws Exception {

		Digita("\nABANDONAI TODA A ESPERAN�A, � V�S QUE ENTRAIS...\n", TimeUnit.MILLISECONDS, temp_dialog);
		Digita(".::: THE ARCHITECT - A BRAZILIAN CHRONIQUE :::.\n", TimeUnit.MILLISECONDS, temp_dialog);
		menu();
	}

	static void menu() throws Exception { // metodo para puxar as escolhas do menu
		String escolha_menu;
		System.out.println("\n1 - Jogar\n2 - Instru��es\n3 - Cr�ditos\n4 - Sair");
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
				System.out.println("1 - Jogar\n2 - Instru��es\n3 - Cr�ditos\n4 - Sair");
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

		Digita("\n0 - Introdu��o\n1 - Cap�tulo I - A ACEITA��O\n2 - Cap�tulo II - A DESCOBERTA\n3 - Cap�tulo III - O CONFRONTO FINAL\n4 - Menu Principal",
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

	static void instrucoes() { // instru��o do jogo

	}

	static void intro() throws Exception {
		String escolha;
		Digita("\n[MESTRE]: O ano � 2018."
				+ "\n[MESTRE]: Toninho finaliza seu dia de trabalho. Entra em seu Ford Belina e d� partida no motor.\n"
				+ "\nVRUM...\n" + "\n[MESTRE]: ele est� com seu amigo e colega de empreitada, Cleytinho.\n"
				+ "\nCleytinho: Bora tomar uma l� no bar do Bira ?\n"
				+ "\nSelecione a sua resposta de acordo com o numero correspondente: " + "\n[1] AEHOOOO, bora!"
				+ "\n[2] T� afim n�o, Cleytinho\n", TimeUnit.MILLISECONDS, temp_dialog);
		escolha = entrada.next();

		do {
			switch (escolha) {

			case "1":
				Digita("\nCleytinho: AEHOOOO, hoje o couro vai cochar!\n"
						+ "\n[MESTRE]: Cleytinho entra no carro e j� vai aumentando o som.\n"
						+ "[MESTRE]: � uma tarde de sexta-feria e o sol come�a a se p�r.\n"
						+ "[MESTRE]: Os amigos chegam ao bar do Bira\n"
						+ "\nToninho: AOWWWW BIRA VEIO, DESCE AQUELA GELADA QUE HOJE VOU VER V�DEO NO ZAPZAP!\n"
						+ "Bira: � pra j�, campe�o!\n"
						+ "\n[MESTRE]: Os amigos sentam-se a mesa de pl�stico e discutem mundanindades.\n"
						+ "\n[3 horas e muitas itaipavas depois...]\n" + "\nCleytinho: � TONINHO, LEVANTA HOMEM!\n"
						+ "Toninho: To n�o.\n"
						+ "Cleytinho: Eu falo que voc� n�o aguenta beber, daqui a pouco vai come�ar a chorar pela ex de novo.\n"
						+ "Toninho: To n�o.\n" + "\n***Toninho desmaia***\n"
						+ "\n[MESTRE]: Cleytinho, vendo ser infrut�feras suas tentativas de ajudar o colega, o arrasta para o carro e leva Toninho � sua casa."
						+ "\n[MESTRE]: Toninho continua desmaiado e dormindo como se n�o houvesse o amanh�.",
						TimeUnit.MILLISECONDS, temp_dialog);
				break;
			case "2":
				Digita("\nCleytinho: Sai dessa, homi! Eu sei que voc� vai voltar para casa e ficar ligando pra Lucilene.\r\n"
						+ "Toninho: Vou nada, amanh� vou assar umas bistecas logo cedo.\r\n" + "Cleytinho:... \r\n"
						+ "\n[MESTRE]: Toninho segue para sua casa.\n"
						+ "[MESTRE]: somente ele e a solid�o em seu cora��o que j� n�o � mais o mesmo ap�s anos de consumo indiscriminado de gordura saturada.\r\n"
						+ "[MESTRE]: Ao chegar, pensa consigo mesmo...\r\n"
						+ "\nToninho: Vou tomar s� uma pois sou merecedor. \r\n"
						+ "\n[3 horas e muitas Itaipavas depois...]\r\n"
						+ "\n[MESTRE]:  Em uma liga��o com sua amada...\r\n" + "\nToninho: Volta pra mim, Lucilene!\r\n"
						+ "Lucilene: Me esquece, �disgra�a�!\r\n" + "BIP BIP BIP...\r\n"
						+ "\n***Toninho desmaia ap�s chorar copiosamente***", TimeUnit.MILLISECONDS, temp_dialog);
				break;
				
			default:
				System.out.println("\nOp��o inv�lida!");
				Digita("\nSelecione a sua resposta de acordo com o numero correspondente: " + "\n[1] AEHOOOO, bora!"
						+ "\n[2] T� afim n�o, Cleytinho\n", TimeUnit.MILLISECONDS, temp_dialog);
				escolha = entrada.next();
			}
		} while (!escolha.equals("1") && !escolha.equals("2"));

		
	}

	static void capitulo_1() throws Exception {
		String escolha;
		Digita("\n[horas depois...]\r\n"
				+ "\n[MESTRE]:  Toninho acorda, ainda meio desorientado pelos eventos da noite anterior e n�o se lembra de nada exceto seu nome e sua profiss�o.\r\n"
				+ "[MESTRE]: Acorda dentro de seu carro embora n�o o reconhe�a, coberto por uma densa neblina.\r\n"
				+ "[blablablabla � inserir algo depois]\r\n"
				+ "[MESTRE]: Em meio a neblina, aproxima-se uma figura de arqu�tipo feminino... \r\n"
				+ "\nSheylla: Est�vamos � sua espera, Toninho.\r\n" + "Toninho: Quem � voc�? Onde estou?\r\n"
				+ "Sheylla: Eu sou Sheylla com dois l�s, guardi� de Diademmor. \r\n" + "Toninho: Diademmor? \r\n"
				+ "Sheylla: Sim, Ant�nio. Diademmor. Esta realidade n�o � acess�vel para humanos comuns.\r\n"
				+ "Toninho: Com todo respeito dona Shirley, mas eu sou um mero pedreiro. Acho que voc� est� me tomando por outra pessoa. \r\n"
				+ "Sheylla: � Sheylla, n�o Shirley. E n�o, tenho certeza de que voc� � o escolhido.\r\n"
				+ "Toninho: Escolhido para qu�, minha senhora? S� quero assar minhas bistecas hoje, se quiser que eu bata a laje da sua casa me chama no ZAPZAP que a gente combina o or�amento. \r\n"
				+ "\n[MESTRE]: Toninho vira as costas e segue em dire��o ao seu carro...\r\n"
				+ "[MESTRE]: Sheylla, visivelmente irada, assume a sua real forma de Er�nia e avan�a em dire��o ao pedreiro\r\n"
				+ "\nSheylla: N�O OUSE ME IGNORAR, HUMANO!\r\n" + "Toninho: Eita, que viajem � essa vei\r\n"
				+ "Sheylla: ACEITE O SEU DESTINO, MORTAL. \r\n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
				+ "Toninho[1]: Pois bem, que seja. \r\n" 
				+ "Toninho[2]: Sem tempo, irm�o.\r\n", TimeUnit.MILLISECONDS,
				temp_dialog);
		escolha = entrada.next();

		do {
			switch (escolha) {
			case "1":
				Digita("\nSheylla: �timo. Venha, vou guia-lo por essa realidade.\r\n"
						+ "Sheylla: N�o � seguro que caminhe s�.\r\n" 
						+ "Sheylla: H� armadilhas por todo o percurso.\r\n",
						TimeUnit.MILLISECONDS, temp_dialog);
				break;
			case "2":
				Digita("\nSheylla: Voc� n�o est� na posi��o de decidir coisa alguma, Ant�nio.\r\n", TimeUnit.MILLISECONDS,
						temp_dialog);
				break;
				
				
			default:
				System.out.println("\nOp��o inv�lida!");
				Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
						+ "Toninho[1]: Pois bem, que seja. \r\n"
						+ "Toninho[2]: Sem tempo, irm�o.\r\n",
						TimeUnit.MILLISECONDS, temp_dialog);
				escolha = entrada.next();
			}
			
			/* Equa��o 1� grau 
			 * Quest�o: x + 4 = 12
			 * x = 12 � 4
			 * R. x = 8
			 */
			
			/* Equa��o 1� grau 
			 * Para que toninho n�o entre em coma alcolico logo no inicio da historia resolva esta quest�o de Matem�tica, que toninho tem espertize para solucionar 
			estas quest�es, e ajude nosso amigo Predreiro. 
			Quest�o: x � 12 = 20
			x = 20 + 12
			R. x = 32 */

			/* Equa��o 1� grau 
			 * Para que o nosso Heroi Toninho possa entender o que a Mestre Sheylla tem para apresentar a ele em Diademmor, ajude ele a resolver esta quest�o de 
			 * equa��o de 1� grau que nosso heroi gosta de resolver, para que ele consiga superar esta etapa
			 * Quest�o: 4x + 2 = 10
			 * R. 4x = 10 � 2
			 *     x = 10 � 2
                          4
                       x =  8
                            4
                          R.  x = 2 */
			
			/* Equa��o 2� grau
			 * Para ajudar o guerreiro Toninho a obter respostas mais claras junto a Deusa Sheylla ajude ele a solucionar esta quest�o de 
			 * equa��o de 2� Grau
			 * Quest�o: x� � 2x +1 = 0
			 * R.
			 * a = 1
			 * b = -2
			 * c = 1
			 * D = b� � 4ac
			 * D = (-2)� � 4 �1�1
			 * D = 4 � 4
			 * D = 0
			 * R. Como D = 0, a equa��o possui uma �nica solu��o real.  */	
			
			/* Equa��o 2� grau
			 * Quest�o: x� +6x + c =0
			 R. a = 1
			 b = 6
			 D = b� � 4 ac
			 D = 6� � 4� 1 c
			 D = 36 � 4c
			 36 � 4c = 0
			 36 = 4c
			 c = 36/4
			 R. c= 9
			 */
			 
			/* Fun��o do 1� grau
			Quest�o: f(x) = -2x + 5
			R. -2x + 5 = 0
			-2x = -5
			x = (-5) : (-2)
			R. x = 2,5 */
			
			/* Fun��o do 1� grau
			Quest�o: f(x) = ax + b, sabendo-se que f(3) = 6 e f (-2) = -3
			f(3) = 6
			f(3) = 3a + b -- 3a + b = 6
			f(-2) = -3
			f(-2) = -2a + b -- -2a + b = -3
			3a + b = 6
			-2a + b = -3
			5a = 9
			R. a = 9/5
			*/
			
			/* Fun��o do 2� grau
			Quest�o: Calcule o valor de k de modo que a fun��o f(x) = 4x� � 4x � k n�o tenha ra�zes, isto �,
			o gr�fico da par�bola n�o possui ponto em comum com o eixo x
			D < 0
			b� � 4ac < 0
			(�4)� � 4 * 4 * (�k) < 0
			16 + 16k < 0
			16k < � 16
			k < �1
			R. O valor de k para que a fun��o n�o tenha ra�zes reais deve ser menor que � 1.
			*/
			
			/* Fun��o do 2� grau
			 * Quest�o: Determine os valores de m, para que a fun��o f(x) = (m � 2)x� � 2x + 6 admita ra�zes reais.
			 * Para essa situa��o temos que D >= 0.
			 * D >= 0
			 * b� � 4ac >= 0
			 * (�2)� � 4 * (m � 2) * 6 >= 0
			 * 4 � 4 * (6m � 12) >= 0
			 * 4 � 24m + 48 >= 0
			 * �24m >= � 48 � 4
			 * �24m >= � 52
			 * 24m <= 52
			 * m <= 52/24
			 * m <= 13/6
			 * R. O valor de m que satisfa�a a condi��o exigida � m <= 13/6.
			 */
			
			/* Polin�mios
			   Quest�o: Sabendo-se que �3 � raiz de P(x) = x� + 4x� - ax + 1, calcule o valor de a.
			   Como foi dito que -3 � raiz do polin�mio, devemos inserir -3 no lugar de x e igualar o polin�mio a zero a fim de obter o valor de a.
			   (-3)3 + 4(-3)2 + -a(-3) + 1 = 0
			   -27 + 36 + 3a + 1 = 0
			   -26 + 36 = -3a
			   10 = -3a
			   a = -10
			        3
			*/
					
		} while (!escolha.equals("1") && !escolha.equals("2"));

		Digita("[MESTRE]: Sheylla, com um estalar de dedos, invoca seu Del Rey 1988\r\n"
				+ "Toninho: Eita, um carro que anda sozinho? � aquele carro do Elton Muska? \r\n"
				+ "Sheylla: N�o, � um Del Rey. J� lhe disse Ant�nio, h� muito mais nessa realidade que tua viv�ncia ordin�ria lhe permite compreender. \r\n"
				+ "\n[MESTRE]: Toninho aceita a resposta de forma silente e ambos entram no Del Rey.\r\n"
				+ "[MESTRE]: Ambos entram no ve�culo com dire��o �s entranhas de Diademmor.\r\n"
				+ "[MESTRE]: Um arco com a inscri��o �Abandonai toda esperan�a, � vos que entrais� chama a aten��o de nosso guerreiro. \r\n"
				+ "\nToninho: � dona Shirley, qual � dessa frase a�?\r\n"
				+ "Sheylla: Pela �ltima vez, � Sheylla, n�o Shirley. Creio que a senten�a tenha sido clara o suficiente.\r\n"
				+ "Sheylla: Esta realidade h� muito abandonada por seu criador virou morada das mais horrendas criaturas e guarda os mais l�gubres segredos.\r\n"
				+ "Sheylla: Prepare-se, meu caro. \r\n", TimeUnit.MILLISECONDS, temp_dialog);

		Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
				+ "Toninho[1]: Criador?\r\n"
				+ "Toninho[2]: Criaturas? \r\n"
				+ "Toninho[3]: Segredos? \r\n", TimeUnit.MILLISECONDS, temp_dialog);
		escolha = entrada.next();

		
		do {
			switch (escolha) {
			case "1":
				Digita("Sheylla: Pouco se sabe sobre ele, mas os boatos s�o de que esta � a �ltima obra de D�dalo antes de sua derrocada. \r\n", TimeUnit.MILLISECONDS, temp_dialog);
				
				Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
						+ "Toninho[1]: Criaturas?\r\n"
						+ "Toninho[2]: Segredos? \r\n", TimeUnit.MILLISECONDS, temp_dialog);
				escolha = entrada.next();
				
				do {
				switch(escolha) {
				case "1":
					Digita("Sheylla: existem 3 grandes criaturas que guardam o segredo dessa masmorra\r\n"
							+ "Sheylla:A Esfinge � um monstro alado com corpo de muher e le�o que afligia a cidade de Tebas, e quem erra seus enigmas � devorado!\r\n"
							+ "Sheylla:O Minotauro, um monstro com cabe�a e cauda de touro e corpo de homem, possue um grande machado e uma for�a fisica descomunal\r\n"
							+ "Sheylla:E a ultima e mais perigosa, Medusa uma criatura do sexo feminino, uma das tr�s G�rgonas, com cabelos de serpente e quem quer que olhe diretamente para ela, vira pedra em instantes\r\n", TimeUnit.MILLISECONDS, temp_dialog);
					
					Digita("\n[MESTRE]: Segredos", TimeUnit.MILLISECONDS, temp_dialog);
					
					Digita("Sheylla: H� boatos de que antes de abandonar Diademmor, o criador escondeu algo de extremo valor (depois pensamos nisso)\r\n", TimeUnit.MILLISECONDS, temp_dialog);
					break;
				case "2":
					Digita("Sheylla: H� boatos de que antes de abandonar Diademmor, o criador escondeu algo de extremo valor (depois pensamos nisso)\r\n", TimeUnit.MILLISECONDS, temp_dialog);
				
					Digita("\n[MESTRE]: Criaturas", TimeUnit.MILLISECONDS, temp_dialog);
					
					Digita("Sheylla: existem 3 grandes criaturas que guardam o segredo dessa masmorra\r\n"
							+ "Sheylla:A Esfinge � um monstro alado com corpo de muher e le�o que afligia a cidade de Tebas, e quem erra seus enigmas � devorado!\r\n"
							+ "Sheylla:O Minotauro, um monstro com cabe�a e cauda de touro e corpo de homem, possue um grande machado e uma for�a fisica descomunal\r\n"
							+ "Sheylla:E a ultima e mais perigosa, Medusa uma criatura do sexo feminino, uma das tr�s G�rgonas, com cabelos de serpente e quem quer que olhe diretamente para ela, vira pedra em instantes\r\n", TimeUnit.MILLISECONDS, temp_dialog);
					break;
					default:
						System.out.println("Op��o Invalida");
						Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
								+ "Toninho[1]: Criaturas?\r\n"
								+ "Toninho[2]: Segredos? \r\n", TimeUnit.MILLISECONDS, temp_dialog);
						escolha = entrada.next();
				}
				}while(!escolha.equals("1") && !escolha.equals("2"));
				break;
			case "2":
				Digita("Sheylla: existem 3 grandes criaturas que guardam o segredo dessa masmorra\r\n"
						+ "Sheylla:A Esfinge � um monstro alado com corpo de muher e le�o que afligia a cidade de Tebas, e quem erra seus enigmas � devorado!\r\n"
						+ "Sheylla:O Minotauro, um monstro com cabe�a e cauda de touro e corpo de homem, possue um grande machado e uma for�a fisica descomunal\r\n"
						+ "Sheylla:E a ultima e mais perigosa, Medusa uma criatura do sexo feminino, uma das tr�s G�rgonas, com cabelos de serpente e quem quer que olhe diretamente para ela, vira pedra em instantes\r\n", TimeUnit.MILLISECONDS, temp_dialog);
				
				Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
						+ "Toninho[1]: Criador?\r\n"
						+ "Toninho[2]: Segredos? \r\n", TimeUnit.MILLISECONDS, temp_dialog);
				escolha = entrada.next();
				do {
				switch(escolha) {
				case "1":
					Digita("Sheylla: Pouco se sabe sobre ele, mas os boatos s�o de que esta � a �ltima obra de D�dalo antes de sua derrocada. \r\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("\n[MESTRE]: Segredos", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Sheylla: H� boatos de que antes de abandonar Diademmor, o criador escondeu algo de extremo valor (depois pensamos nisso)\r\n", TimeUnit.MILLISECONDS, temp_dialog);
					break;
				case "2":
					Digita("Sheylla: H� boatos de que antes de abandonar Diademmor, o criador escondeu algo de extremo valor (depois pensamos nisso)\r\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("\n[MESTRE]: Criador", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Sheylla: Pouco se sabe sobre ele, mas os boatos s�o de que esta � a �ltima obra de D�dalo antes de sua derrocada. \r\n", TimeUnit.MILLISECONDS, temp_dialog);
					break;
					default:
						System.out.println("Op��o Invalida");
						Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
								+ "Toninho[1]: Criador?\r\n"
								+ "Toninho[2]: Segredos? \r\n", TimeUnit.MILLISECONDS, temp_dialog);
						escolha = entrada.next();
				}
				}while(!escolha.equals("1") && !escolha.equals("2"));
				break;
			case "3":
				Digita("Sheylla: H� boatos de que antes de abandonar Diademmor, o criador escondeu algo de extremo valor (depois pensamos nisso)\r\n",TimeUnit.MILLISECONDS, temp_dialog);
				
				Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
						+ "Toninho[1]: Criador?\r\n"
						+ "Toninho[2]: Criaturas? \r\n", TimeUnit.MILLISECONDS, temp_dialog);
				escolha = entrada.next();
				do {
				switch(escolha) {
				case "1":
					Digita("Sheylla: Pouco se sabe sobre ele, mas os boatos s�o de que esta � a �ltima obra de D�dalo antes de sua derrocada. \r\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("\n[MESTRE]: Criatura", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Sheylla: existem 3 grandes criaturas que guardam o segredo dessa masmorra\r\n"
							+ "Sheylla:A Esfinge � um monstro alado com corpo de muher e le�o que afligia a cidade de Tebas, e quem erra seus enigmas � devorado!\r\n"
							+ "Sheylla:O Minotauro, um monstro com cabe�a e cauda de touro e corpo de homem, possue um grande machado e uma for�a fisica descomunal\r\n"
							+ "Sheylla:E a ultima e mais perigosa, Medusa uma criatura do sexo feminino, uma das tr�s G�rgonas, com cabelos de serpente e quem quer que olhe diretamente para ela, vira pedra em instantes\r\n", TimeUnit.MILLISECONDS, temp_dialog);
						break;
				case "2":
					Digita("Sheylla: existem 3 grandes criaturas que guardam o segredo dessa masmorra\r\n"
							+ "Sheylla:A Esfinge � um monstro alado com corpo de muher e le�o que afligia a cidade de Tebas, e quem erra seus enigmas � devorado!\r\n"
							+ "Sheylla:O Minotauro, um monstro com cabe�a e cauda de touro e corpo de homem, possue um grande machado e uma for�a fisica descomunal\r\n"
							+ "Sheylla:E a ultima e mais perigosa, Medusa uma criatura do sexo feminino, uma das tr�s G�rgonas, com cabelos de serpente e quem quer que olhe diretamente para ela, vira pedra em instantes\r\n", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("\n[MESTRE]: Criador", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("Sheylla: Pouco se sabe sobre ele, mas os boatos s�o de que esta � a �ltima obra de D�dalo antes de sua derrocada. \r\n", TimeUnit.MILLISECONDS, temp_dialog);
					break;
						default:
							System.out.println("Op��o Invalida");
							Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
									+ "Toninho[1]: Criador?\r\n"
									+ "Toninho[2]: Criaturas? \r\n", TimeUnit.MILLISECONDS, temp_dialog);
							escolha = entrada.next();
				}
				}while(!escolha.equals("1") && !escolha.equals("2"));
				break;
			default:
				System.out.println("\nOp��o inv�lida!");
				Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
						+ "Toninho[1]: Criador?\r\n" + "Toninho[2]: Criaturas? \r\n" + "Toninho[3]: Segredos? \r\n",
						TimeUnit.MILLISECONDS, temp_dialog);
				escolha = entrada.next();
			}
		} while (!escolha.equals("1") && !escolha.equals("2") && !escolha.equals("3"));

		Digita("[MESTRE]: Toninho digere apreensivamente as novas informa��es... \r\n"
				+ "\nSheylla: Voc� est� bem, Ant�nio? Parece meio... p�lido. \r\n" + "Toninho: Melhor imposs�vel.\r\n"
				+ "Sheylla: Bom, precisarei de voc� atento de agora em diante. \r\n"
				+ "\n[MESTRE]: Ouve-se um estrondo do lado de fora e pouco a pouco o Del Rey come�a a perder velocidade.\r\n"
				+ "\nToninho: AAAAAAAAAAA � O DEM�NIO!!!\r\n" + "Sheylla: RECOMPONHA-SE! \r\n"
				+ "\n[MESTRE]: Sheylla, em sua frieza habitual, estaciona o carro em meio a densa neblina, e sai para checar o que houve. \r\n"
				+ "\nSheylla: Furou o pneu do carro. Voc� deve sair e trocar.\r\n"
				+ "Toninho: E eu que tenho de ficar atento, n�? Deus me ajude... \r\n", TimeUnit.MILLISECONDS,
				temp_dialog);

		// INSERIR AS ALTERNATIVAS NESTE ARRAYLIST. MUDAR O NOME PARA QUEST E O N�MERO DA QUEST�O
		ArrayList<String> quest1 = new ArrayList<String>();
		quest1.add("57");
		quest1.add("-71");
		quest1.add("-7");
		quest1.add("137");
		quest1.add("185");
		
		//COLOCAR O NOVO NOME AQUI TAMB�M 
		Collections.shuffle(quest1);
		Collections.shuffle(quest1);
		Collections.shuffle(quest1);

		// ESSAS VARI�VEIS S�O NECESS�RIAS. SUBSTITUA O N�MERO 1 PELO N�MERO DA QUEST�O
		// CORRESPONDENTE
		int i = 1;
		String resp1;
		String continue1;
		String respSistema1 = null;
		boolean exit1 = false;
		do {
			System.out.println("Sabendo que a largura em mil�metros do Del Rey de Sheylla � 185, determine o valor de x na seguinte express�o:\n"
					+ "(2^4 : 4^2) . (16^1 * 2^3) + x = 185"); //ENUNCIADO DA QUEST�O
			i++;
			System.out.println("a) " + quest1.get(0) + "\n" + "b) " + quest1.get(1) + "\n" + "c) " + quest1.get(2)
					+ "\n" + "d) " + quest1.get(3) + "\n" + "e) " + quest1.get(4) + "\n");
			resp1 = entrada.next().toLowerCase();

			// COLOQUE A ALTERNATIVA CORRETA DENTRO DO .CONTENTEQUALS PARA COMPARA��O
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
				System.out.println("DIGITE UMA OP��O V�LIDA!");
			}

			if (i == 1 && exit1 == true) {
				Digita("[MESTRE]: Seus esfor�os foram bem recompensados! Voc� recebeu uma Itaipava!", TimeUnit.MILLISECONDS, temp_dialog);
				Itaipava = Itaipava + 1;
			}
			if (!(resp1.equals("a") || resp1.equals("b") || resp1.equals("c") || resp1.equals("d")
					|| resp1.equals("e"))) {
				i = i - 1;
			}
			//ESTRUTURA QUE PERMITE O JOGADOR ESCOLHER TENTAR RESPONDER NOVAMENTE OU N�O.
			if (resp1.equals("a") || resp1.equals("b") || resp1.equals("c") || resp1.equals("d")
					|| resp1.equals("e") && i <= 3 && exit1 == false) {
				HP = HP - 10;
				if (respSistema1.equals("ERROOOOOU") && i <= 3) {
					System.out.println("\nTentar novamente?\n1 - SIM\n2 - N�O");
					continue1 = entrada.next();
					if (!continue1.contentEquals("1")) {
						break;
					}
				}
			}

		} while (!exit1 && i <= 3);
		

		Digita("[MESTRE] Ap�s o conserto, Toninho e Sheylla seguem viagem. \r\n"
				+ "Sheylla: N�o foi t�o ruim assim, foi, Ant�nio? \r\n" + "[blablabla]\r\n"
				+ "\n[MESTRE] Ap�s uma breve jornada, Sheylla e Toninho chegam ao destino pretendido. Observa-se uma cratera intranspon�vel � frente, e o conte�do que guarda o outro lado � obstru�do pela ainda densa n�voa.\r\n"
				+ "\nSheylla: Chegamos. Sabe o porqu� de eu traz�-lo aqui, Ant�nio?\r\n"
				+ "Toninho: Nem sei se quero saber...\r\n" + "Sheylla: Preciso que voc� construa uma ponte. \r\n"
				+ "Toninho: O que h� do outro lado? \r\n" + "Sheylla: Nada que voc� precise saber por enquanto. \r\n"
				+ "Toninho: Ouch, grossa. Eu sou pedreiro, n�o engenheiro. Meu neg�cio � bater laje. \r\n"
				+ "Sheylla: Voc� tem o necess�rio. \r\n"
				+ "Toninho: Se voc� est� dizendo... Mas como espera que eu construa uma ponte sem recursos ou m�o de obra?\r\n"
				+ "Sheylla: Voc� ter� toda a m�o de obra necess�ria a seu dispor. Quanto aos materiais, eu o instruirei de onde ach�-los por Diademmor.\r\n"
				+ "\n[MESTRE] Sheylla entrega um mapa nas m�os de Toninho e ele analisa o mesmo atentamente.\r\n"
				+ "\nSheylla: Neste primeiro momento, o conduzirei ao nosso primeiro local de busca para que tenha a m�nima no��o do que ir� enfrentar. O resto ficar� a seu encargo.\r\n"
				+ "Toninho: Que Deus me ajude... \r\n"
				+ "\n[MESTRE] Toninho, agora ciente e quase conformado de seu destino, segue uma curta viagem com Sheylla.\r\n"
				+ "\n[10 minutos depois...]\r\n"
				+ "\n[MESTRE] Toninho e Sheylla chegam em uma rua sem sa�da, com um pr�dio aparentemente abandonado no fim desta. \r\n"
				+ "\nToninho: O que encontraremos aqui?\r\n"
				+ "Sheylla: Os boatos s�o de que aqui est� guardado o projeto original da ponte, este � o primeiro passo. \r\n"
				+ "Toninho: E como espera que eu interprete esse projeto? Minha senhora, minhas habilidades matem�ticas s�o restritas � divis�o da conta do bar.\r\n"
				+ "Sheylla: N�o se preocupe, h� algu�m que ir� auxili�-lo. \r\n"
				+ "\n[MESTRE] Em meio a n�voa, surge uma ave que voa em dire��o ao her�i. \r\n"
				+ "\nSheylla: Falando neste algu�m, a� vem. \r\n" + "[MESTRE] A ave pousa nos ombros de Sheylla. \r\n"
				+ "Ave[Perdix]: E chega-se o momento que todos esper�vamos. \r\n" + "Sheylla: De fato.\r\n"
				+ "Toninho: Isso � um papagaio? \r\n"
				+ "Ave[Perdix]: ... era esse humano med�ocre a quem est�vamos � espera?  \r\n"
				+ "Sheylla: Sim, o pr�prio. \r\n"
				+ "Toninho: Qual foi dona Sheylla, vai deixar esse papagaio me ofender desse jeito? \r\n"
				+ "Ave[Perdix]: Eu sou um perdiz e n�o um papagaio, seu iletrado. Nunca ouvira da lenda de Perdix, sobrinho de D�dalo?  \r\n"
				+ "Toninho: N�o conhe�o e n�o ligo, s� sei que vai voc� virar frango a passarinho se continuar com gracinha. \r\n"
				+ "\n[MESTRE] A discuss�o � interrompida por um som de trotes oriundos do pr�dio abandonado. Emerge da escurid�o dos corredores uma criatura com corpo de le�o e cabe�a de mulher, conhecida como Esfinge. Perdix, ao notar a criatura, al�a voo e abandona Sheylla e Toninho a sua pr�pria sorte. \r\n"
				+ "\nToninho: Estou b�bado ainda ou...\r\n" + "Sheylla: CALADO. Deixe-me cuidar disso.\r\n"
				+ "Esfinge: O QUE PROCURAS AQUI?\r\n" + "Sheylla: Viemos em busca do projeto para...\r\n"
				+ "Esfinge: CALADA, DIRIGI A PALAVRA AO MORTAL QUE VOS ACOMPANHA. \r\n", TimeUnit.MILLISECONDS,
				temp_dialog);

		Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n" + "[1] Diplomacia\r\n"
				+ "[2] Sair no soco com a Esfinge.\r\n"
				+ "Toninho estar� munido de um tijolo que achou entre os escombros.\r\n", TimeUnit.MILLISECONDS,
				temp_dialog);
		escolha = entrada.next();

		do {
			switch (escolha) {
			case "1":
				System.out.println(" - Resolver uma quest�o proposta pela Esfinge.");
				break;
			case "2":
				Digita("[MESTRE]: Toninho, num instinto de sobreviv�ncia tipicamente brasileiro resolveu enfrentar a Esfinge. Valeu-se de um tijolo que estava perto e num �timo de desespero, atirou-o contra a criatura.",
						TimeUnit.MILLISECONDS, temp_dialog);
				System.out.println("Lan�ando o dado de 20 lados(D20)...");
				Thread.sleep(1000);
				System.out.println("Resultado: " + D20);

				if (D20 >= 1 && D20 <= 10) {
					Digita("", TimeUnit.MILLISECONDS, temp_dialog);
					// Toninho erra a tijolada, � atacado por Esfinge e perde 20 pontos de vida.
					// Sheylla interv�m.
					HP = HP - 20;
				} else if (D20 > 10 && D20 <= 15) {
					Digita("", TimeUnit.MILLISECONDS, temp_dialog);
					// A tijolada � suficiente para nocautear a Esfinge temporariamente.
				} else if (D20 > 15) {
					Digita("", TimeUnit.MILLISECONDS, temp_dialog);
					// A tijolada mata a Esfinge.

				}

			}

		} while (!escolha.equals("1") && !escolha.equals("2"));

		Digita("[MESTRE]: Ap�s os acontecimentos, Sheylla e Toninho adentram o pr�dio.\r\n"
				+ "[MESTRE]: � um ambiente mal iluminado, mas pode-se notar v�rias salas e lances de escada que levam aos andares superiores.\r\n"
				+ "\nSheylla: Acho mais prudente nos separarmos, seremos mais r�pidos desta forma. \r\n"
				+ "Toninho: E se eu encontrar alguma outra criatura? \r\n"
				+ "Sheylla: A Esfinge era a �nica guardi� destas ru�nas, voc� ficar� bem... eu acho.\r\n"
				+ "Sheylla: Em todo caso, valha-se de alguma arma se achar, pode ser de grande valia. Em �ltimo caso, corra. H� uma mir�ade de op��es. \r\n"
				+ "Toninho: Voc� sabe muito bem como tranquilizar algu�m... \r\n"
				+ "Sheylla: Confia. Procure por um papiro ou qualquer outra coisa que se assemelhe a isso. \r\n"
				+ "Toninho: Papiro? \r\n"
				+ "Sheylla: Um pergaminho, Ant�nio. Apenas procure por algo que pare�a um papel."
				+ " Cheque toda e qualquer sala e encontre-me na entrada do pr�dio quando terminar. Recomendo que comece pelo piso superior. \r\n"
				+ "Toninho: Ok, mas se aparecer alguma outra criatura diga adeus ao seu Del Rey.\r\n"
				+ "Sheylla: Justo. \r\n"
				+ "\n[MESTRE]: E assim eles se separam. Toninho, ainda abalado com tudo que sucedera momentos antes, cantarola para se encorajar enquanto perambula pelos soturnos corredores. \r\n"
				+ "\nToninho: Entra na minha casaaa, entra na minha vidaaa, mexe com minha estrutura...\r\n"
				+ "\n[MESTRE] Ap�s a infrut�fera checagem de v�rias salas e descendo em dire��o a outro andar, uma voz misteriosa ascende em meio a escurid�o.\r\n"
				+ "\nVoz: Cuida-te com aqueles a quem tu depositas tua confian�a. \r\n"
				+ "Toninho: T� REPREENDIDO EM NOME DO SENHOR, QUEM EST� A�? \r\n"
				+ "Voz: Logo saber�s... n�o sou eu aquele a quem tu deves temer.\r\n"
				+ "Toninho: EU TE COMANDO E ORDENO SATAN�S, MOSTRA TUA FACE\r\n" + "Voz: Logo...\r\n"
				+ "\n[MESTRE]: T�o misteriosamente quanto surgiu, a voz se esvai pelos longos corredores, apenas contribuindo para a tens�o do pedreiro. \r\n"
				+ "\nToninho: AL�...? ... U�.\r\n"
				+ "\n[MESTRE] Algo neste corredor chama a aten��o do her�i. Uma porta distinta de qualquer outra que tenha visto neste edif�cio, com o batente e a ma�aneta feitas em ouro puro, n�o por acaso atrativas � vista. \r\n"
				+ "\nToninho: Interessante... parece que h� algo escrito. \r\n"
				+ "���Tens o que � necess�rio para abrir a minha porta? ���\r\n", TimeUnit.MILLISECONDS, temp_dialog);

		// desafio 2

		Digita("[MESTRE]: A porta se abre lentamente e revela apenas uma incessante escurid�o. \r\n" + "Toninho: \r\n"
				+ "[MESTRE] Toninho se apossa do pergaminho e encontra um bilhete entre este\r\n"
				+ "\n��� Este pergaminho cont�m apenas metade daquilo que projetei, e o local em que se encontra a outra metade cair� no esquecimento assim como eu, ao decorrer do tempo. Prefiro a morte a permitir que minhas obras sejam usadas para prop�sitos escusos. \r\n"
				+ "Dirijo-me agora a ti, � ser perspicaz que fora capaz de evadir-se da criatura que guarda este solo e ao mesmo tempo desvendar o enigma que, como �ltimo recurso, guardava estes segredos. \r\n"
				+ "Sa�do-te. Fora suficientemente sagaz at� aqui, mas duvido que esteja � altura do que o destino lhe reserva. \r\n"
				+ "- D�dalo ���\r\n"
				+ "Toninho: Ser� que � o mesmo homem, tio daquela pomba que conheci mais cedo? � mundinho estranho.\r\n"
				+ "\n[MESTRE] Toninho, com a obra em m�os, dirige-se � sa�da onde encontra Sheylla com um ar de quem falhou em seu objetivo.\r\n"
				+ "\nToninho: � dona Shirlley, veja se � isso o que voc� queria. \r\n"
				+ "Sheylla: Devo admitir Ant�nio, voc� excedeu minhas expectativas! At� pensei que estaria mor... er... digo, mortificado pela arquitetura do pr�dio. \r\n"
				+ "Toninho: Que nada, j� constru� casa muito �mais melhor� que isso. � detalhe nas aspas\r\n"
				+ "Sheylla: Tenho certeza que sim.\r\n" + "Toninho: Tamb�m achei esse bilhete no meio.\r\n"
				+ "\n[MESTRE]: Sheylla silencia-se enquanto l� atentamente. \r\n"
				+ "\nSheylla: Aqui diz que isso � apenas uma parte do projeto. \r\n"
				+ "Toninho: � o que diz. Sabe onde pode estar a outra parte? \r\n"
				+ "Sheylla: Tenho uma ideia, mas caber� a ti obt�-lo. \r\n" + "Toninho: S� achei algo estranho...\r\n"
				+ "Sheylla: O que seria?\r\n"
				+ "Toninho: Uma voz falou comigo. N�o sei se aconteceu de verdade ou ainda � efeito das cervejas da noite anterior, mas... \r\n"
				+ "Sheylla: E o que essa voz disse? \r\n"
				+ "Toninho: Alguma coisa sobre confiar no meu potencial eu acho, n�o lembro direito pois me assustei um pouco.\r\n"
				+ "Sheylla: Conte-me mais. \r\n"
				+ "Toninho: Mas eu me impus e chamei ele pra briga, n�o fui um covarde. Ah, e esse cheiro estranho n�o est� vindo de mim n�o. \r\n"
				+ "Sheylla: Meu her�i. Creio que tenha provado o seu valor hoje, poder� descansar por hoje se quiser. \r\n",
				TimeUnit.MILLISECONDS, temp_dialog);

		Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
				+ "[1 - DESCANSAR] Nois � merecedor. \r" + "+ 10HP\r\n"
				+ "[2 � PROSSEGUIR] Confia que o pai t� monstro.\r\n"
				+ "O jogador receber� um �buff� no seu ataque ou na defesa, vou analisar melhor depois.\r\n",
				TimeUnit.MILLISECONDS, temp_dialog);
		escolha = entrada.next();

		do {
			switch (escolha) {
			case "1":
				Digita("[MESTRE]: Toninho e Sheylla entram no Del Rey, e Toninho aproveita a viagem para descansar seus olhos.\r\n"
						+ "[MESTRE]:Nosso her�i dorme tranquilo, apesar de tudo que vivenciou nestas �ltimas horas.\r\n"
						+ "\n[ALGUMAS HORAS DEPOIS...]\r\n", TimeUnit.MILLISECONDS, temp_dialog);
				HP = HP + 10;
				break;
			case "2":
				Digita("Else if (escolha == 2) {\r\n"
						+ "[MESTRE]: Toninho e Sheylla entram no Del Rey em rumo � sua pr�xima aventura\r\n"
						+ "Sheylla: Creio que voc� mere�a uma recompensa. Olhe no banco de tr�s, tenho uma surpresa para ti.\r\n"
						+"Toninho: UMA ITAIPAVA? MAS RAPAZ, ERA TUDO O QUE EU ESTAVA PRECISANDO!\r\n"
						+"[MESTRE]: Toninho degusta aquela cerveja como se fosse a melhor que bebera em toda sua vida enquanto da vidra�a do Del Rey"
						+" observa a ca�tica paisagem que se condensa para ser vista depressa.\r\n",
						TimeUnit.MILLISECONDS, temp_dialog);
				break;
			default:
				System.out.println("\nOp��o inv�lida!");
				Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
						+ "[1 - DESCANSAR] Nois � merecedor. \r" + "+ 10HP\r\n"
						+ "[2 � PROSSEGUIR] Confia que o pai t� monstro.\r\n"
						+ "O jogador receber� um �buff� no seu ataque ou na defesa, vou analisar melhor depois.\r\n",
						TimeUnit.MILLISECONDS, temp_dialog);
				escolha = entrada.next();
			}

		} while (!escolha.equals("1") && !escolha.equals("2"));
		
		Digita("Horas se passam, e ao momento que ambos chegam em seu pr�ximo destino, a escurid�o da noite j� come�a a pairar.\r\n"
				+"Sheylla: Ant�nio, creio que esteja mais ou menos inteirado dos perigos que aqui habitam. De agora em diante voc� dever�"
				+"prosseguir sozinho.\r\n"
				+"Toninho: A senhora n�o vir� por qu�?\r\n"
				+"Sheylla: � que... �... hm... eu tenho coisas a fazer. Estou contando com sua bravura.\r\n"
				+"[MESTRE]: Sheylla sai do carro e vai em dire��o ao porta-malas. Toninho ouve os passos e percebe que ela retorna com algo em m�os."
				+"Sheylla: Leve isso contigo, creio que lhe ser� �til.\r\n"
				+"Toninho: Um machado, dona Sheylla? Para que eu precisaria disso?\r\n"
				+"Sheylla: Eu pensei que voc� j� estivesse ciente do porqu�... E n�o � um machado qualquer, dizem que pertenceu a Hefesto, filho de Zeus e ferreiro dos deuses.\r\n"
				+"Toninho: Voc� tem o zapzap dele? Estava precisando de uma grelha nova para minha churrasqueira.\r\n"
				+"Sheylla: Zapzap? O que?\r\n"
				+"Toninho: U� dona Sheylla, aquele neg�cio do celular que...\r\n"
				+"Sheylla: SIL�NCIO! FOCO! Voc� me distraiu tanto que at� perdi o fio da meada\r\n"
				+"Toninho: Mas...\r\n"
				+"Sheylla: SEM MAIS!\r\n"
				+"Toninho: Perd�o pelo vacilo, dona Sheylla.\r\n"
				+"Sheylla: Enfim, o que eu estava dizendo mesmo... Isso, sobre o machado. Ser� �til. J� enfatizei que h� criaturas por todos os cantos e dessa vez"
				+ "n�o estarei aqui para te defender. N�o abaixe sua guarda em nenhum momento.\r\n"
				+"Toninho: Sim, senhora. S� mais uma coisa...\r\n"
				+"Sheylla: O que?\r\n"
				+"[MESTRE]: Um breve momento de tens�o e sil�ncio se passa e os olhares de ambos se cruzam, antes que nosso her�i quebre-o com sua pergunta.\r\n"
				,TimeUnit.MILLISECONDS, temp_dialog);
		Thread.sleep(700);
		Digita("Toninho: N�o tem uma Itaipavinha pra 'nois' a� n�o?\r\n"
				+"Sheylla: MAS QUE DIABOS! E EU ESPERANDO QUE FOSSE ALGO S�RIO! J� nem sei por que eu ainda me impressiono com sua futilidade.\r\n"
				+"Toninho: Mas e a�, tem?\r\n"
				+"Sheylla: N�O! V� LOGO!\r\n"
				+"Toninho: Ouch, mas n�o precisava gritar tamb�m!\r\n"
				+"Sheylla: Fa�a tua parte e eu providenciarei, est� bom assim?\r\nnnnn"
				+"Toninho: Justo.\r\n"
				+"Sheylla: Boa sorte.\r\n"
				+"[MESTRE]: Sheylla entra em seu Del Rey e volta pelo mesmo caminho que percorrera anteriormente, enquanto Toninho observa os far�is "
				+"se estreitarem na escurid�o.\r\n"
				+"[MESTRE]: Agora sozinho, o her�i contempla o bosque dentre as ru�nas a sua frente e se indaga sobre as prova��es vindouras, lembrando-se de uma "
				+"can��o que o conforta nos momentos de soledade.\r\n"
				+"Toninho: Acrediteeeei no seu amor, e olha s� como estooooou...\r\n"
				+"Toninho: SOZINHOOOO, SOZINHOOOO... CHEGA DE TANTAS MENTIRAS, CHEGA DE BRINCAR COM MEU AMOR\r\n"
				+"* CRACK *\r\n"
				+"[MESTRE]: A cantoria � subitamente interrompida por um som de galhos quebrando em meio ao aparentemente in�spito bosque, assustando o pobre pedreiro.\r\n"
				+"Toninho: AAAAAAAAAAAAAAAAAA!\r\n"
				+"Toninho: QUEM EST� A�? 'TEJE' CIENTE DE QUE TENHO UM MACHADO E N�O TENHO MEDO DE US�-LO!\r\n"
				+"* CRACK CRACK CRACK *\r\n"
				+"Toninho: REVELA TUA FACE, TINHOSO!\r\n"
				+"[MESTRE]: O som misterioso se dissipa, mas a tens�o se mant�m. Agora alerta, Tonihno adentra as ru�nas com o machado em m�os, "
				+"preparado para enfrentar o que quer que seja que o destino lhe reserva.\r\n",TimeUnit.MILLISECONDS, temp_dialog);
		

	}

	static void capitulo_2() {

	}

	static void capitulo_3() {

	}

	// CR�DITOS FINAIS
	static void creditos() throws Exception {

		Digita(".::: CR�DITOS :::.\n> Alex Gama\n> Bruno Souza\n> Rafael Pereira Elias\n> Ruy Menezes \n",
				TimeUnit.MILLISECONDS, temp_dialog);
		menu();
	}

	// M�TODO PARA DELAY NAS MENSAGENS
	public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
		for (char caractere : mensagem.toCharArray()) {
			System.out.print(caractere);
			unit.sleep(tempo_mensagem);
		}
	}
}