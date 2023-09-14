
package J05003_DanhSachDoiTuongSinhVien;
import static java.lang.Math.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int t=Integer.parseInt(sc.nextLine());
        
        ArrayList <SinhVien> a=new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String ten = sc.nextLine(); // Đọc tên
            String ma = sc.nextLine();  // Đọc mã
            String ns = sc.nextLine();  // Đọc ngày sinh
            float gpa = Float.parseFloat(sc.nextLine()); // Đọc GPA

            SinhVien m = new SinhVien(ten, ma, ns, gpa);
            m.chuanHoa();
            m.chuanNs();
            a.add(m);
        }
        Collections.sort(a,new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Float.compare(o2.getGpa(), o1.getGpa());
            }
            
            
        });
        for(SinhVien x:a)
        {
            System.out.println(x);
        }
                  
       
    }
}


/*

2
ngUYen Van NaM
D20DCCN01-B
2/12/1994
2.17
Nguyen QuanG hAi
D20DCCN02-B
1/9/1994
3.0
*/