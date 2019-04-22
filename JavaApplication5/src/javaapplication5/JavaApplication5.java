/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.util.Scanner;
import java.math.MathContext;
/**
 *
 * @author Lenovo
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int a,b,c;
        double Diskriminan, AkarPolinomial1, AkarPolinomial2, AkarPolinomial11, AkarPolinomial12 = 0, AkarPolinomial13, AkarPolinomial21, AkarPolinomial22, AkarPolinomial23, m = 0, x, y, TitikStasioner, KecekunganKurva, NilaiMinimumLokal;
        System.out.println("Polinomial berderajat dua dimana");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        if(a!=0){
            
        System.out.println("Polinomial : " + a + "x^2 + " + b + "x + " + c);
        
        
        Diskriminan = (b*b) - (4*a*c);
        System.out.println("1." + "Diskriminan              = " + Diskriminan);
        
          if(Diskriminan==0){
            AkarPolinomial1 = -b/(2*a);
            System.out.println("2.Akar-akar polinomial    = " + AkarPolinomial1);
            
        }else if(Diskriminan>0){
          AkarPolinomial1 = ((-b) + Math.sqrt(Diskriminan))/(2*a); 
          AkarPolinomial2 = ((-b) - Math.sqrt(Diskriminan))/(2*a);
          AkarPolinomial1*=1000;
          AkarPolinomial11 = Math.floor(AkarPolinomial1);
          AkarPolinomial11/=1000;
          AkarPolinomial2*=1000;
          AkarPolinomial21 = Math.floor(AkarPolinomial2);
          AkarPolinomial21/=1000;
          System.out.println("2.Akar-akar polinomial    = " + AkarPolinomial11 + " dan " + AkarPolinomial21);
          
        }else if(Diskriminan<0 && b==0){
          AkarPolinomial1 = (((-b) + Math.sqrt((-Diskriminan)))/(2*a)); 
          AkarPolinomial2 = (((-b) - Math.sqrt((-Diskriminan)))/(2*a));   
          AkarPolinomial1*=1000;
          AkarPolinomial11 = Math.floor(AkarPolinomial1);
          AkarPolinomial11/=1000;
          AkarPolinomial1*=1000;
          AkarPolinomial21 = Math.floor(AkarPolinomial2);
          AkarPolinomial21/=1000;
          System.out.println("2.Akar-akar polinomial = " + AkarPolinomial11 + "i dan " + AkarPolinomial21 + "i");
          
          
        }else if(Diskriminan<0 && b!=0){
          AkarPolinomial1 = (int)-b/(2*a); 
          AkarPolinomial1*=1000;
          AkarPolinomial13 = Math.floor(AkarPolinomial1);
          AkarPolinomial13 /=1000;
          
                    AkarPolinomial11 = (Math.sqrt(-Diskriminan))/(2*a);
          AkarPolinomial11*=1000;
            double AkarPolinomia12 = Math.floor(AkarPolinomial11);
          AkarPolinomial12 /=1000;
          
          AkarPolinomial2 = (int)-b/(2*a); 
          AkarPolinomial2*=1000;
          AkarPolinomial23 = Math.floor(AkarPolinomial2);
          AkarPolinomial23 /=1000;
          
          AkarPolinomial21 = (Math.sqrt(-Diskriminan))/(2*a);
          AkarPolinomial21*=1000;
          AkarPolinomial22 = Math.floor(AkarPolinomial21);
          AkarPolinomial22/=1000;
            String akar12;
             System.out.println("2.Akar-akar polinomial    = " + AkarPolinomial13 + " + " + AkarPolinomial12 + "i dan " + AkarPolinomial23 + " - " +AkarPolinomial22 + "i");
        }  
        
        if (m==0){
            x = (-b)/(2*a);
            y = (-((-b)/(2*a)))/(4*a);
            System.out.println("3." + "Titik Stasioner          = " + "(" + x + "," + y + ")");
            
        if (a>0){
            System.out.println("4." + "Kecekungan Kurva         = atas ");
        }
        if (a<0){
            System.out.println("4." + "Kecekungan Kurva         = bawah ");
        }
        
        System.out.println("5." + "Nilai Minimum Lokal      = " + y);   
        }}
        
        else if (a==0){
            System.out.println("Nilai a tidak boleh 0");
}}}