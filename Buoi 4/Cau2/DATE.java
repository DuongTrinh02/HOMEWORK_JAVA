package Cau2;
import java.util.Scanner;

public class DATE {
    Scanner sc = new Scanner(System.in);
    private int day;
    private int month;
    private int year;
    public void Nhap() {
        System.out.print("Dte: ");
        day =sc.nextInt();
        System.out.print("Month: ");
        month =sc.nextInt();
        System.out.print("Year: ");
        year = sc.nextInt();
    }
    public void Xuat() {
        System.out.print(day + " - " + month + " - " + year);
    }
}
