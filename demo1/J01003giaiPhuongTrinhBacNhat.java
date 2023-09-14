
package demo;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class J01003giaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==0 && b==0)
        {
            System.out.println("VSN");
        }else if( a==0)
        {
            System.out.println("VN");
        }else
        {
            float tong=1F*(-b)/a;
            System.out.printf("%.2f",tong);
        }
        
    
        
        
      
            
        
    }
}
