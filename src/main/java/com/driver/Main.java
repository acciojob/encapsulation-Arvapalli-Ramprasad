package com.driver;

public class Main {
  public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        // Try setting a value to name by directly accessing it using obj
        // obj.name = "Direct Access"; // Error: The field RWOnly.name is not visible
        // Try printing it
        // System.out.println(obj.name); // Error: The field RWOnly.name is not visible
        // Error: You might see some errors, please note them down in comments

        // Try setting a value to name in the Main function using the setter function
        obj.setName("Set from Main");

        // Access its value using the getter function
        System.out.println(obj.getName());
  }
}
