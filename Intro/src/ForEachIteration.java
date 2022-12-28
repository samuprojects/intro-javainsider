
public class ForEachIteration { // enhanced-for com arrays

	public static void main(String[] args) {
		double[] grades = new double[4];
	    grades[0] = 8.5;
	    grades[1] = 7.0;
	    grades[2] = 7.5;
	    grades[3] = 6.0;
	    
	    for (double g : grades){ // essa estrutura sempre itera do índice zero até o final somente 
	      System.out.println("-> " + g);
	      }// se colocar um break por exemplo após a primeira iteração o loop é encerrado 
	    
	  }// o ponto fraco é que não permite outros resultados como inverter os valores, etc.
}
