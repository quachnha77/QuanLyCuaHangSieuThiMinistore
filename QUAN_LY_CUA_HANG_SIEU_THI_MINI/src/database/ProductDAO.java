package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.ProductDTO;
public class ProductDAO {
    public static ProductDAO getInstance(){
            return new ProductDAO();
        }
    
    public ArrayList<ProductDTO> selectAll() {
		ArrayList<ProductDTO> ketQua = new ArrayList<ProductDTO>();
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "Select * from product";
			PreparedStatement pst = con.prepareStatement(sql);
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maSP = rs.getString("masp");
				String tenSP = rs.getString("tensp");
				String loaiSP = rs.getString("loaisp");
				int donGia = rs.getInt("dongia");
				int soLuong = rs.getInt("soluong");
				String donVi = rs.getString("donvi");
				ProductDTO p = new ProductDTO(maSP, tenSP, loaiSP, donGia, soLuong, donVi);
				ketQua.add(p);		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}

        // tìm kiếm
    	public ProductDTO selectById(String t) {
		ProductDTO ketQua = null;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "select * form product where masp=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t);
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maSP = rs.getString("masp");
				String tenSP = rs.getString("tensp");
				String loaiSP = rs.getString("loaisp");
				int donGia = rs.getInt("dongia");
				int soLuong = rs.getInt("soluong");
				String donVi = rs.getString("donvi");
				ketQua = new ProductDTO(maSP, tenSP, loaiSP, donGia, soLuong, donVi);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}    
	public int insert(ProductDTO sp) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "insert into product(masp,tensp,loaisp,dongia,soluong,donvi) value(?,?,?,?,?,?)";
			PreparedStatement statement = con.prepareCall(sql);
			statement.setString(1, sp.getMaSP());
                        statement.setString(2, sp.getTenSP());
                        statement.setString(3, sp.getLoaiSP());
                        statement.setInt(4, sp.getDonGia());
                        statement.setInt(5, sp.getSoLuong());
                        statement.setString(6, sp.getDonVi());
                        ketQua = statement.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
	}
	public int update(ProductDTO sp) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "update product set tensp=?,loaisp=?,dongia=?,soluong=?,donvi=? WHERE masp=?";
			PreparedStatement statement = con.prepareCall(sql);     
                        statement.setString(1, sp.getTenSP());
                        statement.setString(2, sp.getLoaiSP());
                        statement.setInt(3, sp.getDonGia());
                        statement.setInt(4, sp.getSoLuong());
                        statement.setString(5, sp.getDonVi());
                        statement.setString(6, sp.getMaSP());

			ketQua = statement.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}
       
	public int delete(String maSP) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "delete from product where masp=N'"+maSP+"'";
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
