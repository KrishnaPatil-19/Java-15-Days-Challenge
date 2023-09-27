package com.company;

interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good morning");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording in 4k");
    }
}

interface MyWiFi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class cellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall()
    {
        System.out.println("Connecting...");
    }


}

class mySmartphone extends cellPhone implements MyWiFi, MyCamera{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }
    /* public void record4kVideo(){
         System.out.println("Taking snap and recording in 4k");
     }*/
    public String[] getNetworks(){
        System.out.println("Getting list of networks : ");
        String[] networkList = {"Krishna", "Bhuvan", "Simran"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
    public void sampleMeth(){
        System.out.println("meth");
    }
}

public class cwh_59_polymorphism {
    public static void main(String[] args) {
        MyCamera cam1 = new mySmartphone(); //this is a smartphone but use it as a camera
//        cam1.getNetworks(); //not allowed
//        cam1.sampleMeth(); //not allowed
        cam1.record4kVideo();

        mySmartphone s = new mySmartphone();
        s.sampleMeth();
        s.recordVideo();
        s.getNetworks();
        s.callNumber(19042006);
    }
}
