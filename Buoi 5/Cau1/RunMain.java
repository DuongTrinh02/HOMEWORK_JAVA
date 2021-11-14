package Cau1;
import java.util.ArrayList;
import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap n: ");
        n = sc.nextInt();
//        do {
//            if(n<1){
//                System.out.println("Khong hop le! Xin kiem tra lai!");
//            }
////        }while (n<1);
//    }

        ArrayList<DieuHoa> dieuhoa = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin san pham thu "+(i+1));
            DieuHoa a = new DieuHoa();
            a.Nhap();
            dieuhoa.add(a);
        }
        int dem = 0;
        System.out.println("Danh sach san pham do hang Electrolux san xuat: ");
        for (int i = 0; i < dieuhoa.size(); i++) {
            if (dieuhoa.get(i).hangSX.compareTo("Electrolux") == 0) {
                dieuhoa.get(i).Xuat();
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("Khong ton tai!");
        }
        float min = dieuhoa.get(0).getGiaBan();
        for (int i = 0; i < dieuhoa.size(); i++) {
            if (dieuhoa.get(i).getGiaBan() < min)
                min = dieuhoa.get(i).getGiaBan();
        }
        System.out.println("San pham co gia ban nho nhat: ");
        for (int i = 0; i < dieuhoa.size(); i++) {
            if (dieuhoa.get(i).getGiaBan() == min)
                dieuhoa.get(i).Xuat();
        }
    }
}