
package bai2;


public class MonHoc {
    private int maMon;
    private String tenMon;
    private String nhomMon;
    private int soTinchi;

    public MonHoc(int maMon, String tenMon, String nhomMon, int soTinchi) throws Exception {
        if(maMon>=1000 && maMon<=9999)
        this.maMon = maMon;
        else throw new Exception();
        
        if(tenMon!=null)
        this.tenMon = tenMon;
        else throw new Exception();
        
        if(nhomMon.equals("Cơ bản") || nhomMon.equals("Cơ sở ngành")
                || nhomMon.equals("Chuyên ngành") || nhomMon.equals("Kỹ năng mềm"))
        this.nhomMon = nhomMon;
        else throw new Exception();
        
        if(soTinchi>0 && soTinchi<7)
        this.soTinchi = soTinchi;
        else throw new Exception();
    }

    public int getMaMon() {
        return maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public String getNhomMon() {
        return nhomMon;
    }

    public int getSoTinchi() {
        return soTinchi;
    }
    
    
    
}
