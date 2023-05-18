package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.CustomerDTO;
public class CustomerDAO {
    public static CustomerDAO getInstance(){
            return new CustomerDAO();
        }
    public ArrayList<CustomerDTO> selectAll() {
		ArrayList<CustomerDTO> ketQua = new ArrayList<CustomerDTO>();
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "Select * from khachhang";
			PreparedStatement pst = con.prepareStatement(sql);
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maKH = rs.getString("makh");
				String hoKH = rs.getString("hokh");
				String tenKH = rs.getString("tenkh");
                                String sdt = rs.getString("sdt");
				CustomerDTO kh = new CustomerDTO(maKH, hoKH, tenKH, sdt);
				ketQua.add(kh);		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}
        // tìm kiếm
	public CustomerDTO selectById(String ma) {
		CustomerDTO ketQua = null;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "select * from khachhang where maKH=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, ma);
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maKH = rs.getString("maKH");
				String hoKH = rs.getString("hoKH");
				String tenKH = rs.getString("tenKH");
				String sdt = rs.getString("sdt");
				ketQua = new CustomerDTO(maKH, hoKH, tenKH, sdt);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}    
	public int insert(CustomerDTO kh) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "insert into khachhang(maKH, hoKH, tenKH, sdt) value(?,?,?,?)";
			PreparedStatement statement = con.prepareCall(sql);
			statement.setString(1, kh.getMaKH());
                        statement.setString(2, kh.getHoKH());
                        statement.setString(3, kh.getTenKH());
                        statement.setString(4, kh.getSdt());
                        ketQua = statement.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
	}
        
	
        public int update(CustomerDTO kh, String maKH) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "update khachhang set hoKH=?, tenKH=?, sdt=?  WHERE makh=?";
			PreparedStatement statement = con.prepareCall(sql);     
                        statement.setString(1, kh.getHoKH());
                        statement.setString(2, kh.getTenKH());
                        statement.setString(3, kh.getSdt());
                        statement.setString(4, kh.getMaKH());
                        ketQua = statement.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}
       
	public int delete(String maKH) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "delete from khachhang where maKH=n'"+maKH+"'";
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
