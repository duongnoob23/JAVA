
package J05042BangXepHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class XepHang {
    private String name;
    private String homeWork,submit,worked;

    public XepHang(String name,  String homeWork) {
        this.name = name;
        this.submit = homeWork;
        
        String[] a=homeWork.split("\\s+");
        worked=a[0];
        submit=a[1];
    }

    

    public String getSubmit() {
        return submit;
    }

    public String getWorked() {
        return worked;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString()
    {
        return name+" "+worked+" "+submit;
    }
    
}


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList <XepHang> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            XepHang moi=new XepHang(sc.nextLine(),sc.nextLine());
            a.add(moi);
            
        }
        Collections.sort(a,new Comparator<XepHang>(){
            @Override
            public int compare(XepHang o1, XepHang o2) {
                if(o1.getWorked().compareTo(o2.getWorked())!=0)
                    return o2.getWorked().compareTo(o1.getWorked());
                else if(o1.getSubmit().compareTo(o2.getSubmit())!=0)
                    return o1.getSubmit().compareTo(o2.getSubmit());
                else 
                    return o1.getName().compareTo(o2.getName());
            }
            
        });
        for(XepHang x:a)
        {
            System.out.println(x);
        }
    }
}
/*


2
Nguyen Van Nam
168 600
Tran Thi Ngoc
168 600
*/