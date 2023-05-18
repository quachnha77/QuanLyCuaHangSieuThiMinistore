package BUS;

import database.CartDAO;
import java.util.ArrayList;
import model.CartDTO;

public class CartBUS {
    public static ArrayList<CartDTO> dsspCart;// danh sách sản phẩm trong giỏ hàng
    //cart
        public void docCart()
        {
            CartDAO dataCart = new CartDAO();
            if(dsspCart==null)
                {
                    dsspCart = new ArrayList<CartDTO>();
                }
            dsspCart = dataCart.selectAll();
        }
	
        public void insertCart(CartDTO cart) {
		CartDAO dataCart = new CartDAO();
                dataCart.insert(cart);
                dsspCart.add(cart);
	}
        public void updateCart(CartDTO cart ) {
                CartDAO dataCart = new CartDAO();
                dataCart.update(cart);
                
                dsspCart.remove(cart);
		dsspCart.add(cart);
	}  
	
	public void deleteCart() {
		CartDAO dataCart = new CartDAO();
                dataCart.delete();   
	} 
        public void deleteCartByMaSP(String maSP,int n){
		CartDAO dataCart = new CartDAO();
                dataCart.delete1(maSP);
                dsspCart.remove(n);       
	} 
}
