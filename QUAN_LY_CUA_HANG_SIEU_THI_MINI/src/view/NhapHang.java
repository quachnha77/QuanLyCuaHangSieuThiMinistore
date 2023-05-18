package view;

import BUS.DetailReceiptBUS;
import BUS.ProductBUS;
import BUS.ReceiptBUS;
import com.itextpdf.text.log.Logger;
import database.AccountDAO;
import database.ProductDAO;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.AccountDTO;
import model.DetailReceiptDTO;
import model.ProductDTO;
import model.ReceiptDTO;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NhapHang extends javax.swing.JPanel {
    ArrayList<ProductDTO> dssp = new ArrayList<>();
    ArrayList<DetailReceiptDTO> dsctpn = new ArrayList<>();
    DefaultTableModel model = new DefaultTableModel();
    DefaultTableModel tableModelSanPham;
    DefaultTableModel tableModelPhieuNhap;
    private final String userName;
    public NhapHang(String user) {
        initComponents();
        
 
        userName = user;
        AccountDTO ac = AccountDAO.getInstance().selectById(userName);
        lbNguoiTao.setText(ac.getFullName());
        showAll();
    }
    public void showAll() {
        /*
        tableModelSanPham = (DefaultTableModel) tbSP.getModel();
        showSanPhamTrongKho();
        */
        tableModelPhieuNhap = (DefaultTableModel) tbPhieuNhap.getModel();
        showPhieuNhap();

        showChiTietPhieuNhap();
    }
    private void showChiTietPhieuNhap(){
        DetailReceiptBUS bus = new DetailReceiptBUS();
        bus.docCTPN();
    }
    private void showPhieuNhap() { 
        ReceiptBUS bus = new ReceiptBUS();
        tableModelPhieuNhap.setRowCount(0);
        bus.docPN();
        
        for (ReceiptDTO sp : ReceiptBUS.dspn) {
            tableModelPhieuNhap.addRow(new Object[]{
                sp.getMaPN(), 
                sp.getNgayTao(), 
                sp.getNguoiTao(), 
                sp.getTongTien()});
        }   
    }
    private void showSanPhamTrongKho() { 
        ProductBUS bus = new ProductBUS();
        tableModelSanPham.setRowCount(0);
        bus.docSP();
        
        for (ProductDTO sp : ProductBUS.dssp) {
            tableModelSanPham.addRow(new Object[]{
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

        jButton1 = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        txtMaSP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTenSanPham = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtLoai = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDonVi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbNguoiTao = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaNhaCungCap = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtMaPhieuNhap = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPhieuNhap = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSP = new javax.swing.JTable();
        Sua = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        Xoa = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btnThemSanPham = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Luu = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        importExcel = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(255, 255, 255));

        txtMaSP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSPActionPerformed(evt);
            }
        });

        jLabel8.setText("Mã Sản Phẩm");

        jLabel9.setText("Tên Sản Phẩm");

        txtTenSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel10.setText("Loại");

        txtLoai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setText("Đơn Giá");

        txtDonGia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel11.setText("Số Lượng");

        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongActionPerformed(evt);
            }
        });

        jLabel12.setText("Đơn Vị");

        txtDonVi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDonVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonViActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Người tạo:");

        lbNguoiTao.setText("jLabel4");

        jLabel5.setText("Mã Nhà Cung Cấp");

        txtMaNhaCungCap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNhaCungCapActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        jLabel13.setText("Chi tiết phiếu nhập");

        jLabel14.setText("Mã Phiếu Nhập");

        txtMaPhieuNhap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaPhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaPhieuNhapActionPerformed(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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
        jScrollPane2.setViewportView(tbPhieuNhap);
        if (tbPhieuNhap.getColumnModel().getColumnCount() > 0) {
            tbPhieuNhap.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("                        Lịch sử nhập hàng                        ", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tbSP.setModel(new javax.swing.table.DefaultTableModel(
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
        tbSP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbSP.setInheritsPopupMenu(true);
        tbSP.setName(""); // NOI18N
        tbSP.setSelectionBackground(javax.swing.UIManager.getDefaults().getColor("Objects.RedStatus"));
        tbSP.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbSP.setShowGrid(false);
        tbSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSP);

        Sua.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        Sua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SuaMousePressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("  Sửa");

        javax.swing.GroupLayout SuaLayout = new javax.swing.GroupLayout(Sua);
        Sua.setLayout(SuaLayout);
        SuaLayout.setHorizontalGroup(
            SuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SuaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel15)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        SuaLayout.setVerticalGroup(
            SuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SuaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Xoa.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        Xoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                XoaMousePressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText(" Xóa  ");

        javax.swing.GroupLayout XoaLayout = new javax.swing.GroupLayout(Xoa);
        Xoa.setLayout(XoaLayout);
        XoaLayout.setHorizontalGroup(
            XoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, XoaLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(29, 29, 29))
        );
        XoaLayout.setVerticalGroup(
            XoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, XoaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addContainerGap())
        );

        btnThemSanPham.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        btnThemSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThemSanPhamMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Thêm");

        javax.swing.GroupLayout btnThemSanPhamLayout = new javax.swing.GroupLayout(btnThemSanPham);
        btnThemSanPham.setLayout(btnThemSanPhamLayout);
        btnThemSanPhamLayout.setHorizontalGroup(
            btnThemSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnThemSanPhamLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(33, 33, 33))
        );
        btnThemSanPhamLayout.setVerticalGroup(
            btnThemSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnThemSanPhamLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(Sua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnThemSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Sua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("                       Sản phẩm vừa nhập                       ", jPanel2);

        Luu.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        Luu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LuuMousePressed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("  Lưu");

        javax.swing.GroupLayout LuuLayout = new javax.swing.GroupLayout(Luu);
        Luu.setLayout(LuuLayout);
        LuuLayout.setHorizontalGroup(
            LuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LuuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel16)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        LuuLayout.setVerticalGroup(
            LuuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LuuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap())
        );

        importExcel.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        importExcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                importExcelMousePressed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Import Excel");

        javax.swing.GroupLayout importExcelLayout = new javax.swing.GroupLayout(importExcel);
        importExcel.setLayout(importExcelLayout);
        importExcelLayout.setHorizontalGroup(
            importExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(importExcelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        importExcelLayout.setVerticalGroup(
            importExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, importExcelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaPhieuNhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaNhaCungCap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLoai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDonVi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNguoiTao))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(importExcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(Luu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lbNguoiTao))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(5, 5, 5)
                        .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Luu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(importExcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSPActionPerformed

    private void txtDonViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonViActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDonViActionPerformed

    private void txtMaNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNhaCungCapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNhaCungCapActionPerformed

    private void txtMaPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaPhieuNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaPhieuNhapActionPerformed

    private void txtSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoLuongActionPerformed

    private boolean checkMaSP(String MaSP) {
        for (ProductDTO sp: ProductBUS.dssp) {
            if(MaSP.equals(sp.getMaSP())){
                return false;
            }
        }
        return true;
    }
    private void Reset(){
        txtMaPhieuNhap.setText("");
        txtMaNhaCungCap.setText("");
        txtMaSP.setText("");
        txtTenSanPham.setText("");
        txtLoai.setText("");
        txtDonGia.setText("");
        txtSoLuong.setText("");
        txtDonVi.setText("");
    }
    private boolean checkMaPN(String MaSP) {
        for (ReceiptDTO pn: ReceiptBUS.dspn) {
            if(MaSP.equals(pn.getMaPN())){
                return false;
            }
        }
        return true;
    }
    private void resetTable(){
        DefaultTableModel tb = (DefaultTableModel)tbSP.getModel();
        while(tb.getRowCount() > 0)
        {
            tb.removeRow(0);
        }
    }
    private void loadToDatabase(){
        //tbSP.setModel(model);
        if (checkMaPN(txtMaPhieuNhap.getText())==false){
            JOptionPane.showMessageDialog(this, "Trùng mã phiếu nhập!!!");
        }else{
            int tongTienPhieuNhap = 0;
            ProductBUS busSP = new ProductBUS();             
            for (ProductDTO sp: dssp) {
                busSP.insertSP(sp);
                tongTienPhieuNhap+= sp.getDonGia()*sp.getSoLuong();
            }
            DetailReceiptBUS busCTPN = new DetailReceiptBUS();
            for (DetailReceiptDTO ctpn: dsctpn) {
                ctpn.setMaPN(txtMaPhieuNhap.getText());
                busCTPN.docCTPN();
                busCTPN.insertCTPN(ctpn);
            }

            
            ReceiptBUS busPN = new ReceiptBUS();
            ReceiptDTO pn = new ReceiptDTO();
            pn.maPN = txtMaPhieuNhap.getText();
            long millis=System.currentTimeMillis();  
            java.sql.Date date=new java.sql.Date(millis);  
            pn.ngayTao = date;
            AccountDTO ac = AccountDAO.getInstance().selectById(userName);
            pn.nguoiTao = ac.getFullName();
            pn.tongTien = tongTienPhieuNhap;
            busPN.insertPN(pn);      
            
            
            
            Reset();
            dssp.clear();
            dsctpn.clear();
            JOptionPane.showMessageDialog(this, "Thêm thành công!!!");
            resetTable();
            showAll();
        }
    }

    private boolean ckMaSP(String maSP){
        for(ProductDTO sp: dssp){
            if(maSP.equals(sp.getMaSP())){
                return false;
            }
        }
        return true;
    }
    private boolean kiemTraNhap(){
        String maPN = txtMaPhieuNhap.getText();
        String maNCC = txtMaNhaCungCap.getText();
        String maSP = txtMaSP.getText();
        String tenSP = txtTenSanPham.getText();
        String loaiSP = txtLoai.getText();
        String donGia = txtDonGia.getText();
        String soLuong = txtSoLuong.getText();
        String donVi = txtDonVi.getText();
        return !("".equals(maPN) || "".equals(maNCC) || "".equals(maSP) || "".equals(tenSP) || "".equals(loaiSP) || "".equals(donGia) || "".equals(soLuong) || "".equals(donVi));
    }
    private void btnThemSanPhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemSanPhamMousePressed
        try{
            ProductDTO sp = new ProductDTO();
            sp.setMaSP(txtMaSP.getText());
            sp.setTenSP(txtTenSanPham.getText());
            sp.setLoaiSP(txtLoai.getText());
            sp.setDonGia(Integer.parseInt(txtDonGia.getText()));
            sp.setSoLuong(Integer.parseInt(txtSoLuong.getText()));
            sp.setDonVi(txtDonVi.getText());   
            
            
            
            DetailReceiptDTO ctpn = new DetailReceiptDTO();
            ctpn.setMaPN(txtMaPhieuNhap.getText());
            ctpn.setMaNCC(txtMaNhaCungCap.getText());
            ctpn.setMaSP(txtMaSP.getText());
            ctpn.setTenSP(txtTenSanPham.getText());
            ctpn.setLoaiSP(txtLoai.getText());
            ctpn.setDonGia(Integer.parseInt(txtDonGia.getText()));
            ctpn.setSoLuong(Integer.parseInt(txtSoLuong.getText()));
            ctpn.setDonVi(txtDonVi.getText());
            if(ckMaSP(sp.maSP) == false){
                JOptionPane.showMessageDialog(this, "Trùng!!!");
            }else if(kiemTraNhap()==false){
                JOptionPane.showMessageDialog(this, "Kiểm tra nhập!!!");
            }
            else{
                dssp.add(sp);
                dsctpn.add(ctpn);
                
                
                //cập nhật Jtable
                //DefaultTableModel  model = new DefaultTableModel();
                Vector header = new Vector();
                header.add("Mã SP");//tua de cot cua jtable
                header.add("Tên SP");
                header.add("Loại");
                header.add("Đơn Giá");
                header.add("Số Lượng");
                header.add("Đơn Vị");

                if (model.getRowCount()==0)
                        { model=new DefaultTableModel(header,0);} //dữ liệu rỗng

                //nạp dữ liệu cho mỗi row
                Vector row = new Vector();
                row.add(sp.maSP);
                row.add(sp.tenSP);
                row.add(sp.loaiSP);
                row.add(sp.donGia);
                row.add(sp.soLuong);
                row.add(sp.donVi);
                model.addRow(row); 
                tbSP.setModel(model);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Kiểm tra nhập!!!");
            }
            
           
        
             
   /*     
        MiniStoreBUS bus = new MiniStoreBUS();  
        try{
            ProductDTO sp = new ProductDTO();
            sp.maSP = txtMaSP.getText();
            sp.tenSP = txtTenSanPham.getText();
            sp.loaiSP = txtLoai.getText();
            sp.donGia = Integer.parseInt(txtDonGia.getText());
            sp.soLuong = Integer.parseInt(txtSoLuong.getText());
            sp.donVi = txtDonVi.getText();     
            
            ReceiptDTO pn = new ReceiptDTO();
            pn.maPN = txtMaPhieuNhap.getText();
            long millis=System.currentTimeMillis();  
            java.sql.Date date=new java.sql.Date(millis);  
            pn.ngayTao = date;
            AccountDTO ac = AccountDAO.getInstance().selectById(userName);
            pn.nguoiTao = ac.getFullName();
            pn.tongTien = sp.donGia * sp.soLuong;
            
            
            DetailReceiptDTO ctpn = new DetailReceiptDTO();
            ctpn.maPN = txtMaPhieuNhap.getText();
            ctpn.maNCC = txtMaNhaCungCap.getText();
            ctpn.maSP  = txtMaSP.getText();
            ctpn.tenSP = txtLoai.getText();
            ctpn.loaiSP = txtLoai.getText();
            ctpn.donGia = Integer.parseInt(txtDonGia.getText());
            ctpn.soLuong = Integer.parseInt(txtSoLuong.getText());
            ctpn.donVi = txtDonVi.getText();   
            
            
            if(checkMaSP(sp.maSP) == false){
                JOptionPane.showMessageDialog(this, "Trùng!!!");
            }
            else{ 
                bus.insertSP(sp);
                bus.insertPN(pn);
                bus.docCTHD();
                bus.insertCTPN(ctpn);
                
                showAll();
                JOptionPane.showMessageDialog(this, "Thêm thành công!!!");
                Reset(); 
            }     
            
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Kiểm tra nhập");
        }
*/
    }//GEN-LAST:event_btnThemSanPhamMousePressed

    private void LuuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LuuMousePressed
        loadToDatabase();
        
    }//GEN-LAST:event_LuuMousePressed

    private void XoaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XoaMousePressed
        int  i = tbSP.getSelectedRow();
        if (i>=0)
        {
            dsctpn.remove(i);
            
            dssp.remove(i);
            model.removeRow(i);
            tbSP.setModel(model);
        }
    }//GEN-LAST:event_XoaMousePressed

    private void SuaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SuaMousePressed
        // TODO add your handling code here:
        int  i=tbSP.getSelectedRow();
        if (i>=0)
        {
            try{
                ProductDTO sp =new ProductDTO();
                sp.setMaSP(txtMaSP.getText());
                sp.setTenSP(txtTenSanPham.getText());
                sp.setLoaiSP(txtLoai.getText());
                sp.setDonGia(Integer.parseInt(txtDonGia.getText()));
                sp.setSoLuong(Integer.parseInt(txtSoLuong.getText()));
                sp.setDonVi(txtDonVi.getText());  
                
                
                DetailReceiptDTO ctpn = new DetailReceiptDTO();
                ctpn.setMaPN(txtMaPhieuNhap.getText());
                ctpn.setMaNCC(txtMaNhaCungCap.getText());
                ctpn.setMaSP(txtMaSP.getText());
                ctpn.setTenSP(txtTenSanPham.getText());
                ctpn.setLoaiSP(txtLoai.getText());
                ctpn.setDonGia(Integer.parseInt(txtDonGia.getText()));
                ctpn.setSoLuong(Integer.parseInt(txtSoLuong.getText()));
                ctpn.setDonVi(txtDonVi.getText());
                dsctpn.set(i, ctpn);
                
                
                //update
                ProductDTO old= dssp.set(i, sp);
                model.setValueAt(sp.maSP, i, 0);
                model.setValueAt(sp.tenSP, i, 1);
                model.setValueAt(sp.loaiSP, i, 2);     
                model.setValueAt(sp.donGia, i, 3);
                model.setValueAt(sp.soLuong, i, 4);
                model.setValueAt(sp.donVi, i, 5);    
                tbSP.setModel(model);
            }catch(Exception e){
            }
        }
    }//GEN-LAST:event_SuaMousePressed

    private void tbSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSPMouseClicked
        try{
            int  i = tbSP.getSelectedRow();
            if(i>=0)
            {
                ProductDTO sp =new ProductDTO();
                sp = dssp.get(i);        
                txtMaSP.setText(sp.getMaSP());
                txtTenSanPham.setText(sp.getTenSP());
                txtLoai.setText(sp.getLoaiSP());
                txtDonGia.setText(""+sp.getDonGia());
                txtSoLuong.setText(""+sp.getSoLuong());
                txtDonVi.setText(sp.getDonVi());
            }else{
                System.out.print("NULL");
            }
        }catch(Exception e){
            System.out.print("ERROR");
        }
        
    }//GEN-LAST:event_tbSPMouseClicked
/*
    public void loadDataToTable(ArrayList<ProductDTO> sp) {
        try {
            tableModelSanPham.setRowCount(0);
            for (ProductDTO i : sp) {
                tableModelSanPham.addRow(new Object[]{
                    i.getMaSP(), 
                    i.getTenSP(), 
                    i.getLoaiSP(), 
                    i.getDonGia(),
                    i.getSoLuong(),
                    i.getDonVi()});
            }
        } catch (Exception e) {
        }   
    }
    */
    private void loadDataFromExcelToTable(String maSP, String tenSP, String loaiSP, int donGia, int soLuong, String donVi){
        try{
            ProductDTO sp = new ProductDTO();
            sp.setMaSP(maSP);
            sp.setTenSP(tenSP);
            sp.setLoaiSP(loaiSP);
            sp.setDonGia(donGia);
            sp.setSoLuong(soLuong);
            sp.setDonVi(donVi);   
            
            
            
            DetailReceiptDTO ctpn = new DetailReceiptDTO();
            ctpn.setMaPN(txtMaPhieuNhap.getText());
            ctpn.setMaNCC(txtMaNhaCungCap.getText());
            ctpn.setMaSP(maSP);
            ctpn.setTenSP(tenSP);
            ctpn.setLoaiSP(loaiSP);
            ctpn.setDonGia(donGia);
            ctpn.setSoLuong(soLuong);
            ctpn.setDonVi(donVi);
            if(ckMaSP(sp.maSP) == false){
                JOptionPane.showMessageDialog(this, "Trùng!!!");
            }
            else{
                dssp.add(sp);
                dsctpn.add(ctpn);
                
                
                //cập nhật Jtable
                //DefaultTableModel  model = new DefaultTableModel();
                Vector header = new Vector();
                header.add("Mã SP");//tua de cot cua jtable
                header.add("Tên SP");
                header.add("Loại");
                header.add("Đơn Giá");
                header.add("Số Lượng");
                header.add("Đơn Vị");

                if (model.getRowCount()==0)
                        { model=new DefaultTableModel(header,0);} //dữ liệu rỗng

                //nạp dữ liệu cho mỗi row
                Vector row = new Vector();
                row.add(sp.maSP);
                row.add(sp.tenSP);
                row.add(sp.loaiSP);
                row.add(sp.donGia);
                row.add(sp.soLuong);
                row.add(sp.donVi);
                model.addRow(row); 
                tbSP.setModel(model);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Kiểm tra nhập!!!");
            }
    }
    private void importExcelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importExcelMousePressed
        //Import excel
        File excelFile;
        FileInputStream excelFIS = null;
        BufferedInputStream excelBIS = null;
        XSSFWorkbook excelJTableImport = null;
        //ArrayList<ProductDTO> listAccExcel = new ArrayList<ProductDTO>();
        JFileChooser jf = new JFileChooser();
        int result = jf.showOpenDialog(null);
        jf.setDialogTitle("Open file");
        Workbook workbook = null;
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                excelFile = jf.getSelectedFile();
                excelFIS = new FileInputStream(excelFile);
                excelBIS = new BufferedInputStream(excelFIS);
                excelJTableImport = new XSSFWorkbook(excelBIS);
                XSSFSheet excelSheet = excelJTableImport.getSheetAt(0);
                for (int row = 1; row <= excelSheet.getLastRowNum(); row++) {
                    XSSFRow excelRow = excelSheet.getRow(row);
                    String maSP = excelRow.getCell(0).getStringCellValue();
                    String tenSP = excelRow.getCell(1).getStringCellValue();
                    String loaiSP = excelRow.getCell(2).getStringCellValue();
                    int donGia = (int) excelRow.getCell(3).getNumericCellValue();
                    int soLuong = (int) excelRow.getCell(4).getNumericCellValue();
                    String donVi = excelRow.getCell(5).getStringCellValue();
                    //ProductDTO acc = new ProductDTO(maSP, tenSP, loaiSP, donGia, soLuong, donVi);
                    //listAccExcel.add(acc);
                    //DefaultTableModel table_acc = (DefaultTableModel) tbSP.getModel();
                    //table_acc.setRowCount(0);
                    //loadDataToTable(listAccExcel);
                    loadDataFromExcelToTable(maSP, tenSP, loaiSP, donGia, soLuong, donVi);
                }
            } catch (FileNotFoundException ex) {  
            } catch (IOException ex) {    
            }
        }
        /*
        try {
            int k = 0;
            for (ProductDTO sp : listAccExcel) {
                k = ProductDAO.getInstance().insert(sp);
            }
            if(k!=0) {
                JOptionPane.showMessageDialog(this, "Import thành công !");
            }
        } catch (Exception e) {
        }
*/
    }//GEN-LAST:event_importExcelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Luu;
    private javax.swing.JPanel Sua;
    private javax.swing.JPanel Xoa;
    private javax.swing.JPanel btnThemSanPham;
    private javax.swing.JPanel importExcel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbNguoiTao;
    private javax.swing.JTable tbPhieuNhap;
    private javax.swing.JTable tbSP;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtDonVi;
    private javax.swing.JTextField txtLoai;
    private javax.swing.JTextField txtMaNhaCungCap;
    private javax.swing.JTextField txtMaPhieuNhap;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSanPham;
    // End of variables declaration//GEN-END:variables
}
