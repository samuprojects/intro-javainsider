
public class ExRollingDice {

	public static void main(String[] args) {
		int d1 = (int) (Math.random() * 6) +1; //professor já fez a conversão direto no Math.random e soma para evitar o zero
	    int d2 = (int) (Math.random() * 6) +1;
	       
	    System.out.println("D1 = " + d1);
	    System.out.println("D2 = " + d2);
	    
	    int sum = d1 + d2;
	    
	    if (d1 == d2){
	      sum = sum * 2;
	    }
	    
	    System.out.println("Casas = " + sum);


	}

}
