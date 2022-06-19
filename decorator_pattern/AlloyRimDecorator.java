package decorator_pattern;

public class AlloyRimDecorator extends CarDecorator {
    Vehicle vehicle;
    public AlloyRimDecorator(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public String description() {
        return vehicle.description() + " with AlloyRIm";
    }
}
