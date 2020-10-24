
package bai2;

import java.util.*;
import java.io.*;

public class bai15 {
    public static void main(String[] args) throws IOException,NullPointerException {
        //1.
        File myfile= new File("bai15\\SV.INP");
        Scanner s=new Scanner(myfile);
        ArrayList<SinhVienPTIT>  students =new ArrayList<SinhVienPTIT>();
        while(s.hasNextLine()){
            SinhVienPTIT student;
            try{
            student=new SinhVienPTIT(Integer.parseInt(s.nextLine()),
            s.nextLine(),s.nextLine(),Double.parseDouble(s.nextLine()));
            students.add(student); //  neu ko co ngoai le xay ra, doi tuong duoc tao va add vao mang
            
            
            }
            catch(Exception e){
                
            }
            
            
        }
        s.close();
        
        //2.
        show(students);
        
        
       
        //3.
        
       // sort sinh viên theo thứ tự giảm dần điểm trung bình
        Collections.sort(students, new Comparator<SinhVienPTIT>() {
            @Override
            public int compare(SinhVienPTIT sv1, SinhVienPTIT sv2) {
                if (sv1.getDtb() < sv2.getDtb()) {
                    return 1;
                } else {
                    if (sv1.getDtb() == sv2.getDtb()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
        
        //in ra file SX.OUT
       output(students);
        
       //4.
       // sap xep theo ten:
       Collections.sort(students, new Comparator<SinhVienPTIT>() {
            @Override
            public int compare(SinhVienPTIT sv1, SinhVienPTIT sv2) {
                StringTokenizer st1=new StringTokenizer(sv1.getTen());
                StringTokenizer st2=new StringTokenizer(sv2.getTen());
                String t1=null;
                String t2=null;
                while(st1.hasMoreTokens()){
                    t1=st1.nextToken();
                }
                while(st2.hasMoreTokens()){
                    t2=st2.nextToken();
                }
                return (t1.compareTo(t2));
            }
        });
       
       //Ghi ra danh sach sinh vien theo phan loai
       
       PrintWriter w=new PrintWriter(new File("bai15\\XEPLOAI.OUT"));
       w.println("Gioi: ");
       for(int i=0;i<students.size();i++){
           if(students.get(i).getDtb()>=8){
               
               w.println(students.get(i).getMaSV()+" "+students.get(i).getTen()
            +" "+students.get(i).getLop()+" "+students.get(i).getDtb());
           }
       }
       w.println("Kha: ");
       for(int i=0;i<students.size();i++){
           if(students.get(i).getDtb()>=7 && students.get(i).getDtb()<8 ){
               
               w.println(students.get(i).getMaSV()+" "+students.get(i).getTen()
            +" "+students.get(i).getLop()+" "+students.get(i).getDtb());
           }
       }
       w.println("Tb: ");
       for(int i=0;i<students.size();i++){
           if(students.get(i).getDtb()>=5 && students.get(i).getDtb()<7 ){
               
               w.println(students.get(i).getMaSV()+" "+students.get(i).getTen()
            +" "+students.get(i).getLop()+" "+students.get(i).getDtb());
           }
       }
       w.println("Yeu: ");
       for(int i=0;i<students.size();i++){
           if(students.get(i).getDtb()<5){
               
               w.println(students.get(i).getMaSV()+" "+students.get(i).getTen()
            +" "+students.get(i).getLop()+" "+students.get(i).getDtb());
           }
       }
       w.close();
    }

    private static void show(ArrayList<SinhVienPTIT> students) throws NullPointerException {
        for(int i=0;i<students.size();i++){
            System.out.println(students.get(i).getMaSV()+" "+students.get(i).getTen()
            +" "+students.get(i).getLop()+" "+students.get(i).getDtb());
        }
    }
    
    
   
    private static void output(ArrayList<SinhVienPTIT> students) throws IOException{
        PrintWriter p = new PrintWriter(new File("bai15\\SX.OUT"));
        for(int i=0;i<students.size();i++){
           p.println(students.get(i).getMaSV()+" "+students.get(i).getTen()
            +" "+students.get(i).getLop()+" "+students.get(i).getDtb());
           
        }
        p.close();
    }
    
    
}
