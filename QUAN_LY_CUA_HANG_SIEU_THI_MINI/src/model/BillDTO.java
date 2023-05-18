package model;

import java.util.Date;

public class BillDTO {
    public int maHD;
    public String maKH;
    public Date ngayTao;
    public String nguoiTao;
    public int tongTien;

    public BillDTO() {
        super();
    }

    public BillDTO(int maHD, String maKH, Date ngayTao, String nguoiTao, int tongTien) {
        super();
        this.maHD = maHD;
        this.maKH = maKH;
        this.ngayTao = ngayTao;
        this.nguoiTao = nguoiTao;
        this.tongTien = tongTien;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "BillDTO{" + "maHD=" + maHD + ", maKH=" + maKH + ", ngayTao=" + ngayTao + ", nguoiTao=" + nguoiTao + ", tongTien=" + tongTien + '}';
    }

    public void tongTien(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
