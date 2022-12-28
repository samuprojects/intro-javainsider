
public class VariableRules {

	public static void main(String[] args) {
		// regras para inicialização de variáveis
		int n; // o int sozinho sem atribuição de valor roda mas não aparece nada
	    boolean c = true; // o boolean apesar de ter declarado como verdadeiro não rodará pois depende de teste
	    // o java não permite acessar uma variável não inicializada.
	    if (c) {
	      n = 1;
	    } else {// se comentar o else o compilador não roda o código, pois o Java não atribui nenhum valor genérico
	      // para a variável. Neste código só sabe-se que haverá valor atribuído na variável n após o teste da condição
	      // apesar do boolean já estar declarado como true o java não sabe disso por isso não roda do código.
	      n = 2; // já com a adição do else o compilador sabe que pelo menos uma das condições será testada e portanto
	      // haverá atribuição de valor
	    }
	    
	    System.out.println(n);


	}

}
