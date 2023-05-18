package view;

import BUS.PromotionBUS;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.PromotionDTO;

public class Promotion extends javax.swing.JPanel {
    DefaultTableModel tableModel;
    int selectindex = -1;

    public Promotion() {
        initComponents();
        showAll();
    }
    public void showAll() {
        tableModel = (DefaultTableModel) tbKM.getModel();
        showThongTin();
    }
    private void showThongTin() { 
        PromotionBUS bus = new PromotionBUS();
        tableModel.setRowCount(0);
        bus.docKM();
        for (PromotionDTO km : PromotionBUS.dskm) {
            tableModel.addRow(new Object[]{
                km.getMaKM(), 
                km.getChuongTrinh(), 
                km.getPhanTram(),
                km.getDieuKien(), 
                km.getNgayBD(),
                km.getNgayKT(),
                km.getTinhTrang()});
        }      
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbKM = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaKM = new javax.swing.JTextField();
        txtChuongTrinh = new javax.swing.JTextField();
        txtPhanTramKM = new javax.swing.JTextField();
        txtDieuKien = new javax.swing.JTextField();
        txtNgayBatDau = new javax.swing.JTextField();
        txtNgayKetThuc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTinhTrang = new javax.swing.JTextField();
        btnThem = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnSua = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbKM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã KM", "Chương Trình", "Phần Trăm KM", "Điều Kiện", "Ngày Bắt Đầu", "Ngày Kết Thúc", "Tìm Trạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbKM.setSelectionBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        tbKM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbKMMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbKM);
        if (tbKM.getColumnModel().getColumnCount() > 0) {
            tbKM.getColumnModel().getColumn(0).setPreferredWidth(20);
            tbKM.getColumnModel().getColumn(2).setPreferredWidth(50);
            tbKM.getColumnModel().getColumn(4).setPreferredWidth(30);
            tbKM.getColumnModel().getColumn(5).setPreferredWidth(30);
        }

        jLabel1.setText("Mã KM");

        jLabel2.setText("Chương Trình");

        jLabel3.setText("Phần Trăm KM");

        jLabel4.setText("Điều Kiện");

        jLabel5.setText("Ngày Bắt Đầu");

        jLabel6.setText("Ngày Kết Thúc");

        txtNgayBatDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayBatDauActionPerformed(evt);
            }
        });

        jLabel7.setText("Tình Trạng");

        btnThem.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThemMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Thêm");

        javax.swing.GroupLayout btnThemLayout = new javax.swing.GroupLayout(btnThem);
        btnThem.setLayout(btnThemLayout);
        btnThemLayout.setHorizontalGroup(
            btnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThemLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel8)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        btnThemLayout.setVerticalGroup(
            btnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        btnXoa.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnXoaMousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Xóa");

        javax.swing.GroupLayout btnXoaLayout = new javax.swing.GroupLayout(btnXoa);
        btnXoa.setLayout(btnXoaLayout);
        btnXoaLayout.setHorizontalGroup(
            btnXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXoaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel9)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        btnXoaLayout.setVerticalGroup(
            btnXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        btnSua.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.inactiveTitleForeground"));
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSuaMousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sửa");

        javax.swing.GroupLayout btnSuaLayout = new javax.swing.GroupLayout(btnSua);
        btnSua.setLayout(btnSuaLayout);
        btnSuaLayout.setHorizontalGroup(
            btnSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSuaLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(36, 36, 36))
        );
        btnSuaLayout.setVerticalGroup(
            btnSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(44, 44, 44)
                                .addComponent(txtDieuKien, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(25, 25, 25)
                                            .addComponent(txtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(24, 24, 24)
                                            .addComponent(txtChuongTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPhanTramKM))))
                        .addGap(145, 145, 145)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNgayBatDau)
                                    .addComponent(txtNgayKetThuc)
                                    .addComponent(txtTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtChuongTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPhanTramKM, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDieuKien, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private boolean checkMaKM(String maKM){
        for (PromotionDTO km: PromotionBUS.dskm) {
            if(maKM.equals(km.getMaKM())){
                return false;
            }
        }
        return true;
    }
    private void Reset(){
        txtMaKM.setText("");
        txtChuongTrinh.setText("");
        txtPhanTramKM.setText("");
        txtDieuKien.setText("");
        txtNgayBatDau.setText("");
        txtNgayKetThuc.setText("");
        txtTinhTrang.setText("");
    }
    private void btnThemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMousePressed
        // TODO add your handling code here:
        PromotionDTO km = new PromotionDTO();
        km.maKM = txtMaKM.getText();
        km.chuongTrinh = txtChuongTrinh.getText();
        km.phanTram = Integer.parseInt(txtPhanTramKM.getText());
        km.dieuKien = txtDieuKien.getText();
        try {
            km.ngayBD = new SimpleDateFormat("yyyy-MM-dd").parse(txtNgayBatDau.getText());
            km.ngayKT = new SimpleDateFormat("yyyy-MM-dd").parse(txtNgayKetThuc.getText());
        } catch (ParseException ex) {
            Logger.getLogger(Promotion.class.getName()).log(Level.SEVERE, null, ex);
        }
        km.tinhTrang = txtTinhTrang.getText();
        
        if (checkMaKM(km.maKM) == false){
            JOptionPane.showMessageDialog(this, "Trùng");
        }else{
            PromotionBUS bus = new PromotionBUS();
            bus.insertKM(km);
 
            Reset();
            showAll();
        }
        

    }//GEN-LAST:event_btnThemMousePressed

    private void btnXoaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMousePressed
        List<PromotionDTO> kmList = PromotionBUS.dskm;
        int n = tbKM.getSelectedRow();  //khi người dùng bấm bất kì dòng nào trên table
        if (n == -1) {
            JOptionPane.showMessageDialog(this, "Chọn dòng để xóa");
        } else {
            PromotionDTO km = kmList.get(n);    
            PromotionBUS bus = new PromotionBUS();
            bus.deleteKM(km.getMaKM(),n);
            showAll();           
            JOptionPane.showMessageDialog(this, "Xóa thành công");
        }  
    }//GEN-LAST:event_btnXoaMousePressed

    private void btnSuaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMousePressed
        PromotionDTO km = new PromotionDTO();  
        int n = tbKM.getSelectedRow();  //khi người dùng bấm bất kì dòng nào trên table
        if (n == -1) {
            JOptionPane.showMessageDialog(this, "Chọn dòng để cập nhật");
        } else {
            km.maKM = txtMaKM.getText();
            km.chuongTrinh = txtChuongTrinh.getText();
            km.phanTram = Integer.parseInt(txtPhanTramKM.getText());
            km.dieuKien = txtDieuKien.getText();
            try {
                km.ngayBD = new SimpleDateFormat("yyyy-MM-dd").parse(txtNgayBatDau.getText());
                km.ngayKT = new SimpleDateFormat("yyyy-MM-dd").parse(txtNgayKetThuc.getText());
            } catch (ParseException ex) {
                Logger.getLogger(Promotion.class.getName()).log(Level.SEVERE, null, ex);
            }
            km.tinhTrang = txtTinhTrang.getText();
            
            PromotionBUS bus = new PromotionBUS();
            bus.updateKM(km, km.getMaKM());
            showAll();
            Reset();
        }
    }//GEN-LAST:event_btnSuaMousePressed

    private void tbKMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKMMouseClicked
        int n = tbKM.getSelectedRow();
        txtMaKM.setText(tbKM.getModel().getValueAt(n, 0).toString());
        txtChuongTrinh.setText(tbKM.getModel().getValueAt(n, 1).toString());
        txtPhanTramKM.setText(tbKM.getModel().getValueAt(n, 2).toString());
        txtDieuKien.setText(tbKM.getModel().getValueAt(n, 3).toString());
        txtNgayBatDau.setText(tbKM.getModel().getValueAt(n, 4).toString());
        txtNgayKetThuc.setText(tbKM.getModel().getValueAt(n, 5).toString());
        txtTinhTrang.setText(tbKM.getModel().getValueAt(n, 6).toString());
    }//GEN-LAST:event_tbKMMouseClicked

    private void txtNgayBatDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayBatDauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayBatDauActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnSua;
    private javax.swing.JPanel btnThem;
    private javax.swing.JPanel btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbKM;
    private javax.swing.JTextField txtChuongTrinh;
    private javax.swing.JTextField txtDieuKien;
    private javax.swing.JTextField txtMaKM;
    private javax.swing.JTextField txtNgayBatDau;
    private javax.swing.JTextField txtNgayKetThuc;
    private javax.swing.JTextField txtPhanTramKM;
    private javax.swing.JTextField txtTinhTrang;
    // End of variables declaration//GEN-END:variables
}
