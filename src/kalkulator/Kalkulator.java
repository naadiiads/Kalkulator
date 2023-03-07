/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulator;

import java.util.Scanner;

public class Kalkulator {
    public int angka1, angka2;
    String pilihan;
    double hasil = 0;
    
    public Kalkulator(int angka1, int angka2, String pilihan) {
        this.angka1 = angka1;
        this.angka2 = angka2;
        this.pilihan = pilihan;
    }
    
    public double hasil() {
        
        switch(pilihan) {
            case "+":
                hasil = angka1+angka2;
                break;

            case "-":
                hasil = angka1-angka2;
                break;

            case "x":
                hasil = angka1*angka2;
                break;

            case ":":
                hasil = angka1/angka2;
                break;
             
            default:
                System.out.println("Operator Salah!");
        }
        return hasil;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Angka 1 : ");
        int angka1 = input.nextInt();
        
        System.out.print("Masukkan Angka 2 : ");
        int angka2 = input.nextInt();
        
        System.out.print("Masukkan Pilihan Anda (+ / - / x / :) : ");
        String pilihan = input.next();
        
        Kalkulator calculator = new Kalkulator(angka1, angka2, pilihan);
        
        System.out.println(angka1+" "+pilihan+" "+" "+angka2+" = "+calculator.hasil());
    }
}
