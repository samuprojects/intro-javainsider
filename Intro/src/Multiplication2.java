
public class Multiplication2 { // outra forma de apresentar a tabuada, agora usando o WHILE

	public static void main(String[] args) {
	    
	    int n = 4;
	    int i = 1; // variável de controle
	    
	    while (i <= 10) {// condição para repetição e critério de parada ao mesmo tempo
	      System.out.println(n + " x " + i + " = " + n * i); // se parar aqui vai dar loop infinito
	      i++; // não esquecer do incremento, explicado que pode alterar o incremento pelo vaor que quiser, exemplo i = i + 2; vai executar de 2 em 2 a tabuada
	      // outra informação é que poderia inverter a condição e usar o decremento (i--) para imprimir a tabuada ao contrário
	    }// não tem melhor ou pior, do ponto de vista técnico, dependo apenas do cenário, tudo que faz com while pode ser feito com o for
	    // o for geralmente é utilizado quando se tem o intervalo de início e fim bem definido
	  }// já o while é utilizado quando não se sabe quantas vezes a repetição vai ser feita, então enquanto a condição for satisfeita o bloco repete.
	}

