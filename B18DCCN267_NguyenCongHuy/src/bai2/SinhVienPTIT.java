
package bai2;

public class SinhVienPTIT {
    private int maSV;
    private String ten;
    private String lop;
    private double dtb;
    
    public SinhVienPTIT() {
    }

    public SinhVienPTIT(int maSV, String ten, String lop, double dtb) throws Exception {
        if(maSV >= 1000 && maSV <= 9999)
        this.maSV = maSV;
        else throw new Exception();
        
        if(ten!=null)
        this.ten = ten;
        else throw new Exception();
        
        String pattern="^D\\d{2}(CQ||TC||TX||DN)(CS||IS||TE||EL||VT||DT||KD||XT||CN||MT||CP||KM||AM||QT||QM||QD||TH||KT||PT||TK||PU||TT||AT||MR||IM||TM||UD||TD)\\d{2}-(B||N||K)$";
        
        if(lop.matches(pattern))
        this.lop = lop;
        else throw new Exception();
        
        if(dtb>=0 && dtb<=10)
        this.dtb = dtb;
        else throw new Exception();
    }

    public int getMaSV() {
        return maSV;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }

    public double getDtb() {
        return dtb;
    }
    
    
    
}
