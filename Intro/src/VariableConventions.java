
public class VariableConventions {

	public static void main(String[] args) {
		 int age; // melhor forma de declaração de variáveis, tudo letra minuscula 
		    int $age; // possível, mas não recomendado!!!
		    int _age; // possível, mas não recomendado!!!
		    int age2; // pode ser utilizado porém o número nunca pode vir no início (2age, por exemplo)
		    int Age; // não recomendado
		    int AGE; // não recomendado para variáveis (por convênção é usado para constantes e será explicado mais pra frente)
		    
		    String firstName; // OK, estilo Camel Case, a primeira letra sempre minúsculo a segunda palavra començando com maiúscula, pois não pode ter espaço ou _
		    String lastName; // OK, lembrando que o nome da variável deve ser clara pois estamos programando para resolver problemas dos outros e o código precisa ser claro
		    
		    int String; // não podemos criar variáveis com palavras reservadas do sistema como: void, int, booblean, for. PORÉM, podemos usar string com letra minúscula e
		    //também String com letra maiúscula pois nesse caso String não é um tipo reservado e pertence a uma classe.


	}

}
