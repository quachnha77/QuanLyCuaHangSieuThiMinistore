package model;

public class ProductDTO {
    public String maSP;
    public String tenSP;
    public String loaiSP;
    public int donGia;
    public int soLuong;
    public String donVi;
    
    public ProductDTO() {
        super();
    }

    public ProductDTO(String maSP, String tenSP, String loaiSP, int donGia, int soLuong, String donVi) {
        super();
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.loaiSP = loaiSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.donVi = donVi;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public int getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    @Override
    public String toString() {
        return "Product{" + "maSP=" + maSP + ", tenSP=" + tenSP + ", loaiSP=" + loaiSP + ", donGia=" + donGia + ", soLuong=" + soLuong + ", donVi=" + donVi + '}';
    }

    public void maSP(String stringCellValue) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void tenSP(String stringCellValue) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
