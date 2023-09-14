import java.util.Scanner;
import static java.lang.Math.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
 class Time {
    private int gio,phut,giay;

    public Time(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    
    public int getHour()
    {
        return gio*60;
    }
    
    public int getMinute()
    {
        return phut*60;
    }

    public int getGiay() {
        return giay;
    }
    
    
    @Override
    public String toString()
    {
        return gio+" "+phut+" "+giay;
    }
}
//public class AMainn {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//    
//        int t=sc.nextInt();
//        ArrayList<Time> a=new ArrayList<>();
//        for(int i=0;i<t;i++)
//        {
//            Time m=new Time(sc.nextInt(),sc.nextInt(),sc.nextInt());
//            a.add(m);
//        }
//        Collections.sort(a,new Comparator<Time>(){
//            @Override
//            public int compare(Time o1, Time o2) {
//               if(o1.getHour()!=o2.getHour())
//               {
//                   return o1.getHour()-o2.getHour();
//               }else if(o1.getMinute()!=o2.getMinute())
//               {
//                   return o1.getMinute()-o2.getMinute();
//               }
//               else
//                   return o1.getGiay()-o2.getGiay();
//            }
//            
//        });
//        for(Time x:a)
//        {
//            System.out.println(x);
//        }
//}
//}