package Cau1;

import java.util.Scanner;
public class RunMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so quyen sach: ");
        n = sc.nextInt();
        SACH[] SACH = new SACH[n];
        for(int i = 0 ; i < n ;i++) {
            SACH[i] = new SACH();
            SACH[i].Nhap();
        }
        System.out.println("Thong tin sach ban da nhap:");
        System.out.println("Id\t " + " Name\t " + " Writer\t" + "Page Number\t" + " Price");
        for(int i = 0 ; i < n ;i++) {
            SACH[i].Xuat();
            System.out.println();
        }

        sc.close();
    }
}

