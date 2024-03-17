
package com.crio.qcalc;


public class App {
    public String getGreeting(){
        return "Hello World";
    }


   public static void main(String[] args) {

       System.out.println("Starting QCalc..");

       LogicCalculator calc = new LogicCalculator();
       calc.AND(8, 6);
       calc.printResult();

   }


}
