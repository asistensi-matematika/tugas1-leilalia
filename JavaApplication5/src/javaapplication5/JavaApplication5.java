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
        double Diskriminan, AkarPolinomial1, AkarPolinomial2, m = 0, x, y, TitikStasioner, KecekunganKurva, NilaiMinimumLokal;
        
        System.out.println("Polinomial berderajat dua dimana");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        if(a!=0){
            
        System.out.println("Polinomial : " + a + "x^2 + " + b + "x + " + c);
        
        
        Diskriminan = (b*b) - (4*a*c);
        System.out.println("1." + "Diskriminan              = " + Diskriminan);
        
        AkarPolinomial1 = (int) (((-b) + (Math.sqrt(Math.pow(Diskriminan,(0.5)))))/(2*a));
        AkarPolinomial2 = (int) (((-b) - (Math.sqrt(Math.pow(Diskriminan,(0.5)))))/(2*a));

        System.out.println("2." + "Akar - akar polinomial   = " + AkarPolinomial1 + " dan " + AkarPolinomial2);
        
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
    }
    
}
