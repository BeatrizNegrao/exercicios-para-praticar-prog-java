package Exercicios_Vetores;

/*4) Faça um programa que leia 9 números inteiros e armazene-os num vetor. 
Armazene os números pares no vetor PAR e os números impares no vetor IMPAR. Imprima os 3 vetores.*/
public class Ex4 {
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        int numerosInteiros[] = { 1, 2, 3, 6, 8, 10, 5, 7, 4 }; // Criação de um vetor de inteiros com 9 elementos
        int[] pares = new int[9]; // Criação de um vetor para armazenar os números pares, com o mesmo tamanho do vetor original
        int[] impares = new int[9]; // Criação de um vetor para armazenar os números ímpares, com o mesmo tamanho do vetor original
        int countPares = 0; // Inicialização de um contador para rastrear quantos números pares foram encontrados
        int countImpares = 0; // Inicialização de um contador para rastrear quantos números ímpares foram encontrados

         // Loop que percorre todos os elementos do vetor de números inteiros
        for (int i = 0; i < 9; i++) {
            if (numerosInteiros[i] % 2 == 0) { // Verifica se o número atual é par
                pares[countPares] = numerosInteiros[i];// Se for par, armazena no vetor de pares na posição indicada pelo contador de pares
                countPares++; // Incrementa o contador de pares
            } else {
                impares[countImpares] = numerosInteiros[i]; // Armazena o número ímpar no vetor de ímpares na posição indicada pelo contador de ímpares
                countImpares++;  // Incrementa o contador de ímpares
            }
        }

        // Imprimir vetor numeroInteiros
        System.out.println("Numeros inteiros:"); 
        for (int num : numerosInteiros) { // loop for-each para imprimir a implementação do vetor numerosInteiros
            System.out.print(num + " ");
        }
        

        // Imprime vetor pares
        System.out.println("\nNúmeros pares: ");
        for (int i = 0; i < countPares; i++) { // Loop que percorre o vetor pares
            System.out.println(pares[i] + " ");
        }


        // Imprime vetor impares
        System.out.println("Números impares: ");
        for(int i = 0; i < countImpares; i++){  // Loop que percorre o vetor impares
            System.out.println(impares[i] + " ");            
        }
    }

}
