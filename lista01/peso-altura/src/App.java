import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner( System.in);
        double altura, pesoiIdeal;

        System.out.println("Informe sua altura:");
        altura = teclado.nextDouble();
        teclado.close();

        pesoiIdeal= (72.7 * altura) -58;
        System.out.println("Seu peso ideal conforme altura informada é: " + pesoiIdeal);
        
    }
}
