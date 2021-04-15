/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.Scanner;

public class Trabalho {

    int mod;

    Scanner entrada = new Scanner(System.in);

    void escolha() {
        System.out.println(">>Qual das seguintes ordenações de dados você deseja saber como funciona?<<");
        System.out.println("[1]Bubble sort");
        System.out.println("[2]Selection sort");
        System.out.println("[3]Insertion sort");
        System.out.println("[4]Quick sort");
        mod = entrada.nextInt();

        switch (mod) {
            case 1:
                System.out.println("Bubble sort é um algoritmo de ordenação");
                System.out.println("dos mais simples. A ideia é percorrer o vector diversas vezes, e a cada");
                System.out.println("passagem fazer flutuar para o topo o maior elemento da sequência.");
                System.out.println("Esse é um pequeno exemplo de como funciona o Bubble sort:");
                System.out.println("[4, 5, 3, 2, 1]");
                System.out.println("[4, 3, 5, 2, 1]");
                System.out.println("[4, 3, 2, 5, 1]");
                System.out.println("[4, 3, 2, 1, 5]");
                System.out.println("[3, 4, 2, 1, 5]");
                System.out.println("[3, 2, 4, 1, 5]");
                System.out.println("[3, 2, 1, 4, 5]");
                System.out.println("[3, 2, 1, 4, 5]");
                System.out.println("[2, 3, 1, 4, 5]");
                System.out.println("[2, 1, 3, 4, 5]");
                System.out.println("[2, 1, 3, 4, 5]");
                System.out.println("[2, 1, 3, 4, 5]");
                System.out.println("[1, 2, 3, 4, 5]");

                break;

            case 2:
                System.out.println("Selection sort  é um algoritmo de ordenação baseado em se passar sempre o ");
                System.out.println("menor valor do vetor para a primeira posição, depois o de segundo menor ");
                System.out.println("valor para a segunda posição, e assim é feito sucessivamente com os n-1");
                System.out.println("elementos restantes, até os últimos dois elementos.");
                System.out.println("Esse é um pequeno exemplo de como funciona o Selection sort:");
                System.out.println("[70, 90, 1, 3, 0, 100, 2]");
                System.out.println("[0, 90, 1, 3, 70, 100, 2]");
                System.out.println("[0, 90, 1, 3, 70, 100, 2]");
                System.out.println("[0, 1, 90, 3, 70, 100, 2]");
                System.out.println("[0, 1, 90, 3, 70, 100, 2]");
                System.out.println("[0, 1, 2, 3, 70, 100, 90]");
                System.out.println("[0, 1, 2, 3, 70, 100, 90]");
                System.out.println("[0, 1, 2, 3, 70, 90, 100]");
                break;

            case 3:
                System.out.println("Insertion sort é um algoritmo de ordenação que, dado uma estrutura constrói");
                System.out.println("uma matriz final com um elemento de cada vez, uma inserção por vez.");
                System.out.println("Esse é um pequeno exemplo de como funciona o Insertion sort:");
                System.out.println("[9, 13, 16, 21, 12, 32]");
                System.out.println("[9, 13, 16, 12, 21, 32]");
                System.out.println("[9, 13, 12, 16, 21, 32]");
                System.out.println("[9, 12, 13, 16, 21, 32]");
                break;

            case 4:
                System.out.println("Quick sort é um método de ordenação muito rápido e eficiente, ele  baseia-se ");
                System.out.println("em uma rotina fundamental cujo nome é particionamento. Particionar significa ");
                System.out.println("escolher um número qualquer presente no array, chamado de pivot, e colocá-lo ");
                System.out.println("em uma posição tal que todos os elementos à esquerda são menores ou iguais e ");
                System.out.println("todos os elementos à direita são maiores.");
                System.out.println("Esse é um pequeno exemplo de como funciona o Quick sort:");
                System.out.println("[1  2  3  4  5  6  7  8]");
                System.out.println("[1  2  3  4  5  6  7] 8 ");
                System.out.println("[1  2  3  4  5  6] 7  8 ");
                System.out.println("             :          ");
                System.out.println("[1] 2  3  4  5  6  7  8 ");
                System.out.println(" 1  2  3  4  5  6  7  8 ");
                break;

        }
    }

    public static void main(String[] args) {

        Trabalho ordenacao = new Trabalho();

        ordenacao.escolha();
    }

}
