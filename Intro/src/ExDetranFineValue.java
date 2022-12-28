
public class ExDetranFineValue { // baseado no exercicio ExFinePaymentCalculation , operadores matemáticos, relacionais e condições.

	public static void main(String[] args) {
		int velocidade = 122;
	    double valorMulta;
	    
	    if (velocidade <= 80) {
	      valorMulta = 0;
	    } else if (velocidade > 80 && velocidade <= 100) {
	      valorMulta = 67;
	    } else {// não saiu este pensamento de primeira
	      valorMulta = 70 + (velocidade - 100) * 10;
	    }
	    	
	    System.out.println("O valor da multa é de R$" + valorMulta + " reais.");


	}

}
