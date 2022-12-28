
public class DaysInMonths { // treinando condições e operadores lógicos (tabela verdade)

	public static void main(String[] args) {
		int month = 13;
	    int numDays;
	    
	    if (month == 2){
	      numDays = 28;
	    } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
	      numDays = 31;
	    } else {
	      numDays = 30;
	    }
	    
	    if (month == 0 || month > 12){ System.out.println ("Mês incorreto! Digite um valor válido de 1 a 12.");
	    } else System.out.println ("O mês " + month + " possui " + numDays + " dias.");
	  
	}

}
