package com.company;

import java.util.Scanner;

class Main{
    public static void main (String args[]) {
        int a[] = new int[100];
        int x, sum, ganjil, genap;
        Scanner in = new Scanner (System.in);

        System.out.println("masukkan nilai");
        x = in.nextInt();
            sum = ganjil = genap = 0;

            for (int i = 1; i<=x; i++) {
                System.out.println("Input angka ke- "+i+":");
                a[i] = in.nextInt();
            sum = sum+a[i];
            if (a[i] % 2 == 0)
                genap += 1;
            else
                ganjil+=1;
        }
        System.out.println("Angka yang di-input-kan: " );
        for (int i = 1; i <= x; i++) {
            System.out.println(a[i]);
        }

        System.out.println("Total bilangan : " + sum );
        System.out.println("Jumlah bilangan ganjil : " + ganjil );
        System.out.println("Jumlah bilangan genap : "+ genap);

    }
}
