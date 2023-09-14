
import java.util.*;


public class J01013TongUocSo1 {
    public static Scanner sc=new Scanner(System.in);
    public static int [] p=new int[2000001];
    
    public static void sang(){
        for(int i=2;i<=Math.sqrt(2000001);i++)
        {
            if(p[i]==0)
            {
                for(int j=i;j<2000001;j+=i)
                {
                    p[j]=i;
                }
           
            }
            
        }
        for(int i=2;i<2000001;i++)
        {
           if(p[i]==0)
           {
               p[i]=i;
           }
        }
    }
    
    public static void main(String[] args) {
        sang();
        int t=sc.nextInt();
        long sum=0;
        while(t-->0)
        {
            int n=sc.nextInt();
            while(n!=1)
            {
                sum+=p[n];
                n/=p[n];
            }
        }
        System.out.println(sum);
    }
            
}
