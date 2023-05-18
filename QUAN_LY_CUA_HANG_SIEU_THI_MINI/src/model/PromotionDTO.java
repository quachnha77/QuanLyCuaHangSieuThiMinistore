package model;
import java.util.Date;

public class PromotionDTO {
    public String maKM;
    public String chuongTrinh;
    public String dieuKien;
    public int phanTram;
    public Date ngayBD;
    public Date ngayKT;
    public String tinhTrang;

    public PromotionDTO() {
        super();
    }

    public PromotionDTO(String maKM, String chuongTrinh, String dieuKien, int phanTram, Date ngayBD, Date ngayKT, String tinhTrang) {
        super();
        this.maKM = maKM;
        this.chuongTrinh = chuongTrinh;
        this.dieuKien = dieuKien;
        this.phanTram = phanTram;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
        this.tinhTrang = tinhTrang;
    }

    public String getMaKM() {
        return maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public String getChuongTrinh() {
        return chuongTrinh;
    }

    public void setChuongTrinh(String chuongTrinh) {
        this.chuongTrinh = chuongTrinh;
    }

    public String getDieuKien() {
        return dieuKien;
    }

    public void setDieuKien(String dieuKien) {
        this.dieuKien = dieuKien;
    }

    public int getPhanTram() {
        return phanTram;
    }

    public void setPhanTram(int phanTram) {
        this.phanTram = phanTram;
    }

    public Date getNgayBD() {
        return ngayBD;
    }

    public void setNgayBD(Date ngayBD) {
        this.ngayBD = ngayBD;
    }

    public Date getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(Date ngayKT) {
        this.ngayKT = ngayKT;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return "PromotionDTO{" + "maKM=" + maKM + ", chuongTrinh=" + chuongTrinh + ", dieuKien=" + dieuKien + ", phanTram=" + phanTram + ", ngayBD=" + ngayBD + ", ngayKT=" + ngayKT + ", tinhTrang=" + tinhTrang + '}';
    }  
}
