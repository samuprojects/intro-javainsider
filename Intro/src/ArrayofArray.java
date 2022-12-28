
public class ArrayofArray { //introdução Array de Arrays - ou referenciado pelo nome de matriz

	public static void main(String[] args) {
		//String[][] array = new String[2] [3];
	    
	    String[][] array = { // a estrutura se assemelha a linhas e colunas de uma tabela
	      { "A", "B", "C"}, // para criar esse array é preciso informar o tamanho das duas dimensões
	      { "D", "E", "F"} // e para acessar elementos do array precisa fazê-lo por meio de dois índices
	    };
	    
	    for (int i = 0; i< array.length; i++){
	      for (int j = 0; j < array[i].length; j++) {
	        System.out.print(array[i][j] + " ");
	      }
	      System.out.println();

	    }
	}

}
