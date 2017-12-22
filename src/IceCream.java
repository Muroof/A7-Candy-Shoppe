/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maloof
 */
public class IceCream extends DessertItem {

    // create an instance variable for cost
    private int cost;

    /**
     * Constructor for IceCream
     *
     * @param name
     * @param cost
     */
    public IceCream(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    // returns the cost
    @Override
    public int getCost() {
        return this.cost;

    }

    // correctly formats and returns the string - to be printed on the reciept
    public String toString() {
        // create an empty string callled string
        String string = "";
        // add the name of the item to the string
        string += super.getName();
        // create a string called cost, that stores the cost
        String cost = DessertShoppe.cents2dollarsAndCents(this.cost);
        // determine amount of spaces needed to correctly place everything 
        for (int i = 0; i < DessertShoppe.RECEIPT_WIDTH - super.getName().length() - cost.length(); i++) {
            string += " ";

        }
        // add cost to the string
        string += cost;
        // return string
        return string;
    }
}
