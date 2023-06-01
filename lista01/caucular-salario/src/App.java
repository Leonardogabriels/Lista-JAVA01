import java.util.Scanner;
class Main{
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double salarioHora, salarioMes, salario;

        System.out.println("informe o valor recebido em horas:");
        salarioHora = teclado.nextDouble();

        System.out.println("informe a quantidade de horas trabalhadas no mês");
        salarioMes = teclado.nextDouble();
        teclado.close();

        salario = salarioHora * salarioMes;
        System.out.println("o valor do seu salario neste mês é: " + salario);
        
    }
}
