import calculadora.Calculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Interface extends javax.swing.JFrame implements ActionListener {
    private Calculadora calculadora;

    public Interface() {
        setTitle("Calculadora");
        initComponents();
        addActionListenersToButtons();
        setLocationRelativeTo(null);
        setSize(416, 300);
        calculadora = new Calculadora();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.GridLayout(4, 0, 2, 2));

        jButton1.setText("7");
        jPanel3.add(jButton1);

        jButton2.setText("8");
        jPanel3.add(jButton2);

        jButton3.setText("9");
        jPanel3.add(jButton3);

        jButton4.setText("+");
        jPanel3.add(jButton4);

        jButton5.setText("4");
        jPanel3.add(jButton5);

        jButton6.setText("5");
        jPanel3.add(jButton6);

        jButton7.setText("6");
        jPanel3.add(jButton7);

        jButton8.setText("-");
        jPanel3.add(jButton8);

        jButton9.setText("1");
        jPanel3.add(jButton9);

        jButton10.setText("2");
        jPanel3.add(jButton10);

        jButton11.setText("3");
        jPanel3.add(jButton11);

        jButton12.setText("*");
        jPanel3.add(jButton12);

        jButton13.setText("0");
        jPanel3.add(jButton13);

        jButton14.setText("=");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton14);

        jButton15.setText("C");
        jPanel3.add(jButton15);

        jButton16.setText("/");
        jPanel3.add(jButton16);

        jTextField2.setEditable(false);
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        calculadora.calcular();
        jTextField2.setText(String.valueOf(calculadora.getResultado()));
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
 
    private void addActionListenersToButtons() {
        JButton[] buttons = {
            jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7,
            jButton8, jButton9, jButton10, jButton11, jButton12, jButton13,
            jButton14, jButton15, jButton16
        };

        for (JButton button : buttons) {
            button.addActionListener((ActionListener) this);
        }
    }
    
    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
    JButton source = (JButton) e.getSource();
    String buttonText = source.getText();
    
    if (buttonText.matches("[0-9]")) {
        jTextField2.setText(jTextField2.getText() + buttonText);
    } else if (buttonText.matches("[+\\-*/]")) {
        try {
            int numero = Integer.parseInt(jTextField2.getText());
            calculadora.setNumero1(numero);
            calculadora.setEstado(Calculadora.Estado.OPERADOR);
            calculadora.setOperador(buttonText);
            jTextField2.setText("");
        } catch (NumberFormatException ex) {
            
        }
    } else if (buttonText.equals("=")) {
        try {
            int numero = Integer.parseInt(jTextField2.getText());
            calculadora.setNumero2(numero);
            calculadora.igual();
            jTextField2.setText(String.valueOf(calculadora.getResultado()));
        } catch (NumberFormatException ex) {
            
        } catch (ArithmeticException ex) {
            
        }
    } else if (buttonText.equals("C")) {
        jTextField2.setText("");
        calculadora = new Calculadora();
    }
}


    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
        // Set the look and feel
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
    
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
