
public class Casting {

	public static void main(String[] args) {
		 int a = 5 / 2; // o resultado não será 2,5 porque a variável é do tipo inteiro e vai "truncar" o que viria depois da vírgula resultando em 2;
		    double b = 5 / 2; // mesmo que use double o resultado será 2.0 porque os valores apresentados são inteiros e o java segue o tipo mais abrangente apresentado;
		    double c = 5.0 / 2; // agora sim quando um dos valores é apresentado com a casa decimal o valor final será com a casa decimal 2,5 porque double é mais abrangente;
		    double d = 5 / 2.0; // qualquer um dos valores que possuir o critério double vai permitir que o resultado apresenta a casa decimal no 2,5 que não aparecia antes.
		    double e = (double) 5 / 2; // nesse modelo os números inteiros são convertidos para double apresentando o resultado correto 2,5 (lembrando que 2,5 é no formato BR, na linguagem sempre usa . (ponto))
		    //int f = e;  // aqui vai dar erro (se tirar o comentário) dizendo que não é possível atribuir um double dentro do int (por conta de não aceitar casas decimais);
		    int f = (int) e; // para resolver o problema da linha acima pode-se converter o valor de double para int (USANDO O CASTING) porém vai perder o valor das casas decimais
		    
		    // PORTATO FICAR ATENTO NAS CONVERSÕES DE TIPOS DE DADOS USANDO O CASTING
		    
		    System.out.println("a = " + a);
		    System.out.println("a = " + b);
		    System.out.println("a = " + c);
		    System.out.println("a = " + d);
		    System.out.println("a = " + e);
		    System.out.println("a = " + f);
		  }
		
		 /* COMENTÁRIO REFERENTE A AULA SEGUINTE SOBRE EXPLICAÇÃO DO CASTING
		 int i = 10;
		 double d = 5;
		 
		 int r = i; ok pro java, não há casting!
		 double r = d; ok pro java, não há casting!
		 double r = i; ok pro java, casting implícito, pois o double é mais abrangente que o int!
		 int r = d; não funciona pois o compilador não vai permitir essa atribuição devido a imprecisão do resultado (perda de dado) pois int não aceita casa decimal
		 int r = (int) d; ok pro java, casting explícito! Você está dizendo pro compilador que assume qualquer cagada por esse tipo de atribuição, nesse caso pela perda do valor na casa decimal.
		 
		 */


	}


