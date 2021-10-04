package Controller;

import View.purchaseTickets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author hayde
 */
public class purchaseTicketsController implements ActionListener {//this will control the purchase gui
    private purchaseTickets purchaseTix;
    private viewTicketsController viewTix;

    public static void main(String[] args){
        viewTicketsController viewTicketsCntrl = new viewTicketsController();
        
    }

    /**
     * getter for purchased tickets
     * @return (gets purchased tickets)
     */
    public purchaseTickets getPurchaseTix() {
        return purchaseTix;
    }

    /**
     * setter for purchase tickets
     * @param purchaseTix sets variable of purchase tickets type
     */
    public void setPurchaseTix(purchaseTickets purchaseTix) {
        this.purchaseTix = purchaseTix;
    }

    /**
     * getter for view tickets controller
     * @return (gets an instance of the view tickets controller)
     */
    public viewTicketsController getViewTix() {
        return viewTix;
    }

    /**
     * setter for view tickets
     * @param viewTix sets variable of viewTicketsController type
     */
    public void setViewTix(viewTicketsController viewTix) {
        this.viewTix = viewTix;
    }
    
    /**
     * create the purchase tickets gui
     */
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
