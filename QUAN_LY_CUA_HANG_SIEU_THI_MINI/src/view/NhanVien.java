package view;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.NhanVienDTO;
import BUS.NhanVienBUS;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
/*
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

*/
public class NhanVien extends javax.swing.JPanel {
    DefaultTableModel tableModel;
    Vector ds=new Vector();
    Vector dataDS = new Vector();
    
    public NhanVien() {
        initComponents();
        showAll();
    }
    public String gioitinh(){
        String gioitinh = null;
        if(rbtnnam.isSelected())
            gioitinh= "Nam";
        else if(rbtnnu.isSelected())
            gioitinh= "Nữ";
       return gioitinh;
    }
    /**
     * Creates new form NhanVien
     */
   private boolean checkMaNV(String ID){
        NhanVienBUS bus = new NhanVienBUS();        
        for (NhanVienDTO nv : NhanVienBUS.dsnv) {
            if(ID.equals(nv.getMaNV())){
                return false;
            }
        } 
        return true;
    }
    private void showThongTin() { 
        NhanVienBUS bus = new NhanVienBUS();
        tableModel.setRowCount(0);
        bus.docnv();
        
        for (NhanVienDTO sp : NhanVienBUS.dsnv) {
            tableModel.addRow(new Object[]{
                sp.getMaNV(),
                sp.getHo(),
                sp.getTen(),
                sp.getGioiTinh(),
                sp.getSDT(), 
                sp.getDiaChi()});
        }   
    }
    public void showAll() {
        tableModel = (DefaultTableModel) tbThongTin.getModel();
        showThongTin();
    }
    public void timkiem(String timkiem, Object cbLoc){
        if(cbLoc=="Mã Nhân Viên"){
            tableModel.setRowCount(0);
            for(NhanVienDTO nv: NhanVienBUS.dsnv){
                if(nv.getMaNV().contains(timkiem)){
//                    NhanVienBUS.selectbyid(nv,timkiem);
                    tableModel.addRow(new Object[]{nv.getMaNV(), 
                        nv.getHo(),
                        nv.getTen(),
                        nv.getGioiTinh(),
                        nv.getSDT(), 
                        nv.getDiaChi()});
                }
            }
        }
         if(cbLoc=="Họ"){
             tableModel.setRowCount(0);
            for(NhanVienDTO nv: NhanVienBUS.dsnv){
                if(nv.getHo().contains(timkiem)){
                    tableModel.addRow(new Object[]{nv.getMaNV(), 
                         
                        nv.getHo(),
                        nv.getTen(),
                        nv.getGioiTinh(),
                        nv.getSDT(), 
                        nv.getDiaChi()});
                }
            }
        }
         if(cbLoc=="Tên"){
             tableModel.setRowCount(0);
            for(NhanVienDTO nv: NhanVienBUS.dsnv){
                if(nv.getTen().contains(timkiem)){
                    tableModel.addRow(new Object[]{nv.getMaNV(), 
                        nv.getHo(),
                        nv.getTen(),
                        nv.getGioiTinh(),
                        nv.getSDT(), 
                        nv.getDiaChi()});
                }
            }
        }
         if(cbLoc=="Địa Chỉ"){
             tableModel.setRowCount(0);
            for(NhanVienDTO nv: NhanVienBUS.dsnv){
                if(nv.getDiaChi().contains(timkiem)){
                    tableModel.addRow(new Object[]{nv.getMaNV(), 
                        nv.getHo(),
                        nv.getTen(),
                        nv.getGioiTinh(),
                        nv.getSDT(), 
                        nv.getDiaChi()});
                }
            }
        }
         if(cbLoc=="Số Điện Thoại"){
             tableModel.setRowCount(0);
            for(NhanVienDTO nv: NhanVienBUS.dsnv){
                if(nv.getSDT().contains(timkiem)){
                    tableModel.addRow(new Object[]{nv.getMaNV(), 
                        nv.getHo(),
                        nv.getTen(),
                        nv.getGioiTinh(),
                        nv.getSDT(), 
                        nv.getDiaChi()});
                }
            }
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbThongTin = new javax.swing.JTable();
        cbLoc = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnLoc = new javax.swing.JButton();
        txtLoc = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rbtnnam = new javax.swing.JRadioButton();
        rbtnnu = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbThongTin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MaNV", "Họ", "Tên", "Giới Tính", "SDT", "Địa Chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbThongTin.setSelectionBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        tbThongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbThongTinMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbThongTin);
        if (tbThongTin.getColumnModel().getColumnCount() > 0) {
            tbThongTin.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbThongTin.getColumnModel().getColumn(1).setMinWidth(15);
            tbThongTin.getColumnModel().getColumn(1).setPreferredWidth(20);
            tbThongTin.getColumnModel().getColumn(2).setPreferredWidth(30);
            tbThongTin.getColumnModel().getColumn(3).setPreferredWidth(30);
            tbThongTin.getColumnModel().getColumn(4).setPreferredWidth(45);
        }

        cbLoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã Nhân Viên", "Tên", "Họ", "Địa Chỉ", "Số Điện Thoại" }));

        jLabel1.setText("Tìm Kiếm");

        btnLoc.setText("Lọc");
        btnLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtLoc)
                        .addGap(119, 119, 119)
                        .addComponent(btnLoc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        jLabel2.setText("Thông Tin");
        jLabel2.setMaximumSize(new java.awt.Dimension(55, 16));

        jLabel3.setText("Mã Nhân Viên");

        txtMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNVActionPerformed(evt);
            }
        });

        jLabel4.setText("Họ");

        txtHo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoActionPerformed(evt);
            }
        });

        jLabel5.setText("Tên");

        jLabel6.setText("Giới Tính");

        buttonGroup1.add(rbtnnam);
        rbtnnam.setText("Nam");
        rbtnnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnnamActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnnu);
        rbtnnu.setText("Nữ");

        jLabel7.setText("SDT");

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        jLabel8.setText("Địa Chỉ");

        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(rbtnnam)
                                .addGap(48, 48, 48)
                                .addComponent(rbtnnu))
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaNV)
                            .addComponent(txtHo)
                            .addComponent(txtTen)
                            .addComponent(txtSDT)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnsua)
                        .addGap(18, 18, 18)
                        .addComponent(btnthem)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnnam)
                    .addComponent(rbtnnu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNVActionPerformed

    private void txtHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoActionPerformed

    private void rbtnnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnnamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnnamActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        TableModel model = tbThongTin.getModel();
        int n = tbThongTin.getSelectedRow();  //khi người dùng bấm bất kì dòng nào trên table
        if (n == -1) {
            JOptionPane.showMessageDialog(this, "Chọn dòng để xóa");
        }
            NhanVienDTO newnv = new NhanVienDTO(txtMaNV.getText(),txtHo.getText(),txtTen.getText(),gioitinh(),txtSDT.getText(),txtDiaChi.getText());
            NhanVienBUS bus = new NhanVienBUS(); 
            bus.updatenv(newnv,newnv.getMaNV());
            model.setValueAt(newnv.getMaNV(), n, 0); // Column 1
            model.setValueAt(newnv.getHo(), n, 1);
            model.setValueAt(newnv.getTen(), n, 2); // Column 2
            model.setValueAt(newnv.getGioiTinh(), n, 3);
            model.setValueAt(newnv.getSDT(), n, 4);
            model.setValueAt(newnv.getDiaChi(), n, 5); // Column 3
            tbThongTin.repaint();
            showAll();
            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            txtMaNV.setText("");
            txtHo.setText("");
            txtTen.setText("");
            txtDiaChi.setText("");
            txtSDT.setText("");  
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocActionPerformed
        // TODO add your handling code here:
        String timkiem=txtLoc.getText();
        Object cbBox = cbLoc.getSelectedItem();
        timkiem(timkiem, cbBox);
        
    }//GEN-LAST:event_btnLocActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        NhanVienDTO nv = new NhanVienDTO();
        NhanVienBUS bus=new NhanVienBUS();
        nv.MaNV = txtMaNV.getText();
        nv.Ho = txtHo.getText();
        nv.Ten = txtTen.getText();
        nv.GioiTinh=gioitinh();
        nv.DiaChi = txtDiaChi.getText();
        nv.SDT =txtSDT.getText();
       
        if (checkMaNV(nv.MaNV) == false){
            JOptionPane.showMessageDialog(this, "Trùng");
        }else{
            Vector row  = new Vector();
            row.add(nv.MaNV);
            row.add(nv.Ho);
            row.add(nv.Ten);
            row.add(nv.GioiTinh);
            row.add(nv.SDT);
            row.add(nv.DiaChi);
            tableModel.addRow(row);
                tbThongTin.setModel(tableModel);
                bus.insertnv(nv);
                JOptionPane.showMessageDialog(this, "Thêm thành công!!!");
//                Reset(); 
            txtMaNV.setText("");
            txtHo.setText("");
            txtTen.setText("");
            rbtnnam.setSelected(false);
            rbtnnu.setSelected(false);
            txtDiaChi.setText("");
            txtSDT.setText(""); 
        }
        
    }//GEN-LAST:event_btnthemActionPerformed

    private void tbThongTinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbThongTinMouseClicked
        // TODO add your handling code here:
        List<NhanVienDTO> NhanVienList = NhanVienBUS.dsnv;
        int n = tbThongTin.getSelectedRow();  //khi người dùng bấm bất kì dòng nào trên table    
            NhanVienDTO nv = NhanVienList.get(n); 
            txtMaNV.setText(nv.getMaNV());
            txtHo.setText(nv.getHo());
            txtTen.setText(nv.getTen());
            if("Nam".equals(nv.getGioiTinh())){
                rbtnnam.setSelected(true);
            }
            else if("Nữ".equals(nv.getGioiTinh())){
                rbtnnu.setSelected(true);
            }
            txtDiaChi.setText(nv.getDiaChi());
            txtSDT.setText(nv.getSDT());     
    }//GEN-LAST:event_tbThongTinMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
         List<NhanVienDTO> NhanVienList = NhanVienBUS.dsnv;
        int n = tbThongTin.getSelectedRow();  //khi người dùng bấm bất kì dòng nào trên table
        if (n == -1) {
            JOptionPane.showMessageDialog(this, "Chọn dòng để xóa");
        } else {
            NhanVienDTO nv = NhanVienList.get(n);    
            NhanVienBUS bus = new NhanVienBUS();
            bus.deletenv(nv,nv.getMaNV(),n);
            showAll();           
            JOptionPane.showMessageDialog(this, "Xóa thành công");
        }
    }//GEN-LAST:event_btnXoaActionPerformed
    public void openFile(String file){
        try{
            File path=new File(file);
            Desktop.getDesktop().open(path);
            
        } catch (IOException ioe){
            System.out.println(ioe);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoc;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbLoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnnam;
    private javax.swing.JRadioButton rbtnnu;
    private javax.swing.JTable tbThongTin;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHo;
    private javax.swing.JTextField txtLoc;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
