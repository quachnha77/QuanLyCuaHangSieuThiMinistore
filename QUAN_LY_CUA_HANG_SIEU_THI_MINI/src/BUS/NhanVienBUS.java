package BUS;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import model.NhanVienDTO;
import database.NhanVienDAO;

public class NhanVienBUS {
    public static ArrayList<NhanVienDTO> dsnv;
    public NhanVienBUS(){
        }
    public void docnv()
        {
            NhanVienDAO datanv = new NhanVienDAO();
            if(dsnv==null)
                {
                    dsnv = new ArrayList<NhanVienDTO>();
                }
            dsnv = datanv.selectAll();
        }
	
        public void insertnv(NhanVienDTO nv) {
		NhanVienDAO datanv = new NhanVienDAO();
                datanv.insert(nv);
                dsnv.add(nv);
	}
	
	public void deletenv(NhanVienDTO nv, String MaNV, int n) {
		NhanVienDAO datanv = new NhanVienDAO();
                datanv.delete(MaNV);
                dsnv.remove(nv);
	}
	
	public void updatenv(NhanVienDTO nv, String MaNV) {
                NhanVienDAO datanv = new NhanVienDAO();
                datanv.update(nv, MaNV);               
                dsnv.remove(nv);
		dsnv.add(nv);
	}
        public void selectbyMaNV(NhanVienDTO nv, String MaNV){
                NhanVienDAO datanv= new NhanVienDAO();
                datanv.selectByMaNV(nv);
                dsnv.add(nv);
                
        }
        
        //acount
}
    

