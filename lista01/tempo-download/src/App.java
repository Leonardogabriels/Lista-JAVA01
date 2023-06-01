import java.util.Scanner;
class Main {
    public static void main(String[] args) throws Exception {
           Scanner teclado = new Scanner(System.in);
            double velocidade, arquivo, download;

            System.out.println("informe o tamanho do arquivo para download (em MB)");
            arquivo = teclado.nextDouble();

            System.out.println("informe a velocidade do link de Internet em Mbps");
            velocidade = teclado.nextDouble();
            teclado.close();

            download = arquivo / (velocidade/8) / 60;
            System.out.println("o tempo gasto em minutos para realizar este download é:"+ download);
            
    }
}
