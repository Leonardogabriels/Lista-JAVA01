import java.util.Scanner;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double grausCelsius, grausf;

        System.out.println("informe a temperatura em graus Fahrenheit");
        grausf = teclado.nextDouble();
        teclado.close();

        grausCelsius = 5 *(grausf - 32) / 9;
        System.out.println("a quantidade informada convertida em graus Celsius é: " + grausCelsius);
    }
}
