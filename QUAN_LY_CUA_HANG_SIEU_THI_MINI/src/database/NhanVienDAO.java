package database;
import java.sql.*;
import model.NhanVienDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

public class NhanVienDAO {
    public static NhanVienDAO getInstance(){
        return new NhanVienDAO();}

        public int insert(NhanVienDTO nv) {
		int ketQua = 0;
		try {
			Connection con =KetNoiDB.getConnection();
			String sql = "insert into nhanvien(MaNV,Ho,Ten,GioiTinh,SDT,DiaChi) value(?,?,?,?,?,?)";
			PreparedStatement statement = con.prepareCall(sql);
                        statement.setString(1, nv.getMaNV());
                        statement.setString(2, nv.getHo());
                        statement.setString(3, nv.getTen());
                         statement.setString(4, nv.getGioiTinh());
                        statement.setString(6, nv.getDiaChi());
                        statement.setString(5, nv.getSDT());
                        ketQua = statement.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
	}

        public ArrayList<NhanVienDTO> selectAll() {
		ArrayList<NhanVienDTO> ketQua = new ArrayList<NhanVienDTO>();
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "Select * from nhanvien";
			PreparedStatement pst = con.prepareStatement(sql);
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String MaNV = rs.getString("MaNV");
                                String Ho = rs.getString("Ho");
				String Ten = rs.getString("Ten");
                                String GioiTinh = rs.getString("GioiTinh");
				String DiaChi = rs.getString("DiaChi");		
				String SDT = rs.getString("SDT");		
				NhanVienDTO p = new NhanVienDTO(MaNV,Ho, Ten, GioiTinh,   SDT,  DiaChi);
				ketQua.add(p);		
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
	}
        public int update(NhanVienDTO nv, String MaNV) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "update nhanvien set Ho=?, Ten=?,GioiTinh=?,SDT=?,DiaChi=? WHERE MaNV=?";
			PreparedStatement statement = con.prepareCall(sql); 
                        statement.setString(6, nv.getMaNV());
                        statement.setString(1, nv.getHo());
                        statement.setString(2, nv.getTen());
                        statement.setString(3, nv.getGioiTinh());
                        statement.setString(4, nv.getSDT());
                        statement.setString(5, nv.getDiaChi());
                        statement.executeUpdate();
                        statement.close();
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			// TODO: handle exception
                        JOptionPane.showMessageDialog(null, "Lỗi", "Thông báo", 1);
                        e.printStackTrace();
		}
		return ketQua;
	}
        public int delete(String MaNV ) {
		int ketQua=0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "delete from nhanvien where MaNV=?";
			PreparedStatement pst = con.prepareStatement(sql);
                        pst.setString(1,MaNV);
                        ketQua=pst.executeUpdate();
                        pst.close();
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			// TODO: handle exception
                        JOptionPane.showMessageDialog(null, "Lỗi", "Thông báo", 1);
			e.printStackTrace();
		}
            return ketQua;    
	}
        public NhanVienDTO selectByMaNV(NhanVienDTO nv) {
		NhanVienDTO ketQua = null;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "select * form nhanvien where MaNV=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, nv.getMaNV());
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String MaNV = rs.getString("MaNV");
                                String Ho = rs.getString("Ho");
				String Ten = rs.getString("Ten");
                                String GioiTinh = rs.getString("GioiTinh");
				String SDT = rs.getString("SDT");
				String DiaChi = rs.getString("Diachi");
				ketQua = new NhanVienDTO(MaNV,Ho, Ten, GioiTinh, SDT  ,DiaChi);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
	}    
       
    }



