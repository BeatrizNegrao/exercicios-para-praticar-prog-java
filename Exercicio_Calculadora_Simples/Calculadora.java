import java.util.Scanner;
//Fça uma calculadora em java que receba dois números e depis realize as operações aritméticas 
public class Calculadora {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double num1, num2, soma, sub, mult, div;

        System.out.println("Digite o primeiro número: ");
        num1 = ler.nextDouble();

        System.out.println("Digite o segunfo número: ");
        num2 = ler.nextDouble();

        soma = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divisão: " + div);
    }
}
