package model;

public class DetailReceiptDTO {
    public String maPN, maNCC, maSP, tenSP, loaiSP, donVi;
    public int donGia, soLuong;

    public DetailReceiptDTO() {
        super();
    }

    public DetailReceiptDTO(String maPN, String maNCC, String maSP, String tenSP, String loaiSP, int donGia, int soLuong, String donVi) {
        super();
        this.maPN = maPN;
        this.maNCC = maNCC;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.loaiSP = loaiSP;
        this.donGia = donGia;
        this.soLuong = soLuong; 
        this.donVi = donVi;        
    }

    public String getMaPN() {
        return maPN;
    }

    public void setMaPN(String maPN) {
        this.maPN = maPN;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "ReceiptDetailDTO{" + "maPN=" + maPN + ", maNCC=" + maNCC + ", maSP=" + maSP + ", tenSP=" + tenSP + ", loaiSP=" + loaiSP + ", donVi=" + donVi + ", donGia=" + donGia + ", soLuong=" + soLuong + '}';
    }
    
}
