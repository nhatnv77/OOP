/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenvannhat;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author hocvien
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        tb_1.setVisible(false);
        tb_2.setVisible(false);
        tb_4.setVisible(false);
        tb_3.setVisible(false);
        tb_6.setVisible(false);
        tb_5.setVisible(false);
        tb_7.setVisible(false);
        tb_9.setVisible(false);
        tb_8.setVisible(false);
        loadCBSach();
        loadCBTG();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_MaSach = new javax.swing.JTextField();
        txt_TenSach = new javax.swing.JTextField();
        txt_HinhAnh = new javax.swing.JTextField();
        txt_Tien = new javax.swing.JTextField();
        txt_SL = new javax.swing.JTextField();
        txt_NXB = new javax.swing.JTextField();
        txt_KichThuoc = new javax.swing.JTextField();
        txt_SoTrang = new javax.swing.JTextField();
        txt_SKU = new javax.swing.JTextField();
        btn_Them = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_MoTa = new javax.swing.JTextArea();
        cb_TacGia = new javax.swing.JComboBox<>();
        cb_LoaiSach = new javax.swing.JComboBox<>();
        tb_1 = new javax.swing.JLabel();
        tb_2 = new javax.swing.JLabel();
        tb_4 = new javax.swing.JLabel();
        tb_3 = new javax.swing.JLabel();
        tb_6 = new javax.swing.JLabel();
        tb_5 = new javax.swing.JLabel();
        tb_7 = new javax.swing.JLabel();
        tb_9 = new javax.swing.JLabel();
        tb_8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("QUAN LY SACH");

        jLabel3.setText("Mã sách");

        jLabel4.setText("Tên sách");

        jLabel5.setText("Tác giả");

        jLabel6.setText("Loại sách");

        jLabel7.setText("Đường dẫn hình ảnh");

        jLabel8.setText("Giá tiền");

        jLabel9.setText("Số lượng");

        jLabel10.setText("Ngày xuất bản");

        jLabel11.setText("Kích thước");

        jLabel12.setText("Số trang");

        jLabel13.setText("SKU");

        jLabel14.setText("Mô tả");

        txt_Tien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_TienKeyTyped(evt);
            }
        });

        txt_SL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_SLKeyTyped(evt);
            }
        });

        txt_SoTrang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_SoTrangKeyTyped(evt);
            }
        });

        btn_Them.setText("Thêm");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_Xoa.setText("Xoá");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        btn_Sua.setText("Sửa");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        txt_MoTa.setColumns(20);
        txt_MoTa.setRows(5);
        jScrollPane1.setViewportView(txt_MoTa);

        cb_TacGia.setEditable(true);

        cb_LoaiSach.setEditable(true);

        tb_1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tb_1.setForeground(java.awt.Color.red);
        tb_1.setText("!");

        tb_2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tb_2.setForeground(java.awt.Color.red);
        tb_2.setText("!");

        tb_4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tb_4.setForeground(java.awt.Color.red);
        tb_4.setText("!");

        tb_3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tb_3.setForeground(java.awt.Color.red);
        tb_3.setText("!");

        tb_6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tb_6.setForeground(java.awt.Color.red);
        tb_6.setText("!");

        tb_5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tb_5.setForeground(java.awt.Color.red);
        tb_5.setText("!");

        tb_7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tb_7.setForeground(java.awt.Color.red);
        tb_7.setText("!");

        tb_9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tb_9.setForeground(java.awt.Color.red);
        tb_9.setText("!");

        tb_8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tb_8.setForeground(java.awt.Color.red);
        tb_8.setText("!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_TenSach)
                            .addComponent(txt_MaSach)
                            .addComponent(cb_TacGia, 0, 252, Short.MAX_VALUE)
                            .addComponent(cb_LoaiSach, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tb_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tb_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tb_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tb_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_SoTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_KichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_NXB, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_SL, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_Tien, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_HinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_SKU)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tb_5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(tb_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tb_7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tb_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tb_9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(151, 151, 151))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_MaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb_1))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_TenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cb_TacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cb_LoaiSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tb_3)
                        .addGap(3, 3, 3)
                        .addComponent(tb_4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_HinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_Tien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tb_5)
                        .addGap(3, 3, 3)
                        .addComponent(tb_6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_SL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb_7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_NXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_KichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_SoTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txt_SKU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_Them)
                                    .addComponent(btn_Xoa)
                                    .addComponent(btn_Sua)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 47, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tb_8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tb_9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void checkTenTG(String s) {
        Connection kn = KNCSDL.layKetNoi();
        String sql = "select * from tacgia where tentacgia=N'" + s + "'";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return;
            }
            String sql1 = "insert into tacgia values (?,?)";
            try {
                PreparedStatement ps1 = kn.prepareStatement(sql1);
                ps1.setString(1, "TG" + cb_TacGia.getItemCount());
                ps1.setString(2, s);
                ps1.executeUpdate();
            } catch (Exception e) {
                System.out.println("Loi checkTg");
            }
        } catch (Exception e) {
            System.out.println("Loi checkTg");
        }
    }

    String checkDate(String d) {
        String pattern = "(0?[1-9]|[1-2]\\d|3[0-1])/(0?[1-9]|1[1-2])/(19|20)\\d{2}";
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat f1 = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        if (!d.matches(pattern)) {
            return "1";
        } else {
            f.setLenient(false);
            try {
                date = f.parse(d);
                return f1.format(date);
            } catch (ParseException e) {
                System.out.println("Error fDate!");
                JOptionPane.showMessageDialog(this, "Date not valid");
            }
            return "1";
        }

    }

    void checkLoaiSach(String s) {
        Connection kn = KNCSDL.layKetNoi();
        String sql = "select * from loaisach where LOAISACH=N'" + s + "'";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return;
            }
            String sql1 = "insert into loaisach values (?,?)";
            try {
                PreparedStatement ps1 = kn.prepareStatement(sql1);
                ps1.setString(1, "LS" + cb_LoaiSach.getItemCount());
                ps1.setString(2, s);
                ps1.executeUpdate();
            } catch (Exception e) {
                System.out.println("Loi checkLoaiSach");
            }
        } catch (Exception e) {
            System.out.println("Loi checkLoaiSach");
        }
    }

    String layMaTG(String s) {
        Connection kn = KNCSDL.layKetNoi();
        String sql = "select MATACGIA from tacgia where tentacgia=N'" + s + "'";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println("Loi laymaTG");
        }
        return "";
    }

    String layMaLoaiSach(String s) {
        Connection kn = KNCSDL.layKetNoi();
        String sql = "select maloaisach from loaisach where LOAISACH=N'" + s + "'";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println("Loi layMaLoaiSach");
        }
        return "";
    }

    boolean checkSKU(String s) {
        String pattern = "\\d{13}";
        if (s.matches(pattern)) {
            return true;
        }
        return false;
    }
//    String checkDate(String d){
//        String pattern="(0?[1-9]|[1-2]\\d|3[0-1])/(0?[1-9]|1[1-2])/(19|20)\\d{2}";
//        SimpleDateFormat f= new SimpleDateFormat("dd/MM/yyyy");
//        SimpleDateFormat f1= new SimpleDateFormat("yyyy/MM/dd");
////        Date date = new Date();
//        return "1";
//    }

    boolean checkFill() {
        int dem = 0;
        if (txt_MaSach.getText().equals("")) {
            tb_1.setVisible(true);
        } else {
            dem++;
            tb_1.setVisible(false);
        }
        if (txt_TenSach.getText().equals("")) {
            tb_2.setVisible(true);
        } else {
            dem++;
            tb_2.setVisible(false);
        }
        if ((cb_TacGia.getSelectedItem().toString()).equals("")) {
            tb_3.setVisible(true);
        } else {
            dem++;
            tb_3.setVisible(false);
        }
        if ((cb_LoaiSach.getSelectedItem().toString()).equals("")) {
            tb_4.setVisible(true);
        } else {
            dem++;
            tb_4.setVisible(false);
        }
        if (txt_HinhAnh.getText().equals("")) {
            tb_5.setVisible(true);
        } else {
            dem++;
            tb_5.setVisible(false);
        }
        if (txt_Tien.getText().equals("")) {
            tb_6.setVisible(true);
        } else {
            dem++;
            tb_6.setVisible(false);
        }
        if (txt_SL.getText().equals("")) {
            tb_7.setVisible(true);
        } else {
            dem++;
            tb_7.setVisible(false);
        }
        if (txt_SKU.getText().equals("") || !checkSKU(txt_SKU.getText())) {
            tb_8.setVisible(true);
        } else {
            dem++;
            tb_8.setVisible(false);
        }
        if (!txt_NXB.getText().equals("")&&"1".equals(checkDate(txt_NXB.getText()))) {
            JOptionPane.showMessageDialog(this, "Loi ngay");
        } else {
            dem++;
        }
        if (txt_MoTa.getText().equals("")) {
            tb_9.setVisible(true);
        } else {
            dem++;
            tb_9.setVisible(false);
        }
        if (dem == 10) {
            return true;
        } else {
            return false;
        }
    }

    void loadCBTG() {
        Connection kn = KNCSDL.layKetNoi();
        String sql = "select tentacgia from tacgia";
        cb_TacGia.removeAllItems();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cb_TacGia.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            System.out.println("Loi LoadCBTG");
        }
    }

    void loadCBSach() {
        Connection kn = KNCSDL.layKetNoi();
        String sql = "select loaisach from loaisach";
        cb_TacGia.removeAllItems();
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cb_LoaiSach.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            System.out.println("Loi LoadCBSach");
        }
    }
    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        // TODO add your handling code here:
        checkLoaiSach(cb_LoaiSach.getSelectedItem().toString());
        checkTenTG(cb_TacGia.getSelectedItem().toString());
        if (checkSach(txt_MaSach.getText())) {
            JOptionPane.showMessageDialog(this, "Mã sách đã tồn tại!");
        } else if (checkFill()) {
            Connection kn = KNCSDL.layKetNoi();
            String sql = "insert into sach values (?,?,?,?,?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement ps = kn.prepareStatement(sql);
                ps.setString(1, txt_MaSach.getText());
                ps.setString(2, txt_TenSach.getText());
                ps.setString(3, layMaTG(cb_TacGia.getSelectedItem().toString()));
                ps.setString(4, layMaLoaiSach(cb_LoaiSach.getSelectedItem().toString()));
                ps.setString(5, txt_HinhAnh.getText());
                ps.setString(6, txt_Tien.getText());
                ps.setString(7, txt_SL.getText());
                ps.setString(8, checkDate(txt_NXB.getText()));
                ps.setString(9, txt_KichThuoc.getText());
                ps.setString(10, txt_SoTrang.getText());
                ps.setString(11, txt_SKU.getText());
                ps.setString(12, txt_MoTa.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Thêm thành công!");
            } catch (Exception e) {
//                if (e.getMessage().indexOf("SACH_TENSACH_U") != -1) {
//                    JOptionPane.showMessageDialog(this, "Trung ten sach!");
//                }
            }
        }
    }//GEN-LAST:event_btn_ThemActionPerformed
    boolean checkSach(String s) {
        Connection kn = KNCSDL.layKetNoi();
        String sql = "select * from sach where masach='" + s + "'";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("Loi checkSach");
        }
        return false;
    }
    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        // TODO add your handling code here:
        Connection kn = KNCSDL.layKetNoi();
        if (!checkSach(txt_MaSach.getText())) {
            JOptionPane.showMessageDialog(this, "Mã sách không tồn tại!");
        } else {
            String sql = "delete from sach where masach='" + txt_MaSach.getText() + "'";
            try {
                PreparedStatement ps = kn.prepareStatement(sql);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Xoá sách thành công!");
            } catch (Exception e) {
                System.out.println("Loi xoa sach!");
            }
        }

    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        // TODO add your handling code here:
        Connection kn = KNCSDL.layKetNoi();
        if (!checkSach(txt_MaSach.getText())) {
            JOptionPane.showMessageDialog(this, "Sách này chưa có vui lòng thêm thay vì sửa!");
        } else {
            String sql = "update sach set TENSACH=?,MATACGIA=?,MALOAISACH=?,HINHANH=?,GIATIEN=?,SOLUONG=?,NGAYXUATBAN=?,KICHTHUOC=?,SOTRANG=?,SKU=?,MOTA=? where masach='" + txt_MaSach.getText() + "'";
            try {
                PreparedStatement ps = kn.prepareStatement(sql);
                ps.setString(1, txt_TenSach.getText());
                ps.setString(2, layMaTG(cb_TacGia.getSelectedItem().toString()));
                ps.setString(3, layMaLoaiSach(cb_LoaiSach.getSelectedItem().toString()));
                ps.setString(4, txt_HinhAnh.getText());
                ps.setString(5, txt_Tien.getText());
                ps.setString(6, txt_SL.getText());
                ps.setString(7, checkDate(txt_NXB.getText()));
                ps.setString(8, txt_KichThuoc.getText());
                ps.setString(9, txt_SoTrang.getText());
                ps.setString(10, txt_SKU.getText());
                ps.setString(11, txt_MoTa.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Sua sách thành công!");
            } catch (Exception e) {
                System.out.println("Loi sua sach");
            }

        }
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void txt_SLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SLKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_SLKeyTyped

    private void txt_TienKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TienKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_TienKeyTyped

    private void txt_SoTrangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SoTrangKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_SoTrangKeyTyped

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JComboBox<String> cb_LoaiSach;
    private javax.swing.JComboBox<String> cb_TacGia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel tb_1;
    private javax.swing.JLabel tb_2;
    private javax.swing.JLabel tb_3;
    private javax.swing.JLabel tb_4;
    private javax.swing.JLabel tb_5;
    private javax.swing.JLabel tb_6;
    private javax.swing.JLabel tb_7;
    private javax.swing.JLabel tb_8;
    private javax.swing.JLabel tb_9;
    private javax.swing.JTextField txt_HinhAnh;
    private javax.swing.JTextField txt_KichThuoc;
    private javax.swing.JTextField txt_MaSach;
    private javax.swing.JTextArea txt_MoTa;
    private javax.swing.JTextField txt_NXB;
    private javax.swing.JTextField txt_SKU;
    private javax.swing.JTextField txt_SL;
    private javax.swing.JTextField txt_SoTrang;
    private javax.swing.JTextField txt_TenSach;
    private javax.swing.JTextField txt_Tien;
    // End of variables declaration//GEN-END:variables
}
