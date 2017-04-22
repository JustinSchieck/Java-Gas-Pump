/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

/**
 *
 * @author Justin
 */
public class PumpGui extends JFrame{
    
    private JPanel pnlTop, pnlCenter, pnlSouth, pnlGlobalTop, pnlGlobalCenter, pnlGlobalSouth, pnlFirstTab, pnlSecondTab;
    
    //Gas Liter Label
    private JLabel literThousand, literHundred, literTen, literOne;
    
    private JButton startBtn, stopBtn, finishBtn;
    private JRadioButton rdRegular, rdPlus, rdSupreme;
    private ButtonGroup radioGroup;
    
    
    
    private JLabel  saleHundredlbl, saleTenlbl, saleOnelbl, saleTenthlbl, saleHundredthlbl;
       
    private JTabbedPane tabPaneOne, tabPaneTwo;
    private JLabel lblFirstTab = new JLabel("First Tab");
    
    
    public PumpGui(){
        super("Pump GUI");
        setLayout(new BorderLayout());
        
        tabPaneOne = new JTabbedPane();
       // tabPaneTwo = new JTabbedPane();
        tabPaneOne.addTab("Pump", null, createLaunchTab() ,"My First Tab");
       //tabPaneTwo.addTab("Global", null, createGlobalTab(), "My Second Tab");
        

        
        add(tabPaneOne, BorderLayout.CENTER);
       // add(tabPaneTwo, BorderLayout.CENTER);
        
        setSize(500,500);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        
    }
    
    private JPanel createLaunchTab(){
        pnlFirstTab = new JPanel(new BorderLayout());
        
        
        saleHundredlbl = new JLabel("0");
        saleHundredlbl.setHorizontalAlignment(SwingConstants.CENTER);
        saleHundredlbl.setFont(new Font("Arial",Font.BOLD,34));
        saleTenlbl = new JLabel("0");
        saleTenlbl.setHorizontalAlignment(SwingConstants.CENTER);
        saleTenlbl.setFont(new Font("Arial",Font.BOLD,34));
        saleOnelbl = new JLabel("0");
        saleOnelbl.setHorizontalAlignment(SwingConstants.CENTER);
        saleOnelbl.setFont(new Font("Arial",Font.BOLD,34));
        saleTenthlbl = new JLabel("0");
        saleTenthlbl.setHorizontalAlignment(SwingConstants.CENTER);
        saleTenthlbl.setFont(new Font("Arial",Font.BOLD,20));
        saleHundredthlbl = new JLabel("0");
        saleHundredthlbl.setHorizontalAlignment(SwingConstants.CENTER);
        saleHundredthlbl.setFont(new Font("Arial",Font.BOLD,20));


        radioGroup = new ButtonGroup();
        rdRegular = new JRadioButton("Regular");
        rdPlus = new JRadioButton("Plus");
        rdSupreme = new JRadioButton("Supreme");
        radioGroup.add(rdRegular);
        radioGroup.add(rdPlus);
        radioGroup.add(rdSupreme);
        
        
        startBtn = new JButton("Start");
        stopBtn = new JButton("Stop");
        finishBtn = new JButton("Complete Sale");
        
        //Top Items
        pnlTop = new JPanel();
        pnlTop.setLayout(new GridLayout(1,5));
        pnlTop.setBorder(BorderFactory.createRaisedBevelBorder());
        pnlTop.add(saleHundredlbl);
        pnlTop.add(saleTenlbl);
        pnlTop.add(saleOnelbl);
        pnlTop.add(saleTenthlbl);
        pnlTop.add(saleHundredthlbl);
        
        //Middle Panel
        pnlCenter = new JPanel();
        pnlCenter.setLayout(new FlowLayout());
        pnlCenter.add(rdRegular);
        pnlCenter.add(rdPlus);
        pnlCenter.add(rdSupreme);
        pnlCenter.setBorder(BorderFactory.createRaisedBevelBorder());

        //Bottom Panel
        pnlSouth = new JPanel();
        pnlSouth.setLayout(new FlowLayout());
        pnlSouth.add(startBtn);
        pnlSouth.add(stopBtn);
        pnlSouth.add(finishBtn);
        
        
        
    rdRegular.addItemListener(
      new ItemListener(){
      @Override
      public void itemStateChanged(ItemEvent event){
        if(rdRegular.isSelected())
        {
         saleHundredlbl.setText("1");
         saleTenlbl.setText("1");
         saleOnelbl.setText("0");
         saleTenthlbl.setText("9");
         saleHundredthlbl.setText("9");
        }
      }
      }
    );
            
      rdPlus.addItemListener(
      new ItemListener(){
      @Override
      public void itemStateChanged(ItemEvent event){    
        if(rdPlus.isSelected()) 
        {
         saleHundredlbl.setText("1");
         saleTenlbl.setText("2");
         saleOnelbl.setText("1");
         saleTenthlbl.setText("9");
         saleHundredthlbl.setText("9");
        } 
      }
      });
        rdSupreme.addItemListener(
        new ItemListener(){
        @Override
        public void itemStateChanged(ItemEvent event){
        if(rdSupreme.isSelected())
         {
         saleHundredlbl.setText("1");
         saleTenlbl.setText("3");
         saleOnelbl.setText("2");
         saleTenthlbl.setText("9");
         saleHundredthlbl.setText("9");
         }
        }
       }
    );
        
        
             
        
        
        //add panels to tabs
        pnlFirstTab.add(pnlTop, BorderLayout.NORTH);
        pnlFirstTab.add(pnlCenter, BorderLayout.CENTER);
        pnlFirstTab.add(pnlSouth, BorderLayout.SOUTH);
        
        
        return pnlFirstTab;
        
    }
    
//    private JPanel createGlobalTab(){
//        pnlSecondTab = new JPanel(new BorderLayout());
//        
//        
//        literThousand = new JLabel("1");
//        literThousand.setHorizontalAlignment(SwingConstants.CENTER);
//        literThousand.setFont(new Font("Arial",Font.BOLD,34));
//        literHundred = new JLabel("0");
//        literHundred.setHorizontalAlignment(SwingConstants.CENTER);
//        literHundred.setFont(new Font("Arial",Font.BOLD,34));
//        literTen = new JLabel("0");
//        literTen.setHorizontalAlignment(SwingConstants.CENTER);
//        literTen.setFont(new Font("Arial",Font.BOLD,34));
//        literOne = new JLabel("0");
//        literOne.setHorizontalAlignment(SwingConstants.CENTER);
//        literOne.setFont(new Font("Arial",Font.BOLD,34));
//        
//        pnlGlobalTop = new JPanel();
//        pnlGlobalTop.setLayout(new GridLayout(1,5));
//        pnlGlobalTop.setBorder(BorderFactory.createRaisedBevelBorder());
//        pnlGlobalTop.add(literThousand);
//        pnlGlobalTop.add(literHundred);
//        pnlGlobalTop.add(literTen);
//        pnlGlobalTop.add(literOne);
//       
//        pnlSecondTab.add(pnlTop, BorderLayout.NORTH);
//        
//        return pnlSecondTab;
//    }
    
    



    public static void main(String[]args){
            new PumpGui();
            


    }
    
}

