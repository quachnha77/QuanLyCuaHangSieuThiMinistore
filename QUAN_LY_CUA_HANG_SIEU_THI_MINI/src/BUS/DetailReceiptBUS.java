package BUS;

import database.DetailReceiptDAO;
import java.util.ArrayList;
import model.DetailReceiptDTO;

public class DetailReceiptBUS {
    public static ArrayList<DetailReceiptDTO> dsctpn;  //ds chi tiết phiếu nhập
    //chi tiet phiếu nhập
        public void docCTPN()
        {
            DetailReceiptDAO dataCTPN = new DetailReceiptDAO();
            if(dsctpn==null)
                {
                    dsctpn = new ArrayList<DetailReceiptDTO>();
                }
            dsctpn = dataCTPN.selectAll();
        }
	
        public void insertCTPN(DetailReceiptDTO ctpn) {
		DetailReceiptDAO dataCTPN = new DetailReceiptDAO();
                dataCTPN.insert(ctpn);
                dsctpn.add(ctpn);
	}
	
	public void deleteCTPN(String maCTPN, int n) {
		DetailReceiptDAO dataCTPN = new DetailReceiptDAO();
                dataCTPN.delete(maCTPN);
                dsctpn.remove(n);
	}
        
	public void updateCTPN(DetailReceiptDTO ctpn, String maCTPN) {
                DetailReceiptDAO dataCTPN = new DetailReceiptDAO();
                dataCTPN.update(ctpn);
                
                dsctpn.remove(ctpn);
		dsctpn.add(ctpn);
	}
}
