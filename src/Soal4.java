/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class Soal4 {
    
    public static void main(String[] args) {
    ArrayList<String> ab = new ArrayList<String>();
    Scanner myObj = new Scanner(System.in); 
    
       
    int angka;
    System.out.print("Berapa angka yang diinginkan: ");
    angka = myObj.nextInt();
    int[] a = new int[angka];
    System.out.println("Masukkan angka yang diinginkan: ");
   
    for(int i=0;i<angka;i++) {
        a[i] = myObj.nextInt();
    }
        System.out.println("----------------");
    for(int i : a) {
        System.out.print(i+", ");
        if (i % 2 ==0){
            ab.add("Genap");
    } else {
        ab.add("Ganjil");
        }
    }
    System.out.println("");
        for (String i : ab){
            System.out.print(i + ", ");
        }
    }
}
