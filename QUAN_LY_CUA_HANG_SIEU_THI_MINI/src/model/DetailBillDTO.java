package model;

public class DetailBillDTO {
    public int maHD;
    public String maSP;
    public int soLuong;
    public int donGia;
    public int thanhTien;

    public DetailBillDTO() {
        super();
    }

    public DetailBillDTO(int maHD, String maSP, int soLuong, int donGia, int thanhTien) {
        super();
        this.maHD = maHD;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

    @Override
    public String toString() {
        return "DetailBillDTO{" + "maHD=" + maHD + ", maSP=" + maSP + ", soLuong=" + soLuong + ", donGia=" + donGia + ", thanhTien=" + thanhTien + '}';
    } 
}
