package BUS;

import database.CustomerDAO;
import java.util.ArrayList;
import model.CustomerDTO;

public class CustomerBUS {
    public static ArrayList<CustomerDTO> dskh;
    public CustomerBUS(){}
    public void docDSKH(){
        CustomerDAO data = new CustomerDAO();
        if(dskh ==null) dskh =new ArrayList<CustomerDTO>();
        dskh = data.selectAll();
    }
    public void them(CustomerDTO kh){
        CustomerDAO data = new CustomerDAO();
        data.insert(kh);
        dskh.add(kh);
    }
	
    public void xoa(String maKH) {
        CustomerDAO data = new CustomerDAO();
        data.delete(maKH);
        dskh.remove(maKH);
    }

    public void sua(CustomerDTO kh, String maKH) {
        CustomerDAO data = new CustomerDAO();
        data.update(kh,maKH);
        dskh.remove(kh);
        dskh.add(kh);
    } 
}
