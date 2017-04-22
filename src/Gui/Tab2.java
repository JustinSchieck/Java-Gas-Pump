/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;
import javax.swing.*;
import java.awt.*;
 
/**
 *
 * @author scot-
 */
public class Tab2 extends JFrame{
    private JLabel lblThousand, lblHundred, lblTen, lblOne;
    private JRadioButton btnRegular, btnPlus, btnSupreme;
   
    private JPanel pnlMain,pnlLabels, pnlButtons;
   
    private ButtonGroup radioGroup;
   
   
    public Tab2(){
        super("tab2");
        setLayout(new BorderLayout());
        setSize(500, 500);
       
        lblThousand = new JLabel("1");
        lblThousand.setFont(new Font("Arial", Font.BOLD, 48));
       
        lblHundred = new JLabel("0");
        lblHundred.setFont(new Font("Arial", Font.BOLD, 48));
       
        lblOne = new JLabel("0");
        lblOne.setFont(new Font("Arial", Font.BOLD, 48));
       
        lblTen = new JLabel("0");
        lblTen.setFont(new Font("Arial", Font.BOLD, 48));
       
       
        btnRegular = new JRadioButton("Regular");
        btnPlus = new JRadioButton("Plus");
        btnSupreme = new JRadioButton("Supreme");
       
        radioGroup = new ButtonGroup();
        radioGroup.add(btnRegular);
        radioGroup.add(btnPlus);
        radioGroup.add(btnSupreme);
       
        pnlMain = new JPanel();
        pnlMain.setBorder(BorderFactory.createRaisedBevelBorder());
        pnlMain.setLayout(new BorderLayout());
       
        pnlLabels = new JPanel();
        pnlLabels.add(lblThousand);
        pnlLabels.add(lblHundred);
        pnlLabels.add(lblTen);
        pnlLabels.add(lblOne);
        pnlLabels.setBorder(BorderFactory.createRaisedBevelBorder());
        pnlMain.add(pnlLabels,BorderLayout.NORTH);
       
        pnlButtons = new JPanel();
        pnlButtons.add(btnRegular);
        pnlButtons.add(btnPlus);
        pnlButtons.add(btnSupreme);
        pnlButtons.setBorder(BorderFactory.createRaisedBevelBorder());
        pnlMain.add(pnlButtons,BorderLayout.SOUTH);
       
        add(pnlLabels,BorderLayout.NORTH);
        add(pnlButtons,BorderLayout.SOUTH);
       
        pack();
         
        setVisible(true);
    }
 
    public static void main(String[] args) {
        new Tab2();
    }
   
}

