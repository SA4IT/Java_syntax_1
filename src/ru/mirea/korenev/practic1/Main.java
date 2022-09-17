package ru.mirea.korenev.practic1;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double [] arr = new double[n];
        double sum = 0;
        System.out.println("Заполните массив: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);
        System.out.println("Avar = " + sum/n);



        double max = arr[0];
        double min = arr[0];
        for(int i = 0; i<n; i++){
            if(arr[i] >= max){
                max = arr[i];
            }
            if(arr[i] <= min){
                min = arr[i];
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println('\n');


        for(int i = 1; i<=10; i++){//гармонический ряд
            System.out.println("1/" + i);
        }
        System.out.println('\n');


        System.out.println("Факториал числа: ");
        int f = sc.nextInt();
        Factorial a = new Factorial(f);
        System.out.println(a.Fact());


    }

}
