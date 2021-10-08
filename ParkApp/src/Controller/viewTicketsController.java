package Controller;

import Controller.loginPageController;
import Controller.purchaseTicketsController;
import Controller.viewTicketsController;
import View.viewTickets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author hayde
 */
public class viewTicketsController implements ActionListener{//will grab tickets based on a verified user and control from here
    private NavigationController navCntrl;
    private purchaseTicketsController purchaseTicketsCntrl;
    private viewTickets viewTicketsUI;
    
    public viewTicketsController(NavigationController navCntrl, purchaseTicketsController purchaseTicketsCntrl) {
        this.navCntrl = navCntrl;
        this.purchaseTicketsCntrl = purchaseTicketsCntrl;
        viewTicketsUI = new viewTickets();
        viewTicketsUI.printTicketsButton.addActionListener(this);
        viewTicketsUI.purchaseTicketsButton.addActionListener(this);
        viewTicketsUI.setVisible(true);
    }
    
    /**
     * Action Events for buttons
     * @param e representing an Action Event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == viewTicketsUI.purchaseTicketsButton)
        {
            purchaseTicketsCntrl = new purchaseTicketsController(navCntrl);
            viewTicketsUI.setVisible(false);
        }
        if(obj == viewTicketsUI.printTicketsButton)
        {
            navCntrl = new NavigationController();
            viewTicketsUI.setVisible(false);
        }
    }
    
}
