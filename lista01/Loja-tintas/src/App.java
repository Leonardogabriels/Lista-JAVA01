import java.util.Scanner;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
    Double area, mts, latas, valor ;

    System.out.println("informe a quantidade de mts quadrados da area a ser pintada");
    area = teclado.nextDouble();
    teclado.close();

    mts = area / 3;
    latas = mts / 18;
    valor = latas * 80;

      System.out.print("você precisará comprar " + latas + " latas " + " e ficará no valor total de " + valor);
    
    }
}
