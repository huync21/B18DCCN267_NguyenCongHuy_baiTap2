
package bai2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class bai18 {
    public static void main(String[] args) throws IOException {
        //1.
        Scanner s=new Scanner(new File("bai18\\MH.INP"));
        ArrayList<MonHoc> monHocs=new ArrayList<>();
        
        while(s.hasNextLine()){
            try{
            MonHoc monHoc=new MonHoc(Integer.parseInt(s.nextLine()), s.nextLine(), s.nextLine(), Integer.parseInt(s.nextLine()));
            monHocs.add(monHoc);// ko co ngoai le thi moi tao doi tuong roi add vao mang
            }
            catch(Exception e){
            }
        }
        s.close();
        //2.
        for(int i=0;i<monHocs.size();i++){
            MonHoc temp=monHocs.get(i);
            System.out.println(temp.getMaMon()+" "+temp.getTenMon()
            +" "+temp.getNhomMon()+" "+temp.getSoTinchi());
        }
        
        //3.
        // Sap xep cac mon hoc trong mang theo thu tu so tin chi giam dan dung ham sort cua Collections
        Collections.sort(monHocs, new Comparator<MonHoc>(){
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
               if(o1.getSoTinchi()<o2.getSoTinchi())
                   return 1;
               else if(o1.getSoTinchi()==o2.getSoTinchi())
                   return 0;
               else return -1;
            }
            
        });
        
        //in ra file SX.OUT
        PrintWriter pw=new PrintWriter(new File("bai18\\SX.OUT"));
        for(int i=0;i<monHocs.size();i++){
            MonHoc temp=monHocs.get(i);
            pw.println(temp.getMaMon()+" "+temp.getTenMon()
            +" "+temp.getNhomMon()+" "+temp.getSoTinchi());
        }
        pw.close();
        
        //4.
        Collections.sort(monHocs, new Comparator<MonHoc>(){
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return (o1.getTenMon().compareTo(o2.getTenMon()));
            }
            
        });
        
        PrintWriter pw1=new PrintWriter(new File("bai18\\NHOM.OUT"));
        pw1.println("nhóm môn Cơ bản: ");
        for(int i=0;i<monHocs.size();i++){
            MonHoc temp=monHocs.get(i);
           if(temp.getNhomMon().equals("Cơ bản")){
                pw1.println(temp.getMaMon()+" "+temp.getTenMon()
            +" "+temp.getNhomMon()+" "+temp.getSoTinchi());
           }
        }
        
        pw1.println("=====================");
        pw1.println("nhóm môn Cơ sở ngành: ");
        for(int i=0;i<monHocs.size();i++){
            MonHoc temp=monHocs.get(i);
           if(temp.getNhomMon().equals("Cơ sở ngành")){
                pw1.println(temp.getMaMon()+" "+temp.getTenMon()
            +" "+temp.getNhomMon()+" "+temp.getSoTinchi());
           }
        }
        
        pw1.println("=====================");
        pw1.println("nhóm môn Chuyên ngành: ");
        for(int i=0;i<monHocs.size();i++){
            MonHoc temp=monHocs.get(i);
           if(temp.getNhomMon().equals("Chuyên ngành")){
                pw1.println(temp.getMaMon()+" "+temp.getTenMon()
            +" "+temp.getNhomMon()+" "+temp.getSoTinchi());
           }
        }
        
        pw1.println("=====================");
        pw1.println("nhóm môn Kỹ năng mềm: ");
        for(int i=0;i<monHocs.size();i++){
            MonHoc temp=monHocs.get(i);
           if(temp.getNhomMon().equals("Kỹ năng mềm")){
                pw1.println(temp.getMaMon()+" "+temp.getTenMon()
            +" "+temp.getNhomMon()+" "+temp.getSoTinchi());
           }
        }
        
        pw1.close();
    }
}
