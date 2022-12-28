
public class DaysInMonths2 {

	public static void main(String[] args) {
		int month = 2;
	    int year = 1997; // incluído variável ano para testar condição se ano é bissexto ou não específico para fevereiro
	    int numDays;
	    
	    if (month == 2){// abaixo segue teste de condição para validar 29 dias (ano bissexto) se escolhido fevereiro
	      if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
	        numDays = 29;
	      } else {// caso a condição acima não seja satisfeita mantém os 28 dias se escolhido mês de fevereiro
	      numDays = 28;
	      }
	    } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
	      numDays = 31;
	    } else {
	      numDays = 30;
	    }
	    // mantido abaixo melhoria mencionada pelo professor sobre usuário digitar qualquer número para o mês, inclusive negativo, não previsto no meu primeiro código 
	    if (month < 1 || month > 12){ System.out.println ("Mês incorreto! Digite um valor válido de 1 a 12.");
	    } else System.out.println ("O mês " + month + " possui " + numDays + " dias.");

	}

}
