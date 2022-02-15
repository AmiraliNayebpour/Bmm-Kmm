package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        int zarb = a *b;
        int BMM = 0;
            if (a > b) {
                for (int i = 0 ; i <= a ; i++){
                    c = a % b;
                    if (c == 0){
                        BMM = b;
                    }
                    else {
                        a = b ;
                        b = c;
                    }
                }
                System.out.println("BMM is => " + BMM);
            }
            else if (b > a){
                for(int j = 0 ; j <= a; j++){
                    c = b%a;
                    if (c == 0){
                        BMM = a;
                    }
                    else {
                        b = a;
                        a = c;
                    }
                }
                System.out.println("BMM is => " + BMM);
            }
            int KMM = zarb/BMM;
        System.out.println("KMM is => " + KMM);

    }
}
