package Class_Work;

public class Car {

    private String plateNumber;
    private String carModel;
    private double dailyRate;
    private boolean isRented;

    public static String companyName = "JUST Rentals";
    public static int totalCars = 0;

    public Car() {
        this.plateNumber = "ABC-123";
        this.carModel = "Porsche";
        this.dailyRate = 50.0;
        this.isRented = false;
        totalCars++;
    }

    public Car(String plateNumber, String carModel, double dailyRate) {
        this.plateNumber = plateNumber;
        this.carModel = carModel;
        this.dailyRate = Math.max(0.0, dailyRate);
        this.isRented = false;
        totalCars++;
    }

    public String getPlateNumber() {
        return plateNumber;
    }
    public String getCarModel() {
        return carModel;
    }
    public double getDailyRate() {
        return dailyRate;
    }
    public boolean isRented() {
        return isRented;
    }
    public void setDailyRate(double dailyRate) {
        this.dailyRate = Math.max(0.0, dailyRate);
    }
    public void rent() {
        this.isRented = true;
        System.out.println("Car " + carModel + " (" + plateNumber + ") status updated to Rented.");
    }
    public void returnCar() {
        this.isRented = false;
        System.out.println("Car " + carModel + " (" + plateNumber +")" );
    }
    public void displayInfo() {
        System.out.println("Plate Number : " + plateNumber);
        System.out.println("Car Model : " + carModel);
        System.out.println("Daily Rate : $" + dailyRate);
        System.out.println("Is Rented  : " + isRented);
        System.out.println("===========================");
    }

    public static void displayCompanyName() {
        System.out.println("Company Name: " + companyName);
    }

    public static void displayTotalCars() {
        System.out.println("Total Cars Created: " + totalCars);
    }
}



class testCar {
    public static void main(String[] args) {
        Car.displayCompanyName();

        Car car1 = new Car();
        Car car2 = new Car("Ju-8899", "Bugatti", 80.0);
        car1.displayInfo();
        car1.rent();
        car1.returnCar();
        car2.setDailyRate(40.0);
        car2.displayInfo();

        Car.displayTotalCars();
    }
}