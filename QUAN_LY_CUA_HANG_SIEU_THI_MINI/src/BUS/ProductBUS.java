package BUS;

import database.ProductDAO;
import java.util.ArrayList;
import model.ProductDTO;

public class ProductBUS {
    public static ArrayList<ProductDTO> dssp;
    public ProductBUS(){ 
	} 
        //product
        public void docSP()
        {
            ProductDAO dataSP = new ProductDAO();
            if(dssp==null)
                {
                    dssp = new ArrayList<ProductDTO>();
                }
            dssp = dataSP.selectAll();
        }
	
        public void insertSP(ProductDTO sp) {
		ProductDAO dataSP = new ProductDAO();
                dataSP.insert(sp);
                dssp.add(sp);
	}
	
	public void deleteSP(String maSP, int n) {
		ProductDAO dataSP = new ProductDAO();
                dataSP.delete(maSP);
                dssp.remove(n);
	}
        
	public void updateSP(ProductDTO sp) {
                ProductDAO dataSP = new ProductDAO();
                dataSP.update(sp);
                
                dssp.remove(sp);
		dssp.add(sp);
	}
}
