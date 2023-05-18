package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import model.BillDTO;
import model.DetailReceiptDTO;

public class DetailReceiptDAO {
    public static DetailReceiptDAO getInstance(){
            return new DetailReceiptDAO();
        }
    public ArrayList<DetailReceiptDTO> selectAll() {
		ArrayList<DetailReceiptDTO> ketQua = new ArrayList<DetailReceiptDTO>();
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "Select * from detailreceipt";
			PreparedStatement pst = con.prepareStatement(sql);
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maPN = rs.getString("mapn");
                                String maNCC = rs.getString("mancc");
				String maSP = rs.getString("masp");
				String tenSP = rs.getString("tensp");
				String loaiSP = rs.getString("loaisp");
                                int donGia = rs.getInt("dongia");
                                int soLuong = rs.getInt("soluong");
                                String donVi = rs.getString("donvi");
				DetailReceiptDTO p = new DetailReceiptDTO(maPN, maNCC, maSP, tenSP, loaiSP, donGia, soLuong, donVi);
				ketQua.add(p);		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}
        // tìm kiếm
	public DetailReceiptDTO selectById(DetailReceiptDTO detailReceipt) {
		DetailReceiptDTO ketQua = null;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "select * form detailreceipt where mapn=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, detailReceipt.getMaPN());
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maPN = rs.getString("mapn");
                                String maNCC = rs.getString("mancc");
				String maSP = rs.getString("masp");
				String tenSP = rs.getString("tensp");
				String loaiSP = rs.getString("loaisp");
                                int donGia = rs.getInt("dongia");
                                int soLuong = rs.getInt("soluong");
                                String donVi = rs.getString("donvi");
				ketQua = new DetailReceiptDTO(maPN, maNCC, maSP, tenSP, loaiSP, donGia, soLuong, donVi);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}  
        
	public int insert(DetailReceiptDTO detailReceipt) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "insert into detailreceipt(mapn,mancc,masp,tensp,loaisp,dongia,soluong,donvi) value(?,?,?,?,?,?,?,?)";
			PreparedStatement statement = con.prepareCall(sql);
			statement.setString(1, detailReceipt.getMaPN());
                        statement.setString(2, detailReceipt.getMaNCC());
                        statement.setString(3, detailReceipt.getMaSP());
                        statement.setString(4, detailReceipt.getTenSP());
                        statement.setString(5, detailReceipt.getLoaiSP());
                        statement.setInt(6, detailReceipt.getDonGia());
                        statement.setInt(7, detailReceipt.getSoLuong());
                        statement.setString(8, detailReceipt.getDonVi());
                        ketQua = statement.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}
        
	public int update(DetailReceiptDTO detailReceipt) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "update detailreceipt set mapn=?,mancc=?,tensp=?,loaisp=?,dongia=?,soluong=?,donvi=? WHERE mapn=?";
			PreparedStatement statement = con.prepareCall(sql);  
                        statement.setString(1, detailReceipt.getMaPN());
                        statement.setString(2, detailReceipt.getMaNCC());
                        statement.setString(3, detailReceipt.getMaSP());
                        statement.setString(4, detailReceipt.getTenSP());
                        statement.setString(5, detailReceipt.getLoaiSP());
                        statement.setInt(6, detailReceipt.getDonGia());
                        statement.setInt(7, detailReceipt.getSoLuong());
                        statement.setString(8, detailReceipt.getDonVi());
			ketQua = statement.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}
       
	public int delete(String maPN) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "delete from bill where mahd=N'"+ maPN+"'";
			PreparedStatement pst = con.prepareStatement(sql);
			ketQua = pst.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}
}
