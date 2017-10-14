package com.company;

public class Customer {

    public String customerName;
    public String customerPhone;
    public String customerAddress;
    public double squareFootage;
    public int senior;





    public Customer(String customerName, String customerPhone, String customerAddress, double squareFootage, int seniorAge) {
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
        this.squareFootage = squareFootage;

    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }
    public int getSenior(){
        return senior;
    }
    public void setSenior(){
        this.senior = senior;
    }
}
