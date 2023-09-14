
import java.util.Scanner;



public class J01007kiemTraSoFibonacii {
    public static Scanner sc =new Scanner(System.in);
    public static long[] p=new long[95];
    
    public static void fibo() {
        p[0]=0L;
        p[1]=1L;
        
        for(int i=2;i<=94;i++)
        {
            p[i]=p[i-1]+p[i-2];
        }
    }
    
    public static boolean check(long n)
    {
        for(int i=0;i<=94;i++)
        {
            if(p[i]==n) return true;
            if(p[i]>n) return false;
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        fibo();
        int t=sc.nextInt();
        while(t-- >0)
        {
            long  n=sc.nextLong();
            int ok=0;
            for(int i=0;i<=94;i++)
            {
                if(p[i]==n)
                     
                {
                    ok=1;
                    break;
                }
            }
            if(ok==1)System.out.println("YES");
            else System.out.println("NO");
            
        }
        
        
    }
    
}