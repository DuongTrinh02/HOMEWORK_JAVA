package Buoi3_Bai2;

import java.util.Scanner;

public class Array {
    private int n;
    private int[] a;
    static Scanner scan = new Scanner(System.in);

    public Array() {
    }
    public Array(int n, int[] a) {
        this.n = n;
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public void InputData() {
        System.out.println("Enter number array: ");
        n = scan.nextInt();
        a = new int[n];
        for(int i=0; i<n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scan.nextInt();
        }
        System.out.println();
    }

    public void Show() {
        for(int b : a) {
            System.out.print(b + " ");
        }
        System.out.println();
    }

    public int Sum() {
        int sum = 0;
        for(int i=0; i<a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public void Filter(Boolean flag) {
        if(flag == true) {
            for(int i=0; i<a.length; i++) {
                if(a[i]%2 == 0) {
                    System.out.print(a[i] + " ");
                }
            }
        }
        else {
            for(int i=0; i<a.length; i++) {
                if(a[i]%2 == 1) {
                    System.out.print(a[i] + " ");
                }
            }
        }
        System.out.println();
    }
}

