import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codFuncionario, horas;
        double valorPorHoras, salario;

        codFuncionario = sc.nextInt();
        horas = sc.nextInt();
        valorPorHoras = sc.nextDouble();

        salario = valorPorHoras * horas;

        System.out.println("NUMBER = "+ codFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }
}