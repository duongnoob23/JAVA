
package demo;

import java.util.Scanner;


public class tinhTongNSoNguyenDuongDauTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while( t-- >0)
        {
            int n=sc.nextInt();
            long tong=1L*n*(n+1)/2;
            System.out.println(tong);
        }
        
        
    }
}
