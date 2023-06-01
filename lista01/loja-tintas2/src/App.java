import java.util.Scanner;
import java.lang.Math;
class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       Double area, litro,latas, galoes,valorL,valorG,latasMisturadas, galoesMisturados, restoLitro,valorMisturado;

         System.out.println("Informe a quantidade total de metros da area a ser pintada ");
         area = teclado.nextDouble();
         teclado.close();

         litro = area /6 *1.1  ;
         latas = Math.ceil(litro / 18);
         valorL = latas * 80;

         System.out.println("a quantidade de tintas a serem compradas em latas de 18L é: " + latas + " o valor a ser pago será de:" + valorL);

         galoes = Math.ceil(litro/3.6) ;
         valorG =  Math.ceil(galoes * 25);

          System.out.println("a quantidade de tintas a serem compradas em galões de 3.6L é:" + galoes + " o valor a ser pago será de:" + valorG);
         
          latasMisturadas = Math.floor(litro/18);
         restoLitro =litro - (latasMisturadas *18);
         galoesMisturados = Math.ceil(restoLitro/3.6);
         valorMisturado = (latasMisturadas * 80) + (galoesMisturados * 25 );
         
         System.out.println("a quantidade a ser comprada de latas de 18L é:" + latasMisturadas + " e a quantidade de latas de 3.6L é:" + galoesMisturados + "o valor total será:" + valorMisturado);
        
        }
     }
