package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Sayı Giriniz:");

        int number=input.nextInt();
        int  ilkEleman=0, TwoEleman=1, Soneleman=0;
        for(int i=1; i<=number; i++){
            System.out.println(ilkEleman+" ");
            Soneleman=ilkEleman+TwoEleman;
            ilkEleman=TwoEleman;
            TwoEleman=Soneleman;
        }

    }
}
