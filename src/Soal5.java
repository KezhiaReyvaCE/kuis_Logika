/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class Soal5 {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    ArrayList<Integer> max = new ArrayList<Integer>();

    System.out.println("Berapa angka yang diinginkan: ");
    int angka = myObj.nextInt();
    System.out.println("Masukkan angka yang diinginkan : ");
    for(int i=0;i<angka;i++){
    int angka1 = myObj.nextInt();
    max.add(angka1);
    
}
		int a = max.size();
		int i;

		System.out.println("Data Angka yang dimasukkan: ");

		for (i = 0; i < a; i++) {
			System.out.print(max.get(i) + " ");
		}

		System.out.println();

		Collections.sort(max);

		System.out.println("Urutan terkecil ke terbesar: ");

		for (i = 0; i < a; i++) {
			System.out.print(max.get(i) + " ");
		}

		System.out.println();
                
		int maks = max.get(a - 1);

		System.out.println("Nilai maksimumnya adalah: " + maks);
		
	
        
    }
}
