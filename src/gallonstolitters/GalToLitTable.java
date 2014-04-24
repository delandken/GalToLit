/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gallonstolitters;

/**
 * Try This 1-2
 * 
 * This program displays a table of gallons to liters.
 * 
 * @author Ken
 */
public class GalToLitTable {
    public static void main(String[] args) {
        double gallons, liters;
        
        for(gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " gallons is " + liters + " liters.");
            if(gallons % 10 == 0) {
                System.out.println();
            }
        }
    }
}
