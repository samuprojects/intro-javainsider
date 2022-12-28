
public class BreakingLoop { // break para encerrar loops nas estruturas de repetição

	public static void main(String[] args) {
		while (true){// aqui a condição sempre verdadeira vai gerar números aleatórios infinitamente, porém, com o break posso quebrar o loop e parar o programa
		      int n = (int) (Math.random() * 100) + 1;
		      System.out.println(n);
		      
		      if (n > 50) {
		        break;
		      }
		    }
		    
		    System.out.println("Entrontrou número falso");


	}

}
