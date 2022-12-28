
public class ExBhaskara { // fixando conceitos com operadoes matemáticos... equação 2º grau

	public static void main(String[] args) {
		 int a = 3;
		    int b = 0;
		    int c = -27;
		    
		    double delta = Math.pow(b, 2) - (4 * a * c);
		    
		    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		    
		    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		    
		    System.out.println("O delta é: " + delta);
		    System.out.println("O resultado de x1 é: " + x1);
		    
		    System.out.println("O resultado de x2 é: " + x2);


	}

}
