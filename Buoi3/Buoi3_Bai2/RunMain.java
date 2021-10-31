package Buoi3_Bai2;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Array arr1 = new Array();
        System.out.println("---Enter array 1---");
        arr1.InputData();
        arr1.Show();
        System.out.println("Sum = " + arr1.Sum());
        System.out.println("Enter flag: ");
        Boolean flag = scan.nextBoolean();
        arr1.Filter(flag);
        System.out.println();

        System.out.println("---Enter array 2---");
        Array arr2 = new Array();
        arr2.InputData();
        arr2.Show();
        System.out.println("Sum = " + arr2.Sum());
        System.out.println("Enter flag: ");
        flag = scan.nextBoolean();
        arr2.Filter(flag);

        System.out.println();
        if((double)arr1.Sum()/arr1.getN() > (double)arr2.Sum()/arr2.getN()) {
            System.out.println("arr1 max");
        }
        else if((double)arr1.Sum()/arr1.getN() < (double)arr2.Sum()/arr2.getN()) {
            System.out.println("arr2 max");
        }
        else {
            System.out.println("Bye");
        }
    }
}

