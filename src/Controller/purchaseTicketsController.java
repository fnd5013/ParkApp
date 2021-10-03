/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.purchaseTickets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author hayde
 */
public class purchaseTicketsController implements ActionListener {
    private purchaseTickets purchaseTix;
    private viewTicketsController viewTix;

     public static void main(String[] args){
        viewTicketsController viewTicketsCntrl = new viewTicketsController();
        
    }

    public purchaseTickets getPurchaseTix() {
        return purchaseTix;
    }

    public void setPurchaseTix(purchaseTickets purchaseTix) {
        this.purchaseTix = purchaseTix;
    }

    public viewTicketsController getViewTix() {
        return viewTix;
    }

    public void setViewTix(viewTicketsController viewTix) {
        this.viewTix = viewTix;
    }
    
    public purchaseTicketsController() {
        purchaseTix.myTicketsBuy.addActionListener(this);
        purchaseTix.setVisible(true);
        
    }
    
    

    /**
     * @param args the command line arguments
     */
    @Override
    public void actionPerformed(ActionEvent e){
        
        
    }

}
