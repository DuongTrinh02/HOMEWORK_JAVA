import java.util.Scanner;

public class Buoi1_Bai1 {
    public static void main(String[] args) {
        int m, n;
        System.out.println("Nhap chieu rong n, chieu dai m lan luot: ");
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0 || i==m-1 || j==0 || j==n-1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

}
