/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author tss
 */
public class MainWin extends JFrame implements MouseListener {

    private JButton btnPlus;
    private JButton btnMinus;
    private JLabel result;
    private JPanel pMain;
    private final Container cp;

    public MainWin(String title) throws HeadlessException {
        super(title);

        this.cp = this.getContentPane();

        this.createGUI();

        this.createListeners();
        
        this.setSize(500, 300);
        this.setLocation(200, 200);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    private void createGUI() {
        this.pMain = new JPanel();
        this.btnPlus = new JButton("+");
        this.btnMinus = new JButton("-");
        this.result = new JLabel("0");
        this.pMain.add(this.btnPlus);
        this.pMain.add(this.btnMinus);
        this.pMain.add(this.result);
        this.cp.add(this.pMain);
    }

    private void createListeners() {
        this.btnPlus.addActionListener(this::onIncrementa);
        this.btnMinus.addActionListener(this::onDecrementa);
        this.btnPlus.addMouseListener(this);
        this.btnMinus.addMouseListener(this);
    }

    /*
    click bottone incrementa
    */
    private void onIncrementa(ActionEvent e) {
        this.result.setText(String.valueOf(Integer.parseInt(result.getText()) + 1));
    }

    /*
    click bottone decrementa
    */
    public void onDecrementa(ActionEvent e) {
        this.result.setText(String.valueOf(Integer.parseInt(result.getText()) - 1));
    }

    /*
        Mouse Listener
    */
    @Override
    public void mouseClicked(MouseEvent me) {}

    @Override
    public void mousePressed(MouseEvent me) {}

    @Override
    public void mouseReleased(MouseEvent me) {}

    @Override
    public void mouseEntered(MouseEvent me) {
        if (me.getSource().equals(this.btnPlus)) {
            this.btnPlus.setBackground(Color.GREEN);
        } else if (me.getSource().equals(this.btnMinus)) {
            this.btnMinus.setBackground(Color.GREEN);
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        if (me.getSource().equals(this.btnPlus)) {
            this.btnPlus.setBackground(null);
        } else if (me.getSource().equals(this.btnMinus)) {
            this.btnMinus.setBackground(null);
        }
    }

}
