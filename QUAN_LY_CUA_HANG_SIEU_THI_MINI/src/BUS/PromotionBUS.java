package BUS;

import database.PromotionDAO;
import java.util.ArrayList;
import model.PromotionDTO;

public class PromotionBUS {
    public static ArrayList<PromotionDTO> dskm;
    //promotion
        public void docKM()
        {
            PromotionDAO dataKM = new PromotionDAO();
            if(dskm==null)
                {
                    dskm = new ArrayList<PromotionDTO>();
                }
            dskm = dataKM.selectAll();
        }
	
        public void insertKM(PromotionDTO km) {
		PromotionDAO dataKM = new PromotionDAO();
                dataKM.insert(km);
                dskm.add(km);
	}
        
        public void updateKM(PromotionDTO km, String maKM ) {
                PromotionDAO dataKM = new PromotionDAO();
                dataKM.update(km, maKM);
                
                dskm.remove(km);
		dskm.add(km);
	}  
	
	public void deleteKM(String maKM, int n) {
		PromotionDAO dataKM = new PromotionDAO();
                dataKM.delete(maKM);
                dskm.remove(n);
	}
}
