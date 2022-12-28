
public class Average { // array e enhanced-for combinados com operadores matemáticos para cálculo da média

	public static void main(String[] args) {
		double[] grades = new double[4];
	    grades[0] = 8.5;
	    grades[1] = 7.0;
	    grades[2] = 7.5;
	    grades[3] = 6.0;
	    
	    double sum = 0;
	    
	    for (double grade : grades){
	      sum = sum + grade;
	    }
	    double avg = sum / grades.length; // usando o length podemos dividir pelo tamanho do array que vai satisfazer a condição 
	    System.out.println("A média é: " + avg);


	}

}
