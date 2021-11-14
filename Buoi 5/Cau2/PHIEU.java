package Cau2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PHIEU {
    private String idPhieu;
    private String tenPhieu;
    private DateTime a;
    List<SANPHAM> x = new ArrayList<>();
    private int n;
    public void NhapPH(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma phieu: ");
        idPhieu = sc.nextLine();
        System.out.print("Nhap ten phieu: ");
        tenPhieu = sc.nextLine();
        a = new DateTime();
        a.NhapDT();
        System.out.print("Nhap n = ");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin san pham thu "+(i+1));
            SANPHAM y = new SANPHAM();
            y.NhapSP();
            x.add(y);
        }
    }
    public void XuatPH(){
        System.out.println("ID phieu: " + idPhieu);
        System.out.println("Ten phieu: " + tenPhieu);
        System.out.printf("Ngay nhap: ");
        a.XuatDT();
        System.out.printf("%-10s %-30s %-10s %-12s %-15s \n", "ID phieu", "ten phieu", "So luong", "Don gia", "Thanh tien");
        for(int i=0;i<x.size();i++){
            x.get(i).XuatSP();
        }
    }
}
