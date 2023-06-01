import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
    double peso, limite, excesso, multa;

    System.out.println("informe a quantidade total de kg pescados");
      peso = scanner.nextDouble();
      scanner.close();

    limite = 50;
    excesso = peso - limite;

    if( excesso > 0){
    multa = excesso * 4;
        System.out.println("Você terá que pagar o valor de R$ " + multa + " por " + excesso + "kg de excesso de peso");
    }
    else
      System.out.println("Você esta dentro dos limites de peso permitido.");
    


    
      
        
  }
}