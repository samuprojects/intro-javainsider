
public class ExNumerosPrimos { //baseado no exercício ExPrimeNumber do professor

	public static void main(String[] args) {
		int n = 6;
	    boolean isPrime = true; // já declaro o valor booleano como verdadeiro para testar se em algum momento vira falso e interrompe a execução, resultanto em falso ou continuará como verdadeiro 
	    
	    if (n == 0 || n == 1) {// 0 e 1 não são primos então já elimino eles com falso usando a checagem de um ou outro 
	      isPrime = false;
	    } else {// como os primos são divisiveis apenas por um ou per ele mesmo, colocar para dividir por todos os números que vem antes do número escolhido pelo usuário e já eliminando o 1
	      for (int i = 2; i < n; i++){// por isso já começo com o 2 e uso o operador < dele próprio para não tentar dividir por ele mesmo
	        if (n % i == 0) {// verifica se o numero n é divisível pelo número da iteração, se for 0 então i é um divisor de n, por isso além de 1 e dele próprio tem outro divisor e logo não é mais primo
	          isPrime = false; // se isso aconteceu nem preciso mais testar condição nenhuma e posso usar o break abaixo para encerrar a repetição
	          break; // a hora que encontrar o primeiro divisor já encerra (pois já sei que 1 e ele mesmo estão fora)
	        }
	      }
	    }
	    
	    System.out.println(n + " é primo? --> " + isPrime); // ou seja, enquanto as condições dos blocos forem verdadeiras mantem e nem entra nos ifs, a hora que um dos blocos forem falso aí já deixa de ser verdadeiro
	   // existem diversas outras formas ou otimizações, segundo o professor, de testar os números primos, como por exemplo eliminando também o 2 pois é o único número primo par existente 
	// ou testar apenas metado do intervalo considerando um conceito matemático (não citado na aula).
	/* resposta do tadeu no fórum sobre se colocar o número 2 pra testar e porque não dá falso... 
	Nesse caso está correto, pois o 2 é o único número primo par. No for é verificado se o valor de i
	, que inicia com 2, é menor do que n, que também possui valor 2, então logo já na primeira iteração do for a condição 
	do laço de repetição não é satisfeita, pois i é igual a n ao invés de ser menor, nesse caso o que está dentro 
	do bloco for nem será executado, então na prática a operação do módulo acaba não sendo 
	realizada e o valor da variável isPrime permanece como true, da mesma forma como foi inicializada! 
	Se nesse caso o if do módulo fosse executado, realmente o resto da divisão 
	entre n(2) e i(2) resultaria em 0 e os isPrime passaria a ser false, mas nesse caso o programa estaria 
	se comportando de forma errada, pois o número 2 também é um número primo, então o isPrime tem que ser ser true!*/ 


	}

}
