
package com.company;

import java.text.NumberFormat;
import java.util.Locale;

public class Commercial extends Customer {
    public String propertyName = propertyName;
    public boolean multiProperty = false;
    public String customerName, customerPhone, customerAddress;
    public double squareFootage;
    public double commercialRate = 5.00;
















    public Commercial(String customerName, String customerPhone, String customerAddress, double squareFootage, String propertyName, boolean multi, String name, String phone, String address, double squareFootage, double commercialRate) {
        super(customerName, customerPhone, customerAddress, squareFootage);
        this.propertyName = propertyName;
        this.multiProperty = false;
        this.customerName = name;
        this.customerPhone = phone;
        this.customerAddress = address;
        this.squareFootage = squareFootage;
        this.commercialRate = 5.00; //5 dollars per 1000 squarefeet of space
    }
    public void calculate(boolean multiProperty, String name, String phone, String address, double squareFootage, double commercialRate, double totalCost){

        double commercialRate = 5.0;
        double squareFootage = 0.0;
        double seniorDiscount = 0.0;
        public double totalCost = 0.0;
        boolean multiProperty = false;
        double multiCommercialProperty = .10;
        double totalsquareFootageCost = 0;
    }

     if (multiProperty >2){
        double totalCost = ((squareFootage * 5.00) * .10);
        {  //weekly
        } if (squareFootage > 10000){
            totalCost = (((squareFootage*5.00) + 50.00);
            System.out.println(totalCost);
        }
        else (multiProperty <2 && squareFootage < 10000){
            System.out.printf(.printf());
        }
        if(senior)
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Phone number: " + customerPhone);
        System.out.println("Customer Address: " + customerAddress);
        System.out.println("Square footage: " + squareFootage);
        System.out.println("Property Name: " + propertyName);

        System.out.println("Commercial properties get discount of 10% when their are 2 or more.");
        System.out.println("Quote for the lawn service: " + NumberFormat.getCurrencyInstance(new Locale("english", "US")).format(totalCost) + "\n" + "Have a Nice Day" + "\n");
    }
}