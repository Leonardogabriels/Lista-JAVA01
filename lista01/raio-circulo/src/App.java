import java.util.Scanner;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        double raio, area;

        System.out.println("digite o valor do raio");
        raio = teclado.nextDouble();
        teclado.close();

        area = Math.PI * Math.pow(raio,2);
        System.out.println("o valor da area do circulo é:" + area);
        
    }
}
