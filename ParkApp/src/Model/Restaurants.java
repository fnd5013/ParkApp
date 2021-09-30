package Model;

import java.util.ArrayList;

/**
 *
 * @author bpardee
 */
public class Restaurants {
    private String restaurantName;
    private ArrayList<String> menuItemNames = new ArrayList<>();
    private ArrayList<Double> menuItemPrices = new ArrayList<>();
    private double orderTotal;

    /**
     * Constructor for Restaurants
     * @param restaurantName
     * @param menuItemNames
     * @param menuItemPrices
     * @param orderTotal
     */
    public Restaurants(String restaurantName, ArrayList<String> menuItemNames, ArrayList<Double> menuItemPrices, double orderTotal) {
        this.restaurantName = restaurantName;
        this.menuItemNames = menuItemNames;
        this.menuItemPrices = menuItemPrices;
        this.orderTotal = orderTotal;
    }
    
    /**
     * Default Constructor
     */
    public Restaurants() {
        this.restaurantName = "";
        this.menuItemNames = new ArrayList<>();
        this.menuItemPrices = new ArrayList<>();
        this.orderTotal = 0;
    }

    /**
     * getter for restaurant name
     * @return restaurantName
     */
    public String getRestaurantName() {
        return restaurantName;
    }

    /**
     * setter for restaurant name
     * @param restaurantName 
     */
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    /**
     * getter for menu item names
     * @return menuItemNames
     */
    public ArrayList<String> getMenuItemNames() {
        return menuItemNames;
    }

    /**
     * setter for menu item names
     * @param menuItemNames 
     */
    public void setMenuItemNames(ArrayList<String> menuItemNames) {
        this.menuItemNames = menuItemNames;
    }

    /**
     * getter for menu item prices
     * @return menuItemPrices
     */
    public ArrayList<Double> getMenuItemPrices() {
        return menuItemPrices;
    }

    /**
     * setter for menu item prices
     * @param menuItemPrices 
     */
    public void setMenuItemPrices(ArrayList<Double> menuItemPrices) {
        this.menuItemPrices = menuItemPrices;
    }

    /**
     * getter for order total
     * @return orderTotal
     */
    public double getOrderTotal() {
        return orderTotal;
    }

    /**
     * setter for order total
     * @param orderTotal 
     */
    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    @Override
    public String toString() {
        return "Restaurants{" + "restaurantName=" + restaurantName + ", menuItemNames=" + menuItemNames + ", menuItemPrices=" + menuItemPrices + ", orderTotal=" + orderTotal + '}';
    }
   
}
