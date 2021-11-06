package Cau2;

import java.util.Scanner;

public class Employee {
    private String maNS;
    private String hoTen;
    private DATE NS;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan su: ");
        maNS = sc.nextLine();
        System.out.print("Nhap ho ten");
        hoTen = sc.nextLine();
        NS = new DATE();
        System.out.println("Ngay sinh: ");
        NS.Nhap();
    }
    public void xuat(){
        System.out.println("Ma nhan su: " + maNS);
        System.out.println("Ho ten: " + hoTen);
        System.out.print("Ngay sinh: ");
        NS.Xuat();
    }
}

