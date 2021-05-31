package RPG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Teste para fazer pull
		
		//Teste 13_05
		desafio2CI();
		
	}
	
	
	public static void desafio2CI() {
		
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
		System.out.print("Escolha uma alternativa: ");
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
		
	}

