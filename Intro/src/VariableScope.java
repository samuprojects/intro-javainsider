
public class VariableScope { //escopo da variável trata da visibilidade de uma variável de acordo onde é escrita

	public static void main(String[] args) {
		 int v1 = 1;
		    
		    while (v1 > 10) {
		      int v2 = 10;
		      v1++;
		    }
		    
		    //System.out.println(v2); // se tirar o comentário no início da linha não vai compilar pois o v2 está dentro do escopo do while
		    // nesse caso a variável v2 só existe dentro do escopo do while, já a v1 está dentro do main e pode ser visualizada no decorrer de todo código
		    int i = 0;
		    for (; i< 10; i++) {// nesse caso não é muito comum mas a inicialização do for está vazio pois i foi declarado no main, seguindo apenas com a condição e o incremento
		      System.out.println(i); // pode ser impresso tanto aqui dentro do for quanto fora no main
		    }
		    
		    System.out.println("=>" +i); // se tivesse só dentro do for não compilaria pois ela só existiria lá e no momento da execução do bloco, após isso ela deixa de existir no caso do for ou while


	}

}
