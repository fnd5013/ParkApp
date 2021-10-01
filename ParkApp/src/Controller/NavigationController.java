package Controller;

import View.NavigationUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author bpardee
 */
public class NavigationController implements ActionListener {
    private NavigationUI navigationUI;
    private RestaurantController restCntrl;
    
    /**
     * Constructor for the Navigation Controller
     * used to instantiate aspects of the controller
     */
    public NavigationController() {
        navigationUI = new NavigationUI(this);
        navigationUI.restaurantBtn.addActionListener(this);
        navigationUI.setVisible(true);
    }
    
    /**
     * Action events for buttons
     * @param e represents an Action Event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == navigationUI.restaurantBtn)
        {
            restCntrl = new RestaurantController(this);
            navigationUI.setVisible(false);
        }
    }
    
}
