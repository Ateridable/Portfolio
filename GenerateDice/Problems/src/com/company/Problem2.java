package com.company;

public class Problem2 {
    public static void main(String[] args){
        String employeeName = "Rick James";
        double hoursWorked = 42.68;
        double hourlyPay = 11.00;
        double taxRate = .2;

        payCheck(employeeName,hoursWorked,hourlyPay,taxRate);

        double sum = grossPay(hoursWorked,hourlyPay);
        System.out.println(sum);

        double net2 = netPay(sum,taxRate);
        System.out.println(net2);
    }
    public static void payCheck(String employeeName, double hoursWorked,double hourlyPay, double taxRate) {
         double total = (hoursWorked * hourlyPay) * taxRate;
         double results = (hoursWorked * hourlyPay) - total;
         System.out.println(employeeName + " makes " + results);
    }
    public static double grossPay(double hoursWorked,double hourlyPay) {
        double gross;
        gross = hoursWorked * hourlyPay;
        return gross;
    }
    public static double netPay(double gross,double taxRate) {
        double net;
        net = gross * taxRate;
        return net;
    }
}
