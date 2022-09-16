// this program is prepared by 21ce105_patelvraj
//Develop a Program that illustrate method overriding concept
// GITHUB LINK :
class Vehicle {
    // defining a method
    void run() {
        System.out.println("Vehicle is running");
    }
}

// Creating a child class
class Bike2 extends Vehicle {
    // defining the same method as in the parent class
    void run() {
        System.out.println("Bike is running safely");
    }

    
}


