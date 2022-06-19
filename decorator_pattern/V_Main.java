package decorator_pattern;

public class V_Main {
    public static void main(String[] args) {
        Vehicle vehicle = new AlloyRimDecorator(new Tesla());
        System.out.println(vehicle.description());
    }
}