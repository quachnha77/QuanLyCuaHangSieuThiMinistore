package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.AccountDTO;
import model.CartDTO;

public class CartDAO {
    public static CartDAO getInstance(){
            return new CartDAO();
        }
    public ArrayList<CartDTO> selectAll() {
		ArrayList<CartDTO> ketQua = new ArrayList<CartDTO>();
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "Select * from cart";
			PreparedStatement pst = con.prepareStatement(sql);
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maSP = rs.getString("masp");
                                String tenSP = rs.getString("tensp");
				int soLuong = rs.getInt("soluong");
                                int donGia = rs.getInt("dongia");
                                int thanhTien = rs.getInt("thanhtien");
				CartDTO p = new CartDTO(maSP,tenSP,soLuong,donGia,thanhTien);
				ketQua.add(p);		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}
        // tìm kiếm
	public CartDTO selectById(CartDTO cart) {
		CartDTO ketQua = null;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "select * form cart where masp=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, cart.getMaSP());
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maSP = rs.getString("masp");
                                String tenSP = rs.getString("tensp");
				int soLuong = rs.getInt("soluong");
                                int donGia = rs.getInt("dongia");
                                int thanhTien = rs.getInt("thanhtien");
				ketQua = new CartDTO(maSP,tenSP,soLuong,donGia,thanhTien);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}    
	public int insert(CartDTO cart) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "insert into cart(masp,tensp,soluong,dongia,thanhtien) value(?,?,?,?,?)";
			PreparedStatement statement = con.prepareCall(sql);                    
			statement.setString(1, cart.getMaSP());
                        statement.setString(2, cart.getTenSP());
                        statement.setInt(3, cart.getSoLuong());
                        statement.setInt(4, cart.getDonGia());
                        statement.setInt(5, cart.getThanhTien());
                        ketQua = statement.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}
        
	public int update(CartDTO cart) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "update cart set tensp=?,soluong=?,dongia=?,thanhtien=? WHERE masp=?";
			PreparedStatement statement = con.prepareCall(sql);          
                        //statement.setString(1, cart.getMaSP());
                        statement.setString(1, cart.getTenSP());
                        statement.setInt(2, cart.getSoLuong());
                        statement.setInt(3, cart.getDonGia());
                        statement.setInt(4, cart.getThanhTien());
                        statement.setString(5, cart.getMaSP());

                        ketQua = statement.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}
       
	public int delete() {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "DELETE from cart";
			PreparedStatement pst = con.prepareStatement(sql);
			ketQua = pst.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}
        public int delete1(String maSP) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "delete from cart where masp=N'"+maSP+"'";
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
