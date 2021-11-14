package Cau2;

import java.util.Scanner;

public class DateTime {
    private int dd;
    private int mm;
    private int yy;

    public void NhapDT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        dd = sc.nextInt();
        System.out.print("Nhap thang: ");
        mm = sc.nextInt();
        System.out.print("Nhap nam: ");
        yy = sc.nextInt();
    }
    public void XuatDT(){
        System.out.println(dd+"/"+mm+"/"+yy);
    }
}
