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
public class CarroT {
   
 public static void main(String[] args) {
     String modelo;
     Scanner ler = new Scanner(System.in);
     int ano;
     Scanner ler1 = new Scanner(System.in);
     Scanner ler2 = new Scanner(System.in);

     
        System.out.println("Digite o modelo do carro: ");
        modelo = ler.next();

        System.out.println("Digite o ano: ");
        ano = ler1.nextInt();

        System.out.println("Digite os preços; ");
        int s = 0;
        double[] preco = new double[s];
        for (int c = 0; c < preco.length; c++) {
            System.out.println(" Digite o " + (c + 1) + "º preço: ");
            preco[c] = ler2.nextDouble();
        }
        
        Carro ca = new Carro (modelo, preco, ano);
        
        System.out.println("Media de preços; " + ca.getMedia());
        System.out.println("Maior Preço: " + ca.getMaior());
        System.out.println("Menor Preço: " + ca.getMenor());
                 
        
        
    }
    


}
