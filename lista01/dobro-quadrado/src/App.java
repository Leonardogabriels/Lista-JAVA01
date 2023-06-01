import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double lado, area;

    System.out.println("informe a medida de um dos lados");
    lado = teclado.nextDouble();
    teclado.close();

    area = Math.pow(lado, 2);
    System.out.println("O dobro da area do seu quadrado é:" +area * 2);
    }
}
