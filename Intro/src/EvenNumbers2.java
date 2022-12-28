
public class EvenNumbers2 { // estrutura repetição WHILE

	public static void main(String[] args) {
		int min = 1;
	    int max = 20;
	    
	    int i = min; // no for a variável de controle era declarado dentro da estrutura do for (sessão de inicialização)
	    // no caso do while (não tem essa sessão) ela deve ser declarado fora, pois no while vai estar apenas a condição de repetição "enquanto situação X"

	    while (i <= max){ // tomar cuidado com essa estrutura pois em algum momento ele tem que ser falsa, senão estará em loop infinito
	      if (i % 2 == 0) {	// na condição do while testa o intervalo declarado no i que recebe o valor de min, no if verifica o resto da divisão
	        System.out.print(i + " ");
	      }
	      i++; // diferente do for no while também não há uma sessão de incremento, por isso dentro do bloco while precisa declarar o i++ para não entrar em loop infinito
	    }// se comentar a linha acima será percebido isso, ficar atento na vida real.


	}

}
