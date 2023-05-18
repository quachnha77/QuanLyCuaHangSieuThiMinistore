package view;
import BUS.BillBUS;
import BUS.CartBUS;
import BUS.DetailBillBUS;
import BUS.ProductBUS;
import BUS.ReceiptBUS;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import com.formdev.flatlaf.FlatLightLaf;
import database.AccountDAO;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static java.time.Clock.system;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import static java.util.Spliterators.iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import javax.swing.table.DefaultTableModel;
import model.AccountDTO;
import model.BillDTO;
import model.CartDTO;
import model.DetailBillDTO;
import model.ProductDTO;
import model.PromotionDTO;
//note
//DELETE from cart where soluong>0;

public final class Sales extends javax.swing.JPanel {
    DefaultTableModel tableModel;
    DefaultTableModel tableModel1;
    private final String userName;
    //DefaultTableModel tableModelDetailBill; //chi tiết hóa đơn
    //DefaultTableModel tableModelBill;//hóa đơn
    //Cart
    Vector DS = new Vector();//lưu tiêu đề cho table
    Vector dataDS = new Vector();//lưu dữ liệu cho tb
    int selectindex = -1;

    public Sales(String user) {
        initComponents();
        jsSoLuong.setValue(1); // đặt giá trị mặc định cho SL thêm là 1
        DS.add("Mã SP");
        DS.add("Tên SP");
        DS.add("Số Lượng");
        DS.add("Đơn Giá");
        DS.add("Thành Tiền");        
        
        int tongTien = tongTienTrongGio();
        lbTongTien.setText(String.valueOf(tongTien) + " VND");
        
        userName = user;
        showAll();
    }

    public void showAll() {
        tableModel = (DefaultTableModel) tbProduct.getModel();
        showThongTin();
        
        tableModel1 = (DefaultTableModel) tbCart.getModel();
        showCart();
    }
    private void showCart() { 
        CartBUS bus = new CartBUS();
        tableModel1.setRowCount(0);
        bus.docCart();
        for (CartDTO cart : CartBUS.dsspCart) {
            tableModel1.addRow(new Object[]{
                cart.getMaSP(), 
                cart.getTenSP(),
                cart.getSoLuong(),
                cart.getDonGia(),
                cart.getThanhTien(),});
        }   
    }
    private void showThongTin() { 
        ProductBUS bus = new ProductBUS();
        tableModel.setRowCount(0);
        bus.docSP();
        
        for (ProductDTO sp : ProductBUS.dssp) {
            tableModel.addRow(new Object[]{
                sp.getMaSP(), 
                sp.getTenSP(), 
                sp.getLoaiSP(),   
                sp.getDonGia(),
                sp.getSoLuong(),
                sp.getDonVi()});
        }   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduct = new javax.swing.JTable();
        txtTimKiem = new javax.swing.JTextField();
        cbTimKiem = new javax.swing.JComboBox<>();
        btnTimKiem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCart = new javax.swing.JTable();
        lbTongTien = new javax.swing.JLabel();
        btnXuatHoaDon = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnThemCart = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jsSoLuong = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        btnXoaCart = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tbProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Loại", "Đơn Giá", "Số Lượng", "Đơn Vị"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbProduct.setInheritsPopupMenu(true);
        tbProduct.setName(""); // NOI18N
        tbProduct.setSelectionBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        tbProduct.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbProduct.setShowGrid(false);
        jScrollPane1.setViewportView(tbProduct);
        if (tbProduct.getColumnModel().getColumnCount() > 0) {
            tbProduct.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbProduct.getColumnModel().getColumn(4).setPreferredWidth(60);
        }

        txtTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        cbTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cbTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã Sản Phẩm", "Tên Sản Phẩm", "Loại", "Đơn Giá", "Số Lượng", "Đơn Vị" }));

        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        jLabel1.setText("Giỏ hàng");

        tbCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Số Lượng", "Đơn Giá", "Thành Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCart.setInheritsPopupMenu(true);
        tbCart.setSelectionBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        jScrollPane2.setViewportView(tbCart);
        if (tbCart.getColumnModel().getColumnCount() > 0) {
            tbCart.getColumnModel().getColumn(0).setPreferredWidth(40);
            tbCart.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        lbTongTien.setText("0   VND");

        btnXuatHoaDon.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        btnXuatHoaDon.setForeground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        btnXuatHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXuatHoaDonMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnXuatHoaDonMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Xuất hóa đơn");

        javax.swing.GroupLayout btnXuatHoaDonLayout = new javax.swing.GroupLayout(btnXuatHoaDon);
        btnXuatHoaDon.setLayout(btnXuatHoaDonLayout);
        btnXuatHoaDonLayout.setHorizontalGroup(
            btnXuatHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnXuatHoaDonLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(15, 15, 15))
        );
        btnXuatHoaDonLayout.setVerticalGroup(
            btnXuatHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        jLabel5.setText("Tổng tiền:");

        btnThemCart.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        btnThemCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThemCartMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Thêm");

        javax.swing.GroupLayout btnThemCartLayout = new javax.swing.GroupLayout(btnThemCart);
        btnThemCart.setLayout(btnThemCartLayout);
        btnThemCartLayout.setHorizontalGroup(
            btnThemCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThemCartLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        btnThemCartLayout.setVerticalGroup(
            btnThemCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jsSoLuong.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Số lượng");

        btnXoaCart.setBackground(new java.awt.Color(102, 102, 102));
        btnXoaCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnXoaCartMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Bớt");

        javax.swing.GroupLayout btnXoaCartLayout = new javax.swing.GroupLayout(btnXoaCart);
        btnXoaCart.setLayout(btnXoaCartLayout);
        btnXoaCartLayout.setHorizontalGroup(
            btnXoaCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXoaCartLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        btnXoaCartLayout.setVerticalGroup(
            btnXoaCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTimKiem)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jsSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(188, 188, 188))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(162, 162, 162)
                                        .addComponent(jLabel5)
                                        .addGap(20, 20, 20))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(btnThemCart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnXoaCart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnXuatHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(23, 23, 23))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimKiem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jsSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbTongTien)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnXuatHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnXoaCart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnThemCart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1))
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void timKiem(String timKiem, Object cbBox){
            if(cbBox == "Mã Sản Phẩm"){
                tableModel.setRowCount(0);
                for (ProductDTO sp: ProductBUS.dssp) {
                    if(sp.getMaSP().contains(timKiem)){
                        tableModel.addRow(new Object[]{sp.getMaSP(), 
                        sp.getTenSP(), 
                        sp.getLoaiSP(), 
                        sp.getDonGia(),
                        sp.getSoLuong(),
                        sp.getDonVi()});
                    }
                }
            }else if(cbBox == "Tên Sản Phẩm"){
                tableModel.setRowCount(0);
                for (ProductDTO sp: ProductBUS.dssp) {
                    if(sp.getTenSP().contains(timKiem)){
                        tableModel.addRow(new Object[]{sp.getMaSP(), 
                        sp.getTenSP(), 
                        sp.getLoaiSP(), 
                        sp.getDonGia(),
                        sp.getSoLuong(),
                        sp.getDonVi()});
                    }
                }
            }else if(cbBox == "Loại"){
                tableModel.setRowCount(0);
                for (ProductDTO sp: ProductBUS.dssp) {
                    if(sp.getLoaiSP().contains(timKiem)){
                        tableModel.addRow(new Object[]{sp.getMaSP(), 
                        sp.getTenSP(), 
                        sp.getLoaiSP(), 
                        sp.getDonGia(),
                        sp.getSoLuong(),
                        sp.getDonVi()});
                    }
                }
            }else if(cbBox == "Đơn Giá"){
                tableModel.setRowCount(0);
                for (ProductDTO sp: ProductBUS.dssp) {
                    String DG = String.valueOf(sp.getDonGia());
                    if(DG.contains(timKiem)){
                        tableModel.addRow(new Object[]{sp.getMaSP(), 
                        sp.getTenSP(), 
                        sp.getLoaiSP(), 
                        sp.getDonGia(),
                        sp.getSoLuong(),
                        sp.getDonVi()});
                    }
                }
            }else if(cbBox == "Số Lượng"){
                tableModel.setRowCount(0);
                for (ProductDTO sp: ProductBUS.dssp) {
                    String SL = String.valueOf(sp.getSoLuong());
                    if(SL.contains(timKiem)){
                        tableModel.addRow(new Object[]{sp.getMaSP(), 
                        sp.getTenSP(), 
                        sp.getLoaiSP(), 
                        sp.getDonGia(),
                        sp.getSoLuong(),
                        sp.getDonVi()});
                    }
                }
            }else{
                tableModel.setRowCount(0);
                for (ProductDTO sp: ProductBUS.dssp) {
                    if(sp.getDonVi().contains(timKiem)){
                        tableModel.addRow(new Object[]{sp.getMaSP(), 
                        sp.getTenSP(), 
                        sp.getLoaiSP(), 
                        sp.getDonGia(),
                        sp.getSoLuong(),
                        sp.getDonVi()});
                    }
                }
            }
    }
    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String timKiem = txtTimKiem.getText();
        Object cbBox = cbTimKiem.getSelectedItem();
        timKiem(timKiem, cbBox);
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnXuatHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatHoaDonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXuatHoaDonMouseClicked
    private int maxMaHD(){
        BillBUS bus = new BillBUS();
        bus.docHD();
        int maxMaHD = -1;
        for (BillDTO bill : BillBUS.dshd) {
            if(bill.getMaHD()>maxMaHD){
                maxMaHD = bill.getMaHD();
            }
        }
        return maxMaHD;
    }
    /*
    private void resetCard(){
        MiniStoreBUS bus = new MiniStoreBUS();
        tableModel1.setRowCount(0);
        bus.docCart();
        for (CartDTO cart : MiniStoreBUS.dsspCart) {
            tableModel1.addRow(new Object[]{
                cart.getMaSP(), 
                cart.getTenSP(),
                cart.getSoLuong(),
                cart.getDonGia(),
                cart.getThanhTien(),});
        }  
    }
*/
    private void btnXuatHoaDonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatHoaDonMousePressed
        CartBUS busCart = new CartBUS();
        
        DetailBillDTO detailBill = new DetailBillDTO();
        DetailBillBUS busDetailBill = new DetailBillBUS();
        BillDTO bill = new BillDTO();
        BillBUS busBill = new BillBUS();
        AccountDTO ac = AccountDAO.getInstance().selectById(userName);
 
        if(tableModel1.getRowCount()==0){
            JOptionPane.showMessageDialog(this, "Giỏ hàng chưa có sản phẩm!!!"); 
        }else{
            //thêm vào Hóa đơn
            //bill.maHD   auto
            bill.maKH = "null";
            long millis=System.currentTimeMillis();  
            java.sql.Date date=new java.sql.Date(millis);  
            bill.ngayTao = date;
            bill.nguoiTao = ac.getFullName();
            bill.tongTien = tongTienTrongGio();
            busBill.insertHD(bill);
            for(int i = 0; i < tableModel1.getRowCount(); i++){      
                //lấy data từ Giỏ hàng
                String maSP = tableModel1.getValueAt(i, 0).toString();
                String tenSP = tableModel1.getValueAt(i, 1).toString(); // không thêm vào CTHD
                int soLuong = Integer.parseInt(tableModel1.getValueAt(i, 2).toString());
                int donGia = Integer.parseInt(tableModel1.getValueAt(i, 3).toString());
                int thanhTien = Integer.parseInt(tableModel1.getValueAt(i, 4).toString());  

                detailBill.maHD = maxMaHD();
                detailBill.maSP = maSP;
                detailBill.soLuong  = soLuong;
                detailBill.donGia = donGia;
                detailBill.thanhTien = thanhTien;   
                busDetailBill.insertCTHD(detailBill);
            }

            checkKhachHang checkKH = new checkKhachHang(maxMaHD());
            checkKH.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            checkKH.setLocationRelativeTo(null);
            checkKH.setVisible(true); 

            tableModel1.setRowCount(0);
            busCart.deleteCart();
            lbTongTien.setText(0 + " VND");
        }
    }//GEN-LAST:event_btnXuatHoaDonMousePressed

    private int kiemTraCart(String maSP){
        int n = -1;
        for (CartDTO cart : CartBUS.dsspCart) {
            n=n+1;
            if(maSP.equals(cart.getMaSP())){
                return n;
            }
        }   
        return -1;
    }
    private int kiemTraProduct(String maSP){
        int n = -1;
        for (ProductDTO sp : ProductBUS.dssp) {
            n=n+1;
            if(maSP.equals(sp.getMaSP())){
                return n;
            }
        }   
        return -1;
    }
    
    private int tongTienTrongGio(){
        CartBUS bus = new CartBUS();
        bus.docCart();
        int sum = 0;  
        for (CartDTO cart : CartBUS.dsspCart) {
            sum += cart.getThanhTien();
        }       
        return sum;
    }
    //int tongTien =  tongTienTrongGio();  Lỗi 
    private void btnThemCartMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemCartMousePressed
        CartDTO cart = new CartDTO();
        ProductDTO sp = new ProductDTO(); 
        ProductBUS busSP = new ProductBUS();
        CartBUS busCart = new CartBUS();
        
        
        int tongTien = tongTienTrongGio();
        int n = tbProduct.getSelectedRow();   
        int sl = (int)jsSoLuong.getValue();
          
        if (n == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm!!!");
        }else{
            if(sl<1){
                JOptionPane.showMessageDialog(this, "Kiểm tra số lượng!!!"); 
            }else if(Integer.parseInt(tbProduct.getModel().getValueAt(n, 4).toString()) < sl){
                JOptionPane.showMessageDialog(this, "Nhập quá số lượng!!!");
            }else{
                cart.maSP = tbProduct.getModel().getValueAt(n, 0).toString();
                if(kiemTraCart(cart.maSP)!=-1){//nếu sản phẩm đã có trong Giỏ
                    //cập nhập SL cho GIỎ HÀNG (CART)
                    cart.tenSP = tbProduct.getModel().getValueAt(n, 1).toString();
                    cart.soLuong = Integer.parseInt(tbCart.getModel().getValueAt(kiemTraCart(cart.maSP), 2).toString()) + sl;
                    cart.donGia = Integer.parseInt(tbProduct.getModel().getValueAt(n, 3).toString());
                    cart.thanhTien = cart.soLuong * cart.donGia;
                    busCart.updateCart(cart);
                    tongTien = tongTienTrongGio();
                }else{
                    cart.tenSP = tbProduct.getModel().getValueAt(n, 1).toString();
                    cart.soLuong = sl;
                    cart.donGia = Integer.parseInt(tbProduct.getModel().getValueAt(n, 3).toString());
                    cart.thanhTien = cart.soLuong * cart.donGia; 
                    busCart.insertCart(cart);
                    tongTien = tongTienTrongGio();
                }         
                
                //cập nhật lại giá trị cho tbSP         
                sp.soLuong = Integer.parseInt(tbProduct.getModel().getValueAt(n, 4).toString()) - sl; 
                sp.maSP = cart.getMaSP();
                sp.tenSP = tbProduct.getModel().getValueAt(n, 1).toString();
                sp.donGia = Integer.parseInt(tbProduct.getModel().getValueAt(n, 3).toString());
                sp.donVi = tbProduct.getModel().getValueAt(n, 5).toString();
                sp.loaiSP = tbProduct.getModel().getValueAt(n, 2).toString();
                if(sp.soLuong==0){
                    busSP.deleteSP(sp.getMaSP(), n);
                    tongTien = tongTienTrongGio();
                }else{
                    busSP.updateSP(sp); 
                    tongTien = tongTienTrongGio();
                } 
                
                //tongTien = tongTien + cart.getThanhTien();
                lbTongTien.setText(String.valueOf(tongTien) + " VND");
                showAll();
                n = -1; 
            }
        }
    }//GEN-LAST:event_btnThemCartMousePressed

    private void btnXoaCartMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaCartMousePressed
        CartDTO cart = new CartDTO();
        CartBUS busCart = new CartBUS();
        ProductDTO sp = new ProductDTO();
        ProductBUS busSP = new ProductBUS();
        
        int tongTien = tongTienTrongGio();
        int n = tbCart.getSelectedRow();

        if (n == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm!!!");
        }else{
            cart.maSP = tbCart.getModel().getValueAt(n, 0).toString();
            cart.tenSP = tbProduct.getModel().getValueAt(n, 1).toString();
            cart.soLuong = Integer.parseInt(tbCart.getModel().getValueAt(n, 2).toString()) -1 ;
            cart.donGia = Integer.parseInt(tbProduct.getModel().getValueAt(n, 3).toString());
            cart.thanhTien = cart.soLuong * cart.donGia;
            if(cart.soLuong==0){
                busCart.deleteCartByMaSP(cart.getMaSP(),n);
                tongTien = tongTienTrongGio();
            }else{
                busCart.updateCart(cart);
                tongTien = tongTienTrongGio(); 
            }

            sp.maSP = cart.getMaSP();
            if(kiemTraProduct(sp.maSP)!=-1){
                sp.tenSP = tbProduct.getModel().getValueAt(n, 1).toString();
                sp.loaiSP = tbProduct.getModel().getValueAt(n, 2).toString();
                sp.donGia = Integer.parseInt(tbProduct.getModel().getValueAt(n, 3).toString());
                sp.soLuong = Integer.parseInt(tbProduct.getModel().getValueAt(n, 4).toString())+1;
                sp.donVi = tbProduct.getModel().getValueAt(n, 5).toString();
                busSP.updateSP(sp);
                tongTien = tongTienTrongGio();
            }else{
                sp.tenSP = tbProduct.getModel().getValueAt(n, 1).toString();
                sp.loaiSP = tbProduct.getModel().getValueAt(n, 2).toString();
                sp.donGia = Integer.parseInt(tbProduct.getModel().getValueAt(n, 3).toString());
                sp.soLuong =1;
                sp.donVi = tbProduct.getModel().getValueAt(n, 5).toString();
                busSP.insertSP(sp);
                tongTien = tongTienTrongGio();
            }

            lbTongTien.setText(String.valueOf(tongTien) + " VND");
            showAll();
            n = -1;

        }
    }//GEN-LAST:event_btnXoaCartMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnThemCart;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JPanel btnXoaCart;
    private javax.swing.JPanel btnXuatHoaDon;
    private javax.swing.JComboBox<String> cbTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jsSoLuong;
    private javax.swing.JLabel lbTongTien;
    private javax.swing.JTable tbCart;
    private javax.swing.JTable tbProduct;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

}
