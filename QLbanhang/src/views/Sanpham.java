/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

/**
 *
 * @author hungh
 */
public class Sanpham extends javax.swing.JPanel {

    /**
     * Creates new form sanpham
     */
    public Sanpham() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGradiente1 = new swing.PanelGradiente();
        panelBorder1 = new swing.PanelBorder();
        myTextField1 = new swing.MyTextField();
        jLabel1 = new javax.swing.JLabel();
        myTextField2 = new swing.MyTextField();
        jLabel2 = new javax.swing.JLabel();
        myTextField3 = new swing.MyTextField();
        jLabel3 = new javax.swing.JLabel();
        myTextField4 = new swing.MyTextField();
        jLabel4 = new javax.swing.JLabel();
        myTextField5 = new swing.MyTextField();
        jLabel5 = new javax.swing.JLabel();
        myTextField6 = new swing.MyTextField();
        jLabel6 = new javax.swing.JLabel();
        myTextField7 = new swing.MyTextField();
        jLabel7 = new javax.swing.JLabel();
        myTextField8 = new swing.MyTextField();
        jLabel8 = new javax.swing.JLabel();
        panelBorder2 = new swing.PanelBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1010, 640));

        panelGradiente1.setColorPrimario(new java.awt.Color(204, 255, 255));
        panelGradiente1.setColorSecundario(new java.awt.Color(255, 204, 255));

        panelBorder1.setBackground(new java.awt.Color(204, 204, 255));
        panelBorder1.add(myTextField1);
        myTextField1.setBounds(40, 30, 210, 40);

        jLabel1.setText("Mã");
        panelBorder1.add(jLabel1);
        jLabel1.setBounds(40, 10, 210, 20);
        panelBorder1.add(myTextField2);
        myTextField2.setBounds(40, 100, 210, 40);

        jLabel2.setText("Mã");
        panelBorder1.add(jLabel2);
        jLabel2.setBounds(40, 80, 210, 20);
        panelBorder1.add(myTextField3);
        myTextField3.setBounds(40, 170, 210, 40);

        jLabel3.setText("Mã");
        panelBorder1.add(jLabel3);
        jLabel3.setBounds(40, 150, 210, 20);
        panelBorder1.add(myTextField4);
        myTextField4.setBounds(40, 240, 210, 40);

        jLabel4.setText("Mã");
        panelBorder1.add(jLabel4);
        jLabel4.setBounds(40, 220, 210, 20);
        panelBorder1.add(myTextField5);
        myTextField5.setBounds(290, 30, 210, 40);

        jLabel5.setText("Mã");
        panelBorder1.add(jLabel5);
        jLabel5.setBounds(290, 10, 210, 20);
        panelBorder1.add(myTextField6);
        myTextField6.setBounds(290, 100, 210, 40);

        jLabel6.setText("Mã");
        panelBorder1.add(jLabel6);
        jLabel6.setBounds(290, 80, 210, 20);
        panelBorder1.add(myTextField7);
        myTextField7.setBounds(290, 170, 210, 40);

        jLabel7.setText("Mã");
        panelBorder1.add(jLabel7);
        jLabel7.setBounds(290, 150, 210, 20);
        panelBorder1.add(myTextField8);
        myTextField8.setBounds(290, 240, 210, 40);

        jLabel8.setText("Mã");
        panelBorder1.add(jLabel8);
        jLabel8.setBounds(290, 220, 210, 20);

        panelGradiente1.add(panelBorder1);
        panelBorder1.setBounds(8, 0, 990, 300);

        panelBorder2.setBackground(new java.awt.Color(204, 204, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        panelBorder2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 30, 990, 240);

        panelGradiente1.add(panelBorder2);
        panelBorder2.setBounds(10, 309, 990, 270);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private swing.MyTextField myTextField1;
    private swing.MyTextField myTextField2;
    private swing.MyTextField myTextField3;
    private swing.MyTextField myTextField4;
    private swing.MyTextField myTextField5;
    private swing.MyTextField myTextField6;
    private swing.MyTextField myTextField7;
    private swing.MyTextField myTextField8;
    private swing.PanelBorder panelBorder1;
    private swing.PanelBorder panelBorder2;
    private swing.PanelGradiente panelGradiente1;
    // End of variables declaration//GEN-END:variables
}
