package BUS;

import database.AccountDAO;
import java.util.ArrayList;
import model.AccountDTO;

public class AccountBUS {
    
        public static ArrayList<AccountDTO> dsac;
        //acount
        public void docAC()
        {
            AccountDAO dataAC = new AccountDAO();
            if(dsac==null)
                {
                    dsac = new ArrayList<AccountDTO>();
                }
            dsac = dataAC.selectAll();
        }
	 
        public void insertAC(AccountDTO ac) {
		AccountDAO dataAC = new AccountDAO();
                dataAC.insert(ac);
                dsac.add(ac);
	}
	
	public void deleteAC(String userName, int n) {
		AccountDAO dataAC = new AccountDAO();
                dataAC.delete(userName);
                dsac.remove(n);
	}
	
	public void updateAC(AccountDTO ac) {
                AccountDAO dataAC = new AccountDAO();
                dataAC.update(ac);
                
                dsac.remove(ac);
		dsac.add(ac);
	}  
        public void editAC(AccountDTO ac){
                AccountDAO dataAC = new AccountDAO();
                dataAC.edit(ac);
                
                dsac.remove(ac);
		dsac.add(ac);
        }
         public void editPass(AccountDTO ac){
                AccountDAO dataAC = new AccountDAO();
                dataAC.editPass(ac);
                
                dsac.remove(ac);
		dsac.add(ac);
        }
}
