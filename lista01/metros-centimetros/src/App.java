import java.util.Scanner;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite qual a metragem você quer transformar em cm");
        double metragem, centimetro;

        metragem = teclado.nextDouble();
        teclado.close();

        centimetro = metragem * 100;
        System.out.println("a quantidade em cm é: " + centimetro +"cm");
        
            }
        }
    

