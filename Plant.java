/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;



/**
 *
 * @author maala
 */
public class Plant {
    String type;
    String size;
    String lightRequirements;
    String waterRequirements;
    String soilTypePreference;
    String temperaturePreference;

    public void waterPlant() {
        System.out.println("Plant watered.");
    }
    
    public static void main(String [] args){
        Plant myPlant = new Plant();
        
        myPlant.type="Succulent";
        myPlant.size="Small";
        myPlant.lightRequirements="High";
        myPlant.lightRequirements="Low";
        myPlant.soilTypePreference= "Well-draining";
        myPlant.temperaturePreference="Warm";
        
        System.out.println("Plant type: " + myPlant.type + 
                "\nPlant size: " + myPlant.size + 
                "\nPlant light requirements: " + myPlant.lightRequirements + 
                "\nPlant water requirements: " + myPlant.waterRequirements + 
                "\nSoil Type Preference of the plant: "+ myPlant.soilTypePreference + 
                "\nTemperature Preference of the plant: " + myPlant.temperaturePreference);
        
        myPlant.waterPlant();
    }
}
