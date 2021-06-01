package RPG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Teste para fazer pull
		
		//Teste 13_05
		//desafioC2I();
		//desafioC2II();
		//desafioC2III();
		//desafioC3I();
		batalhaMino();
	}
	
	
	public static void desafioC2I() {
		
		Scanner entrada = new Scanner(System.in);
		boolean acertou = false;
		int contador = 0;
		String alternativa;
		ArrayList<String> r = new ArrayList<String>();
		r.add("Literal -  x / a^2 b^2 / x^2 x \n"
				+ "Coficiente - 3 / 1 1 / 1 3 7\n"); // resposta correta
		r.add("Literal -  3 / y^2 a^2 / 2^6 t \n"
				+ "Coficiente - x / 2 0 / a b c\n");
		r.add("Literal -  3 / 1 1 / 1 3 7 \n"
				+ "Coficiente - x / a^2 b^2 / x^2 x\n");
		r.add("Literal -  3x / 2a^2 1^2 / 0^2 1 \n"
				+ "Coficiente - 3 / 0 0 / x c 7\n");
		r.add("Literal -  0 / a b / x x \n"
				+ "Coficiente - 2 / 1 1 / 1 3\n");
		
		do {
			
		System.out.println("Os polinômios são expressões algébricas formadas por números (coeficientes) e letras (partes literais).\r\n "
				+ "Sabendo disso determine quais são as parte literais e os coefiencias das expressôes:\r\n"
				+ "3x / a^2 - b^2 / x^2 + 3x + 7 \n");
		System.out.println("a) " +r.get(0)); 
		System.out.println("b) " +r.get(1));
		System.out.println("c) " +r.get(2));
		System.out.println("d) " +r.get(3));
		System.out.println("e) " +r.get(4));
		System.out.print("\nEscolha uma alternativa: ");
		alternativa = entrada.next();
		
		switch (alternativa) {
		
		case "a":
		case "A":	
			if(r.get(0) == "Literal -  x / a^2 b^2 / x^2 x \n"
					+ "Coficiente - 3 / 1 1 / 1 3 7\n") {
				System.out.println("Resposta correta!\n");
				acertou = true;
				contador = contador + 1;
				}else {
				System.out.println("Resposta incorreta!\n");
				contador = contador + 1;
				Collections.shuffle(r);
				}
			break;
		case "b":
		case "B":
			if(r.get(1) == "Literal -  x / a^2 b^2 / x^2 x \n"
					+ "Coficiente - 3 / 1 1 / 1 3 7\n") {
				System.out.println("Resposta correta!\n");
				acertou = true;
				contador = contador + 1;
				}else {
				System.out.println("Resposta incorreta!\n");
				contador = contador + 1;
				Collections.shuffle(r);
				}
			break;
		case "c":
		case "C":
			if(r.get(2) == "Literal -  x / a^2 b^2 / x^2 x \n"
					+ "Coficiente - 3 / 1 1 / 1 3 7\n") {
				System.out.println("Resposta correta!\n");
				acertou = true;
				contador = contador + 1;
				}else {
				System.out.println("Resposta incorreta!\n");
				contador = contador + 1;
				Collections.shuffle(r);
				}
			break;
		case "d":
		case "D":
			if(r.get(3) == "Literal -  x / a^2 b^2 / x^2 x \n"
					+ "Coficiente - 3 / 1 1 / 1 3 7\n") {
				System.out.println("Resposta correta!\n");
				acertou = true;
				contador = contador + 1;
				}else {
				System.out.println("Resposta incorreta!\n");
				contador = contador + 1;
				Collections.shuffle(r);
				}
			break;
		case "e":
		case "E":
			if(r.get(4) == "Literal -  x / a^2 b^2 / x^2 x \n"
					+ "Coficiente - 3 / 1 1 / 1 3 7\n") {
			System.out.println("Resposta correta!\n");
			acertou = true;
			contador = contador + 1;
			}else {
			System.out.println("Resposta incorreta!\n");
			contador = contador + 1;
			Collections.shuffle(r);
			}
		break;
		
		default:
		System.out.println("Escolha invalida!\n");
		contador = contador + 1;
		Collections.shuffle(r);
		}
		
		} while (!acertou && contador < 3);
		if (acertou) {
		System.out.println("Você acertou na " + contador + " tentativa!");
		} else {
		System.out.println("Resposta incorreta nas 3 tentativas!");
		}
		}
	
	public static void desafioC2II() {

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
			
		System.out.println("Os polinômios são formados por termos.\n"
				+ "A única operação entre os elementos de um termo é a multiplicação"
				+ "chegando em até 3 termos sendo  monomio(1 termo), binomio(2 termos) e trinomo(3 termos).\n"
				+ "Sabendo disso termine qual é o polinomio das expressões:\n"
				+ "3x+y / 3ab-4xy-10y / 5abc\n");
		System.out.println("a) " +r.get(0)); 
		System.out.println("b) " +r.get(1));
		System.out.println("c) " +r.get(2));
		System.out.println("d) " +r.get(3));
		System.out.println("e) " +r.get(4));
		System.out.print("\nEscolha uma alternativa: ");
		alternativa = entrada.next();
		
		switch (alternativa) {
		
		case "a":
		case "A":	
			if(r.get(0) == "Binômio / Trinômio / Monômio") {
				System.out.println("Resposta correta!\n");
				acertou = true;
				contador = contador + 1;
				}else {
				System.out.println("Resposta incorreta!\n");
				contador = contador + 1;
				Collections.shuffle(r);
				}
			break;
		case "b":
		case "B":
			if(r.get(1) == "Binômio / Trinômio / Monômio") {
				System.out.println("Resposta correta!\n");
				acertou = true;
				contador = contador + 1;
				}else {
				System.out.println("Resposta incorreta!\n");
				contador = contador + 1;
				Collections.shuffle(r);
				}
			break;
		case "c":
		case "C":
			if(r.get(2) == "Binômio / Trinômio / Monômio") {
				System.out.println("Resposta correta!\n");
				acertou = true;
				contador = contador + 1;
				}else {
				System.out.println("Resposta incorreta!\n");
				contador = contador + 1;
				Collections.shuffle(r);
				}
			break;
		case "d":
		case "D":
			if(r.get(3) == "Binômio / Trinômio / Monômio") {
				System.out.println("Resposta correta!\n");
				acertou = true;
				contador = contador + 1;
				}else {
				System.out.println("Resposta incorreta!\n");
				contador = contador + 1;
				Collections.shuffle(r);
				}
			break;
		case "e":
		case "E":
			if(r.get(4) == "Binômio / Trinômio / Monômio") {
			System.out.println("Resposta correta!\n");
			acertou = true;
			contador = contador + 1;
			}else {
			System.out.println("Resposta incorreta!\n");
			contador = contador + 1;
			Collections.shuffle(r);
			}
		break;
		
		default:
		System.out.println("Escolha invalida!");
		contador = contador + 1;
		Collections.shuffle(r);
		}
		
		} while (!acertou && contador < 3);
		if (acertou) {
		System.out.println("Voc� acertou na " + contador + " tentativa!");
		} else {
		System.out.println("Resposta incorreta nas 3 tentativas!");
		}
		}
	
	public static void desafioC2III() {
	
		Scanner entrada = new Scanner(System.in);
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
			
		System.out.println("Some os polinômios:\n"
				+ "a(x)=2x^3+2x^2-3x+1\n"
				+ "b(x)=x^3+3x^2-2x+2\n");
		System.out.println("a) " +r.get(0)); 
		System.out.println("b) " +r.get(1));
		System.out.println("c) " +r.get(2));
		System.out.println("d) " +r.get(3));
		System.out.println("e) " +r.get(4));
		System.out.print("\nEscolha uma alternativa: ");
		alternativa = entrada.next();
		
		switch (alternativa) {
		
		case "a":
		case "A":	
			if(r.get(0) == "3x^3+5x^2-5x+3") {
				System.out.println("Resposta correta!\n");
				acertou = true;
				contador = contador + 1;
				}else {
				System.out.println("Resposta incorreta!\n");
				contador = contador + 1;
				Collections.shuffle(r);
				}
			break;
		case "b":
		case "B":
			if(r.get(1) == "3x^3+5x^2-5x+3") {
				System.out.println("Resposta correta!\n");
				acertou = true;
				contador = contador + 1;
				}else {
				System.out.println("Resposta incorreta!\n");
				contador = contador + 1;
				Collections.shuffle(r);
				}
			break;
		case "c":
		case "C":
			if(r.get(2) == "3x^3+5x^2-5x+3") {
				System.out.println("Resposta correta!\n");
				acertou = true;
				contador = contador + 1;
				}else {
				System.out.println("Resposta incorreta!\n");
				contador = contador + 1;
				Collections.shuffle(r);
				}
			break;
		case "d":
		case "D":
			if(r.get(3) == "3x^3+5x^2-5x+3") {
				System.out.println("Resposta correta!\n");
				acertou = true;
				contador = contador + 1;
				}else {
				System.out.println("Resposta incorreta!\n");
				contador = contador + 1;
				Collections.shuffle(r);
				}
			break;
		case "e":
		case "E":
			if(r.get(4) == "3x^3+5x^2-5x+3") {
			System.out.println("Resposta correta!\n");
			acertou = true;
			contador = contador + 1;
			}else {
			System.out.println("Resposta incorreta!\n");
			contador = contador + 1;
			Collections.shuffle(r);
			}
		break;
		
		default:
		System.out.println("\nEscolha invalida!");
		contador = contador + 1;
		Collections.shuffle(r);
		}
		
		} while (!acertou && contador < 3);
		if (acertou) {
		System.out.println("Você acertou na " + contador + " tentativa!");
		} else {
		System.out.println("Resposta incorreta nas 3 tentativas!");
		}
	}
	
	public static void desafioC3I() {
		
		Scanner entrada = new Scanner(System.in);
		boolean acertou = false;
		int contador = 0;
		String alternativa;
		ArrayList<String> r = new ArrayList<String>();
		r.add("11000111 e FA"); // resposta correta
		r.add("11100111 e F9");
		r.add("11010111 e FA");
		r.add("11000111 e F9	");
		r.add("11100111 e FA.");
		
		do {
			
		System.out.println("Os numeros decimais 199 e 250 correspondem,\n"
				+ "nos sistemas binario e hexadecimal, as seguintes representações:");
		System.out.println("a) " +r.get(0)); 
		System.out.println("b) " +r.get(1));
		System.out.println("c) " +r.get(2));
		System.out.println("d) " +r.get(3));
		System.out.println("e) " +r.get(4));
		System.out.print("\nEscolha uma alternativa: ");
		alternativa = entrada.next();
		
		switch (alternativa) {
		
		case "a":
		case "A":	
			if(r.get(0) == "11000111 e FA") {
				System.out.println("Resposta correta!\n");
				acertou = true;
				contador = contador + 1;
				}else {
				System.out.println("Resposta incorreta!\n");
				contador = contador + 1;
				Collections.shuffle(r);
				}
			break;
		case "b":
		case "B":
			if(r.get(1) == "11000111 e FA") {
				System.out.println("Resposta correta!\n");
				acertou = true;
				contador = contador + 1;
				}else {
				System.out.println("Resposta incorreta!\n");
				contador = contador + 1;
				Collections.shuffle(r);
				}
			break;
		case "c":
		case "C":
			if(r.get(2) == "11000111 e FA") {
				System.out.println("Resposta correta!\n");
				acertou = true;
				contador = contador + 1;
				}else {
				System.out.println("Resposta incorreta!\n");
				contador = contador + 1;
				Collections.shuffle(r);
				}
			break;
		case "d":
		case "D":
			if(r.get(3) == "11000111 e FA") {
				System.out.println("Resposta correta!\n");
				acertou = true;
				contador = contador + 1;
				}else {
				System.out.println("Resposta incorreta!\n");
				contador = contador + 1;
				Collections.shuffle(r);
				}
			break;
		case "e":
		case "E":
			if(r.get(4) == "11000111 e FA") {
			System.out.println("Resposta correta!\n");
			acertou = true;
			contador = contador + 1;
			}else {
			System.out.println("Resposta incorreta!\n");
			contador = contador + 1;
			Collections.shuffle(r);
			}
		break;
		
		default:
		System.out.println("\nEscolha invalida!");
		contador = contador + 1;
		Collections.shuffle(r);
		}
		
		} while (!acertou && contador < 3);
		if (acertou) {
		System.out.println("Você acertou na " + contador + " tentativa!");
		} else {
		System.out.println("Resposta incorreta nas 3 tentativas!");
		}
		
		
	}
	
	public static void batalhaMino() {
		int hpMino = 100, hp = 100;
		
		Scanner entrada = new Scanner(System.in);
		int d20 = new Random().nextInt(20) + 1;
		int d6 = new Random().nextInt(6) + 1;
		//int d20 = rand.nextInt(21); // DADO DE 20 FACES - GLOBAL
		//int d6 = rand.nextInt(7); // DADO DE 6 FACES - GLOBAL

		System.out.println(d6);
		System.out.println(d20);
		
		System.out.println("[MESTRE]:Toninho entra na porta final e ve aquela criatura se alimentando de um pigmeu\n"
				+ "\nToninho: kkk eae man! \n"
				+ "\n[MESTRE]: O minotauro volta seu olhar para o Toninho e berra\n"
				+ "Minotauro: hahahaha! Opa parece que chegou a sobremesa\n"
				+ "Toninho: Mas o que é isso!\n"
				+ "\n[MESTRE]: Minotauro anvaça em direção ao toninho com seu machado! ");
		
		System.out.println("Escolha:\n"
				+ "[1 - jogar os dados]\n"
				+ "[2 - Usar item]\n");
		String escolha = entrada.next();
		
		do {
			int n;
		switch(escolha) {
		case "1":
			n = d20;
			System.out.println(n);
			if(n >= 15 && n <= 20) {
				System.out.println("[MESTRE]: Toninho esquiva do ataque do minotauro passando por de baixo de suas pernas e acerta um golpe certeiro na bunda do minotauro o fazendo cair\n"
						+ "[MESTRE]: Toninho aproveita a oportunidade e decepa a cabeça da criatura\n ");
				break;
			}else if(n >= 10 && n < 15) {
				System.out.println("[MESTRE]: Toninho esquiva do ataque do minotauro passando por de baixo de suas pernas e acerta um golpe certeiro na bunda do minotauro o fazendo cair\n"
						+ "[MESTRE]: Toninho vai finalizar a criatura, mas escorrega e da tempo do minotauro se levantar\n");
				hpMino = hpMino - 50;
				
				System.out.println("Escolha:\n"
						+ "[1 - jogar os dados]\n"
						+ "[2 - Usar item]\n");
				String decisao = entrada.next();
				
				do {
					switch(decisao) {
					case "1":
						n = d20;
						System.out.println(n);
						if(n >= 10 && n <= 20) {
							System.out.println("[MESTRE]: Minotauro enfurecido pega seu machado em tenta acertar o Toninho, mas o mesmo consegue esquivar e decepa a criatura");
							break;
						}else if(n >= 0 && n < 10) {
							System.out.println("[MESTRE]: ");
						}
							break;
							case "2":
								
						}
					
				}while(!decisao.equals("1") && !decisao.equals("2"));
			}
			
		}
		}while(!escolha.equals("1") && !escolha.equals("2"));
		
	}
	}