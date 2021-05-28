package RPG;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Intro {
	
	//static int u=0;
	// 70, 150, 25
	 static int temp_dialog =0, temp_narrativa = 00, temp_transicao = 0; //Para rodar o jogo sem o delay nas mensagens, pode mudar o valor destas 3 variÃ¡veis para 0;
	 
	public static void main(String[] args) throws Exception{
		
		Digita("\nABANDONAI TODA A ESPERANÃ‡A, Ã“ VÃ“S QUE ENTRAIS...\n",TimeUnit.MILLISECONDS, temp_dialog);
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
		System.out.println("\n1 - Jogar\n2 - InstruÃ§Ãµes\n3 - CrÃ©ditos\n4 - Sair");
		escolha_menu = input.next(); /*
										 * string para caso alguÃ©m digitar uma opÃ§Ã£o diferente de int o que farÃ¡ bugar a
										 * execuÃ§Ã£o do cÃ³digo. isola essa parte e testa depois para ver o que estou
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
				System.out.println("1 - Jogar\n2 - InstruÃ§Ãµes\n3 - CrÃ©ditos\n4 - Sair");
				escolha_menu = input.next();
			}
		} while (!escolha_menu.equals("1") && !escolha_menu.equals("2") && !escolha_menu.equals("3") && !escolha_menu.equals("4"));

	}

//USAR SUPER AND SUBCLASSES. Inserir tudo em um sÃ³, dependendo da escolha do jogador.
	static void jogo() throws InterruptedException { //metodo de inicio do jogo
		
		int escolha;
		Scanner entrada = new Scanner (System.in);
		Digita("\n[MESTRE]: O ano Ã© 2018."
			+"\n[MESTRE]: Toninho finaliza seu dia de trabalho. Entra em seu carro (modelo) e dÃ¡ partida no motor.\n"
			+"\nVRUM...\n"
			+"\n[MESTRE]: ele estÃ¡ com seu amigo e colega de empreitada, Cleytinho.\n"
			+"\nCleytinho: Bora tomar uma lÃ¡ no bar do Bira ?\n"
			+"\nSelecione a sua resposta de acordo com o numero correspondente: "
				+"\n[1] AEHOOOO, bora!"
				+ "\n[2] TÃ´ afim nÃ£o, Cleytinho\n",TimeUnit.MILLISECONDS, temp_dialog);
		escolha = entrada.nextInt();
		
		do {
		switch(escolha) {
			
		case 1:
			Digita("\nCleytinho: AEHOOOO, hoje o couro vai cochar!\n"
					+ "\n[MESTRE]: Cleytinho entra no carro e jÃ¡ vai aumentando o som.\n"
					+ "[MESTRE]: Ã‰ uma tarde de sexta-feria e o sol comeÃ§a a se pÃ´r.\n"
					+ "[MESTRE]: Os amigos chegam ao bar do Bira\n"
					+ "\nToninho: AOWWWW BIRA VEIO, DESCE AQUELA GELADA QUE HOJE VOU VER VÃ�DEO NO ZAPZAP!\n"
					+ "Bira: Ã‰ pra jÃ¡, campeÃ£o!\n"
					+ "\n[MESTRE]: Os amigos sentam-se a mesa de plÃ¡stico e discutem mundanindades.\n"
					+ "\n[3 horas e muitas itaipavas depois...]\n"
					+ "\nCleytinho: Ã” TONINHO, LEVANTA HOMEM!\n"
					+ "Toninho: To nÃ£o.\n"
					+ "Cleytinho: Eu falo que vocÃª nÃ£o aguenta beber, daqui a pouco vai comeÃ§ar a chorar pela ex de novo.\n"
					+ "Toninho: To nÃ£o.\n"
					+ "\n***Toninho desmaia***\n"
					+ "\n[MESTRE]: Cleytinho, vendo ser infrutÃ­feras suas tentativas de ajudar o colega, o arrasta para o carro e leva Toninho Ã  sua casa."
					+ "\n[MESTRE]: Toninho continua desmaiado e dormindo como se nÃ£o houvesse o amanhÃ£.",TimeUnit.MILLISECONDS, temp_dialog);
			break;
		case 2:
			Digita("\nCleytinho: Sai dessa, homi! Eu sei que vocÃª vai voltar para casa e ficar ligando pra Lucilene.\r\n"
					+ "Toninho: Vou nada, amanhÃ£ vou assar umas bistecas logo cedo.\r\n"
					+ "Cleytinho:... \r\n"
					+ "\n[MESTRE]: Toninho segue para sua casa.\n"
					+ "[MESTRE]: somente ele e a solidÃ£o em seu coraÃ§Ã£o que jÃ¡ nÃ£o Ã© mais o mesmo apÃ³s anos de consumo indiscriminado de gordura saturada.\r\n"
					+ "[MESTRE]: Ao chegar, pensa consigo mesmo...\r\n"
					+ "\nToninho: Vou tomar sÃ³ uma pois sou merecedor. \r\n"
					+ "\n[3 horas e muitas Itaipavas depois...]\r\n"
					+ "\n[MESTRE]:  Em uma ligaÃ§Ã£o com sua amada...\r\n"
					+ "\nToninho: Volta pra mim, Lucilene!\r\n"
					+ "Lucilene: Me esquece, â€˜disgraÃ§aâ€™!\r\n"
					+ "BIP BIP BIP...\r\n"
					+ "\n***Toninho desmaia apÃ³s chorar copiosamente***",TimeUnit.MILLISECONDS, temp_dialog);
			break;
		default:
			System.out.println("\nOpÃ§Ã£o invÃ¡lida!");
			Digita("\nSelecione a sua resposta de acordo com o numero correspondente: "
					+"\n[1] AEHOOOO, bora!"
					+ "\n[2] TÃ´ afim nÃ£o, Cleytinho\n",TimeUnit.MILLISECONDS, temp_dialog);
			escolha = entrada.nextInt();
		}
		}while(escolha != 1 && escolha != 2);
		
		Digita("\n[horas depois...]\r\n"
				+ "\n[MESTRE]:  Toninho acorda, ainda meio desorientado pelos eventos da noite anterior e nÃ£o se lembra de nada exceto seu nome e sua profissÃ£o.\r\n"
				+ "[MESTRE]: Acorda dentro de seu carro embora nÃ£o o reconheÃ§a, coberto por uma densa neblina.\r\n"
				+ "[blablablabla â€“ inserir algo depois]\r\n"
				+ "[MESTRE]: Em meio a neblina, aproxima-se uma figura de arquÃ©tipo feminino... \r\n"
				+ "\nSheylla: EstÃ¡vamos Ã  sua espera, Toninho.\r\n"
				+ "Toninho: Quem Ã© vocÃª? Onde estou?\r\n"
				+ "Sheylla: Eu sou Sheylla com dois lâ€™s, guardiÃ£ de Diademmor. \r\n"
				+ "Toninho: Diademmor? \r\n"
				+ "Sheylla: Sim, AntÃ´nio. Diademmor. Esta realidade nÃ£o Ã© acessÃ­vel para humanos comuns.\r\n"
				+ "Toninho: Com todo respeito dona Shirley, mas eu sou um mero pedreiro. Acho que vocÃª estÃ¡ me tomando por outra pessoa. \r\n"
				+ "Sheylla: Ã‰ Sheylla, nÃ£o Shirley. E nÃ£o, tenho certeza de que vocÃª Ã© o escolhido.\r\n"
				+ "Toninho: Escolhido para quÃª, minha senhora? SÃ³ quero assar minhas bistecas hoje, se quiser que eu bata a laje da sua casa me chama no ZAPZAP que a gente combina o orÃ§amento. \r\n"
				+ "\n[MESTRE]: Toninho vira as costas e segue em direÃ§Ã£o ao seu carro...\r\n"
				+ "[MESTRE]: Sheylla, visivelmente irada, assume a sua real forma de ErÃ­nia e avanÃ§a em direÃ§Ã£o ao pedreiro\r\n"
				+ "\nSheylla: NÃƒO OUSE ME IGNORAR, HUMANO!\r\n"
				+ "Toninho: Eita, que viajem Ã© essa vei\r\n"
				+ "Sheylla: ACEITE O SEU DESTINO, MORTAL. \r\n",TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
				+ "Toninho[1]: Pois bem, que seja. \r\n"
				+ "Toninho[2]: Sem tempo, irmÃ£o.\r\n",TimeUnit.MILLISECONDS, temp_dialog);
		escolha = entrada.nextInt();
		
		do {
			switch(escolha) {
			case 1:
				Digita("\nSheylla: Ã“timo. Venha, vou guia-lo por essa realidade.\r\n"
						+ "Sheylla: NÃ£o Ã© seguro que caminhe sÃ³.\r\n"
						+ "Sheylla: HÃ¡ armadilhas por todo o percurso.",TimeUnit.MILLISECONDS, temp_dialog);
				break;
			case 2:
				Digita("\nSheylla: VocÃª nÃ£o estÃ¡ na posiÃ§Ã£o de decidir coisa alguma, AntÃ´nio.",TimeUnit.MILLISECONDS, temp_dialog);
				break;
			default:
				System.out.println("\nOpÃ§Ã£o invÃ¡lida!");
				Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
						+ "Toninho[1]: Pois bem, que seja. \r\n"
						+ "Toninho[2]: Sem tempo, irmÃ£o.\r\n",TimeUnit.MILLISECONDS, temp_dialog);
				escolha = entrada.nextInt();
			}
			
		}while(escolha != 1 && escolha != 2);
		
		Digita("[MESTRE]: Sheylla, com um estalar de dedos, invoca seu Del Rey 1988\r\n"
				+ "Toninho: Eita, um carro que anda sozinho? Ã‰ aquele carro do Elton Muska? \r\n"
				+ "Sheylla: NÃ£o, Ã© um Del Rey. JÃ¡ lhe disse AntÃ´nio, hÃ¡ muito mais nessa realidade que tua vivÃªncia ordinÃ¡ria lhe permite compreender. \r\n"
				+ "[MESTRE]: Toninho aceita a resposta de forma silente e ambos entram no Del Rey.\r\n"
				+ "[MESTRE]: Ambos entram no veÃ­culo com direÃ§Ã£o Ã s entranhas de Diademmor.\r\n"
				+ "[MESTRE]: Um arco com a inscriÃ§Ã£o â€œAbandonai toda esperanÃ§a, Ã³ vos que entraisâ€� chama a atenÃ§Ã£o de nosso guerreiro. \r\n"
				+ "Toninho: Ã” dona Shirley, qual Ã© dessa frase aÃ­?\r\n"
				+ "Sheylla: Pela Ãºltima vez, Ã© Sheylla, nÃ£o Shirley. Creio que a sentenÃ§a tenha sido clara o suficiente.\r\n"
				+ "Sheylla: Esta realidade hÃ¡ muito abandonada por seu criador virou morada das mais horrendas criaturas e guarda os mais lÃºgubres segredos.\r\n"
				+ "Sheylla: Prepare-se, meu caro. \r\n",TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
				+ "Toninho[1]: Criador?\r\n"
				+ "Toninho[2]: Criaturas? \r\n"
				+ "Toninho[3]: Segredos? \r\n",TimeUnit.MILLISECONDS, temp_dialog);
		escolha = entrada.nextInt();
		
		do {
		switch(escolha) {
		case 1:
			Digita("Sheylla: Pouco se sabe sobre ele, mas os boatos sÃ£o de que esta Ã© a Ãºltima obra de DÃ©dalo antes de sua derrocada.  \r\n"
					+ "Mostrar as opÃ§Ãµes novamente, mas as que nÃ£o foram selecionadas. SerÃ¡ tipo uma inserÃ§Ã£o do jogador no nosso contexto. Caso jÃ¡ tenham sido esgotadas, segue o jogo...\r\n"
					+ "",TimeUnit.MILLISECONDS, temp_dialog);
			break;
		case 2:
			Digita("Sheylla: Sim blalala\r\n"
					+ "Mostrar as opÃ§Ãµes novamente, mas as que nÃ£o foram selecionadas. SerÃ¡ tipo uma inserÃ§Ã£o do jogador no nosso contexto. Caso jÃ¡ tenham sido esgotadas, segue o jogo...\r\n"
					+ "",TimeUnit.MILLISECONDS, temp_dialog);
			break;
		case 3:
			Digita("Sheylla: HÃ¡ boatos de que antes de abandonar Diademmor, o criador escondeu algo de extremo valor (depois pensamos nisso)\r\n"
					+ "Mostrar as opÃ§Ãµes novamente, mas as que nÃ£o foram selecionadas. SerÃ¡ tipo uma inserÃ§Ã£o do jogador no nosso contexto. Caso jÃ¡ tenham sido esgotadas, segue o jogo... \r\n"
					+ "",TimeUnit.MILLISECONDS, temp_dialog);
			break;
			default:
				System.out.println("\nOpÃ§Ã£o invÃ¡lida!");
				Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
						+ "Toninho[1]: Criador?\r\n"
						+ "Toninho[2]: Criaturas? \r\n"
						+ "Toninho[3]: Segredos? \r\n",TimeUnit.MILLISECONDS, temp_dialog);
				escolha = entrada.nextInt();
		}
		}while(escolha != 1 && escolha != 2 && escolha != 3);
		
		Digita("[MESTRE]: Toninho digere apreensivamente as novas informaÃ§Ãµes... \r\n"
				+ "Sheylla: VocÃª estÃ¡ bem, AntÃ´nio? Parece meio... pÃ¡lido. \r\n"
				+ "Toninho: Melhor impossÃ­vel.\r\n"
				+ "Sheylla: Bom, precisarei de vocÃª atento de agora em diante. \r\n"
				+ "[MESTRE]: Ouve-se um estrondo do lado de fora e pouco a pouco o Del Rey comeÃ§a a perder velocidade.\r\n"
				+ "Toninho: AAAAAAAAAAA Ã‰ O DEMÃ”NIO!!!\r\n"
				+ "Sheylla: RECOMPONHA-SE! \r\n"
				+ "[MESTRE]: Sheylla, em sua frieza habitual, estaciona o carro em meio a densa neblina, e sai para checar o que houve. \r\n"
				+ "Sheylla: Furou o pneu do carro. VocÃª deve sair e trocar.\r\n"
				+ "Toninho: E eu que tenho de ficar atento, nÃ©? Deus me ajude... \r\n",TimeUnit.MILLISECONDS, temp_dialog);
		
	// criaÃ§Ã£o do metodo/funÃ§Ã£o Desafio 1
		
		Digita("[MESTRE] ApÃ³s o conserto, Toninho e Sheylla seguem viagem. \r\n"
				+ "Sheylla: NÃ£o foi tÃ£o ruim assim, foi, AntÃ´nio? \r\n"
				+ "[blablabla]\r\n"
				+ "[MESTRE] ApÃ³s uma breve jornada, Sheylla e Toninho chegam ao destino pretendido. Observa-se uma cratera intransponÃ­vel Ã  frente, e o conteÃºdo que guarda o outro lado Ã© obstruÃ­do pela ainda densa nÃ©voa.\r\n"
				+ "Sheylla: Chegamos. Sabe o porquÃª de eu trazÃª-lo aqui, AntÃ´nio?\r\n"
				+ "Toninho: Nem sei se quero saber...\r\n"
				+ "Sheylla: Preciso que vocÃª construa uma ponte. \r\n"
				+ "Toninho: O que hÃ¡ do outro lado? \r\n"
				+ "Sheylla: Nada que vocÃª precise saber por enquanto. \r\n"
				+ "Toninho: Ouch, grossa. Eu sou pedreiro, nÃ£o engenheiro. Meu negÃ³cio Ã© bater laje. \r\n"
				+ "Sheylla: VocÃª tem o necessÃ¡rio. \r\n"
				+ "Toninho: Se vocÃª estÃ¡ dizendo... Mas como espera que eu construa uma ponte sem recursos ou mÃ£o de obra?\r\n"
				+ "Sheylla: VocÃª terÃ¡ toda a mÃ£o de obra necessÃ¡ria a seu dispor. Quanto aos materiais, eu o instruirei de onde achÃ¡-los por Diademmor.\r\n"
				+ "[MESTRE] Sheylla entrega um mapa nas mÃ£os de Toninho e ele analisa o mesmo atentamente.\r\n"
				+ "Sheylla: Neste primeiro momento, o conduzirei ao nosso primeiro local de busca para que tenha a mÃ­nima noÃ§Ã£o do que irÃ¡ enfrentar. O resto ficarÃ¡ a seu encargo.\r\n"
				+ "Toninho: Que Deus me ajude... \r\n"
				+ "[MESTRE] Toninho, agora ciente e quase conformado de seu destino, segue uma curta viagem com Sheylla.\r\n"
				+ "[10 minutos depois...]\r\n"
				+ "[MESTRE] Toninho e Sheylla chegam em uma rua sem saÃ­da, com um prÃ©dio aparentemente abandonado no fim desta. \r\n"
				+ "Toninho: O que encontraremos aqui?\r\n"
				+ "Sheylla: Os boatos sÃ£o de que aqui estÃ¡ guardado o projeto original da ponte, este Ã© o primeiro passo. \r\n"
				+ "Toninho: E como espera que eu interprete esse projeto? Minha senhora, minhas habilidades matemÃ¡ticas sÃ£o restritas Ã  divisÃ£o da conta do bar.\r\n"
				+ "Sheylla: NÃ£o se preocupe, hÃ¡ alguÃ©m que irÃ¡ auxiliÃ¡-lo. \r\n"
				+ "[MESTRE] Em meio a nÃ©voa, surge uma ave que voa em direÃ§Ã£o ao herÃ³i. \r\n"
				+ "Sheylla: Falando neste alguÃ©m, aÃ­ vem. \r\n"
				+ "[MESTRE] A ave pousa nos ombros de Sheylla. \r\n"
				+ "Ave[Perdix]: E chega-se o momento que todos esperÃ¡vamos. \r\n"
				+ "Sheylla: De fato.\r\n"
				+ "Toninho: Isso Ã© um papagaio? \r\n"
				+ "Ave[Perdix]: ... era esse humano medÃ­ocre a quem estÃ¡vamos Ã  espera?  \r\n"
				+ "Sheylla: Sim, o prÃ³prio. \r\n"
				+ "Toninho: Qual foi dona Sheylla, vai deixar esse papagaio me ofender desse jeito? \r\n"
				+ "Ave[Perdix]: Eu sou um perdiz e nÃ£o um papagaio, seu iletrado. Nunca ouvira da lenda de Perdix, sobrinho de DÃ©dalo?  \r\n"
				+ "Toninho: NÃ£o conheÃ§o e nÃ£o ligo, sÃ³ sei que vai vocÃª virar frango a passarinho se continuar com gracinha. \r\n"
				+ "[MESTRE] A discussÃ£o Ã© interrompida por um som de trotes oriundos do prÃ©dio abandonado. Emerge da escuridÃ£o dos corredores uma criatura com corpo de leÃ£o e cabeÃ§a de mulher, conhecida como Esfinge. Perdix, ao notar a criatura, alÃ§a voo e abandona Sheylla e Toninho a sua prÃ³pria sorte. \r\n"
				+ "Toninho: Estou bÃªbado ainda ou...\r\n"
				+ "Sheylla: CALADO. Deixe-me cuidar disso.\r\n"
				+ "Esfinge: O QUE PROCURAS AQUI?\r\n"
				+ "Sheylla: Viemos em busca do projeto para...\r\n"
				+ "Esfinge: CALADA, DIRIGI A PALAVRA AO MORTAL QUE VOS ACOMPANHA. \r\n",TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
				+ "[1] Diplomacia\r\n"
				+ "[2] Combate - Aqui se insere o dado.\r\n"
				+ "Toninho estarÃ¡ munido de um tijolo que achou entre os escombros.\r\n",TimeUnit.MILLISECONDS, temp_dialog);
		escolha = entrada.nextInt();
		
		do {
			switch(escolha) {
			case 1:
				System.out.println(" - Resolver uma questÃ£o proposta pela Esfinge.");
				break;
			case 2:
				System.out.println("Combate");
				/*If (dado >= 1 && dado <= 10) {
					Ele errarÃ¡ e provocarÃ¡ a irÃ¡ de Esfinge, caso em que o jogador perderÃ¡ 2 pontos de vida e Sheylla terÃ¡ de intervir para salvar Toninho. CulminarÃ¡ com uma luta intensa e a eventual morte da Esfinge.
					}
					Else if (dado > 10 & dado <= 15) { 
					 A tijolada Ã© suficiente para nocautear a Esfinge temporariamente, permitindo a passagem de Sheylla e Toninho. 
					}
					Else if (dado > 15) {
					A tijolada mata a Esfinge. 
					}*/
			}
			
		}while(escolha != 1 && escolha != 2);
		
		Digita("[MESTRE]: ApÃ³s os acontecimentos, Sheylla e Toninho adentram o prÃ©dio.\r\n"
				+ "[MESTRE]: Ã‰ um ambiente mal iluminado, mas pode-se notar vÃ¡rias salas e lances de escada que levam aos andares superiores.\r\n"
				+ "Sheylla: Acho mais prudente nos separarmos, seremos mais rÃ¡pidos desta forma. \r\n"
				+ "Toninho: E se eu encontrar alguma outra criatura? \r\n"
				+ "Sheylla: A Esfinge era a Ãºnica guardiÃ£ destas ruÃ­nas, vocÃª ficarÃ¡ bem... eu acho.\r\n"
				+ "Sheylla: Em todo caso, valha-se de alguma arma se achar, pode ser de grande valia. Em Ãºltimo caso, corra. HÃ¡ uma mirÃ­ade de opÃ§Ãµes. \r\n"
				+ "Toninho: VocÃª sabe muito bem como tranquilizar alguÃ©m... \r\n"
				+ "Sheylla: Confia. Procure por um papiro ou qualquer outra coisa que se assemelhe a isso. \r\n"
				+ "Toninho: Papiro? \r\n"
				+ "Sheylla: Um pergaminho, AntÃ´nio. Apenas procure por algo que pareÃ§a um papel."
				+ " Cheque toda e qualquer sala e encontre-me na entrada do prÃ©dio quando terminar. Recomendo que comece pelo piso superior. \r\n"
				+ "Toninho: Ok, mas se aparecer alguma outra criatura diga adeus ao seu Del Rey.\r\n"
				+ "Sheylla: Justo. \r\n"
				+ "[MESTRE]: E assim eles se separam. Toninho, ainda abalado com tudo que sucedera momentos antes, cantarola para se encorajar enquanto perambula pelos soturnos corredores. \r\n"
				+ "Toninho: Entra na minha casaaa, entra na minha vidaaa, mexe com minha estrutura...\r\n"
				+ "[MESTRE] ApÃ³s a infrutÃ­fera checagem de vÃ¡rias salas e descendo em direÃ§Ã£o a outro andar, uma voz misteriosa ascende em meio a escuridÃ£o.\r\n"
				+ "Voz: Cuida-te com aqueles a quem tu depositas tua confianÃ§a. \r\n"
				+ "Toninho: TÃ� REPREENDIDO EM NOME DO SENHOR, QUEM ESTÃ� AÃ�? \r\n"
				+ "Voz: Logo saberÃ¡s... nÃ£o sou eu aquele a quem tu deves temer.\r\n"
				+ "Toninho: EU TE COMANDO E ORDENO SATANÃ�S, MOSTRA TUA FACE\r\n"
				+ "Voz: Logo...\r\n"
				+ "[MESTRE]: TÃ£o misteriosamente quanto surgiu, a voz se esvai pelos longos corredores, apenas contribuindo para a tensÃ£o do pedreiro. \r\n"
				+ "Toninho: ALÃ”...? ... UÃ‰.\r\n"
				+ "[MESTRE] Algo neste corredor chama a atenÃ§Ã£o do herÃ³i. Uma porta distinta de qualquer outra que tenha visto neste edifÃ­cio, com o batente e a maÃ§aneta feitas em ouro puro, nÃ£o por acaso atrativas Ã  vista. \r\n"
				+ "Toninho: Interessante... parece que hÃ¡ algo escrito. \r\n"
				+ "â€œâ€�â€�Tens o que Ã© necessÃ¡rio para abrir a minha porta? â€œâ€�â€�\r\n",TimeUnit.MILLISECONDS, temp_dialog);
		
		//desafio 2
		
		Digita("[MESTRE]: A porta se abre lentamente e revela apenas uma incessante escuridÃ£o. \r\n"
				+ "Toninho: \r\n"
				+ "[MESTRE] Toninho se apossa do pergaminho e encontra um bilhete entre este\r\n"
				+ "â€œâ€�â€� Este pergaminho contÃ©m apenas metade daquilo que projetei, e o local em que se encontra a outra metade cairÃ¡ no esquecimento assim como eu, ao decorrer do tempo. Prefiro a morte a permitir que minhas obras sejam usadas para propÃ³sitos escusos. \r\n"
				+ "Dirijo-me agora a ti, Ã³ ser perspicaz que fora capaz de evadir-se da criatura que guarda este solo e ao mesmo tempo desvendar o enigma que, como Ãºltimo recurso, guardava estes segredos. \r\n"
				+ "SaÃºdo-te. Fora suficientemente sagaz atÃ© aqui, mas duvido que esteja Ã  altura do que o destino lhe reserva. \r\n"
				+ "- DÃ©dalo â€œâ€�â€�\r\n"
				+ "Toninho: SerÃ¡ que Ã© o mesmo homem, tio daquela pomba que conheci mais cedo? Ã” mundinho estranho.\r\n"
				+ "[MESTRE] Toninho, com a obra em mÃ£os, dirige-se Ã  saÃ­da onde encontra Sheylla com um ar de quem falhou em seu objetivo.\r\n"
				+ "Toninho: Ã” dona Shirlley, veja se Ã© isso o que vocÃª queria. \r\n"
				+ "Sheylla: Devo admitir AntÃ´nio, vocÃª excedeu minhas expectativas! AtÃ© pensei que estaria mor... er... digo, mortificado pela arquitetura do prÃ©dio. \r\n"
				+ "Toninho: Que nada, jÃ¡ construÃ­ casa muito â€œmais melhorâ€� que isso. â€“ detalhe nas aspas\r\n"
				+ "Sheylla: Tenho certeza que sim.\r\n"
				+ "Toninho: TambÃ©m achei esse bilhete no meio.\r\n"
				+ "[MESTRE]: Sheylla silencia-se enquanto lÃª atentamente. \r\n"
				+ "Sheylla: Aqui diz que isso Ã© apenas uma parte do projeto. \r\n"
				+ "Toninho: Ã‰ o que diz. Sabe onde pode estar a outra parte? \r\n"
				+ "Sheylla: Tenho uma ideia, mas caberÃ¡ a ti obtÃª-lo. \r\n"
				+ "Toninho: SÃ³ achei algo estranho...\r\n"
				+ "Sheylla: O que seria?\r\n"
				+ "Toninho: Uma voz falou comigo. NÃ£o sei se aconteceu de verdade ou ainda Ã© efeito das cervejas da noite anterior, mas... \r\n"
				+ "Sheylla: E o que essa voz disse? \r\n"
				+ "Toninho: Alguma coisa sobre confiar no meu potencial eu acho, nÃ£o lembro direito pois me assustei um pouco.\r\n"
				+ "Sheylla: Conte-me mais. \r\n"
				+ "Toninho: Mas eu me impus e chamei ele pra briga, nÃ£o fui um covarde. Ah, e esse cheiro estranho nÃ£o estÃ¡ vindo de mim nÃ£o. \r\n"
				+ "Sheylla: Meu herÃ³i. Creio que tenha provado o seu valor hoje, poderÃ¡ descansar por hoje se quiser. \r\n",TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
				+ "[1 - DESCANSAR] Nois Ã© merecedor. \r\n"
				+ "O jogador ganha mais um ponto de vida.\r\n"
				+ "[2 â€“ PROSSEGUIR] Confia que o pai tÃ¡ monstro.\r\n"
				+ "O jogador receberÃ¡ um â€œbuffâ€� no seu ataque ou na defesa, vou analisar melhor depois.\r\n",TimeUnit.MILLISECONDS, temp_dialog);
		escolha = entrada.nextInt();
		
		do {
			switch(escolha) {
			case 1:
				Digita("MESTRE]: Toninho e Sheylla entram no Del Rey, e Toninho aproveita a viagem para descansar seus olhos.\r\n"
						+ "[MESTRE]:Nosso herÃ³i dorme tranquilo, apesar de tudo que vivenciou nestas Ãºltimas horas.\r\n"
						+ "[ALGUMAS HORAS DEPOIS...]\r\n",TimeUnit.MILLISECONDS, temp_dialog);
				break;
			case 2:
				Digita("Else if (escolha == 2) {\r\n"
						+ "[MESTRE]: Toninho e Sheylla entram no Del Rey em rumo Ã  sua prÃ³xima aventura\r\n",TimeUnit.MILLISECONDS, temp_dialog);
				break;
				default:
					System.out.println("\nOpÃ§Ã£o invÃ¡lida!");
					Digita("\nSelecione a sua resposta de acordo com o numero correspondente: \n"
							+ "[1 - DESCANSAR] Nois Ã© merecedor. \r\n"
							+ "O jogador ganha mais um ponto de vida.\r\n"
							+ "[2 â€“ PROSSEGUIR] Confia que o pai tÃ¡ monstro.\r\n"
							+ "O jogador receberÃ¡ um â€œbuffâ€� no seu ataque ou na defesa, vou analisar melhor depois.\r\n",TimeUnit.MILLISECONDS, temp_dialog);
					escolha = entrada.nextInt();
			}
			
		}while(escolha != 1 && escolha != 2);
	}

	static void instrucoes() {  // instruÃ§Ã£o do jogo

	}

	static void creditos() throws Exception{ // creditos finais 
		
		Digita(".::: CRÃ‰DITOS :::.\n> Alex Gama\n> Bruno Souza\n> Rafael Pereira Elias\n> Ruy Menezes \n",TimeUnit.MILLISECONDS, temp_dialog);
		menu();
	}
	static void intro () {
		
	}
	static void capitulo_1() {
		
	}
	static void capitulo_2() {
		
	}
	static void capitulo_3 () {
		
	}
	
}
