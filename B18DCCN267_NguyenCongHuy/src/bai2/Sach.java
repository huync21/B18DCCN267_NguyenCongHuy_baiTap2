
package bai2;


public class Sach {
    private int maSach;
    private String tenSach;
    private String chuyenNganh;
    private double giaBan;

    public Sach(int maSach, String tenSach, String chuyenNganh, double giaBan) throws Exception{
        if(maSach>=1000 && maSach<=9999)
        this.maSach = maSach;
        else throw new Exception();
        
        if(tenSach != null)
        this.tenSach = tenSach;
        else throw new Exception();
        
        if(chuyenNganh.equals("Giáo khoa") || chuyenNganh.equals("Văn học") || chuyenNganh.equals("Kỹ thuật"))
        this.chuyenNganh = chuyenNganh;
        else throw new Exception();
        
        if(giaBan>0)
        this.giaBan = giaBan;
        else throw new Exception();
    }

    public int getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public double getGiaBan() {
        return giaBan;
    }
    
    
}
