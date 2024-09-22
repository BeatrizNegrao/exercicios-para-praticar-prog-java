package Exercicios_Vetores;

//2) Faça um programa que leia um vetor de 10 números inteiros e mostre-os na ordem inversa.  
public class Ex2 {
    public static void main(String[] args) {
        int vetor[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i < 10; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("------------------------------------------------");
        inverteVetor(vetor);
    }

    public static void inverteVetor(int v1[]) {
        int aux[] = new int[10];

        for (int i = 0; i < 10; i++) {
            aux[i] = v1[9 - i];

            System.out.println(aux[i]);
        }

    }
}
