import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
      double altura, soma;
      int numero;

    System.out.println("informe sua altura :");
    altura = teclado.nextDouble();
    
    System.out.println("informe 1 para masculino e 2 para feminino");
     numero = teclado.nextInt();
     teclado.close();

    if (numero == 1){
        soma = (72.7 *altura) - 58;
      System.out.println("seu peso ideal é: " + soma); 
    }
    else if(numero == 2) {
      soma = (62.1 *altura) - 44.7;
      System.out.println("seu peso ideal é " + soma);
    }
    else{
        System.out.println("numero informado invalido, informe 1 para masculino e 2 para feminino");
    }
      
        
    
  }
}