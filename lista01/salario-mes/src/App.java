import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    double salarioMes, salarioHr,horasMes, ir, inss, sindicato, salarioLiquido;

    System.out.println("informe qual é o seu salário por hora: ");
    salarioHr = teclado.nextDouble();

    System.out.println("informe a quantidade de horas trabalhadas neste mês: ");
    horasMes = teclado.nextDouble();
    teclado.close();

    salarioMes = horasMes * salarioHr;
    ir = salarioMes *0.11;
    inss = salarioMes * 0.08;
    sindicato = salarioMes *0.05;
    salarioLiquido = salarioMes - ir - inss - sindicato;

     System.out.println("você recebe R$: " + salarioMes + " de salário bruto");
     System.out.println("São descontados os seguintes itens de vc:" +   "Ir R$" + ir + "  de Inss R$" + inss + " e de sindicato R$" + sindicato);
 System.out.println("o seu salário liquido é: R$" + salarioLiquido);

    
  }
}