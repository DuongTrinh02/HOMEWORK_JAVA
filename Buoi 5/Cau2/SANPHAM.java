package Cau2;
import java.util.Scanner;

public class SANPHAM {
    private String idSP;
    private String tenSP;
    private int soLuong;
    private float donGia;

    public void NhapSP(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma san pham: ");
        idSP = sc.nextLine();
        System.out.print("Nhap ten san pham: ");
        tenSP = sc.nextLine();
        System.out.print("Nhap so luong: ");
        soLuong = sc.nextInt();
        System.out.print("Nhap gia: ");
        donGia = sc.nextFloat();
    }
    public void XuatSP(){
        System.out.printf("%-10s %-30s %-15d %-10.2f %-15.2f \n", idSP,tenSP, soLuong, donGia, (donGia*soLuong));
    }
}
