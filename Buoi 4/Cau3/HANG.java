package Cau3;

import java.util.Scanner;

public class HANG {
    private String maHang;
    private String tenHang;
    private float donGia;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma hang: ");
        maHang = sc.nextLine();
        System.out.print("Ten hang: ");
        tenHang = sc.nextLine();
        System.out.print("Don gia: ");
        donGia = sc.nextFloat();
    }
    public void xuat(){
        System.out.printf("%-10s %-30s %-8.5f \n", maHang, tenHang, donGia);
    }
}
