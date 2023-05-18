package model;

public class CustomerDTO {
    public String maKH;
    public String hoKH;
    public String tenKH;
    public String sdt;
    
    public CustomerDTO(){
    super();
    }
    public CustomerDTO(String maKH, String hoKH, String tenKH, String sdt) {
        super();
        this.maKH = maKH;
        this.hoKH = hoKH;
        this.tenKH = tenKH;
        this.sdt = sdt;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoKH() {
        return hoKH;
    }

    public void setHoKH(String hoKH) {
        this.hoKH = hoKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return  "maKH=" + maKH + ", hoKH=" + hoKH + ", tenKH=" + tenKH + ", sdt=" + sdt ;
    } 
}
