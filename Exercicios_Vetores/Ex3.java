package Exercicios_Vetores;

//3) Faça um programa que leia 4 notas, mostre as notas e a média na tela. 
public class Ex3 {

    public static void main(String[] args) {
        int notas[] = {10, 8, 9, 7};//Declara e inicializa um vetor de inteiros com 4 notas.
        double soma = 0;//Declara a variável para armazenar a soma total das notas.

        //Mostra as notas.
        System.out.println("Notas: ");
        for (int i = 0; i < notas.length; i++) {//Loop for para percorrer todos os elementos do vetor notas.
            System.out.println(notas[i]);//Imprime o valor da nota na posição(i) do vetor.
            soma = soma + notas[i]; //Adiciona o valor da nota atual(i) na variável soma.
        }

        //Calcula a média das notas 
        double media = soma / notas.length;
        System.out.println("Média: " + media); //Imprime a média calculada.

    }
}
