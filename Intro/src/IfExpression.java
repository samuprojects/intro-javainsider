
public class IfExpression { // introdução estruturas condicionais

	public static void main(String[] args) {
		 int idade = 25;
		    int pontos = 5;
		    
		    if (idade >=18){
		      //bloco só será executado se a condição for satisfeita
		      System.out.println("Maior de idade");
		      pontos = pontos * 2;
		    }
		    
		    System.out.println("Fim, Pontos: " + pontos);


	}

}
