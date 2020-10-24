
package bai2;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class bai16 {
    public static void main(String[] args) throws IOException {
        Scanner s=new Scanner(new File("bai16\\MH.INP"));
        ArrayList<MatHang> matHangs=new ArrayList<>();
        while(s.hasNextLine()){
            try{
            MatHang m=new MatHang(Integer.parseInt(s.nextLine()), s.nextLine(), s.nextLine(), Double.parseDouble(s.nextLine()));
            matHangs.add(m);// neu ko co ngoai le xay ra, doi tuong duoc tao va add vao mang
            }
            catch(maHangException | tenException | nhomException | giaBanException e){
                
            }
            catch(Exception e){//:))
                
            }
            
            
        }
        s.close();
        //2.in danh sach
        show(matHangs);
        
        //3. sap xep va ghi danh sach mat hang theo gia ban giam dan
        PrintWriter pw=new PrintWriter(new File("bai16\\SX.OUT"));
        //sap xep theo gia ban giam dan su dung interface Collections
        Collections.sort(matHangs, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
                if(o1.getGiaBan()<o2.getGiaBan()){
                    return 1;
                }
                else if(o1.getGiaBan()==o2.getGiaBan())
                    return 0;
                else return -1;
            }
            
        });
        
        for(int i=0;i<matHangs.size();i++){
            pw.println(matHangs.get(i).getMaHang()+" "
           + matHangs.get(i).getTen()+" "+matHangs.get(i).getNhom()
           +" "+matHangs.get(i).getGiaBan());
        }
        pw.close();
        
        //4.
        PrintWriter pw1=new PrintWriter(new File("bai16\\NHOM.OUT"));
        //sort theo tên trước
        Collections.sort(matHangs,new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return(o1.getTen().compareTo(o2.getTen()));
            }
            
        });
        
        //ghi ra các mặt hàng theo từng nhóm
        pw1.println("Nhóm hàng tiêu dùng:");
        for(int i=0;i<matHangs.size();i++){
            if(matHangs.get(i).getNhom().equals("hàng tiêu dùng")){
                pw1.println(matHangs.get(i).getMaHang()+" "
                + matHangs.get(i).getTen()+" "+matHangs.get(i).getNhom()
                +" "+matHangs.get(i).getGiaBan());
            }
        }
        
        pw1.println("=====================");
        pw1.println("Nhóm hàng thời trang:");
        for(int i=0;i<matHangs.size();i++){
            if(matHangs.get(i).getNhom().equals("hàng thời trang")){
                pw1.println(matHangs.get(i).getMaHang()+" "
                + matHangs.get(i).getTen()+" "+matHangs.get(i).getNhom()
                +" "+matHangs.get(i).getGiaBan());
            }
        }
        
        pw1.println("=====================");
        pw1.println("Nhóm hàng điện tử- điện lạnh:");
        for(int i=0;i<matHangs.size();i++){
            if(matHangs.get(i).getNhom().equals("điện tử-điện lạnh")){
                pw1.println(matHangs.get(i).getMaHang()+" "
                + matHangs.get(i).getTen()+" "+matHangs.get(i).getNhom()
                +" "+matHangs.get(i).getGiaBan());
            }
        }
        pw1.close();
    }

    private static void show(ArrayList<MatHang> matHangs) {
       for(int i=0;i<matHangs.size();i++){
           System.out.println(matHangs.get(i).getMaHang()+" "
           + matHangs.get(i).getTen()+" "+matHangs.get(i).getNhom()
           +" "+matHangs.get(i).getGiaBan());
       }
    }
    
    
    
}
