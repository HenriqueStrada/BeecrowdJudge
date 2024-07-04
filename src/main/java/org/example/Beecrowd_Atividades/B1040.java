package org.example.Beecrowd_Atividades;

import java.util.Scanner;

public class B1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, n4, exame, media, media_final;

        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        n4 = sc.nextDouble();
        exame = sc.nextDouble();

        // Cálculo da média ponderada
        media = (n1 * 2.0 + n2 * 3.0 + n3 * 4.0 + n4) / 10.0;
        media_final = (exame + media) / 2;

        if (media >= 7) {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");
        } else if (media < 7 && media >= 5) {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno em exame.");
            System.out.printf("Nota do exame: %.1f\n", exame);
            if (exame >= 5) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", media_final);
            } else {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n", media_final);
            }
        } else {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno reprovado.");
        }
    }
}
