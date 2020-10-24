
package bai2;

class maHangException extends Exception{   
}
class tenException extends Exception{    
}
class nhomException extends Exception{ 
}
class giaBanException extends Exception{  
}

public class MatHang {
    private int maHang;
    private String ten;
    private String nhom;
    private double giaBan;

    public MatHang() {
    }

    public MatHang(int maHang, String ten, String nhom, double giaBan) throws Exception {
        if(maHang>=1000 && maHang<=9999)
        this.maHang = maHang;
        else throw new maHangException();
        
        if(ten!=null)
        this.ten = ten;
        else throw new tenException();
        
        if(nhom.equals("hàng tiêu dùng") || nhom.equals("hàng thời trang") || nhom.equals("điện tử-điện lạnh"))
        this.nhom = nhom;
        else throw new nhomException();
        
        if(giaBan>0)
        this.giaBan = giaBan;
        else throw new giaBanException();
    }

    public int getMaHang() {
        return maHang;
    }

    public String getTen() {
        return ten;
    }

    public String getNhom() {
        return nhom;
    }

    public double getGiaBan() {
        return giaBan;
    }
    
    
    
}
