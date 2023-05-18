package database;
import java.sql.*;
import model.NhaCungCapDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import model.NhaCungCapDTO;

public class NhaCungCapDAO   {
    public static NhaCungCapDAO getInstance(){
        return new NhaCungCapDAO();}

        public int insert(NhaCungCapDTO ncc) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "insert into nhacungcap(ID,Ten,Diachi,SDT) value(?,?,?,?)";
			PreparedStatement statement = con.prepareCall(sql);
                        statement.setString(1, ncc.getID());
                        statement.setString(2, ncc.getTen());
                        statement.setString(3, ncc.getDiaChi());
                        statement.setString(4, ncc.getSDT());
                        ketQua = statement.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}

        public ArrayList<NhaCungCapDTO> selectAll() {
		ArrayList<NhaCungCapDTO> ketQua = new ArrayList<NhaCungCapDTO>();
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "Select * from nhacungcap";
			PreparedStatement pst = con.prepareStatement(sql);
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String ID = rs.getString("ID");
				String Ten = rs.getString("Ten");
				String DiaChi = rs.getString("Diachi");
				
				String SDT = rs.getString("SDT");
				
				NhaCungCapDTO p = new NhaCungCapDTO(ID, Ten,   DiaChi,  SDT);
				ketQua.add(p);		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}
        public int update(NhaCungCapDTO ncc) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "update nhacungcap set Ten=?,Diachi=?,SDT=? WHERE ID=?";
			PreparedStatement statement = con.prepareCall(sql); 
                        statement.setString(1, ncc.getTen());
                        statement.setString(2, ncc.getDiaChi());
                        statement.setString(3, ncc.getSDT());
                        statement.setString(4, ncc.getID());
                        statement.executeUpdate();
                        statement.close();
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Lỗi", "Thông báo", 1);
                        e.printStackTrace();
		}
		return ketQua;
	}
        public int delete(String ID ) {
		int ketQua=0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "delete from nhacungcap where ID=?";
			PreparedStatement pst = con.prepareStatement(sql);
                        pst.setString(1,ID);
                        ketQua=pst.executeUpdate();
                        pst.close();
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Lỗi", "Thông báo", 1);
			e.printStackTrace();
		}
            return ketQua;    
	}
        public NhaCungCapDTO selectById(NhaCungCapDTO ncc) {
		NhaCungCapDTO ketQua = null;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "select * form nhacungcap where ID=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, ncc.getID());
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String ID = rs.getString("ID");
				String Ten = rs.getString("Ten");
				String SDT = rs.getString("SDT");
				String DiaChi = rs.getString("Diachi");
				ketQua = new NhaCungCapDTO(ID, Ten, DiaChi, SDT);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}    
       
    }

