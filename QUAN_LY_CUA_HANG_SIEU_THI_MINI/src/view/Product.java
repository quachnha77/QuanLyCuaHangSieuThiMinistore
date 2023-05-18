package view;

import BUS.ProductBUS;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import static com.itextpdf.text.pdf.PdfFileSpecification.url;
import com.itextpdf.text.pdf.PdfWriter;
import com.sun.jdi.connect.spi.Connection;
import static database.KetNoiDB.conn;
import database.ProductDAO;
import java.awt.Desktop;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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


public class Product extends javax.swing.JPanel {
    DefaultTableModel tableModel;
    
    Vector DS = new Vector();//lưu tiêu đề cho table
    Vector dataDS = new Vector();//lưu dữ liệu cho tb
    public Product() {
        initComponents();
        showAll();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Xoa = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduct = new javax.swing.JTable();
        btnXuatExcel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cbTimKiem = new javax.swing.JComboBox<>();
        btnTimKiem = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        Xoa2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Xoa.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        Xoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                XoaMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Xóa");

        javax.swing.GroupLayout XoaLayout = new javax.swing.GroupLayout(Xoa);
        Xoa.setLayout(XoaLayout);
        XoaLayout.setHorizontalGroup(
            XoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, XoaLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(40, 40, 40))
        );
        XoaLayout.setVerticalGroup(
            XoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        tbProduct.setName(""); // NOI18N
        tbProduct.setSelectionBackground(javax.swing.UIManager.getDefaults().getColor("Objects.RedStatus"));
        tbProduct.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbProduct.setShowGrid(false);
        tbProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProduct);

        btnXuatExcel.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        btnXuatExcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnXuatExcelMousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("   Xuất Excel  ");

        javax.swing.GroupLayout btnXuatExcelLayout = new javax.swing.GroupLayout(btnXuatExcel);
        btnXuatExcel.setLayout(btnXuatExcelLayout);
        btnXuatExcelLayout.setHorizontalGroup(
            btnXuatExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnXuatExcelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnXuatExcelLayout.setVerticalGroup(
            btnXuatExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXuatExcelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cbTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã Sản Phẩm", "Tên Sản Phẩm", "Loại", "Đơn Giá", "Số Lượng", "Đơn Vị" }));

        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        txtTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        Xoa2.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.icon.pressedBorderColor"));
        Xoa2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Xoa2MousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("In ấn");

        javax.swing.GroupLayout Xoa2Layout = new javax.swing.GroupLayout(Xoa2);
        Xoa2.setLayout(Xoa2Layout);
        Xoa2Layout.setHorizontalGroup(
            Xoa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Xoa2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        Xoa2Layout.setVerticalGroup(
            Xoa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(Xoa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnXuatExcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Xoa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXuatExcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
    public void showAll() {
        tableModel = (DefaultTableModel) tbProduct.getModel();
        showThongTin();
    }
    private void showThongTin() { 
        ProductBUS bus = new ProductBUS();
        tableModel.setRowCount(0);
        bus.docSP();
        
        for (ProductDTO sp : ProductBUS.dssp) {
            tableModel.addRow(new Object[]{sp.getMaSP(), 
                sp.getTenSP(), 
                sp.getLoaiSP(), 
                sp.getDonGia(),
                sp.getSoLuong(),
                sp.getDonVi()});
        }      
    }  

    private boolean checkMaSP(String MaSP) {
        for (ProductDTO sp: ProductBUS.dssp) {
            if(MaSP.equals(sp.getMaSP())){
                return false;
            }
        }
        return true;
    }    private boolean kiemTra(String maSP){
        for (ProductDTO sp : ProductBUS.dssp) {
            if(maSP==sp.getMaSP()){
                return false;
            }
        }   
        return true;
    }

    private void btnXuatExcelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatExcelMousePressed
        try{
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showSaveDialog(this);
            File saveFile = jFileChooser.getSelectedFile();

            if(saveFile != null){
                saveFile = new File(saveFile.toString()+".xlsx");
                Workbook wb = new XSSFWorkbook();
                Sheet sheet = wb.createSheet("product");

                Row rowCol = sheet.createRow(0);
                for(int i=0;i<tbProduct.getColumnCount();i++){
                    Cell cell = rowCol.createCell(i);
                    cell.setCellValue(tbProduct.getColumnName(i));
                }

                for(int j=0;j<tbProduct.getRowCount();j++){
                    Row row = sheet.createRow(j+1);
                    for(int k=0;k<tbProduct.getColumnCount();k++){
                        Cell cell = row.createCell(k);
                        if(tbProduct.getValueAt(j, k)!=null){
                            cell.setCellValue(tbProduct.getValueAt(j, k).toString());
                        }
                    }
                }
                FileOutputStream out = new FileOutputStream(new File(saveFile.toString()));
                wb.write(out);
                wb.close();
                out.close();
                openFile(saveFile.toString());
            }else{
                JOptionPane.showMessageDialog(null,"Không thể tạo tệp");
            }
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException io){
            System.out.println(io);
        }
    }//GEN-LAST:event_btnXuatExcelMousePressed
    public void openFile(String file) {
        try {
            File path = new File(file);
            Desktop.getDesktop().open(path);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    
   
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

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void tbProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductMouseClicked

    }//GEN-LAST:event_tbProductMouseClicked

    private void XoaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XoaMousePressed
        List<ProductDTO> spList = ProductBUS.dssp;
        int n = tbProduct.getSelectedRow();  
        if (n == -1) {
            JOptionPane.showMessageDialog(this, "Chọn dòng để xóa");
        } else {
            ProductDTO sp = spList.get(n);    
            ProductBUS bus = new ProductBUS();
            bus.deleteSP(sp.getMaSP(),n);
            showAll();           
            JOptionPane.showMessageDialog(this, "Xóa thành công");
        }  
    }//GEN-LAST:event_XoaMousePressed

    private void Xoa2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Xoa2MousePressed
        
            /*
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ministore1?useUnicode=true&characterEncoding=utf8", "root", "");
            JasperDesign jd = JRXmlLoader.load("H:\\Java_Project\\06012016Report\\src\\pkg06012016report\\report1.jrxml");
            JasperReport jr = JasperCompileManager.compileReport("H:\\Java_Project\\06012016Report\\src\\pkg06012016report\\report1.jrxml");
            JasperPrint jp = JasperFillManager.fillReport(jr, new HashMap(), con);
            JasperViewer.viewReport(jp);
            JasperExportManager.exportReportToPdfFile(
            jp, "H:\\Java_Project\\06012016Report\\src\\pkg06012016report\\report1.pdf");
            } catch (ClassNotFoundException | SQLException | JRException e) {
            JOptionPane.showMessageDialog(null, "Cannot show report" + e.getMessage());
            }*/
            java.sql.Connection c = null;
            String link = "C:\\Users\\2301\\Desktop\\java\\QUAN_LY_CUA_HANG_SIEU_THI_MINI\\src\\report\\report1.jrxml";
            try{
                //Class.forName("com.mysql.jdbc.Driver()");
                //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                String database = "jdbc:mysql://localhost:3306/ministore1";
                String user = "root";
                String pass = "";
                c = DriverManager.getConnection(database, user, pass);
                //Connection conn = (Connection) DriverManager.getConnection(database, user, pass);
                JasperReport jr = JasperCompileManager.compileReport(link);
                //HashMap<String, Object> reportMap = new HashMap<>();
                JasperPrint jp = JasperFillManager.fillReport(jr, null, c);
                //JasperPrint jp =JasperFillManager.fillReport(jr,reportMap,new JRBeanCollectionDataSource((Collection<?>) c));
                JasperViewer.viewReport(jp);
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage());
            }
        
    }//GEN-LAST:event_Xoa2MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Xoa;
    private javax.swing.JPanel Xoa2;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JPanel btnXuatExcel;
    private javax.swing.JComboBox<String> cbTimKiem;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbProduct;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

}
