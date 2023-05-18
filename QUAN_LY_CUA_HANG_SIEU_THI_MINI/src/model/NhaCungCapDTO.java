package model;

public class NhaCungCapDTO {
    public String ID, Ten, DiaChi, SDT;
    public NhaCungCapDTO(){
        super();
    }
    public NhaCungCapDTO(String ID, String Ten, String DiaChi, String SDT){
        super();
        this.ID=ID;
        this.Ten=Ten;
        this.DiaChi=DiaChi;
        this.SDT=SDT;
    }
    public String getID(){
        return ID;
    }
    public void setID(String ID){
        this.ID=ID;
    }
    public String getTen(){
        return Ten;
    }
    public void setTen(String Ten){
        this.Ten=Ten;
    }
    public String getDiaChi(){
        return DiaChi;
    }
    public void setDiaChi(String DiaChi){
        this.DiaChi=DiaChi;
    }
    public String getSDT(){
        return SDT;
    }
    public void setSDT(String SDT){
        this.SDT=SDT;
    }

    @Override
    public String toString() {
        return "NhacungcapDTO{" + "ID=" + ID + ", Ten=" + Ten + ", DiaChi=" + DiaChi + ", SDT=" + SDT + '}';
    }
    
}
