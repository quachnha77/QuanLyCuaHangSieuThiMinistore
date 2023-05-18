package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import model.PromotionDTO;
import model.ReceiptDTO;

public class ReceiptDAO {
    public static ReceiptDAO getInstance(){
            return new ReceiptDAO();
        }
    public ArrayList<ReceiptDTO> selectAll() {
		ArrayList<ReceiptDTO> ketQua = new ArrayList<ReceiptDTO>();
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "Select * from receipt";
			PreparedStatement pst = con.prepareStatement(sql);
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maPN = rs.getString("mapn");
				Date ngayTao = rs.getDate("ngaytao");
				String nguoiTao = rs.getString("nguoitao");
				int tongTien = rs.getInt("tongtien");
				ReceiptDTO p = new ReceiptDTO(maPN, ngayTao, nguoiTao, tongTien);
				ketQua.add(p);		
			}
		} catch (Exception e) {
			e.printStackTrace();               
		}
		return ketQua;
	}
        // tìm kiếm
	public ReceiptDTO selectById(ReceiptDTO pn) {
		ReceiptDTO ketQua = null;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "select * form receipt where mapn=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, pn.getMaPN());
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maPN = rs.getString("mapn");
				Date ngayTao = rs.getDate("ngaytao");
				String nguoiTao = rs.getString("nguoitao");
				int tongTien = rs.getInt("tongtien");
				ketQua = new ReceiptDTO(maPN, ngayTao, nguoiTao, tongTien);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}    
	public int insert(ReceiptDTO pn) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "insert into receipt(mapn,ngaytao,nguoitao,tongtien) value(?,?,?,?)";
			PreparedStatement statement = con.prepareCall(sql);
			statement.setString(1, pn.getMaPN());
                        statement.setTimestamp(2, new java.sql.Timestamp(pn.getNgayTao().getTime()));
                        statement.setString(3, pn.getNguoiTao());
                        statement.setInt(4, pn.getTongTien());
                        ketQua = statement.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}
        
	public int update(ReceiptDTO pn, String maPN) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "update receipt set ngaytao=?,nguoitao=?,tongtien=? WHERE mapn=?";
			PreparedStatement statement = con.prepareCall(sql);     
                        statement.setTimestamp(1, new java.sql.Timestamp(pn.getNgayTao().getTime()));
                        statement.setString(2, pn.getNguoiTao());
                        statement.setInt(3, pn.getTongTien());
                        statement.setString(4, pn.getMaPN());
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
			String sql = "delete from receipt where mapn=N'"+maPN+"'";
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
