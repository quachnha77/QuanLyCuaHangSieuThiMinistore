package view;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import model.NhaCungCapDTO;
import BUS.NhaCungCapBUS;

public class Supplier extends javax.swing.JPanel {
    DefaultTableModel tableModel;
    Vector ds=new Vector();
    Vector dataDS = new Vector();
    public Supplier() {
        initComponents();
        showAll();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbNNN = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jcbChon = new javax.swing.JComboBox<>();
        txtTimKiem = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnChiTiet = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbNNN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Nhà Cung Cấp", "Tên Nhà Cung Cấp", "Địa Chỉ", "Số Điện Thoại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbNNN.setSelectionBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        tbNNN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNNNMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbNNN);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 850, 410));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel1.setText("Tìm Kiếm");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jcbChon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jcbChon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã Nhà Cung Cấp", "Tên Nhà Cung Cấp", "Địa Chỉ", "Số Điện Thoại" }));
        jcbChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbChonActionPerformed(evt);
            }
        });
        add(jcbChon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 150, -1));

        txtTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });
        add(txtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 210, -1));

        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 81, -1));

        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 81, -1));

        btnSua.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 81, -1));

        btnChiTiet.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnChiTiet.setText("Tìm Kiếm");
        btnChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiTietActionPerformed(evt);
            }
        });
        add(btnChiTiet, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 90, -1));

        jLabel2.setText("Tên");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenActionPerformed(evt);
            }
        });
        add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 222, 26));

        jLabel3.setText("Địa Chỉ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));
        add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 222, 26));

        jLabel4.setText("SĐT");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, -1, -1));

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });
        add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 222, 26));

        jLabel5.setText("ID");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));
        add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 222, 26));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        jLabel6.setText("Danh Sách");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void mouseClicked1(MouseEvent e) {
        btnChiTiet.setText("Cập Nhật");
}
    public void mouseClicked2(MouseEvent e) {
        
        btnChiTiet.setText("Tìm Kiếm");
}
    private boolean checkID(String ID){
        NhaCungCapBUS bus = new NhaCungCapBUS();        
        for (NhaCungCapDTO ncc : NhaCungCapBUS.dsncc) {
            if(ID.equals(ncc.getID())){
                return false;
            }
        } 
        return true;
    }
    private void showThongTin() { 
        NhaCungCapBUS bus = new NhaCungCapBUS();
        tableModel.setRowCount(0);
        bus.docNCC();
        
        for (NhaCungCapDTO sp : NhaCungCapBUS.dsncc) {
            tableModel.addRow(new Object[]{
                sp.getID(), 
                sp.getTen(), 
                sp.getDiaChi(), 
                sp.getSDT()});
        }   
    }
    public void showAll() {
        tableModel = (DefaultTableModel) tbNNN.getModel();
        showThongTin();
    }
    
    public void timkiem(String timkiem, Object jcbChon){
        if(jcbChon=="Mã Nhà Cung Cấp"){
            tableModel.setRowCount(0);
            for(NhaCungCapDTO ncc: NhaCungCapBUS.dsncc){
                if(ncc.getID().contains(timkiem)){
//                    NhacungcapBUS.selectbyid(ncc,timkiem);
                    tableModel.addRow(new Object[]{ncc.getID(), 
                        
                        ncc.getTen(), 
                        ncc.getDiaChi(), 
                        ncc.getSDT()});
                }
            }
        }
         if(jcbChon=="Tên Nhà Cung Cấp"){
             tableModel.setRowCount(0);
            for(NhaCungCapDTO ncc: NhaCungCapBUS.dsncc){
                if(ncc.getTen().contains(timkiem)){
                    tableModel.addRow(new Object[]{ncc.getID(), 
                         
                        ncc.getTen(), 
                        ncc.getDiaChi(), 
                        ncc.getSDT()});
                }
            }
        }
         if(jcbChon=="Địa Chỉ Nhà Cung Cấp"){
             tableModel.setRowCount(0);
            for(NhaCungCapDTO ncc: NhaCungCapBUS.dsncc){
                if(ncc.getDiaChi().contains(timkiem)){
                    tableModel.addRow(new Object[]{ncc.getID(), 
                        ncc.getTen(), 
                        ncc.getDiaChi(),
                        ncc.getSDT()});
                }
            }
        }
         if(jcbChon=="Số Điện Thoại Nhà Cung Cấp"){
             tableModel.setRowCount(0);
            for(NhaCungCapDTO ncc: NhaCungCapBUS.dsncc){
                if(ncc.getSDT().contains(timkiem)){
                    tableModel.addRow(new Object[]{ncc.getID(), 
                        ncc.getTen(), 
                      
                        ncc.getDiaChi(),
                        ncc.getSDT()});
                }
            }
        }
    }
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        TableModel model = tbNNN.getModel();
        int n = tbNNN.getSelectedRow();  //khi người dùng bấm bất kì dòng nào trên table
        if (n == -1) {
            JOptionPane.showMessageDialog(this, "Chọn dòng để xóa");
        }
            NhaCungCapDTO newncc = new NhaCungCapDTO(txtID.getText(),txtTen.getText(),txtDiaChi.getText(),txtSDT.getText());
            NhaCungCapBUS bus = new NhaCungCapBUS(); 
            bus.updateNCC(newncc,newncc.getID());
            model.setValueAt(newncc.getID(), n, 0); // Column 1
            model.setValueAt(newncc.getTen(), n, 1); // Column 2
            model.setValueAt(newncc.getDiaChi(), n, 2); // Column 3
            model.setValueAt(newncc.getSDT(), n, 3); // Column 3
            tbNNN.repaint();
            showAll();
            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            txtID.setText("");
            txtTen.setText("");
            txtDiaChi.setText("");
            txtSDT.setText("");       
            
    }//GEN-LAST:event_btnSuaActionPerformed
    
    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
           
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        NhaCungCapDTO ncc = new NhaCungCapDTO();
        NhaCungCapBUS bus=new NhaCungCapBUS();
        ncc.ID = txtID.getText();
        ncc.Ten = txtTen.getText();
        ncc.DiaChi = txtDiaChi.getText();
        ncc.SDT =txtSDT.getText();
       
        if (checkID(ncc.ID) == false){
            JOptionPane.showMessageDialog(this, "Trùng");
        }else{
            Vector row  = new Vector();
            row.add(ncc.ID);
            row.add(ncc.Ten);
            row.add(ncc.DiaChi);
            row.add(ncc.SDT);
            tableModel.addRow(row);
                tbNNN.setModel(tableModel);
                bus.insertNCC(ncc);
                JOptionPane.showMessageDialog(this, "Thêm thành công!!!");
//                Reset(); 
            
        }
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void jcbChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbChonActionPerformed
    
      
    }//GEN-LAST:event_jcbChonActionPerformed

    private void txtTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void btnChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTietActionPerformed
        // TODO add your handling code here:
         String tk = txtTimKiem.getText();
        Object cbBox = jcbChon.getSelectedItem();
        timkiem(tk, cbBox);
        
    }//GEN-LAST:event_btnChiTietActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        List<NhaCungCapDTO> nhacungcapList = NhaCungCapBUS.dsncc;
        int n = tbNNN.getSelectedRow();  //khi người dùng bấm bất kì dòng nào trên table
        if (n == -1) {
            JOptionPane.showMessageDialog(this, "Chọn dòng để xóa");
        } else {
            NhaCungCapDTO ncc = nhacungcapList.get(n);    
            NhaCungCapBUS bus = new NhaCungCapBUS();
            bus.deleteNCC(ncc.getID(),n);
            showAll();           
            JOptionPane.showMessageDialog(this, "Xóa thành công");
        }

    }//GEN-LAST:event_btnXoaActionPerformed
    
    private void tbNNNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNNNMouseClicked
        // TODO add your handling code here:
        List<NhaCungCapDTO> nhacungcapList = NhaCungCapBUS.dsncc;
        int n = tbNNN.getSelectedRow();  //khi người dùng bấm bất kì dòng nào trên table    
            NhaCungCapDTO ncc = nhacungcapList.get(n); 
            txtID.setText(ncc.getID());
            txtTen.setText(ncc.getTen());
            txtDiaChi.setText(ncc.getDiaChi());
            txtSDT.setText(ncc.getSDT());     
    }//GEN-LAST:event_tbNNNMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChiTiet;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbChon;
    private javax.swing.JTable tbNNN;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}

