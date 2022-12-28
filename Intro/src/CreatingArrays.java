import java.util.Arrays; // a importação dessa classe Arrays é quem permite o método "Arrays.toString" funcionar como esperado

public class CreatingArrays { // introdução aos Arrays (vetores)

	public static void main(String[] args) {
		int[] array1 = { -1, 0, 4, 10 }; // essa é uma forma de inicializar arrays no java, e o java já sabe o tamanho do array por conta dos elementos solicitados para criação
	    String[] array2 = new String[3]; // aqui outra forma de iniciar arrays no java só que aqui há só o tamanho dele e os valores vazios
	    array2[1] = "abc"; // agora sim foi atribuído um valor para esse elemento do array que está na posição 2 do array porém indice 1 devido a contagem do índice começar em ZERO
	    
	    System.out.println(array1); // o array em java é um objeto e com esse comando ele imprime o endereço de memória
	    System.out.println(Arrays.toString(array1)); // para imprimir os elementos do array trocamos por um método chamado "Arrays.toString" que vai retornar uma representação em string desse array, porém ver **
	    System.out.println(array1.length); // aqui será impresso o tamanho do array

	    System.out.println(Arrays.toString(array2)); // nesse caso como só atribui valores em apenas 1 elemento, os outros vão apresentar null (vazio)
	    System.out.println(array2.length);


	}

}
