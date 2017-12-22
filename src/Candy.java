/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maloof
 */
public class Candy extends DessertItem {

    // create instance variables for weight and price/pound
    private double weight;
    private int pricePerLbs;

    /**
     * Constructor for Candy 
     * @param name
     * @param weight
     * @param pricePerLbs 
     */
    public Candy(String name, double weight, int pricePerLbs) {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    // returns the cost
    @Override
    public int getCost() {
        return (int) Math.round(weight * pricePerLbs);
    }

    // method to format the output
    public String toString() {
        // create an empty string
        String string = "";

        // add the weight and correct symbols
        string += weight + " lbs. @ $";
        // fill in the value for price per pound
        string += DessertShoppe.cents2dollarsAndCents(pricePerLbs);
        // add the correct symbol and add a new line
        string += " /lb. \n";
        // retrieve the name and add it the string
        string += super.getName();
        // create a string called cost, that stores the cost
        String cost = DessertShoppe.cents2dollarsAndCents(this.getCost());

        // determine amount of spaces needed to correctly place everything
        for (int i = 0; i < DessertShoppe.RECEIPT_WIDTH - super.getName().length() - cost.length(); i++) {
            string += " ";
        }
        // add cost the the string
        string += cost;
        // return the string 
        return string;

    }
}
