/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioarrayjava;

/**
 *
 * @author Aline
 */
public class ExercicioSobrecarga {
    public Integer X;
    public  String Y;
   public   Float Z;
     
     public void sobrecarga(int x,String y){
 // sobrecarga int, strinf        
     }
    public  void sobrecarga(Float z,String y){
// sobrecarga float, string         
     }
    public  void sobrecarga(Float z, int x){
//sobrecarga float, int    
    }
}
