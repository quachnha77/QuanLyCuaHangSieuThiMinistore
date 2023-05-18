package view;
/*
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
*/
import BUS.BillBUS;
import BUS.DetailBillBUS;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import database.DetailBillDAO;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.BillDTO;
import model.DetailBillDTO;
import model.ProductDTO;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

import static org.apache.logging.log4j.core.impl.ThrowableFormatOptions.FILE_NAME;
import static org.apache.poi.hssf.usermodel.HeaderFooter.date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Bills extends javax.swing.JPanel {
    DefaultTableModel tableModel;
    DefaultTableModel tableModel1;  //chi tiết
    public Bills() {
        initComponents();
        showAll();
    }
    public void showAll() {
        tableModel = (DefaultTableModel) tbHoaDon.getModel();
        showHoaDon();
        
        tableModel1 = (DefaultTableModel) tbChiTietHoaDon.getModel();
        showChiTietHoaDon(); 
    }
    private void showChiTietHoaDon() { 
        DetailBillBUS bus = new DetailBillBUS();
        tableModel1.setRowCount(0);
        bus.docCTHD();
        
        for (DetailBillDTO cthd : DetailBillBUS.dscthd) {
            tableModel1.addRow(new Object[]{
                cthd.getMaHD(), 
                cthd.getMaSP(), 
                cthd.getSoLuong(), 
                cthd.getDonGia(),
                cthd.getThanhTien()});
        }   
    }
    private void showHoaDon() { 
        BillBUS bus = new BillBUS();
        tableModel.setRowCount(0);
        bus.docHD();
        
        for (BillDTO hd : BillBUS.dshd) {
            tableModel.addRow(new Object[]{
                hd.getMaHD(), 
                hd.getMaKH(), 
                hd.getNgayTao(), 
                hd.getNguoiTao(),
                hd.getTongTien()});
        }   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbChiTietHoaDon = new javax.swing.JTable();
        txtTimKiem = new javax.swing.JTextField();
        cbTimKiem = new javax.swing.JComboBox<>();
        btnTimKiem = new javax.swing.JButton();
        btnXuatPDF = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbHoaDon = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        jLabel1.setText("Hóa Đơn");

        tbChiTietHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã HD", "Mã SP", "Số Lượng", "Đơn Giá", "Thành Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbChiTietHoaDon.setSelectionBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        jScrollPane1.setViewportView(tbChiTietHoaDon);
        if (tbChiTietHoaDon.getColumnModel().getColumnCount() > 0) {
            tbChiTietHoaDon.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbChiTietHoaDon.getColumnModel().getColumn(1).setPreferredWidth(50);
        }

        txtTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        cbTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cbTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã HD", "Ngày Tạo", "Người Tạo", "Tổng Tiền" }));

        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnXuatPDF.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        btnXuatPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnXuatPDFMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Xuất PDF");

        javax.swing.GroupLayout btnXuatPDFLayout = new javax.swing.GroupLayout(btnXuatPDF);
        btnXuatPDF.setLayout(btnXuatPDFLayout);
        btnXuatPDFLayout.setHorizontalGroup(
            btnXuatPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXuatPDFLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        btnXuatPDFLayout.setVerticalGroup(
            btnXuatPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel2.setForeground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        jLabel2.setText("Chi tiết hóa đơn");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel3.setForeground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        jLabel3.setText("Danh sách");

        tbHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã HD", "Mã KH", "Ngày Tạo", "Người Tạo", "Tổng Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbHoaDon.setSelectionBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        tbHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHoaDonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbHoaDon);
        if (tbHoaDon.getColumnModel().getColumnCount() > 0) {
            tbHoaDon.getColumnModel().getColumn(0).setPreferredWidth(35);
            tbHoaDon.getColumnModel().getColumn(1).setPreferredWidth(35);
            tbHoaDon.getColumnModel().getColumn(2).setPreferredWidth(60);
            tbHoaDon.getColumnModel().getColumn(4).setPreferredWidth(60);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(btnTimKiem))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnXuatPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTimKiem))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnXuatPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
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

    private void timKiem(String timKiem, Object cbBox){
            if(cbBox == "Mã HD"){
                tableModel.setRowCount(0);
                for (BillDTO hd: BillBUS.dshd) {
                    String maHD = String.valueOf(hd.getMaHD());
                    if(maHD.contains(timKiem)){
                        tableModel.addRow(new Object[]{ 
                        hd.getMaHD(), 
                        hd.getMaKH(),
                        hd.getNgayTao(), 
                        hd.getNguoiTao(), 
                        hd.getTongTien()});
                    }
                }
            }else if(cbBox == "Mã KH"){
                tableModel.setRowCount(0);
                for (BillDTO hd: BillBUS.dshd) {
                    if(hd.getMaKH().contains(timKiem)){
                        tableModel.addRow(new Object[]{
                        hd.getMaHD(),
                        hd.getMaKH(),
                        hd.getNgayTao(), 
                        hd.getNguoiTao(), 
                        hd.getTongTien()});
                    }
                }
            }
            else if(cbBox == "Ngày Tạo"){
                tableModel.setRowCount(0);
                for (BillDTO hd: BillBUS.dshd) {
                    String ngayTao = hd.getNgayTao().toString();
                    if(ngayTao.contains(timKiem)){
                        tableModel.addRow(new Object[]{
                        hd.getMaHD(),
                        hd.getMaKH(),
                        hd.getNgayTao(), 
                        hd.getNguoiTao(), 
                        hd.getTongTien()});
                    }
                }
            }else if(cbBox == "Người Tạo"){
                tableModel.setRowCount(0);
                for (BillDTO hd: BillBUS.dshd) {
                    if(hd.getNguoiTao().contains(timKiem)){
                        tableModel.addRow(new Object[]{
                        hd.getMaHD(), 
                        hd.getMaKH(),
                        hd.getNgayTao(), 
                        hd.getNguoiTao(), 
                        hd.getTongTien()});
                    }
                }
            }else{
                tableModel.setRowCount(0);
                for (BillDTO hd: BillBUS.dshd) {
                    String tongTien = String.valueOf(hd.getTongTien());
                    if(tongTien.contains(timKiem)){
                        tableModel.addRow(new Object[]{
                        hd.getMaHD(),
                        hd.getMaKH(),
                        hd.getNgayTao(), 
                        hd.getNguoiTao(), 
                        hd.getTongTien()});
                    }
                }
            }
    }
    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String tk = txtTimKiem.getText();
        Object cbBox = cbTimKiem.getSelectedItem();
        timKiem(tk, cbBox);
    }//GEN-LAST:event_btnTimKiemActionPerformed

    
    private void btnXuatPDFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatPDFMousePressed
        /*
        int n = tbHoaDon.getSelectedRow(); //chọn dòng
        if(n==-1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn hóa đơn cần xuất!", "Cảnh báo!", JOptionPane.WARNING_MESSAGE);
        }else{
            int maHD = (int) tbHoaDon.getModel().getValueAt(n, 0);
            showChiTietHD(maHD);
            
            DetailBillDTO detailbill = DetailBillDAO.getInstance().selectById(maHD);
            String maSP ;
            int soLuong;
            int donGia;
            int thanhTien;

            final String FILE_NAME = "demo.pdf";
            Document document = new Document();
            try {
                PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
                //open
                document.open();
                         
                Font f = new Font();
                f.setStyle(Font.BOLD);
                f.setSize(15);
                
                document.add(new Paragraph("Hoa don", f));

                f.setStyle(Font.NORMAL);
                f.setSize(12);
                document.add(new Paragraph("ID: " + maHD, f));
                document.add(new Paragraph("        %-12s%-12s%-15s%-15s\n".formatted("MaSP","SL","Don gia","Thanh tien"), f));
                for (DetailBillDTO cthd : MiniStoreBUS.dscthd) {
                    if(maHD == cthd.getMaHD()){
                        document.add(new Paragraph("%12s%12d    %15d%15d\n".formatted(cthd.getMaSP(),cthd.getSoLuong(),
                        cthd.getDonGia(),cthd.getThanhTien()), f));
                    }
                } 
                //close
                document.close();
                System.out.println("Done");

            } catch (FileNotFoundException | DocumentException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
*/
        
        int n = tbHoaDon.getSelectedRow(); //chọn dòng
        if(n==-1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn hóa đơn cần xuất!", "Cảnh báo!", JOptionPane.WARNING_MESSAGE);
        }else{
            try{
                JFileChooser jFileChooser = new JFileChooser();
                jFileChooser.showSaveDialog(this);
                File saveFile = jFileChooser.getSelectedFile();

                if(saveFile != null){
                    int maHD = (int) tbHoaDon.getModel().getValueAt(n, 0);
                    showChiTietHD(maHD);
                    DetailBillDTO detailbill = DetailBillDAO.getInstance().selectById(maHD);
                    String maSP ;
                    int soLuong;
                    int donGia;
                    int thanhTien;

                    saveFile = new File(saveFile.toString()+".pdf");          

                    //final String FILE_NAME = "demo.pdf";
                    Document document = new Document();

                    PdfWriter.getInstance(document, new FileOutputStream(new File(saveFile.toString())));
                    //open
                    document.open();

                    Font f = new Font();
                    f.setStyle(Font.BOLD);
                    f.setSize(15);
                    document.add(new Paragraph("Hoa don", f));

                    f.setStyle(Font.NORMAL);
                    f.setSize(12);
                    document.add(new Paragraph("ID: " + maHD, f));
                    document.add(new Paragraph("        %-12s%-12s%-15s%-15s\n".formatted("MaSP","SL","Don gia","Thanh tien"), f));

                    for (DetailBillDTO cthd : DetailBillBUS.dscthd) {
                        if(maHD == cthd.getMaHD()){
                            document.add(new Paragraph("%12s%12d    %15d%15d\n".formatted(cthd.getMaSP(),cthd.getSoLuong(),
                            cthd.getDonGia(),cthd.getThanhTien()), f));
                        }
                    }

                    FileOutputStream out = new FileOutputStream(new File(saveFile.toString()));
                    //document.write(out);
                    //close
                    document.close();
                    out.close();
                    openFile(saveFile.toString());
                    System.out.println("Done");

                }else{
                    JOptionPane.showMessageDialog(null,"Không thể tạo tệp");
                }
            }catch(FileNotFoundException e){
                System.out.println(e);
            }catch(IOException io){
                System.out.println(io);
            } catch (DocumentException ex) {
                Logger.getLogger(Bills.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }  
        
    }//GEN-LAST:event_btnXuatPDFMousePressed
    public void openFile(String file) {
        try {
            File path = new File(file);
            Desktop.getDesktop().open(path);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    private void showChiTietHD(int maHD){
        DetailBillBUS bus = new DetailBillBUS();
        tableModel1.setRowCount(0);
        bus.docCTHD();
        
        for (DetailBillDTO cthd : DetailBillBUS.dscthd) {
            if(cthd.getMaHD() == maHD){
                tableModel1.addRow(new Object[]{
                    cthd.getMaHD(), 
                    cthd.getMaSP(), 
                    cthd.getSoLuong(), 
                    cthd.getDonGia(),
                    cthd.getThanhTien()});
            }    
        }  
    }
    private void tbHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHoaDonMouseClicked
        int n = tbHoaDon.getSelectedRow();
        int maHD = (int) tbHoaDon.getModel().getValueAt(n, 0);
        showChiTietHD(maHD);
    }//GEN-LAST:event_tbHoaDonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JPanel btnXuatPDF;
    private javax.swing.JComboBox<String> cbTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbChiTietHoaDon;
    private javax.swing.JTable tbHoaDon;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private void contains(String timKiem) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
