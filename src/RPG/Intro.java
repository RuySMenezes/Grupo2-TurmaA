package RPG;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Intro {
	
	//static int u=0;
	 static int temp_dialog =70, temp_narrativa = 150, temp_transicao = 25; //Para rodar o jogo sem o delay nas mensagens, pode mudar o valor destas 3 variáveis para 0;
	 
	public static void main(String[] args) throws Exception{
		
		Digita("\nABANDONAI TODA A ESPERANÇA, Ó VÓS QUE ENTRAIS...\n",TimeUnit.MILLISECONDS, temp_dialog);
		 Digita(".::: THE ARCHITECT - A BRAZILIAN CHRONIQUE :::.\n",TimeUnit.MILLISECONDS, temp_dialog);
		
		menu();
	}
	
	// metodo para utilizar os delay nas mensagens
	
	public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
        System.out.print(caractere);
        unit.sleep(tempo_mensagem);
    }
}
	
	static void menu() throws Exception { // metodo para puxar as escolhas do menu
		Scanner input = new Scanner(System.in);
		String escolha_menu;
		System.out.println("\n1 - Jogar\n2 - Instruções\n3 - Créditos\n4 - Sair");
		escolha_menu = input.next(); /*
										 * string para caso alguém digitar uma opção diferente de int o que fará bugar a
										 * execução do código. isola essa parte e testa depois para ver o que estou
										 * falando.
										 */
		
		do {
			switch (escolha_menu) {
			case "1":
				//u++;
				//System.out.println(u);
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
				escolha_menu = input.next();
			}
		} while (!escolha_menu.equals("1") && !escolha_menu.equals("2") && !escolha_menu.equals("3") && !escolha_menu.equals("4"));

	}

//USAR SUPER AND SUBCLASSES. Inserir tudo em um só, dependendo da escolha do jogador.
	static void jogo() throws InterruptedException { //metodo de inicio do jogo
		
		int escolha;
		Scanner entrada = new Scanner (System.in);
		Digita("\n[MESTRE]: O ano é 2018."
			+"\n[MESTRE]: Toninho finaliza seu dia de trabalho. Entra em seu carro (modelo) e dá partida no motor.\n"
			+"\nVRUM...\n"
			+"\n[MESTRE]: ele está com seu amigo e colega de empreitada, Cleytinho.\n"
			+"\nCleytinho: Bora tomar uma lá no bar do Bira ?\n"
			+"\nSelecione a sua resposta de acordo com o numero correspondente: "
				+"\n[1] AEHOOOO, bora!"
				+ "\n[2] Tô afim não, Cleytinho\n",TimeUnit.MILLISECONDS, temp_dialog);
		escolha = entrada.nextInt();
		
		do {
		switch(escolha) {
			
		case 1:
			Digita("\nCleytinho: AEHOOOO, hoje o couro vai cochar!\n"
					+ "\n[MESTRE]: Cleytinho entra no carro e já vai aumentando o som.\n"
					+ "[MESTRE]: É uma tarde de sexta-feria e o sol começa a se pôr.\n"
					+ "[MESTRE]: Os amigos chegam ao bar do Bira\n"
					+ "\nToninho: AOWWWW BIRA VEIO, DESCE AQUELA GELADA QUE HOJE VOU VER VÍDEO NO ZAPZAP!\n"
					+ "Bira: É pra já, campeão!\n"
					+ "\n[MESTRE]: Os amigos sentam-se a mesa de plástico e discutem mundanindades.\n"
					+ "\n[3 horas e muitas itaipavas depois...]\n"
					+ "\nCleytinho: Ô TONINHO, LEVANTA HOMEM!\n"
					+ "Toninho: To não.\n"
					+ "Cleytinho: Eu falo que você não aguenta beber, daqui a pouco vai começar a chorar pela ex de novo.\n"
					+ "Toninho: To não.\n"
					+ "\n***Toninho desmaia***\n"
					+ "\n[MESTRE]: Cleytinho, vendo ser infrutíferas suas tentativas de ajudar o colega, o arrasta para o carro e leva Toninho à sua casa."
					+ "\n[MESTRE]: Toninho continua desmaiado e dormindo como se não houvesse o amanhã.",TimeUnit.MILLISECONDS, temp_dialog);
			break;
		case 2:
			Digita("\nCleytinho: Sai dessa, homi! Eu sei que você vai voltar para casa e ficar ligando pra Lucilene.\r\n"
					+ "Toninho: Vou nada, amanhã vou assar umas bistecas logo cedo.\r\n"
					+ "Cleytinho:... \r\n"
					+ "\n[MESTRE]: Toninho segue para sua casa.\n"
					+ "[MESTRE]: somente ele e a solidão em seu coração que já não é mais o mesmo após anos de consumo indiscriminado de gordura saturada.\r\n"
					+ "[MESTRE]: Ao chegar, pensa consigo mesmo...\r\n"
					+ "\nToninho: Vou tomar só uma pois sou merecedor. \r\n"
					+ "\n[3 horas e muitas Itaipavas depois...]\r\n"
					+ "\n[MESTRE]:  Em uma ligação com sua amada...\r\n"
					+ "\nToninho: Volta pra mim, Lucilene!\r\n"
					+ "Lucilene: Me esquece, ‘disgraça’!\r\n"
					+ "BIP BIP BIP...\r\n"
					+ "\n***Toninho desmaia após chorar copiosamente***",TimeUnit.MILLISECONDS, temp_dialog);
			break;
		default:
			System.out.println("\nOpção inválida!");
			Digita("\nSelecione a sua resposta de acordo com o numero correspondente: "
					+"\n[1] AEHOOOO, bora!"
					+ "\n[2] Tô afim não, Cleytinho\n",TimeUnit.MILLISECONDS, temp_dialog);
			escolha = entrada.nextInt();
		}
		}while(escolha != 1 && escolha != 2);
		
		Digita("\n[horas depois...]\r\n"
				+ "\n[MESTRE]:  Toninho acorda, ainda meio desorientado pelos eventos da noite anterior e não se lembra de nada exceto seu nome e sua profissão.\r\n"
				+ "[MESTRE]: Acorda dentro de seu carro embora não o reconheça, coberto por uma densa neblina.\r\n"
				+ "[blablablabla – inserir algo depois]\r\n"
				+ "[MESTRE]: Em meio a neblina, aproxima-se uma figura de arquétipo feminino... \r\n"
				+ "\nSheylla: Estávamos à sua espera, Toninho.\r\n"
				+ "Toninho: Quem é você? Onde estou?\r\n"
				+ "Sheylla: Eu sou Sheylla com dois l’s, guardiã de Diademmor. \r\n"
				+ "Toninho: Diademmor? \r\n"
				+ "Sheylla: Sim, Antônio. Diademmor. Esta realidade não é acessível para humanos comuns.\r\n"
				+ "Toninho: Com todo respeito dona Shirley, mas eu sou um mero pedreiro. Acho que você está me tomando por outra pessoa. \r\n"
				+ "Sheylla: É Sheylla, não Shirley. E não, tenho certeza de que você é o escolhido.\r\n"
				+ "Toninho: Escolhido para quê, minha senhora? Só quero assar minhas bistecas hoje, se quiser que eu bata a laje da sua casa me chama no ZAPZAP que a gente combina o orçamento. \r\n"
				+ "\n[MESTRE]: Toninho vira as costas e segue em direção ao seu carro...\r\n"
				+ "[MESTRE]: Sheylla, visivelmente irada, assume a sua real forma de Erínia e avança em direção ao pedreiro\r\n"
				+ "\nSheylla: NÃO OUSE ME IGNORAR, HUMANO!\r\n"
				+ "Toninho: Eita, que viajem é essa vei\r\n"
				+ "Sheylla: ACEITE O SEU DESTINO, MORTAL. \r\n",TimeUnit.MILLISECONDS, temp_dialog);
		
	}

	static void instrucoes() {  // instrução do jogo

	}

	static void creditos() throws Exception{ // creditos finais 
		
		Digita(".::: CRÉDITOS :::.\n> Alex Gama\n> Bruno Souza\n> Rafael Pereira Elias\n> Ruy Menezes \n",TimeUnit.MILLISECONDS, temp_dialog);
		menu();
	}
}
