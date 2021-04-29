package RPG;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Intro {
static int u=0;
	 static int temp_dialog =70, temp_narrativa = 150, temp_transicao = 25; //Para rodar o jogo sem o delay nas mensagens, pode mudar o valor destas 3 variáveis para 0;
	public static void main(String[] args) throws Exception{
		
		Digita("\nABANDONAI TODA A ESPERANÇA, Ó VÓS QUE ENTRAIS...\n",TimeUnit.MILLISECONDS, temp_dialog);
		// System.out.println("ABANDONAI TODA A ESPERANÇA, Ó VÓS QUE ENTRAIS...\n");
		// System.out.println(".::: THE ARCHITECT - A BRAZILIAN CHRONIQUE :::.\n");
		nome();
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
				u++;
				System.out.println(u);
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
	static void jogo() { //metodo de inicio do jogo
		int escolha_play;
		Scanner input = new Scanner(System.in);
		System.out.println("1 - Um jogador (Singleplayer)\n" + "2 - Dois jogadores (Multiplayer)");
		escolha_play = input.nextInt();
		
		switch (escolha_play) {
		case 1:
			single();
			break;
		case 2:
			multiplayer();
			break;
		}
	}

	static void single() { // metodo caso tenha escolhas da quantidades de  players
		System.out.println("ta no single");
		System.exit(0);
	}

	static void multiplayer() { 
		System.out.println("ta no multi");
		System.exit(0);
	}

	static void instrucoes() {  // instrução do jogo

	}

	static void nome() throws Exception { // em forma de funcao para facilitar caso o jogador decida mudar o nome.
		Scanner input = new Scanner(System.in);
		String nome;
		byte conf_nome;
		System.out.println("Para começarmos nossa aventura, insira seu nome: ");
		nome = input.next();
		System.out.println("Seja bem-vindo, " + nome + ". Deseja confirmar este nome? Digite 1 para sim e 2 para não.");
		conf_nome = input.nextByte();
		switch (conf_nome) {
		case 1:
			menu();

		case 2:
			nome();

		}

	}

	static void creditos() throws Exception{ // creditos finais 
		
		Digita(".::: CRÉDITOS :::.\n> Alex Gama\n> Bruno Souza\n> Rafael Pereira Elias\n> Ruy Menezes \n",TimeUnit.MILLISECONDS, temp_dialog);
		menu();
	}
}
