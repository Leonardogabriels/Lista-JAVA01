import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2;
        double numero3, soma1, soma2, soma3;

        System.out.println("informe o primeiro numero inteiro:");
        numero1 = teclado.nextInt();

        System.out.println("Informe o segundo numero inteiro:");
        numero2 = teclado.nextInt();
        
        System.out.println("Agora me informe um numero real:");
        numero3 = teclado.nextDouble();
        teclado.close();

        soma1 = numero1 * 2 + (numero2 / 2) ;
        soma2 = numero1 * 3 + numero3;
        soma3 = Math.pow(numero3,3);
        
        System.out.println("a soma do dobro do primeiro numero com metade do segundo é: "+ soma1 );
        System.out.println(" a  soma do triplo do primeiro numero com a soma do terceiro é: " + soma2);
        System.out.println("o terceiro numero elevado ao cubo é: " + soma3);
    }
}
