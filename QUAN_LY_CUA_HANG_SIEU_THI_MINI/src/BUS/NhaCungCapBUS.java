package BUS;

import database.NhaCungCapDAO;
import java.util.ArrayList;
import model.NhaCungCapDTO;

public class NhaCungCapBUS {
    public static ArrayList<NhaCungCapDTO> dsncc;
    public NhaCungCapBUS(){
    }
        public void docNCC()
        {
            NhaCungCapDAO dataNCC = new NhaCungCapDAO();
            if(dsncc==null)
                {
                    dsncc = new ArrayList<NhaCungCapDTO>();
                }
            dsncc = dataNCC.selectAll();
        }
	
        public void insertNCC(NhaCungCapDTO ncc) {
		NhaCungCapDAO dataNCC = new NhaCungCapDAO();
                dataNCC.insert(ncc);
                dsncc.add(ncc);
	}
	
	public void deleteNCC(String ID, int n) {
		NhaCungCapDAO dataNCC = new NhaCungCapDAO();
                dataNCC.delete(ID);
                dsncc.remove(n);
	}
	
	public void updateNCC(NhaCungCapDTO ncc, String ID) {
                NhaCungCapDAO dataNCC = new NhaCungCapDAO();
                dataNCC.update(ncc);
                
                dsncc.remove(ncc);
		dsncc.add(ncc);
	}
        public void selectbyid(NhaCungCapDTO ncc, String ID){
                NhaCungCapDAO dataNCC= new NhaCungCapDAO();
                dataNCC.selectById(ncc);
                dsncc.add(ncc);
                
        }
}

    
