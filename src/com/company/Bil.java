package com.company;

public class Bil {

    String biltype;
    String model;
    String stelnummer;
    int antalDøre;
    String softwareversion;
    double gpsX;
    double gpsY;
    double hastigehed;// km/T
    Rat rat = new Rat();
    Bremse bremse = new Bremse();
    Motor motor = new Motor();
    Hjul hjul = new Hjul();

    public void moter(boolean on) {
        if (on == true) {
            System.out.print("Moter On and raedy, ");
        } else {
            System.out.print("Moter off Not ready, ");
        }
    }
    public void motorensOmdrejning(int omdrejning){
        System.out.print("Motorens omdrejning er: "+omdrejning+"%, ");
    }
    public void motorStigningOmdrejninger(int stigerOmdrejninger){
        System.out.print("Motor øger omdrejninger med: "+stigerOmdrejninger+"%, ");
    }
    public void cruiseControl(int hastighed){
        System.out.print("cruiseControl"+hastighed+"%, ");
    }

    public void hastighedStiger(double acelretion) {
        System.out.print("Stiger med: " + acelretion + " km/t., ");
    }

public void bremse (int bremse1){
    System.out.print("bremsen er presset "+bremse1+"% ned, ");
}
public void hjul(int Drejning) {
    if (Drejning > 0) {
        System.out.print("Hjul Drejer Højre med: " + Drejning + "grader, ");
    }
    if (Drejning < 0) {
        System.out.print("Hjul Drejer Ventrer med: " + Math.abs(Drejning) + "grader, ");
    }
}
public void rat(int drejning){

        if (drejning>0){
            System.out.print("rat Drejer Højre med: "+drejning+" grader, " );
            hjul(drejning);
        }
        if (drejning<0){
            System.out.print("rat Drejer Ventrer med: "+Math.abs(drejning)+" grader, ");
            hjul(drejning);
        }
    }









    public Bil(String biltype, String model, String stelnummer, int antalDøre, String softwareversion, double gpsX, double gpsY, double hastigehed) {
        this.biltype = biltype;
        this.model = model;
        this.stelnummer = stelnummer;
        this.antalDøre = antalDøre;
        this.softwareversion = softwareversion;
        this.gpsX = gpsX;
        this.gpsY = gpsY;
        this.hastigehed = hastigehed;
    }

    @Override
    public String toString() {
        return "Bil{" +
                "Biltype='" + biltype + '\'' +
                ", Model='" + model + '\'' +
                ", Stelnummer='" + stelnummer + '\'' +
                ", AntalDøre=" + antalDøre +
                ", Softwareversion='" + softwareversion + '\'' +
                ", GPS X=" + gpsX +
                ", GPSY=" + gpsY +
                ", Hastigehed=" + hastigehed +
                '}';
    }


    public String getBiltype() {
        return biltype;
    }

    public void setBiltype(String biltype) {
        this.biltype = biltype;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStelnummer() {
        return stelnummer;
    }

    public void setStelnummer(String stelnummer) {
        this.stelnummer = stelnummer;
    }

    public int getAntalDøre() {
        return antalDøre;
    }

    public void setAntalDøre(int antalDøre) {
        this.antalDøre = antalDøre;
    }

    public String getSoftwareversion() {
        return softwareversion;
    }

    public void setSoftwareversion(String softwareversion) {
        this.softwareversion = softwareversion;
    }

    public double getGpsX() {
        return gpsX;
    }

    public void setGpsX(double gpsX) {
        this.gpsX = gpsX;
    }

    public double getGpsY() {
        return gpsY;
    }

    public void setGpsY(double gpsY) {
        this.gpsY = gpsY;
    }

    public double getHastigehed() {
        return hastigehed;
    }

    public void setHastigehed(double hastigehed) {
        this.hastigehed = hastigehed;
    }
}

