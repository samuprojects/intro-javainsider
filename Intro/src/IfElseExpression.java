
public class IfElseExpression { //estruturas condicionais if else

	public static void main(String[] args) {
		int idade = 18;
	    // o else não pode ser usado sozinho porém combinado com o if permite apresentar um ou outro resultado apenas com 1 teste de condição
	    if (idade >=18){
	      System.out.println("Maior de idade");
	    } else { // se não usasse o else aqui teria que testar dois ifs para verificar se a pessoa é maior de idade ou não
	      System.out.println("Menor de idade");
	    }    
	    
	    System.out.println("Fim");


	}

}
