import java.lang.invoke.StringConcatFactory;
import java.util.*;

class Car{
    private String carId;
    private String brand;
    private String model;
    private double basePricePerDay;
    private boolean isAvailable;

    public Car(String carId,String brand, String model, double basePricePerDay)
    {
        this.carId=carId;
        this.brand= brand;
        this.model= model;
        this.basePricePerDay=basePricePerDay;
        this.isAvailable=true;

    }
    public String getCarId(){
        return carId;

    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;

    }
    public double calculatePrice(int rentaldays){
        return rentaldays*basePricePerDay;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void rent(){
        isAvailable=false;
    }
    public void returnCar(){
        isAvailable=true;
    }
}
class Customer{
    private  String customerId;
    private String name;

    public Customer(String customerId,String name){
        this.customerId=customerId;
        this.name=name;

    }
    public String getCustomerId(){
        return customerId;

    }
    public String getName(){
        return name;
    }
}
class Rental{
    private Car car;
    private Customer customer;
    private int days;
    public Rental(Car car,Customer customer,int days){
        this.car=car;
        this.customer=customer;
        this.days=days;

    }
    public Car getCar(){
        return car;
    }
    public Customer getCustomer(){
        return customer;

    }
    public int getDays(){
        return days;
    }

}

class CarRentalSystem{
    private List<Car> cars;
    private List<Customer> customers;
    private List<Rental> rentals;
    public CarRentalSystem(){
        cars=new ArrayList<>();

    }

}




public class Main {
    public static void main(String[] args) {
     CarRentalSystem rentalSystem=new CarRentalSystem();
        Car car1 = new Car("C001", "Toyota", "Camry", 60.0); // Different base price per day for each car
        Car car2 = new Car("C002", "Honda", "Accord", 70.0);
        Car car3 = new Car("C003", "Mahindra", "Thar", 150.0);
        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        rentalSystem.addCar(car3);

        rentalSystem.menu();
        }
    }
