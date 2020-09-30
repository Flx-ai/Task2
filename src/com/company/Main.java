package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Введите 3 числа");
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();
        compareNumbers(a,b,c);
    }

    static void compareNumbers( int a,int b,int c) {
        int min, max, sr;
        if (a>b) {
            max = a;
            min = b;
        }

        else {
            max = b;
            min = a;
        }

        if (c>max)
            max = c;

        if (c<min)
            min = c;

        if (a!=min && a!=max) sr = a;
        else if (b!=min && b!=max) sr = b;
        else sr = c;

        System.out.println("Результат: "+ min +"<="+ sr +"<="+ max);
    }

}