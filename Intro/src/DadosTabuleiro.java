
public class DadosTabuleiro { // esclarecido com explicação do prof em ExRollingDice

	public static void main(String[] args) {
		double dado1 = Math.random() * 6 + 1; // pesquisado conforme orientação do prof.
	    double dado2 = Math.random() * 6 + 1;
	    
	    int dados1 = (int) dado1; // casting devido casa decimal
	    int dados2 = (int) dado2;
	    
	    int jogada; // utilizado para as condições
	    
	    if (dados1 != 0 && dados2 !=0 && dados1 != dados2) {// depois do olhar do professor ficou desnecessário diversas condições por que o zero foi eliminado
	      jogada = dados1 + dados2;
	      System.out.println("O Dado 1 resultou em " + dados1 + ".");
	      System.out.println("O Dado 2 resultou em " + dados2 + ".");
	      System.out.println("Caminhe " + jogada + " casas no tabuleiro");
	    } else if (dados1 != 0 && dados2 !=0 && dados1 == dados2){// depois do olhar do professor ficou desnecessário diversas condições por que o zero foi eliminado
	      jogada = (dados1 + dados2) * 2;
	      System.out.println("O Dado 1 resultou em " + dados1 + ".");
	      System.out.println("O Dado 2 resultou em " + dados2 + ".");
	      System.out.println("GANHOU BONUS!!! O DOBRO DO RESULTADO DA SOMA DESTA JOGADA!!!");
	      System.out.println("Caminhe " + jogada + " casas no tabuleiro");
	    } else {// depois do olhar do professor ficou desnecessário diversas condições por que o zero foi eliminado
	      System.out.println("Não existe ZERO nos Dados, Jogue novamente!"); // dificuldades de implementar uma solução // superado após apoio tadeu java insider

	    }
	}

}
