/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maloof
 */
public class Sundae extends IceCream {

    // create instance variables for the toppingName and toppingCost
    private String toppingName;
    private int toppingCost;

    /**
     * Constructor for Sundae
     *
     * @param icName
     * @param icCost
     * @param toppingName
     * @param toppingCost
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        super(icName, icCost + toppingCost);
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;

    }

    // correctly formats and returns the string - to be printed on the reciept
    public String toString() {
        // create an empty string called string
        String string = "";
        // add the topping name and certain phrase along with a new line to the string
        string += toppingName + " Sundae with \n";
        // add the name of the ice cream to the string
        string += super.getName();
        // create a string called cost, that stores the cost
        String cost = DessertShoppe.cents2dollarsAndCents(super.getCost());
        // determine amount of spaces needed to correctly place everything 
        for (int i = 0; i < DessertShoppe.RECEIPT_WIDTH - super.getName().length() - cost.length(); i++) {
            string += " ";

        }
        // add the cost to the string
        string += cost;
        // return string
        return string;
    }
}
