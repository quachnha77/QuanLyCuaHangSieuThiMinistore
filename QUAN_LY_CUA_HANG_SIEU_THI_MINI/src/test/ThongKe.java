package test;

import view.*;
import BUS.BillBUS;
import BUS.DetailBillBUS;
import com.raven.chart.ModelChart;
import java.awt.Color;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BillDTO;
import model.DetailBillDTO;
import model.ReceiptDTO;
import model.topBanChayDTO;
import BUS.NhaCungCapBUS;
import BUS.ProductBUS;
import BUS.ReceiptBUS;
import java.awt.ComponentOrientation;
import model.NhaCungCapDTO;
import model.ProductDTO;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/*
import com.toedter.calendar.JDateChooser;
import common.Logger;
import java.lang.System.Logger.Level;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
*/
public class ThongKe extends javax.swing.JPanel {
    DefaultTableModel tableModel;
    DecimalFormat formatter = new DecimalFormat("###,###,###");
    SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/YYYY HH:mm");

    public DecimalFormat getFormatter() {
        return formatter;
    }

    public SimpleDateFormat getFormatDate() {
        return formatDate;
    }
    //tổng tiền của nhập hàng
    private int nhapHangQuy1=0;
    private int nhapHangQuy2=0;
    private int nhapHangQuy3=0;
    private int nhapHangQuy4=0;
    
    //tổng tiền của nhập hàng
    private int hoaDonQuy1=0;
    private int hoaDonQuy2=0;
    private int hoaDonQuy3=0;
    private int hoaDonQuy4=0;
   
    
    //không có năm phù hợp
    private boolean checkNam = false;
    
    public ThongKe() {
        initComponents();
        thongKeNhapHang();
        thongKeBanHang();
        
        chart.addLegend("Nhập hàng", new Color(245, 189, 135));
        chart.addLegend("Doanh thu", new Color(139, 229, 222));
        chart.addData(new ModelChart("Quý 1", new double[]{nhapHangQuy1, hoaDonQuy1}));
        chart.addData(new ModelChart("Quý 2", new double[]{nhapHangQuy2, hoaDonQuy2}));
        chart.addData(new ModelChart("Quý 3", new double[]{nhapHangQuy3, hoaDonQuy3}));
        chart.addData(new ModelChart("Quý 4", new double[]{nhapHangQuy4, hoaDonQuy4}));
    
        showAll();

        txtNCC.setText(tkNhaCungCap()+"");
        txtSP.setText(tkSanPham()+"");
        txtDT.setText(tkDoanhThu()/1000000+"M");
    }
    private void showAll(){
        tableModel = (DefaultTableModel) tbTopBanChay.getModel();
        showTopBanChay();
    }
    private int tkNhaCungCap(){
        NhaCungCapBUS bus = new NhaCungCapBUS();
        bus.docNCC();
        int soLuongNCC=0;
        for (NhaCungCapDTO dsNCC : NhaCungCapBUS.dsncc) {
            soLuongNCC++;
        }   
        return soLuongNCC;
    }
    private int tkSanPham(){
        ProductBUS bus = new ProductBUS();
        bus.docSP();
        int soLuong=0;
        for (ProductDTO dsSP : ProductBUS.dssp) {
            soLuong++;
        }   
        return soLuong;
    }
    private int tkDoanhThu(){
        BillBUS bus = new BillBUS();
        bus.docHD();
        int doanhThu=0;
        for (BillDTO dsHD : BillBUS.dshd) {
            doanhThu += dsHD.getTongTien();
        }   
        return doanhThu;
    }
    
    private void thongKeNhapHang(){
        ReceiptBUS bus = new ReceiptBUS();
        bus.docPN();
        Date date = new Date();
        SimpleDateFormat simpleDateFormatNam = new SimpleDateFormat();//năm
        simpleDateFormatNam.applyPattern("yyyy");
        SimpleDateFormat simpleDateFormatThang = new SimpleDateFormat();//tháng
        simpleDateFormatThang.applyPattern("MM");
        for (ReceiptDTO phieuNhap : ReceiptBUS.dspn) {
            int nam =  Integer.parseInt(simpleDateFormatNam.format(phieuNhap.getNgayTao()));
            int thang = Integer.parseInt(simpleDateFormatThang.format(phieuNhap.getNgayTao()));
            if(Integer.parseInt(cbNam.getSelectedItem().toString()) ==nam){
                if(thang>=1 && thang <=3){
                    nhapHangQuy1 += phieuNhap.getTongTien();
                }else if(thang>=4 && thang <=6){
                    nhapHangQuy2 += phieuNhap.getTongTien();
                }else if(thang>=7 && thang <=9){
                    nhapHangQuy3 += phieuNhap.getTongTien();
                }else{
                    nhapHangQuy4 += phieuNhap.getTongTien();
                }
            }else{
                checkNam = true;
                break;
            }
        }   
    }

    private void thongKeBanHang(){
        BillBUS bus = new BillBUS();
        bus.docHD();
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();//năm
        simpleDateFormat.applyPattern("yyyy");
        SimpleDateFormat simpleDateFormatThang = new SimpleDateFormat();//tháng
        simpleDateFormatThang.applyPattern("MM");
        for (BillDTO hoaDon : BillBUS.dshd) {
            int nam =  Integer.parseInt(simpleDateFormat.format(hoaDon.getNgayTao()));
            int thang = Integer.parseInt(simpleDateFormatThang.format(hoaDon.getNgayTao()));
            if(Integer.parseInt(cbNam.getSelectedItem().toString()) == nam){
                if(thang>=1 && thang <=3){
                    hoaDonQuy1 += hoaDon.getTongTien();
                }else if(thang>=4 && thang <=6){
                    hoaDonQuy2 += hoaDon.getTongTien();
                }else if(thang>=7 && thang <=9){
                    hoaDonQuy3 += hoaDon.getTongTien();
                }else{
                    hoaDonQuy4 += hoaDon.getTongTien();
                }
            }else{
                //JOptionPane.showMessageDialog(this, "Không có năm phù hợp!");
                //break;
                checkNam = true;
                break;
            }
        }    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtDT = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtSP = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtNCC = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel1 = new javax.swing.JPanel();
        chart = new com.raven.chart.Chart();
        jLabel4 = new javax.swing.JLabel();
        cbNam = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTopBanChay = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        txtDT.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        txtDT.setForeground(new java.awt.Color(255, 255, 255));
        txtDT.setText("100");

        jLabel17.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Doanh thu");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-profit-80.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel17)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDT, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtDT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(java.awt.Color.orange);

        txtSP.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        txtSP.setForeground(new java.awt.Color(255, 255, 255));
        txtSP.setText("100");

        jLabel10.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sản phẩm");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-product-80.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(txtSP))
                .addGap(38, 38, 38))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(txtSP, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addGap(152, 152, 152))
        );

        jPanel5.setBackground(new java.awt.Color(255, 102, 0));

        txtNCC.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        txtNCC.setForeground(new java.awt.Color(255, 255, 255));
        txtNCC.setText("100");

        jLabel14.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nhà cung cấp ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-supplier-80 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(txtNCC)
                        .addGap(29, 29, 29)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        panel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        jLabel4.setText("BIỂU ĐỒ CHO NĂM");

        cbNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        jButton1.setText("Restar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(chart, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29)
                        .addComponent(cbNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(17, 17, 17))
        );

        jTabbedPane1.addTab("Thống kê doanh thu", panel1);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        tbTopBanChay.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Top", "Sản phẩm", "Đã bán", "Giá bán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTopBanChay.setSelectionBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        tbTopBanChay.setShowGrid(true);
        jScrollPane1.setViewportView(tbTopBanChay);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        jLabel6.setText("Top 10 sản phẩm bán chạy");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(289, 289, 289))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addGap(61, 61, 61)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sản phẩm bán chạy", jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        thongKeNhapHang();
        thongKeBanHang();
        if(checkNam == true){
            JOptionPane.showMessageDialog(this, "Không có năm phù hợp!");
            checkNam = false;
        }else{   
            //panel1.remove(chart);
            chart.addLegend("Nhập hàng", new Color(245, 189, 135));
            chart.addLegend("Doanh thu", new Color(139, 229, 222));
            chart.addData(new ModelChart("Quý 1", new double[]{nhapHangQuy1, hoaDonQuy1}));
            chart.addData(new ModelChart("Quý 2", new double[]{nhapHangQuy2, hoaDonQuy2}));
            chart.addData(new ModelChart("Quý 3", new double[]{nhapHangQuy3, hoaDonQuy3}));
            chart.addData(new ModelChart("Quý 4", new double[]{nhapHangQuy4, hoaDonQuy4}));
            //panel1.add(chart);
            //panel1.repaint();
            //panel1.revalidate();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showTopBanChay(){ 
        DetailBillBUS bus = new DetailBillBUS();
        bus.topSPBanChay();
        int top = 0;
        tableModel.setRowCount(0);
        for (topBanChayDTO spBC : DetailBillBUS.dsspbc) {
            top++;
            tableModel.addRow(new Object[]{
                top, 
                spBC.getMaSP(),
                spBC.getDaBan(),
                spBC.getDonGia()});
        }   
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbNam;
    private com.raven.chart.Chart chart;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panel1;
    private javax.swing.JTable tbTopBanChay;
    private javax.swing.JLabel txtDT;
    private javax.swing.JLabel txtNCC;
    private javax.swing.JLabel txtSP;
    // End of variables declaration//GEN-END:variables
}
