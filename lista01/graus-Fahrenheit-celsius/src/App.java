import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double grausCelsius,grausFahrenheit;
        
        System.out.println("informe a temperatura em graus Celsius");
        grausCelsius = teclado.nextDouble();
        teclado.close();

        grausFahrenheit = (grausCelsius *1.8) + 32;
        System.out.println("a sua temperatura convertida em Fahrenheit é: " + grausFahrenheit);
    }
}
