package model;

import java.util.logging.Logger;

public class topBanChayDTO {
    private String maSP;
    private int daBan;
    private int donGia;

    public topBanChayDTO() {
        super();
    }

    public topBanChayDTO(String maSP, int daBan, int donGia) {
        super();
        this.maSP = maSP;
        this.daBan = daBan;
        this.donGia = donGia;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getDaBan() {
        return daBan;
    }

    public void setDaBan(int daBan) {
        this.daBan = daBan;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "topBanChayDTO{" + "maSP=" + maSP + ", daBan=" + daBan + ", donGia=" + donGia + '}';
    }
}
