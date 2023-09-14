package demo1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.util.Collections;

public class J07008DayConTangDan {

    
    public static int n;
    public static int[] a = new int[100];
    public static int[] b = new int[100];
    public static ArrayList <String> A=new ArrayList<>();
    

    public static void ql(int i) {
        for (int j = 0; j <= 1; j++) {
            b[i] = j;
            if (i == n - 1) {
                ArrayList<Integer> arr = new ArrayList<>();
                for (int k = 0; k < n; k++) {
                    if (b[k] == 1) {
                        arr.add(a[k]);
                    }
                }
                if (arr.size() >= 2) {
                    int ok = 1;
                    for (int k = 0; k < arr.size()-1; k++) {
                        if (arr.get(k) > arr.get(k + 1)) {
                            ok = 0;
                            break;
                        }
                    }
                    if (ok == 1) {
                        String res = "";
                        for(Integer m:arr)
                        {
                            res+=m+" ";
                        }
                        A.add(res);
                    }
                }

            } else {
                ql(i + 1);
            }
        }
    }

    public static void main(String[] args)throws FileNotFoundException {
         Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        ql(0);
        Collections.sort(A);
        for(String x:A)
        {
            System.out.println(x);
        }
    }
}
