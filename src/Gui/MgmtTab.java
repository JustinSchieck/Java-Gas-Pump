/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MgmtTab extends JFrame {

    //Enter gas price textbox
    private JTextField textField;
    //radiobuttons
    private JRadioButton regularRadio, plusRadio, supremeRadio;
    //buttongroup to host the radiobuttons
    private ButtonGroup radioGroup;
    //set and cancel buttons
    private JButton setButton, cancelButton;
    //panels for layout
    private JPanel pnlMain, pnlNorth, pnlNorthUpper, pnlNorthLower, pnlSouth;

    public MgmtTab() {
        super("Pump Management");

        // TextBox field
        textField = new JTextField(15);
        textField.setFont(new Font("Arial", Font.PLAIN, 12));
        add(textField);

        //create radio buttons (JRadio)
        regularRadio = new JRadioButton("Regular", true);
        plusRadio = new JRadioButton("Plus", false);
        supremeRadio = new JRadioButton("Supreme", false);
        add(regularRadio);
        add(plusRadio);
        add(supremeRadio);

        //create button group and add radios- if you do not have radiogroups,
        //they will act as permanently selected checkboxes
        radioGroup = new ButtonGroup();
        radioGroup.add(regularRadio);
        radioGroup.add(plusRadio);
        radioGroup.add(supremeRadio);

        setButton = new JButton("Set");
        cancelButton = new JButton("Cancel");

        add(setButton);
        add(cancelButton);

        //register listeners for JRadioButtons
//        SelectionHandler handler = new SelectionHandler();
//        regularRadio.addItemListener(handler);
//        plusRadio.addItemListener(handler);
//        supremeRadio.addItemListener(handler);
//        
        //create the Main panel
        pnlMain = new JPanel();
        pnlMain.setLayout(new BorderLayout());
        pnlMain.setBorder(BorderFactory.createRaisedBevelBorder());

        //create the Main panel
        pnlNorth = new JPanel();
        pnlNorth.setLayout(new BorderLayout());
        pnlNorth.setBorder(BorderFactory.createRaisedBevelBorder());

        //create the north upper panel
        pnlNorthUpper = new JPanel();
        pnlNorthUpper.setLayout(new FlowLayout());
        pnlNorthUpper.setBorder(BorderFactory.createRaisedBevelBorder());
        pnlNorthUpper.add(textField);
        pnlNorth.add(pnlNorthUpper, BorderLayout.NORTH);

        //create the north lower panel
        pnlNorthLower = new JPanel();
        pnlNorthLower.setLayout(new FlowLayout());
        pnlNorthLower.setBorder(BorderFactory.createRaisedBevelBorder());
        pnlNorthLower.add(regularRadio);
        pnlNorthLower.add(plusRadio);
        pnlNorthLower.add(supremeRadio);
        pnlNorth.add(pnlNorthLower, BorderLayout.SOUTH);

        //create the south lower panel
        pnlSouth = new JPanel();
        pnlSouth.setLayout(new FlowLayout());
        pnlSouth.setBorder(BorderFactory.createRaisedBevelBorder());
        pnlSouth.add(setButton);
        pnlSouth.add(cancelButton);
        pnlMain.add(pnlSouth, BorderLayout.SOUTH);

        //add to frame region
        add(pnlNorth, BorderLayout.NORTH);
        add(pnlSouth, BorderLayout.SOUTH);

        pack();

        setVisible(true);

        cancelButton.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (JOptionPane.showConfirmDialog(
                        null,
                        "Are you sure you want to exit?",
                        "Exit?",
                        JOptionPane.YES_NO_OPTION) == 0) {
                    System.exit(0);
                }

            }
        }
        );//end btn listener

        setButton.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (setButton.isSelected()){
                        JOptionPane.showMessageDialog(null ,"New Gas Price has Been Set");
                    }
            } 
        }
        );//end btn listener
    }

//    private class SelectionHandler implements ItemListener
//    {
//        // respond to checkbox events
//        @Override
//        public void itemStateChanged(ItemEvent event)
//        {
//        Font font = null; // stores the new Font
//        
//        if ( regularRadio.isSelected())
//            //set regular gas to...
//        else if ( plusRadio.isSelected())
//            //set plus gas to...
//        else if ( supremeRadio.isSelected())
//            //set supreme price to...
//       
//        //textField.setFont(font);
//        }
//    
//    }
    public static void main(String[] args) {
        new MgmtTab();
    }
}
