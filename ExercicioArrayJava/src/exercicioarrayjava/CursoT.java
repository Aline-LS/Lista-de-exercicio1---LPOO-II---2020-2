/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioarrayjava;

import java.util.Scanner;

/**
 *
 * @author Aline
 */
public class CursoT {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Curso: ");
        String nomecurso = sc.nextLine();

        System.out.println("Digite as Notas: ");
        double[] notas = new double[10];
        for (int c = 0; c < notas.length; c++) {
            System.out.println("Digite a " + (c + 1) + "º nota: ");
            notas[c] = sc.nextDouble();
        }
        Curso cs = new Curso(notas, nomecurso);
        System.out.println("Média: " + cs.getMedia());
        System.out.println("Maior nota: " + cs.getMaior());
    }
    
}
