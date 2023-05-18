package BUS;

import database.DetailBillDAO;
import java.util.ArrayList;
import model.DetailBillDTO;
import model.topBanChayDTO;

public class DetailBillBUS {
    public static ArrayList<DetailBillDTO> dscthd;
    public static ArrayList<topBanChayDTO> dsspbc;  //ds sản phẩm bán chạy
    //chi tiết hóa đơn
        public void docCTHD()
        {
            DetailBillDAO dataCTHD = new DetailBillDAO();
            if(dscthd==null)
                {
                    dscthd = new ArrayList<DetailBillDTO>();
                }
            dscthd = dataCTHD.selectAll();
        }
        
        public void topSPBanChay()
        {
            DetailBillDAO dataCTHD = new DetailBillDAO();
            if(dsspbc==null)
                {
                    dsspbc = new ArrayList<topBanChayDTO>();
                }
            dsspbc = dataCTHD.getTopBanChay();
        }
	
        public void insertCTHD(DetailBillDTO cthd) {
		DetailBillDAO dataCTHD = new DetailBillDAO();
                dataCTHD.insert(cthd);
                //dscthd.add(cthd);
	}
        
        public void updateCTHD(DetailBillDTO cthd) {
                DetailBillDAO dataCTHD = new DetailBillDAO();
                dataCTHD.update(cthd);
                
                dscthd.remove(cthd);
		dscthd.add(cthd);
	}  
	
	public void deleteCTHD(int maCTHD, int n) {
		DetailBillDAO dataCTHD = new DetailBillDAO();
                dataCTHD.delete(maCTHD);
                dscthd.remove(n);
	}
        
}
