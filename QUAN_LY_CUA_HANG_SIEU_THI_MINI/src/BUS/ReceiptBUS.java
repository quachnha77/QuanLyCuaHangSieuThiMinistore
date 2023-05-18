package BUS;

import database.ReceiptDAO;
import java.util.ArrayList;
import model.ReceiptDTO;

public class ReceiptBUS {
        public static ArrayList<ReceiptDTO> dspn;  //ds phiếu nhập
        //phiếu nhập
        public void docPN()
        {
            ReceiptDAO dataPN = new ReceiptDAO();
            if(dspn==null)
                {
                    dspn = new ArrayList<ReceiptDTO>();
                }
            dspn = dataPN.selectAll();
        }
	
        public void insertPN(ReceiptDTO pn) {
		ReceiptDAO dataPN = new ReceiptDAO();
                dataPN.insert(pn);
                dspn.add(pn);
	}
	
	public void deletePN(String maPN, int n) {
		ReceiptDAO dataPN = new ReceiptDAO();
                dataPN.delete(maPN);
                dspn.remove(n);
	}
        
	public void updatePN(ReceiptDTO pn, String maPN) {
                ReceiptDAO dataPN = new ReceiptDAO();
                dataPN.update(pn, maPN);
                
                dspn.remove(pn);
		dspn.add(pn);
	}
}
