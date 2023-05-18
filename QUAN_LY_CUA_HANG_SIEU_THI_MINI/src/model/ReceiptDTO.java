package model;

import java.util.Date;

public class ReceiptDTO {
    public String maPN;
    public Date ngayTao;
    public String nguoiTao;
    public int tongTien;

    public ReceiptDTO() {
        super();
    }

    public ReceiptDTO(String maPN, Date ngayTao, String nguoiTao, int tongTien) {
        super();
        this.maPN = maPN;
        this.ngayTao = ngayTao;
        this.nguoiTao = nguoiTao;
        this.tongTien = tongTien;
    }

    public String getMaPN() {
        return maPN;
    }

    public void setMaPN(String maPN) {
        this.maPN = maPN;
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
        return "ReceiptDTO{" + "maPN=" + maPN + ", ngayTao=" + ngayTao + ", nguoiTao=" + nguoiTao + ", tongTien=" + tongTien + '}';
    }
}
