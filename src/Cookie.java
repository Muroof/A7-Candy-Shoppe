/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maloof
 */
public class Cookie extends DessertItem {

    // create instance variables for number and the price of a dozen 
    private int number;
    private int pricePer12;

    /**
     * Constructor for Cookie
     * @param name
     * @param number
     * @param pricePer12 
     */
    public Cookie(String name, int number, int pricePer12) {
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;

    }

    // returns the cost
    @Override
    public int getCost() {
        return (this.number * (this.pricePer12 / 12));

    }

    // correctly formats and returns the string - to be printed on the reciept
    public String toString() {
        // create an empty string called string
        String string = "";

        // add the number and correct symbols to the string
        string += number + " @ $";
        // convert pricePer12 from cents to dollars and add it to the string
        string += DessertShoppe.cents2dollarsAndCents(pricePer12);
        // add correct symbol and add a new line
        string += " /dz\n";
        // add the name to the string
        string += super.getName();
        // create string cost, that stores the cost
        String cost = DessertShoppe.cents2dollarsAndCents(this.getCost());

        // determine amount of spaces needed to correctly place everything 
        for (int i = 0; i < DessertShoppe.RECEIPT_WIDTH - super.getName().length() - cost.length(); i++) {
            string += " ";
        }
        // add the cost the string 
        string += cost;
        // return the string
        return string;

    }
}
