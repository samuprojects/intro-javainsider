
public class ForIteration { // utilizando FOR em arrays

	public static void main(String[] args) {
		double[] grades = new double[4]; // definido inicialização de array de 4 posições
	    grades[0] = 8.5; // definido valores individuais para cada índice
	    grades[1] = 7.0;
	    grades[2] = 7.5;
	    grades[3] = 6.0;
	    
	    for (int i = 0; i < grades.length; i++) { // i vai controlar as iterações sobre o array começando em zero até o tamanho total checado por grades.length
	      double g = grades[i]; // a cada iteração o valor a ser impresso é armazenado em g através do índice do array
	      System.out.println("-> " + g);
	    }
	    System.out.println(); // acrescentado apenas para pular uma linha com o exemplo a seguir
	    
	    for (int i = grades.length -1; i >= 0; i--) { // aqui a condição foi invertida de forma que i é igual o tamanho total -1
	      double g = grades[i]; // na condição também é o inverso quando chegar no tamanho zero (índice 0) encerra o decremento
	      // cada valor a ser impresso na tela é armazenado em g por meio do índice
	      System.out.println("-> " + g);
	    }

	}

}
