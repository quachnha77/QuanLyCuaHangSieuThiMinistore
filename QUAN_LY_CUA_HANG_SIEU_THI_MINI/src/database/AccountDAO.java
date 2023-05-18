package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.AccountDTO;

public class AccountDAO {
    public static AccountDAO getInstance(){
            return new AccountDAO();
        }
    
    public ArrayList<AccountDTO> selectAll() {
		ArrayList<AccountDTO> ketQua = new ArrayList<AccountDTO>();
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "Select * from account";
			PreparedStatement pst = con.prepareStatement(sql);
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String fullName = rs.getString("fullname");
				String userName = rs.getString("username");
				String passWord = rs.getString("password");
				String role = rs.getString("role");
                                int status = rs.getInt("status");
                                String gmail = rs.getString("email");
				AccountDTO p = new AccountDTO(fullName, userName, passWord, role, status, gmail);
				ketQua.add(p);		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}

        // tìm kiếm
	public AccountDTO selectById(String user) {
		AccountDTO ketQua = null;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "select * from account where username = '" + user + "'";
			PreparedStatement pst = con.prepareStatement(sql);
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String fullName = rs.getString("fullname");
				String userName = rs.getString("username");
				String passWord = rs.getString("password");
				String role = rs.getString("role");
                                int status = rs.getInt("status");
                                String email = rs.getString("email");
				ketQua = new AccountDTO(fullName, userName, passWord, role, status, email);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}    
        
	public int insert(AccountDTO ac) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "insert into account(fullname,username,password,role,status,email) value(?,?,?,?,?,?)";
			PreparedStatement statement = con.prepareCall(sql);
			statement.setString(1, ac.getFullName());
                        statement.setString(2, ac.getUserName());
                        statement.setString(3, ac.getPassWord());
                        statement.setString(4, ac.getRole());
                        statement.setInt(5, ac.getStatus());
                        statement.setString(6, ac.getEmail());
                        ketQua = statement.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}  
	public int update(AccountDTO ac) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "update account set fullname=?,username=?,password=?,role=?, status=?, email=? WHERE username=?";
			PreparedStatement statement = con.prepareCall(sql);          
                        statement.setString(1, ac.getFullName());
                        statement.setString(2, ac.getUserName());
                        statement.setString(3, ac.getPassWord());
                        statement.setString(4, ac.getRole());
                        statement.setInt(5, ac.getStatus());
                        statement.setString(6, ac.getEmail());
                        statement.setString(7, ac.getUserName());
			ketQua = statement.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}
        public int edit(AccountDTO ac) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "update account set fullname=?,username=?,role=?, email=? WHERE username=?";
			PreparedStatement statement = con.prepareCall(sql);          
                        statement.setString(1, ac.getFullName());
                        statement.setString(2, ac.getUserName());
                        statement.setString(3, ac.getRole());
                        statement.setString(4, ac.getEmail());
                        statement.setString(5, ac.getUserName());
			ketQua = statement.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}
        public int editPass(AccountDTO ac) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "update account set password=? WHERE username=?";
			PreparedStatement statement = con.prepareCall(sql);          
                        statement.setString(1, ac.getPassWord());
                        statement.setString(2, ac.getUserName());
			ketQua = statement.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
                        System.out.println("Pass mới là : "+ac.getPassWord());
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}
        public int updatePass(String email,String pass) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "update account set password=? WHERE email=?";
			PreparedStatement statement = con.prepareCall(sql);     
                        statement.setString(1, pass);
                        statement.setString(2, email);                    
			ketQua = statement.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}
	public int delete(String userName) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "delete from account where username=N'"+userName+"'";
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
