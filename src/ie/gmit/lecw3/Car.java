package ie.gmit.lecw3;

public class Car {
int topSpeed;
int totalSeats;
int fuelCapacity;
String manufacturer;
String colour;
String owner;
float engineSize;
float value; 


void refuel();

void park();

void drive();

void crash(){
    value = 0;
}

void show(){
    System.out.println(manufacturer);
}
}