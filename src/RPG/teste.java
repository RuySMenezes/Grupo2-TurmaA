package RPG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Teste para fazer pull

		// Teste 13_05
		// desafioC2I();
		// desafioC2II();
		// desafioC2III();
		// desafioC3I();
		batalhaMino();
	}

	public static void desafioC2I() {

		Scanner entrada = new Scanner(System.in);
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

			System.out.println(
					"Os polinômios são expressões algébricas formadas por números (coeficientes) e letras (partes literais).\r\n "
							+ "Sabendo disso determine quais são as parte literais e os coefiencias das expressôes:\r\n"
							+ "3x / a^2 - b^2 / x^2 + 3x + 7 \n");
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
					contador = contador + 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador + 1;
					Collections.shuffle(r);
				}
				break;
			case "b":
			case "B":
				if (r.get(1) == "Literal -  x / a^2 b^2 / x^2 x \n" + "Coficiente - 3 / 1 1 / 1 3 7\n") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador + 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador + 1;
					Collections.shuffle(r);
				}
				break;
			case "c":
			case "C":
				if (r.get(2) == "Literal -  x / a^2 b^2 / x^2 x \n" + "Coficiente - 3 / 1 1 / 1 3 7\n") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador + 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador + 1;
					Collections.shuffle(r);
				}
				break;
			case "d":
			case "D":
				if (r.get(3) == "Literal -  x / a^2 b^2 / x^2 x \n" + "Coficiente - 3 / 1 1 / 1 3 7\n") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador + 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador + 1;
					Collections.shuffle(r);
				}
				break;
			case "e":
			case "E":
				if (r.get(4) == "Literal -  x / a^2 b^2 / x^2 x \n" + "Coficiente - 3 / 1 1 / 1 3 7\n") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador + 1;
				} else {
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
					+ "Sabendo disso termine qual é o polinomio das expressões:\n" + "3x+y / 3ab-4xy-10y / 5abc\n");
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
					contador = contador + 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador + 1;
					Collections.shuffle(r);
				}
				break;
			case "b":
			case "B":
				if (r.get(1) == "Binômio / Trinômio / Monômio") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador + 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador + 1;
					Collections.shuffle(r);
				}
				break;
			case "c":
			case "C":
				if (r.get(2) == "Binômio / Trinômio / Monômio") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador + 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador + 1;
					Collections.shuffle(r);
				}
				break;
			case "d":
			case "D":
				if (r.get(3) == "Binômio / Trinômio / Monômio") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador + 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador + 1;
					Collections.shuffle(r);
				}
				break;
			case "e":
			case "E":
				if (r.get(4) == "Binômio / Trinômio / Monômio") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador + 1;
				} else {
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

			System.out.println("Some os polinômios:\n" + "a(x)=2x^3+2x^2-3x+1\n" + "b(x)=x^3+3x^2-2x+2\n");
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
					contador = contador + 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador + 1;
					Collections.shuffle(r);
				}
				break;
			case "b":
			case "B":
				if (r.get(1) == "3x^3+5x^2-5x+3") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador + 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador + 1;
					Collections.shuffle(r);
				}
				break;
			case "c":
			case "C":
				if (r.get(2) == "3x^3+5x^2-5x+3") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador + 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador + 1;
					Collections.shuffle(r);
				}
				break;
			case "d":
			case "D":
				if (r.get(3) == "3x^3+5x^2-5x+3") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador + 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador + 1;
					Collections.shuffle(r);
				}
				break;
			case "e":
			case "E":
				if (r.get(4) == "3x^3+5x^2-5x+3") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador + 1;
				} else {
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
				if (r.get(0) == "11000111 e FA") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador + 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador + 1;
					Collections.shuffle(r);
				}
				break;
			case "b":
			case "B":
				if (r.get(1) == "11000111 e FA") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador + 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador + 1;
					Collections.shuffle(r);
				}
				break;
			case "c":
			case "C":
				if (r.get(2) == "11000111 e FA") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador + 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador + 1;
					Collections.shuffle(r);
				}
				break;
			case "d":
			case "D":
				if (r.get(3) == "11000111 e FA") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador + 1;
				} else {
					System.out.println("Resposta incorreta!\n");
					contador = contador + 1;
					Collections.shuffle(r);
				}
				break;
			case "e":
			case "E":
				if (r.get(4) == "11000111 e FA") {
					System.out.println("Resposta correta!\n");
					acertou = true;
					contador = contador + 1;
				} else {
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
		int hpMino = 100, hp = 100, itaipava = 0;
		String escolha="", decisao ="", decisao1="";
		Scanner entrada = new Scanner(System.in);
		int d20 = new Random().nextInt(20) + 1;
		int d6 = new Random().nextInt(6) + 1;
		// int d20 = rand.nextInt(21); // DADO DE 20 FACES - GLOBAL
		// int d6 = rand.nextInt(7); // DADO DE 6 FACES - GLOBAL

		System.out.println(d6);
		System.out.println(d20);

		System.out.println("[MESTRE]:Toninho entra na porta final e ve aquela criatura se alimentando de um pigmeu\n"
				+ "\nToninho: kkk eae man! \n" + "\n[MESTRE]: O minotauro volta seu olhar para o Toninho e berra\n"
				+ "Minotauro: hahahaha! Opa parece que chegou a sobremesa\n" + "Toninho: Mas o que é isso!\n"
				+ "\n[MESTRE]: Minotauro anvaça em direção ao toninho com seu machado! ");

		do {

			System.out.println("Escolha:\n" + "[1 - jogar os dados]\n" + "[2 - Usar itaipava]\n");
		escolha = entrada.next();
			int n;
			switch (escolha) {
			case "1":
				n = d20;
				System.out.println("\nO numero do dado: "+n);
				if (n >= 15 && n <= 20) {
					System.out.println(
							"[MESTRE]: Toninho esquiva do ataque do minotauro passando por de baixo de suas pernas e acerta um golpe certeiro na bunda do minotauro o fazendo cair\n"
									+ "[MESTRE]: Toninho aproveita a oportunidade e decepa a cabeça da criatura\n ");
					break;
				} else if (n >= 10 && n < 15) {
					hpMino = hpMino - 50;
					System.out.println(
							"[MESTRE]: Toninho esquiva do ataque do minotauro passando por de baixo de suas pernas e acerta um golpe certeiro na bunda do minotauro o fazendo cair\n"
									+ "\n HP Minotauro - 50 = " + hpMino
									+ "[MESTRE]: Toninho vai finalizar a criatura, mas escorrega e da tempo do minotauro se levantar\n");

					

					do {
						System.out.println("Escolha:\n" + "[1 - jogar os dados]\n" + "[2 - Usar itaipava]\n");
						decisao = entrada.next();
						switch (decisao) {
						case "1":
							n = d20;
							System.out.println("\nO numero do dado: "+n);
							if (n >= 10 && n <= 20) {
								System.out.println(
										"[MESTRE]: Minotauro enfurecido pega seu machado em tenta acertar o Toninho, mas o mesmo consegue esquivar e decepa a cabeça da criatura");
								break;
							} else if (n >= 0 && n < 10) {
								System.out.println("[MESTRE]: colocar algo do toninho tomando dano 1");
								hp = hp - 20;

								System.out.println("Escolha:\n" + "[1 - jogar os dados]\n" + "[2 - Usar itaipava]\n");
								decisao1 = entrada.next();

								do {
									switch (decisao1) {
									case "1":
										n = d20;
										System.out.println("\nO numero do dado: "+n);
										if (n >= 5 && n <= 20) {
											System.out.println(" fazer algo que o toninho ganhe");
											break;
										} else if (n < 5) {
											System.out.println("Toninho morre ou perde e a sheylla o ajuda!");
											System.exit(0);
											break;
										}
									case "2":
										if (itaipava > 0) {
											itaipava --;
											n = d20 + 10;
											System.out.println("\nO numero do dado: "+n);
											if (n >= 5 && n <= 20) {
												System.out.println(" fazer algo que o toninho ganhe");
												break;
											} else if (n < 5) {
												System.out.println("Toninho morre ou perde e a sheylla o ajuda!");
												System.exit(0);
												break;
											}
										} else {
											System.out.println("Toninho não possui itaipaiva");
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
							if (itaipava > 0) {
								itaipava --;
								n = d20 + 10;
								System.out.println("\nO numero do dado: "+n);
								if (n >= 5 && n <= 20) {
									System.out.println(" fazer algo que o toninho ganhe");
									break;
								} else if (n < 5) {
									System.out.println("Toninho morre ou perde e a sheylla o ajuda!");
									System.exit(0);
									break;
								}
							} else {
								System.out.println("Toninho não possui itaipaiva");
								decisao = "a";
								break;
							}

						default:
							System.out.println("\nOpção invalida!");
							
						}

					} while (!decisao.equals("1") && !decisao.equals("2"));
					break;
				}else if (n >= 0 && n < 10) {
					System.out.println("[MESTRE]: colocar algo do toninho tomando dano");
					hp = hp - 20;

					

					do {
						System.out.println("Escolha:\n" + "[1 - jogar os dados]\n" + "[2 - Usar itaipava]\n");
						decisao1 = entrada.next();
						switch (decisao1) {
						case "1":
							n = d20;
							System.out.println("\nO numero do dado: "+n);
							if (n >= 5 && n <= 20) {
								System.out.println(" fazer algo que o toninho ganhe");
								break;
							} else if (n < 5) {
								System.out.println("Toninho morre ou perde e a sheylla o ajuda!");
								System.exit(0);
								break;
							}
						case "2":
							if (itaipava > 0) {
								itaipava --;
								n = d20 + 10;
								System.out.println("\nO numero do dado: "+n);
								if (n >= 5 && n <= 20) {
									System.out.println(" fazer algo que o toninho ganhe");
									break;
								} else if (n < 5) {
									System.out.println("Toninho morre ou perde e a sheylla o ajuda!");
									System.exit(0);
									break;
								}
							} else {
								System.out.println("Toninho não possui itaipaiva");
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
				if (itaipava > 0) {
					itaipava --;
					n = d20 + 10;
					System.out.println("\nO numero do dado: "+n);
					if (n >= 5 && n <= 30) {
						System.out.println(" fazer algo que o toninho ganhe");
						break;
					} else if (n < 5) {
						System.out.println("Toninho morre ou perde e a sheylla o ajuda!");
						System.exit(0);
						break;
					}
				} else {
					System.out.println("Toninho não possui itaipaiva sdadsaddads");
					
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
/* Equação 1° grau 
 * Questão: x + 4 = 12
 * x = 12 – 4
 * R. x = 8
 */

/* Equação 1° grau 
 * Para que toninho não entre em coma alcolico logo no inicio da historia resolva esta questão de Matemática, que toninho tem espertize para solucionar 
estas questões, e ajude nosso amigo Predreiro. 
Questão: x – 12 = 20
x = 20 + 12
R. x = 32 */

/* Equação 1° grau 
 * Para que o nosso Heroi Toninho possa entender o que a Mestre Sheylla tem para apresentar a ele em Diademmor, ajude ele a resolver esta questão de 
 * equação de 1° grau que nosso heroi gosta de resolver, para que ele consiga superar esta etapa
 * Questão: 4x + 2 = 10
 * R. 4x = 10 – 2
 *     x = 10 – 2
              4
           x =  8
                4
              R.  x = 2 */

/* Equação 2° grau
 * Para ajudar o guerreiro Toninho a obter respostas mais claras junto a Deusa Sheylla ajude ele a solucionar esta questão de 
 * equação de 2° Grau
 * Questão: x² – 2x +1 = 0
 * R.
 * a = 1
 * b = -2
 * c = 1
 * D = b² – 4ac
 * D = (-2)² – 4 ·1·1
 * D = 4 – 4
 * D = 0
 * R. Como D = 0, a equação possui uma única solução real.  */	

/* Equação 2° grau
 * Questão: x² +6x + c =0
 R. a = 1
 b = 6
 D = b² – 4 ac
 D = 6² – 4· 1 c
 D = 36 – 4c
 36 – 4c = 0
 36 = 4c
 c = 36/4
 R. c= 9
 */
 
/* Função do 1° grau
Questão: f(x) = -2x + 5
R. -2x + 5 = 0
-2x = -5
x = (-5) : (-2)
R. x = 2,5 */

/* Função do 1° grau
Questão: f(x) = ax + b, sabendo-se que f(3) = 6 e f (-2) = -3
f(3) = 6
f(3) = 3a + b -- 3a + b = 6
f(-2) = -3
f(-2) = -2a + b -- -2a + b = -3
3a + b = 6
-2a + b = -3
5a = 9
R. a = 9/5
*/

/* Função do 2° grau
Questão: Calcule o valor de k de modo que a função f(x) = 4x² – 4x – k não tenha raízes, isto é,
o gráfico da parábola não possui ponto em comum com o eixo x
D < 0
b² – 4ac < 0
(–4)² – 4 * 4 * (–k) < 0
16 + 16k < 0
16k < – 16
k < –1
R. O valor de k para que a função não tenha raízes reais deve ser menor que – 1.
*/

/* Função do 2° grau
 * Questão: Determine os valores de m, para que a função f(x) = (m – 2)x² – 2x + 6 admita raízes reais.
 * Para essa situação temos que D >= 0.
 * D >= 0
 * b² – 4ac >= 0
 * (–2)² – 4 * (m – 2) * 6 >= 0
 * 4 – 4 * (6m – 12) >= 0
 * 4 – 24m + 48 >= 0
 * –24m >= – 48 – 4
 * –24m >= – 52
 * 24m <= 52
 * m <= 52/24
 * m <= 13/6
 * R. O valor de m que satisfaça a condição exigida é m <= 13/6.
 */

/* Polinômios
   Questão: Sabendo-se que –3 é raiz de P(x) = x³ + 4x² - ax + 1, calcule o valor de a.
   Como foi dito que -3 é raiz do polinômio, devemos inserir -3 no lugar de x e igualar o polinômio a zero a fim de obter o valor de a.
   (-3)3 + 4(-3)2 + -a(-3) + 1 = 0
   -27 + 36 + 3a + 1 = 0
   -26 + 36 = -3a
   10 = -3a
   a = -10
        3
*/