
public class ExSeqFibonacci { // exercícios estruturas de repetição - sequencia Fibonacci

	public static void main(String[] args) {
		int v1 = 1;
	    int v2 = 1;
	    
	    System.out.println(v1); //aqui já imprimi o primeiro valor da sequência 
	    System.out.println(v2); //aqui já imprimi o segundo valor da sequência 
	    
	    for (int i = 3; i <= 15; i++) { //aqui 
	     int v3 = v1 + v2;
	      System.out.println(v3);
	      
	      v2 = v1;
	      v1 = v3;
	    }
	}

}
