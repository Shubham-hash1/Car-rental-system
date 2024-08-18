abstract class SellerCars{
    public  String carNo;
    public  String carName;
    public  String carLocation;
    public  double price;
    public  double carCondition;

    public SellerCars(String carNo, String carName, String carLocation, double price, double carCondition){
        this.carNo = carNo;
        this.carName = carName;
        this.carLocation = carLocation;
        this.price = price;
        this.carCondition = carCondition;
    }
    public abstract void carDetails();
}

class Car extends SellerCars{
    public Car(String carNo, String carName, String carLocation, double price, double carCondition){
            super(carNo, carName, carLocation, price, carCondition);
    }
    @Override
    public void carDetails(){
        System.out.println("Car No: " + carNo);
        System.out.println("Car Name: " + carName);
        System.out.println("Car Location: " + carLocation);
        System.out.println("Price: " + price);
        System.out.println("Condition: " + carCondition);
    }
}

class Buyer{
    public String name;
    public String DL;
    public String buyerLocation;
    public Buyer(String name, String DL, String buyerLocation){
        this.name = name;
        this.DL = DL;
        this.buyerLocation = buyerLocation;
    }
    public void checkCarMatch(SellerCars car){
        if(this.buyerLocation.equals(car.carLocation)){
            System.out.println("Buyer " + name +" with " + DL + " can rent this car");
            car.carDetails();
        }else {
            System.out.println("Buyer " + name +" with " + DL + " can not rent this car");
        }
    }
}


public class Project1 {
    public static void main(String [] agrs) {

                SellerCars car1 = new Car("UK 0007", "Range Rover", "Dubai", 10000, 85);
                SellerCars car2 = new Car("DL 0001", "Audi", "United Kingdom", 90000, 95);
        
                Buyer buyer1 = new Buyer("Samridh", "UK123456789", "Dubai");
                Buyer buyer2 = new Buyer("Shubham", "UK987654321", "United Kingdom");
        
                buyer1.checkCarMatch(car1);
                buyer2.checkCarMatch(car2);
            }
        }
