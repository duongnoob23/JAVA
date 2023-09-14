package demo1;

import java.util.Scanner;

public class J03023SoLaMa {

    public static Scanner sc = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
        String s = sc.next();
        s+='Z';
        long sum=0;
        for (int i = 0; i < s.length(); i++) {
             if(s.charAt(i)=='M') 
             {
                 sum+=1000;
             }
             else if(s.charAt(i)=='D') sum+=500;
             else if(s.charAt(i)=='C')
             {
                 if(s.charAt(i+1)=='D' || s.charAt(i+1)=='M') sum-=100;
                 else sum+=100;
                     
             }
             else if(s.charAt(i)=='L') sum+=50;
             else if(s.charAt(i)=='X')
             {
                 if(s.charAt(i+1)=='L' || s.charAt(i+1)=='C') sum-=10;
                 else sum+=10;
             }
             else if(s.charAt(i)=='V') sum+=5;
             else if(s.charAt(i)=='I')
             {
                 if(s.charAt(i+1)=='V' || s.charAt(i+1)=='X')
                 {
                     sum-=1;
                 }else
                     sum+=1;
             }else
                 sum+=0;
        }
        System.out.println(sum);
    }
    }

}
