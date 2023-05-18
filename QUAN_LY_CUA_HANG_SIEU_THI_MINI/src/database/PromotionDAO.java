package database;
import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.PromotionDTO;

public class PromotionDAO {
    public static PromotionDAO getInstance(){
            return new PromotionDAO();
        }
    public ArrayList<PromotionDTO> selectAll() {
		ArrayList<PromotionDTO> ketQua = new ArrayList<PromotionDTO>();
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "Select * from promotion";
			PreparedStatement pst = con.prepareStatement(sql);
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maKM = rs.getString("makm");
				String chuongTrinh = rs.getString("chuongtrinh");
				String dieuKien = rs.getString("dieukien");
				int phanTram = rs.getInt("phantram");
				Date ngayBD = rs.getDate("ngaybd");
				Date ngayKT = rs.getDate("ngaykt");
                                String tinhTrang = rs.getString("tinhtrang");
				PromotionDTO p = new PromotionDTO(maKM, chuongTrinh, dieuKien, phanTram, ngayBD, ngayKT, tinhTrang);
				ketQua.add(p);		
			}
		} catch (Exception e) {
			e.printStackTrace();               
		}
		return ketQua;
	}
        // tìm kiếm
	public PromotionDTO selectById(PromotionDTO km) {
		PromotionDTO ketQua = null;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "select * form promotion where makm=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, km.getMaKM());
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maKM = rs.getString("makm");
				String chuongTrinh = rs.getString("chuongtrinh");
				String dieuKien = rs.getString("dieukien");
				int phanTram = rs.getInt("phantram");
				Date ngayBD = rs.getDate("ngaybd");
				Date ngayKT = rs.getDate("ngaykt");
                                String tinhTrang = rs.getString("tinhtrang");
				ketQua = new PromotionDTO(maKM, chuongTrinh, dieuKien, phanTram, ngayBD, ngayKT, tinhTrang);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}    
	public int insert(PromotionDTO km) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "insert into promotion(makm,chuongtrinh,dieukien,phantram,ngaybd,ngaykt,tinhtrang) value(?,?,?,?,?,?,?)";
			PreparedStatement statement = con.prepareCall(sql);
			statement.setString(1, km.getMaKM());
                        statement.setString(2, km.getChuongTrinh());
                        statement.setString(3, km.getDieuKien());
                        statement.setInt(4, km.getPhanTram());
                        statement.setTimestamp(5, new java.sql.Timestamp(km.getNgayBD().getTime()));
                        statement.setTimestamp(6, new java.sql.Timestamp(km.getNgayKT().getTime()));
                        statement.setString(7, km.getTinhTrang());
                        ketQua = statement.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}
        
	public int update(PromotionDTO km, String maKM) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "update promotion set chuongtrinh=?,dieukien=?,phantram=?,ngaybd=?,ngaykt=?, tinhtrang=? WHERE makm=?";
			PreparedStatement statement = con.prepareCall(sql);     
                        statement.setString(1, km.getChuongTrinh());
                        statement.setString(2, km.getDieuKien());
                        statement.setInt(3, km.getPhanTram());
                        statement.setTimestamp(4, new java.sql.Timestamp(km.getNgayBD().getTime()));
                        statement.setTimestamp(5, new java.sql.Timestamp(km.getNgayKT().getTime()));
                        statement.setString(6, km.getTinhTrang());
                        statement.setString(7, km.getMaKM());
                        ketQua = statement.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}
       
	public int delete(String maKM) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "delete from promotion where makm=N'"+maKM+"'";
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
