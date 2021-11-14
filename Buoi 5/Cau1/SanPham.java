package Cau1;

import java.util.Scanner;

public class SanPham {
    protected String maSP;
    protected String tenSP;
    protected String hangSX;
    protected String ngayNhap;
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma san pham: ");
        maSP = sc.nextLine();
        System.out.print("Nhap ten san pham: ");
        tenSP = sc.nextLine();
        System.out.print("Nhap hang sam xuat: ");
        hangSX = sc.nextLine();
        System.out.print("Ngay nhap: ");
        ngayNhap = sc.nextLine();
    }
    public void Xuat(){
        System.out.printf("%-10s %-30s %-20s %-15s ", maSP, tenSP, hangSX, ngayNhap);
    }
}
