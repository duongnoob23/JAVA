
package demo1;

import java.util.*;



public class J02009XepHang {
    public static Scanner sc=new Scanner(System.in);
    
    
    public static void main(String[] args) {
        
            int n=sc.nextInt();
            Integer[][] a =new Integer[n][2];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<2;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            Arrays.sort(a,new Comparator<Integer[]>(){
                @Override
                public int compare(Integer[] o1, Integer[] o2) {
                    return o1[0]-o2[0];
                }
                
            });
            
            
            int res=0;
            for(int i=0;i<n;i++)
            {
                if(res<=a[i][0])
                {
                    res =a[i][0]+a[i][1];
                }else
                {
                    res+=a[i][1];
                }
            }
            System.out.println(res);
        
        
    }
}
