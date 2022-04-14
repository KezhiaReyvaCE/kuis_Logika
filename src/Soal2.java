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
public class Soal2 {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); 
    
    System.out.println("Angka: ");
    int angka = myObj.nextInt(); 
    
    if (angka % 2 == 0){
        System.out.println("Angka "+angka+" adalah angka genap");
    } else {
        System.out.println("Angka "+angka+" adalah angka ganjil");
    }
    }
}
