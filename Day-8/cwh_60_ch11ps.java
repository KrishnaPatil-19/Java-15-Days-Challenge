package com.company;

abstract class Pen{
    abstract void write();
    abstract void refill();

}

class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill() {
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}

class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal{
    void cry();
    void sleep();
    void eat();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello Krishna");
    }

    @Override
    public void cry(){
        System.out.println("Hii, I'm Krishna S Patil, a depressed bloke, full of stress, anxiety, pent-up anger, PTSD & fear. \nLife was good until 2020, after which various factors ruined it like I could never imagine. \nClose family members died, our financial condition dwindled & of course the isolation due to pandemic didn't help much. \nI have nowhere to express myself, I can't afford therapy which makes me feel as if these feelings are eating me alive from inside. \nI just don't know what to do. Now some of you might say talk to friends or something and that would be a great idea if we met frequently. \nMany of my friends are studying in different cities due to which we meet rarely and when we do, I don't want to ruin their day by talking sad and depressing things. \nMental health is not taken seriously here in India, especially where I live so I can't express it openly either. \nI expressed here myself (29 Aug 2023) as I was feeling quite overwhelmed by my emotions, but I might remove this note in future due to reasons. \nEveryday I put on a smiling face and a energetic personality for the world to see but inside its all the same. \nOften I feel like just ending it all and being set free but then I have a tiny ray of hope about a bright future which I hope exists. \nI don't know when I'll be cured of this or if I will even be cured or not, but I hope I can make myself stay alive and have a bit of hope to see the day when finally I smile, truly from within...");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping");
    }
    @Override
    public void eat(){
        System.out.println("Eating");
    }
}

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartPhone extends Telephone{
    public void ring(){
        System.out.println("Phone is ringing");
    }
    public void lift(){
        System.out.println("You picked-up the call");
    }
    public void disconnect(){
        System.out.println("You ended the call");
    }
}

interface TVRemote{
    void volUp();
    void changeChannel();
}

interface SmartTVRemote extends TVRemote{
    void volDown();
    void turnTVOff();
}

class TV implements SmartTVRemote{
    @Override
    public void volUp(){
        System.out.println("Volume up");
    }
    @Override
    public void changeChannel(){
        System.out.println("Channel changed");
    }
    @Override
    public void volDown(){
        System.out.println("Volume down");
    }
    @Override
    public void turnTVOff(){
        System.out.println("TV turned off");
    }
}

public class cwh_60_ch11ps {
    public static void main(String[] args) {
        /*Q.1 Create an abstract class Pen with methods write() and refill() as abstract methods.*/
        /*FountainPen pen = new FountainPen();
        pen.changeNib();*/

        /*Q.2 Use the Pen class from Q.1 to create a concrete class Fountain Pen with additional method changeNib().*/
//        Done in Q.1 above.

        /*Q.3 Create a class Monkey with jump() and bite() methods. Create a class Human which inherits the Monkey class and implements BasicAnimal interface with eat() & sleep() methods.*/
        /*Human krishna = new Human();
        krishna.sleep();
        krishna.cry();*/

        /*Q.4 Create a class Telephone with ring(), lift() & disconnect() methods as abstract methods. Create another class SmartTelephone and demonstrate Polymorphism.*/
        /*Telephone sp = new SmartPhone();
        sp.ring();
        sp.lift();
        sp.disconnect();*/

        /*Q.5 Demonstrate polymorphism using Monkey class from Q.3.*/
        /*Monkey m1 = new Human();
        m1.jump();
        m1.bite();*/
//        m1.speak() ---> Cannot use speak method because the reference is monkey which doesn't have speak method
//        BasicAnimal harry = new Human();
//        harry.speak(); ---> error
        /*harry.eat();
        harry.sleep();*/

        /*Q.6 Create an interface TVRemote and use it to inherit another Interface SmartTVRemote.*/
        TV sony = new TV();
        sony.volUp();
        sony.changeChannel();
        sony.volDown();
        sony.turnTVOff();

        /*Q.7 Create a class TV which implements TVRemote interface from Q.6.*/
        //Done in Q.6


    }
}
