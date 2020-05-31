/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31192214_stack;

/**
 *
 * @author Martha
 */
class Stack {

    private boolean kosong, penuh;
    private int pos;
    private int max_data = 3;
    private int item[] = new int[max_data];

    public void Stack() {
        penuh = false;
        kosong = true;
        pos = 0;

    }

    public boolean isPenuh() {
        return (penuh);
    }

    public boolean isKosong() {
        return (kosong);
    }

    public void push(int data) {
        System.out.print("Hasil : ");
        if (!isPenuh()) {
            item[pos++] = data;
            kosong = false;
            if (pos == max_data) {
                penuh = true;

            }
            System.out.println("Data sudag Ditambahkan");
        } else {
            System.out.println("Stack sudah Penuh");
        }
        System.out.println("===================================================");
        return;
    }

    public int pop() {
        int x = 0;
        System.out.println("HAsil : ");
        if (!isKosong()) {
            x = item[--pos];
            penuh = false;
            System.out.println("Data yang di Pop adalah " + item[pos]);
            System.out.println("Keterangan : ");
            item[pos] = 0;
            if (pos == 0) {
                kosong = true;
                System.out.println("Stack kosong");
            } else {
                System.out.println("Data sudah di ambil");
            }
        } else {
            System.out.println("Stack masih kosong : \n");
        }
        System.out.println("==================================================");
        return (x);
    }

    public void display() {
        System.out.println("Isi stack adalah");
        for (int i = 0; i < pos; i++) {
            System.out.println("Node" + (1 + i) + " :" + item[i] + "");
        }
        System.out.println("================================================");
        System.out.println("\n");

    }
}
