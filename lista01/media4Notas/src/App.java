import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double nota1,nota2,nota3, nota4, soma;
    
    System.out.println("Digite sua primeira nota:");
    nota1  = teclado.nextDouble();

    System.out.println("Digite sua segunda nota:");
    nota2 = teclado.nextDouble();

    System.out.println("Digite sua terceira nota. ");
    nota3 = teclado.nextDouble();

    System.out.println("Digite sua quarta nota: ");
    nota4 = teclado.nextDouble();
    teclado.close();

    soma = (nota1 + nota2 + nota3 + nota4)/4;
    System.out.println("A media de suas notas é: " + soma); 
  }
}