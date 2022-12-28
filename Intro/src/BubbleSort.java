import java.util.Arrays;

class BubbleSort { // fixando arrays 
  public static void main(String[] args) { // Este programa vai ordenar os valores do array do menor para o maior fazendo a verificação um a um dos números
    
    int[] array = { 5, 4, 6, 2, 7, 6 }; 
    
    System.out.println(Arrays.toString(array)); // lembrando que para Arrays.toString funcionar precisa do import java.util.Arrays;
     
    for (int i = 0; i < array.length -1; i++){ // para varrer todo array e atribuir os valores em i
      for (int j = i + 1 ; j < array.length; j++){ // para varrer o array na frente do i
        if (array[i] > array[j]) { // se o i for maior que o j troca de posição pra que o menor venha primeiro
          int t = array[i]; // essa variável é de controle para não perder o valor de i logo no início com a atribuição do valor de j
          array[i] = array[j]; // aqui o i recebe o valor de j caso seja maior que o j
          array[j] = t; // aqui o j recebe o valor de i que será testado mais vezes até o fim do array e efetuando todas as trocas para ordenar do menor pro maior
        }        
      }    
    }
    
    System.out.println(Arrays.toString(array)); // aqui vai apresentar os valores ordenados após os testes
  }
}