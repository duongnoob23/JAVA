package demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class J02026DayConCoKPhanTuTangDan {

    public static Scanner sc = new Scanner(System.in);
    public static ArrayList <String> arr=new ArrayList<>();
    public static int n,m;
    public static int[] b = new int[100];
    public static void ql(String s, int bd,int k) {
        if(k==m)
        {
            arr.add(s);
        }
        for(int i=0;i<n;i++)
        {
            ql(s+b[i],i+1,k+1);
        }
    }
    
    public static void main(String[] args) {
        n = sc.nextInt();
        m = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(b);
        ql("",0,0);
        System.out.println(arr.size());
    }
}
