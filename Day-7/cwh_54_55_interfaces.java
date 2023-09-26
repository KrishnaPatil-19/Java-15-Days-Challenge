//        No coding in session 54. File created, theory taught, but no code written.
//code written in session 55.

package com.company;

interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);

}
interface HornBicycle{
    public int x = 50;
    void blowHornSpiderman();
    void blowHornOggy();

}

class AvonCycle implements Bicycle, HornBicycle{
    public int x = 5;
    public void blowHorn(){
        System.out.println("Kendi po kendi pe o kendi");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Speeding up.");
    }
    public void blowHornSpiderman(){
        System.out.println("Spiderman, a spiderman, a spider does whatever he can...");
    }
    public void blowHornOggy(){
        System.out.println("La cucaracha, la cucaracha, Ya no puede caminar...");
    }
}

public class cwh_54_55_interfaces {
    public static void main(String[] args) {
        AvonCycle cycleKSP = new AvonCycle();
        cycleKSP.applyBrake(1);
//        You can create properties in interfaces
        System.out.println(cycleKSP.a);
//        You cannot modify the properties in interfaces as they are final
        /*cycleKSP.a = 454;
        System.out.println(cycleKSP.a);*/
        cycleKSP.blowHornSpiderman();
        cycleKSP.blowHornOggy();
        System.out.println(cycleKSP.x);
    }
}
