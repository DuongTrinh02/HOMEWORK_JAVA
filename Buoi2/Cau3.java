package Buoi2;
import java.util.Scanner;
public class Cau3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s= sc.nextLine();
        int dem=0;
        double sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                dem++;
                sum+=s.charAt(i)-48;
            }
        }
        if(dem==0){
            System.out.println("false");
        }else{
            System.out.println("true");
            System.out.println("Trung binh cong cac chu so la: "+sum/dem);
        }
    }
}