package view;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Insets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import model.AccountDTO;

public class ModeStaff extends javax.swing.JFrame {
    //public QLMTModel model;
    private String userName;
    Color DefaultColor, ClickedColor;
    public ModeStaff(String user) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatLightLaf());
        initComponents();
        setLocationRelativeTo(null);
        userName = user;
        
        DefaultColor = new Color(210, 46, 56);
        ClickedColor = new Color(200, 35, 35);
        
        Sales productform = new Sales(userName);
        main.add(productform);
        main.revalidate();
        main.repaint();
    }

    ModeStaff(AccountDTO ac) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private ModeStaff() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NavbarMenu = new javax.swing.JPanel();
        KhuyenMai = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        SanPham = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BanHang = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        KhachHang = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        NhapHang = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        HoaDon = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        PhieuNhapHang = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        TaiKhoan = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        DangXuat = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        NhaCungCap1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        main = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NavbarMenu.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        NavbarMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KhuyenMai.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        KhuyenMai.setForeground(new java.awt.Color(248, 155, 155));
        KhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KhuyenMaiMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                KhuyenMaiMousePressed(evt);
            }
        });
        KhuyenMai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                KhuyenMaiKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Khuyến mãi");
        jLabel9.setAlignmentX(0.5F);

        javax.swing.GroupLayout KhuyenMaiLayout = new javax.swing.GroupLayout(KhuyenMai);
        KhuyenMai.setLayout(KhuyenMaiLayout);
        KhuyenMaiLayout.setHorizontalGroup(
            KhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KhuyenMaiLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        KhuyenMaiLayout.setVerticalGroup(
            KhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KhuyenMaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NavbarMenu.add(KhuyenMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 170, 40));

        SanPham.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        SanPham.setForeground(new java.awt.Color(248, 155, 155));
        SanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SanPhamMousePressed(evt);
            }
        });
        SanPham.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SanPhamKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sản phẩm");

        javax.swing.GroupLayout SanPhamLayout = new javax.swing.GroupLayout(SanPham);
        SanPham.setLayout(SanPhamLayout);
        SanPhamLayout.setHorizontalGroup(
            SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SanPhamLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        SanPhamLayout.setVerticalGroup(
            SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        NavbarMenu.add(SanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 170, 40));

        BanHang.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        BanHang.setForeground(new java.awt.Color(248, 155, 155));
        BanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BanHangMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BanHangMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bán hàng");

        javax.swing.GroupLayout BanHangLayout = new javax.swing.GroupLayout(BanHang);
        BanHang.setLayout(BanHangLayout);
        BanHangLayout.setHorizontalGroup(
            BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BanHangLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(47, 47, 47))
        );
        BanHangLayout.setVerticalGroup(
            BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BanHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NavbarMenu.add(BanHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 170, 40));

        KhachHang.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        KhachHang.setForeground(new java.awt.Color(248, 155, 155));
        KhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KhachHangMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                KhachHangMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Khách hàng");

        javax.swing.GroupLayout KhachHangLayout = new javax.swing.GroupLayout(KhachHang);
        KhachHang.setLayout(KhachHangLayout);
        KhachHangLayout.setHorizontalGroup(
            KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KhachHangLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        KhachHangLayout.setVerticalGroup(
            KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        NavbarMenu.add(KhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 170, 40));

        NhapHang.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        NhapHang.setForeground(new java.awt.Color(248, 155, 155));
        NhapHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NhapHangMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NhapHangMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nhập hàng");

        javax.swing.GroupLayout NhapHangLayout = new javax.swing.GroupLayout(NhapHang);
        NhapHang.setLayout(NhapHangLayout);
        NhapHangLayout.setHorizontalGroup(
            NhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NhapHangLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        NhapHangLayout.setVerticalGroup(
            NhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NhapHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        NavbarMenu.add(NhapHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 170, 40));

        HoaDon.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        HoaDon.setForeground(new java.awt.Color(248, 155, 155));
        HoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HoaDonMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HoaDonMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hóa đơn");

        javax.swing.GroupLayout HoaDonLayout = new javax.swing.GroupLayout(HoaDon);
        HoaDon.setLayout(HoaDonLayout);
        HoaDonLayout.setHorizontalGroup(
            HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoaDonLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel7)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        HoaDonLayout.setVerticalGroup(
            HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        NavbarMenu.add(HoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 170, 40));

        PhieuNhapHang.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        PhieuNhapHang.setForeground(new java.awt.Color(248, 155, 155));
        PhieuNhapHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PhieuNhapHangMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PhieuNhapHangMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Phiếu nhập");

        javax.swing.GroupLayout PhieuNhapHangLayout = new javax.swing.GroupLayout(PhieuNhapHang);
        PhieuNhapHang.setLayout(PhieuNhapHangLayout);
        PhieuNhapHangLayout.setHorizontalGroup(
            PhieuNhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PhieuNhapHangLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        PhieuNhapHangLayout.setVerticalGroup(
            PhieuNhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PhieuNhapHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        NavbarMenu.add(PhieuNhapHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 170, 40));

        TaiKhoan.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        TaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TaiKhoanMousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tài khoản");

        javax.swing.GroupLayout TaiKhoanLayout = new javax.swing.GroupLayout(TaiKhoan);
        TaiKhoan.setLayout(TaiKhoanLayout);
        TaiKhoanLayout.setHorizontalGroup(
            TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TaiKhoanLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        TaiKhoanLayout.setVerticalGroup(
            TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NavbarMenu.add(TaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 170, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("MiniStore");
        NavbarMenu.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        DangXuat.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        DangXuat.setForeground(new java.awt.Color(248, 155, 155));
        DangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DangXuatMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DangXuatMousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Đăng xuất");

        javax.swing.GroupLayout DangXuatLayout = new javax.swing.GroupLayout(DangXuat);
        DangXuat.setLayout(DangXuatLayout);
        DangXuatLayout.setHorizontalGroup(
            DangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DangXuatLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(41, 41, 41))
        );
        DangXuatLayout.setVerticalGroup(
            DangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DangXuatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        NavbarMenu.add(DangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 170, 40));

        NhaCungCap1.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        NhaCungCap1.setForeground(new java.awt.Color(248, 155, 155));
        NhaCungCap1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NhaCungCap1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NhaCungCap1MousePressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nhà cung cấp");

        javax.swing.GroupLayout NhaCungCap1Layout = new javax.swing.GroupLayout(NhaCungCap1);
        NhaCungCap1.setLayout(NhaCungCap1Layout);
        NhaCungCap1Layout.setHorizontalGroup(
            NhaCungCap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NhaCungCap1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(28, 28, 28))
        );
        NhaCungCap1Layout.setVerticalGroup(
            NhaCungCap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NhaCungCap1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        NavbarMenu.add(NhaCungCap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 170, 40));

        getContentPane().add(NavbarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 590));

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setMaximumSize(new java.awt.Dimension(770, 440));
        main.setPreferredSize(new java.awt.Dimension(770, 440));
        getContentPane().add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 890, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KhuyenMaiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KhuyenMaiKeyPressed

    }//GEN-LAST:event_KhuyenMaiKeyPressed

    private void BanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BanHangMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BanHangMouseClicked

    private void BanHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BanHangMousePressed
        // TODO add your handling code here:
        BanHang.setBackground(ClickedColor);
        HoaDon.setBackground(DefaultColor);
        KhuyenMai.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        KhachHang.setBackground(DefaultColor);
        NhapHang.setBackground(DefaultColor);
        PhieuNhapHang.setBackground(DefaultColor);
        NhaCungCap1.setBackground(DefaultColor);
        TaiKhoan.setBackground(DefaultColor);
        
        
        main.removeAll();
        Sales sales = new Sales(userName);
        main.add(sales);
        main.revalidate();
        main.repaint();
    }//GEN-LAST:event_BanHangMousePressed

    private void KhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KhuyenMaiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_KhuyenMaiMouseClicked

    private void KhuyenMaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KhuyenMaiMousePressed
        // TODO add your handling code here:
        BanHang.setBackground(DefaultColor);
        HoaDon.setBackground(DefaultColor);
        KhuyenMai.setBackground(ClickedColor);
        SanPham.setBackground(DefaultColor);
        KhachHang.setBackground(DefaultColor);
        NhapHang.setBackground(DefaultColor);
        PhieuNhapHang.setBackground(DefaultColor);
        NhaCungCap1.setBackground(DefaultColor);
        TaiKhoan.setBackground(DefaultColor);
        
        main.removeAll();
        Promotion promotion = new Promotion();
        main.add(promotion);
        main.revalidate();
        main.repaint();
    }//GEN-LAST:event_KhuyenMaiMousePressed

    private void HoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoaDonMouseClicked
    }//GEN-LAST:event_HoaDonMouseClicked

    private void PhieuNhapHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhieuNhapHangMouseClicked
    }//GEN-LAST:event_PhieuNhapHangMouseClicked

    private void HoaDonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoaDonMousePressed
        BanHang.setBackground(DefaultColor);
        HoaDon.setBackground(ClickedColor);
        KhuyenMai.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        KhachHang.setBackground(DefaultColor);
        NhapHang.setBackground(DefaultColor);
        PhieuNhapHang.setBackground(DefaultColor);
        NhaCungCap1.setBackground(DefaultColor);
        TaiKhoan.setBackground(DefaultColor);
        
        main.removeAll();
        Bills bills = new Bills();
        main.add(bills);
        main.revalidate();
        main.repaint();
    }//GEN-LAST:event_HoaDonMousePressed

    private void PhieuNhapHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhieuNhapHangMousePressed
        BanHang.setBackground(DefaultColor);
        HoaDon.setBackground(DefaultColor);
        KhuyenMai.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        KhachHang.setBackground(DefaultColor);
        NhapHang.setBackground(DefaultColor);
        PhieuNhapHang.setBackground(ClickedColor);
        NhaCungCap1.setBackground(DefaultColor);
        TaiKhoan.setBackground(DefaultColor);
        
        
        
        main.removeAll();
        PhieuNhap pn = new PhieuNhap();
        main.add(pn);
        main.revalidate();
        main.repaint();
    }//GEN-LAST:event_PhieuNhapHangMousePressed

    private void TaiKhoanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TaiKhoanMousePressed
        BanHang.setBackground(DefaultColor);
        HoaDon.setBackground(DefaultColor);
        KhuyenMai.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        KhachHang.setBackground(DefaultColor);
        NhapHang.setBackground(DefaultColor);
        PhieuNhapHang.setBackground(DefaultColor);
        NhaCungCap1.setBackground(DefaultColor);
        TaiKhoan.setBackground(ClickedColor);
        
        main.removeAll();
        Account ac = new Account(userName);
        main.add(ac);
        main.revalidate();
        main.repaint();
    }//GEN-LAST:event_TaiKhoanMousePressed

    private void KhachHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KhachHangMousePressed
        BanHang.setBackground(DefaultColor);
        HoaDon.setBackground(DefaultColor);
        KhuyenMai.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        KhachHang.setBackground(ClickedColor);
        NhapHang.setBackground(DefaultColor);
        PhieuNhapHang.setBackground(DefaultColor);
        NhaCungCap1.setBackground(DefaultColor);
        TaiKhoan.setBackground(DefaultColor);
        
        main.removeAll();
        Customerform cus = new Customerform();
        main.add(cus);
        main.revalidate();
        main.repaint();
    }//GEN-LAST:event_KhachHangMousePressed

    private void KhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KhachHangMouseClicked
    }//GEN-LAST:event_KhachHangMouseClicked

    private void SanPhamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SanPhamKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_SanPhamKeyPressed

    private void SanPhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SanPhamMousePressed
        BanHang.setBackground(DefaultColor);
        HoaDon.setBackground(DefaultColor);
        KhuyenMai.setBackground(DefaultColor);
        SanPham.setBackground(ClickedColor);
        KhachHang.setBackground(DefaultColor);
        NhapHang.setBackground(DefaultColor);
        PhieuNhapHang.setBackground(DefaultColor);
        NhaCungCap1.setBackground(DefaultColor);
        TaiKhoan.setBackground(DefaultColor);
        
        
        main.removeAll();
        Product addnewproduct = new Product();
        main.add(addnewproduct);
        main.revalidate();
        main.repaint();
    }//GEN-LAST:event_SanPhamMousePressed

    private void NhapHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhapHangMousePressed
        BanHang.setBackground(DefaultColor);
        HoaDon.setBackground(DefaultColor);
        KhuyenMai.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        KhachHang.setBackground(DefaultColor);
        NhapHang.setBackground(ClickedColor);
        PhieuNhapHang.setBackground(DefaultColor);
        NhaCungCap1.setBackground(DefaultColor);
        TaiKhoan.setBackground(DefaultColor);
        
        
        main.removeAll();
        NhapHang nh = new NhapHang(userName);
        main.add(nh);
        main.revalidate();
        main.repaint();
    }//GEN-LAST:event_NhapHangMousePressed

    private void NhapHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhapHangMouseClicked
    }//GEN-LAST:event_NhapHangMouseClicked

    private void DangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangXuatMouseClicked
    }//GEN-LAST:event_DangXuatMouseClicked

    private void DangXuatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangXuatMousePressed
        int input = JOptionPane.showConfirmDialog(null,"Bạn muốn đăng xuất", "Cảnh báo!!!", JOptionPane.DEFAULT_OPTION);
        //yes=0 no=1
        if(input==0){
            System.exit(0);    
        }    }//GEN-LAST:event_DangXuatMousePressed

    private void NhaCungCap1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhaCungCap1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NhaCungCap1MouseClicked

    private void NhaCungCap1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhaCungCap1MousePressed
        BanHang.setBackground(DefaultColor);
        HoaDon.setBackground(DefaultColor);
        KhuyenMai.setBackground(DefaultColor);
        SanPham.setBackground(DefaultColor);
        KhachHang.setBackground(DefaultColor);
        NhapHang.setBackground(DefaultColor);
        PhieuNhapHang.setBackground(DefaultColor);
        NhaCungCap1.setBackground(ClickedColor);
        TaiKhoan.setBackground(DefaultColor);
        
        
        main.removeAll();
        Supplier ncc = new Supplier();
        main.add(ncc);
        main.revalidate();
        main.repaint();
    }//GEN-LAST:event_NhaCungCap1MousePressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(narbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(narbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(narbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(narbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModeStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BanHang;
    private javax.swing.JPanel DangXuat;
    private javax.swing.JPanel HoaDon;
    private javax.swing.JPanel KhachHang;
    private javax.swing.JPanel KhuyenMai;
    private javax.swing.JPanel NavbarMenu;
    private javax.swing.JPanel NhaCungCap1;
    private javax.swing.JPanel NhapHang;
    private javax.swing.JPanel PhieuNhapHang;
    private javax.swing.JPanel SanPham;
    private javax.swing.JPanel TaiKhoan;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel main;
    // End of variables declaration//GEN-END:variables
}
