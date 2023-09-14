
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AMainn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        int t=sc.nextInt();
        ArrayList<MatHang> a=new ArrayList<>();
        for(int i=1;i<=t;i++)
        {
            MatHang m=new MatHang("MH"+String.format("%03d", i),sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextInt());
            a.add(m);
        }
        Collections.sort(a,new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
               if(o1.getLoiNhuan()!=o2.getLoiNhuan())
               {
                   return o2.getLoiNhuan()-o1.getLoiNhuan();
               }else
                   return o1.getMa().compareTo(o2.getMa());
               
            }
            
        });
        
        for(MatHang x:a)
        {
            System.out.println(x);
        }
}
}


/*
2
Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
240000
515000
*/