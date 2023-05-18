package model;

public class NhanVienDTO {
    public String MaNV, Ho, Ten, GioiTinh, SDT, DiaChi;
    public NhanVienDTO(){
        super();
    }

    public NhanVienDTO(String MaNV, String Ho, String Ten, String GioiTinh, String SDT, String DiaChi) {
        super();
        this.MaNV = MaNV;
        this.Ho = Ho;
        this.Ten = Ten;
        this.GioiTinh = GioiTinh;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
    }

    public String getMaNV() {
        return MaNV;
    }

    public String getHo() {
        return Ho;
    }

    public String getTen() {
        return Ten;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public String getSDT() {
        return SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public void setHo(String Ho) {
        this.Ho = Ho;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
    @Override
    public String toString() {
        return "NhanVienDTO{" + "MaNV=" + MaNV + ", Ho=" + Ho + ", Ten=" + Ten + ", GioiTinh=" + GioiTinh + ", SDT=" + SDT + ", DiaChi=" + DiaChi + '}';
    }
    
    
}
