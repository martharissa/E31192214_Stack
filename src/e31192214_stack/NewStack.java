/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31192214_stack;

import java.util.Scanner;

/**
 *
 * @author Martha
 */
public class NewStack {

    public static void maiin(String[] args) {
        int pilihan;
        int data;
        Stack result = new Stack();
        do {
            System.out.println("1.PUSH");
            System.out.println("2.POP ITEM");
            System.out.println("3.LIHAT ISI DATA");
            System.out.println("0.KELUAR");
            System.out.println("Masukkan Pilihan : ");
            Scanner input=new Scanner(System.in);
            pilihan = input.nextInt();
            if (pilihan == 1) {
                System.out.println("Data yang ditambahkan");
                data = input.nextInt();
                result.push(data);
            } else if (pilihan == 2) {
                result.pop();
            } else if (pilihan == 3) {
                result.pop();
            } else if (pilihan == 0) {
                System.exit(0);
            } else {
                System.out.println("Pilihan Tidak Ada");
            }
        }while(pilihan !=0);
    }
}
