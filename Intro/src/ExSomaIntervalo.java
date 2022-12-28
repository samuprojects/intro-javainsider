
public class ExSomaIntervalo { // exercícios - comando intervalos

	public static void main(String[] args) { //ref ao exercício ExSumNumbers ... soma de valores de 0 a n, professor utilizou for, utilizei while

		int n = 10;
	    int i = 1;
	    int soma = 0;    
	    while(i <= n){
	      soma = soma + i;
	      i++;
	    }    
	    System.out.println("Bem vindo ao seu programa de soma de números inteiros!");
	    System.out.println("Escolha um número para execução do cálculo...");
	    System.out.println("Você escolheu o número " + n + ".");
	    System.out.println("A soma dos valores de 0 até " + n + " é igual a " + soma + ".");
		}


	}

