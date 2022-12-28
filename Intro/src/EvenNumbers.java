
public class EvenNumbers { // repetição de código com estrutura FOR

	public static void main(String[] args) {
		 int min = 10;
		    int max = 60;
		    
		    for(int i = min; i <= max; i++){ // o int i nesse caso é a variável de controle declarado dentro do for
		    if (i % 2 == 0) { // essa condição testa se o resto da divisão é 0 que compreende ao que "sobrou" quando números pares
		      System.out.print(i + " "); // System.out.print imprime sem quebra de linha e a concatenação evita vir tudo grudado os números
		    }
		    }

	}

}
