package iterator;

public class SimpleCar implements Car{

    private String model;
    private String licensePlate;

    public SimpleCar(String model, String licensePlate) {
        this.model = model;
        this.licensePlate = licensePlate;
    }
    public String getCarDetails (){
        return model + "(" + licensePlate + ")";
        
    }
    @Override
    public String toString() {
        return "SimpleCar{" +
                "model='" + model + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }
}
