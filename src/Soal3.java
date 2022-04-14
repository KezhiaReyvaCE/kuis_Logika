/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class Soal3 {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); 
    
    int hasil = 0;
    
    System.out.print("Masukkan Angka: ");
    int angka = myObj.nextInt(); 

    for (int i = 1; i <=angka; i++) {
     hasil = hasil+i;
    System.out.print( i + " + ");
    } 
    System.out.print(": "+hasil);
    }
}
