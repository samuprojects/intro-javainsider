
public class ExSumNumbers { // professor utilizou FOR para resolução

	public static void main(String[] args) {
		int n = 10;
	    int sum = 0; // além da variável de controle do for acrescentou sum (no main) para armazenar a soma da variável e exibir no final
	    
	    for (int i = 1; i <= n; i++){
	      sum = sum + i;
	    }
	    
	    System.out.println("A soma é: " + sum);


	}

}
