
package com.mycompany.mavenproject1;


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
