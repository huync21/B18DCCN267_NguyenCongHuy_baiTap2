
package bai2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class bai17 {
    public static void main(String[] args) throws IOException{
        Scanner s=new Scanner(new File("bai17\\SACH.INP"));
        ArrayList<Sach> sachs=new ArrayList<>();// tao ra mang de luu sach
        
        //1.
        while(s.hasNextLine()){
            try{
                Sach sach=new Sach(Integer.parseInt(s.nextLine()), s.nextLine(), s.nextLine(), Double.parseDouble(s.nextLine()));
                sachs.add(sach); // neu ko co ngoai le xay ra, doi tuong duoc tao va add vao mang
            }
            catch(Exception e){
                
            }
        }
        
        //2.
        for(int i=0;i<sachs.size();i++){
            Sach temp=sachs.get(i);
            System.out.println(temp.getMaSach()+" "+temp.getTenSach()
                    +" "+temp.getChuyenNganh()+" "+temp.getGiaBan());
        }
        
        //3.
        Collections.sort(sachs,new Comparator<Sach>(){
            @Override
            public int compare(Sach o1, Sach o2) {
                if(o1.getGiaBan()<o2.getGiaBan())
                    return 1;
                else if(o1.getGiaBan()==o2.getGiaBan())
                    return 0;
                else return -1;
            }
            
        });
        
        PrintWriter pw=new PrintWriter(new File("bai17\\SX.OUT"));
        for(int i=0;i<sachs.size();i++){
            Sach temp=sachs.get(i);
            pw.println(temp.getMaSach()+" "+temp.getTenSach()
                    +" "+temp.getChuyenNganh()+" "+temp.getGiaBan());
        }
        pw.close();
        
        //4.
        //sort ten sach theo ABC
        Collections.sort(sachs, new Comparator<Sach>(){
            @Override
            public int compare(Sach o1, Sach o2) {
                return (o1.getTenSach().compareTo(o2.getTenSach()));
            }
            
        });
        
        PrintWriter pw1=new PrintWriter(new File("bai17\\CN.OUT"));
        pw1.println("chuyên ngành giáo khoa: ");
        for(int i=0;i<sachs.size();i++){
            Sach temp=sachs.get(i);
            if(temp.getChuyenNganh().equals("Giáo khoa")){
                pw1.println(temp.getMaSach()+" "+temp.getTenSach()
                    +" "+temp.getChuyenNganh()+" "+temp.getGiaBan());
            }
        }
        
        pw1.println("=====================");
        pw1.println("chuyên ngành văn học: ");
        for(int i=0;i<sachs.size();i++){
            Sach temp=sachs.get(i);
            if(temp.getChuyenNganh().equals("Văn học")){
                pw1.println(temp.getMaSach()+" "+temp.getTenSach()
                    +" "+temp.getChuyenNganh()+" "+temp.getGiaBan());
            }
        }
        
        pw1.println("======================");
        pw1.println("chuyên ngành kỹ thuật:");
        for(int i=0;i<sachs.size();i++){
            Sach temp=sachs.get(i);
            if(temp.getChuyenNganh().equals("Kỹ thuật")){
                pw1.println(temp.getMaSach()+" "+temp.getTenSach()
                    +" "+temp.getChuyenNganh()+" "+temp.getGiaBan());
            }
        }
        
        
        pw1.close();
        
    }
}
