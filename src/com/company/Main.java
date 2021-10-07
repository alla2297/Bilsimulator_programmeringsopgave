package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bil tesla = new Bil("Tesla", "model X","02930923",4,"0.0.1",55.22458,
        11.757075,0);
        System.out.println(tesla);
        tesla.moter(true);
        tesla.hastighedStiger(2.00);
        tesla.bremse(87);
        tesla.motorensOmdrejning(22);
        tesla.motorStigningOmdrejninger(8);
        tesla.cruiseControl(1);
        tesla.rat(30);
        System.out.println("hey");

    }
}
/*
public bil(){
        String biltype = "Tesla";
        String model = "model X";
        String stelnummer = "02930923";
        int antalDøre = 4;
        String softwareversion = "0.0.1";
        double gpsX =55.22458;
        double gpsY = 11.757075;
        double hastigehed = 0; // km/T
    }
 */