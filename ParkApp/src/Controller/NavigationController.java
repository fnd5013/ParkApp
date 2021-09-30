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
    
    public NavigationController() {
        navigationUI = new NavigationUI(this);
        navigationUI.restaurantBtn.addActionListener(this);
        navigationUI.setVisible(true);
    }
    
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
