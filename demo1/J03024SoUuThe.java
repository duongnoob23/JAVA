
package demo1;

import java.util.Scanner;

public class J03024SoUuThe {
    public static Scanner sc=new Scanner(System.in);
    
    public static int solve(String s)
    {
        int chan=0,le=0;
        for(int i=0;i<s.length();i++)
        {
            if(!Character.isDigit( s.charAt(i) ) ) return -1;
            else{
                if(s.charAt(i)%2==0) chan++;
                else le++;
            }
        }
        if( (chan > le && s.length()%2==0) || ( chan <le  && s.length()%2==1)) return 1;
        return 0;
    }
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s=sc.nextLine().trim();
            if(solve(s)==1) System.out.println("YES");
            else if(solve(s)==0) System.out.println("NO");
            else System.out.println("INVALID");
        }
    }
}
