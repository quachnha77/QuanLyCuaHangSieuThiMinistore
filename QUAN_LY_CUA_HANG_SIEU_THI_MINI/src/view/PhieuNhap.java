package view;

import BUS.DetailReceiptBUS;
import BUS.ReceiptBUS;
import static java.lang.reflect.Array.set;
import java.util.HashSet;
import java.util.Set;
import javax.swing.table.DefaultTableModel;
import model.DetailReceiptDTO;
import model.ProductDTO;
import model.ReceiptDTO;
import static org.apache.poi.xssf.usermodel.helpers.XSSFIgnoredErrorHelper.set;
import static org.apache.xmlbeans.impl.common.SystemCache.set;

public class PhieuNhap extends javax.swing.JPanel {
    DefaultTableModel tableModelPhieuNhap;
    DefaultTableModel tableModelChiTietPhieuNhap;
    public PhieuNhap() {
        initComponents();
        showAll();
    }
    public void showAll() {
        tableModelChiTietPhieuNhap = (DefaultTableModel) tbChiTietPhieuNhap.getModel();
        showChiTietPhieuNhap();
        
        tableModelPhieuNhap = (DefaultTableModel) tbPhieuNhap.getModel();
        showPhieuNhap();
    }
    /*
    private void showPhieuNhap() { 
        MiniStoreBUS bus = new MiniStoreBUS();
        tableModelPhieuNhap.setRowCount(0);
        bus.docPN();
        
        for (ReceiptDTO sp : MiniStoreBUS.dspn) {
            tableModelPhieuNhap.addRow(new Object[]{
                sp.getMaPN(), 
                sp.getNgayTao(), 
                sp.getNguoiTao(), 
                sp.getTongTien()});
        }   
    }*/
    Set set = new HashSet<>();
    private void showPhieuNhap() { 
        ReceiptBUS bus = new ReceiptBUS();
        tableModelPhieuNhap.setRowCount(0);
        bus.docPN();
        for (ReceiptDTO sp : ReceiptBUS.dspn) {
            sp.getMaPN();
                if (!set.contains(sp.maPN)) {
                set.add(sp.maPN);
            tableModelPhieuNhap.addRow(new Object[]{
                sp.getMaPN(), 
                sp.getNgayTao(), 
                sp.getNguoiTao(),
                sp.getTongTien()});
            }   
        }
    }

    private void showChiTietPhieuNhap() { 
        DetailReceiptBUS bus = new DetailReceiptBUS();
        tableModelChiTietPhieuNhap.setRowCount(0);
        bus.docCTPN();
        
        for (DetailReceiptDTO ctpn : DetailReceiptBUS.dsctpn) {
            tableModelChiTietPhieuNhap.addRow(new Object[]{
                ctpn.getMaPN(), 
                ctpn.getMaNCC(), 
                ctpn.getMaSP(), 
                ctpn.getTenSP(),
                ctpn.getLoaiSP(),
                ctpn.getDonGia(),
                ctpn.getSoLuong(),
                ctpn.getDonVi()
            });
        }   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPhieuNhap = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbChiTietPhieuNhap = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        jLabel13.setText("Phiếu nhập");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        jLabel14.setText("Chi tiết phiếu nhập");

        tbPhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã PN", "Ngày Tạo", "Người Tạo", "Tổng Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPhieuNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbPhieuNhap.setInheritsPopupMenu(true);
        tbPhieuNhap.setName(""); // NOI18N
        tbPhieuNhap.setSelectionBackground(javax.swing.UIManager.getDefaults().getColor("Objects.RedStatus"));
        tbPhieuNhap.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbPhieuNhap.setShowGrid(false);
        tbPhieuNhap.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tbPhieuNhapComponentAdded(evt);
            }
        });
        tbPhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPhieuNhapMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbPhieuNhap);

        tbChiTietPhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã PN", "Mã NCC", "Mã Sản Phẩm", "Tên Sản Phẩm", "Loại", "Đơn Giá", "Số Lượng", "Đơn Vị"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbChiTietPhieuNhap.setSelectionBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        tbChiTietPhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbChiTietPhieuNhapMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbChiTietPhieuNhap);
        if (tbChiTietPhieuNhap.getColumnModel().getColumnCount() > 0) {
            tbChiTietPhieuNhap.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbChiTietPhieuNhap.getColumnModel().getColumn(6).setPreferredWidth(50);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(jLabel14)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void showChiTietPN(String maPN){
        DetailReceiptBUS bus = new DetailReceiptBUS();
        tableModelChiTietPhieuNhap.setRowCount(0);
        bus.docCTPN();
        
        for (DetailReceiptDTO ctpn : DetailReceiptBUS.dsctpn) {
            if(maPN.equals(ctpn.getMaPN())){
                tableModelChiTietPhieuNhap.addRow(new Object[]{
                    ctpn.getMaPN(), 
                    ctpn.getMaNCC(), 
                    ctpn.getMaSP(), 
                    ctpn.getMaNCC(),
                    ctpn.getTenSP(),
                    ctpn.getLoaiSP(),
                    ctpn.getDonGia(),
                    ctpn.getSoLuong(),
                    ctpn.getDonVi()
                });
            }
        }   
    }
    private void tbChiTietPhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbChiTietPhieuNhapMouseClicked
        
    }//GEN-LAST:event_tbChiTietPhieuNhapMouseClicked

    private void tbPhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPhieuNhapMouseClicked
        int n = tbPhieuNhap.getSelectedRow();
        String maPN = tbPhieuNhap.getModel().getValueAt(n, 0).toString();
        showChiTietPN(maPN);
    }//GEN-LAST:event_tbPhieuNhapMouseClicked

    private void tbPhieuNhapComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tbPhieuNhapComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tbPhieuNhapComponentAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbChiTietPhieuNhap;
    private javax.swing.JTable tbPhieuNhap;
    // End of variables declaration//GEN-END:variables
}
