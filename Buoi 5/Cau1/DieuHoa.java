package Cau1;

import java.util.Scanner;

public class DieuHoa extends SanPham {
        private float congSuat;
        private float giaBan;

        public void Nhap(){
            Scanner sc = new Scanner(System.in);
            super.Nhap();
            System.out.print("Nhap cong suat: ");
            congSuat = sc.nextFloat();
            System.out.print("Nhap gia ban: ");
            giaBan = sc.nextFloat();
        }
        public void Xuat(){
            super.Xuat();
            System.out.printf("%-10.2f %-15.2f \n",congSuat, giaBan);
        }

        public float getGiaBan() {
            return giaBan;
        }

    }
