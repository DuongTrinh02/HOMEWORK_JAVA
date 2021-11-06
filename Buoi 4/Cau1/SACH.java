package Cau1;
import java.util.Scanner;
public class SACH {
    Scanner sc = new Scanner(System.in);
    private String maSach;
    private String tenSach;
    private String nhaXuatBan;
    private int soTrang;
    private float giaTien;

    public void Nhap() {
        System.out.println("Nhap ma sach : ");
        maSach = sc.nextLine();
        System.out.println("Nhap ten sach : ");
        tenSach = sc.nextLine();
        System.out.println("Nha xuat ban : ");
        nhaXuatBan = sc.nextLine();
        System.out.println("So trang : ");
        soTrang = sc.nextInt();
        System.out.println("Gia sach: ");
        giaTien = sc.nextFloat();
    }
    public void Xuat() {
        System.out.println(maSach +  "\t"  + tenSach +  "\t" + nhaXuatBan + "\t " +  soTrang + " \t "  + giaTien);
    }
}
