package BUS;

import database.BillDAO;
import java.util.ArrayList;
import model.BillDTO;

public class BillBUS {
    public static ArrayList<BillDTO> dshd;//danh sách hóa đơn
    //hóa đơn
        public void docHD()
        {
            BillDAO dataHD = new BillDAO();
            if(dshd==null)
                {
                    dshd = new ArrayList<BillDTO>();
                }
            dshd = dataHD.selectAll();
        }
	
        public void insertHD(BillDTO hd) {
		BillDAO dataHD = new BillDAO();
                dataHD.insert(hd);
                //dshd.add(hd);
	}
        
        public void updateHD(BillDTO hd) {
                BillDAO dataHD = new BillDAO();
                dataHD.update(hd);
                
                dshd.remove(hd);
		dshd.add(hd);
	}  
	public void deleteHD(int maHD, int n) {
		BillDAO dataHD = new BillDAO();
                dataHD.delete(maHD);
                dshd.remove(n);
	}     
}
