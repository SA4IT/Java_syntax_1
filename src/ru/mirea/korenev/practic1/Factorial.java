package ru.mirea.korenev.practic1;

public class Factorial {
    public Factorial(int a1) {
        this.a1 = a1;
    }

    private int a1;
    public int Fact(){
        int b = 1;
        for(int i = 1; i <= a1; i++){
            b = b * i;
        }
        return b;
    }
}
