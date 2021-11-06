package Cau3;

import java.util.Scanner;

public class PHIEU {
    private String maPhieu;
    private HANG[] x;
    private int n;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma phieu:  ");
        maPhieu = sc.nextLine();
        System.out.print("So luong mat hang : ");
        n = sc.nextInt();
        x = new HANG[n];
        for(int i=0;i<n;i++){
            x[i] = new HANG();
            System.out.println("Nhap mat hang thu " + (i+1));
            x[i].nhap();
        }
    }
    public void xuat(){
        System.out.printf("%30s \n","THONG TIN PHIEU");
        System.out.println("Ma phieu: " + maPhieu);
        System.out.printf("%-10s %-30s %-10s \n", "Ma hang", "Ten hang", "Don gia");
        for(int i=0;i<n;i++){
            x[i].xuat();
        }
    }
}
