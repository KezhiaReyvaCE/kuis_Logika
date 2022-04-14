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
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); 
   
    System.out.println("Angka 1: ");
    int angka1 = myObj.nextInt(); 
    
    System.out.println("Angka 2: "); 
    int angka2 = myObj.nextInt();
    
    if (angka1 > angka2){
        System.out.println("Angka yang lebih besar: "+angka1);
    } else {
        System.out.println("Angka yang lebih besar: "+angka2);
    }
    }
    
}
