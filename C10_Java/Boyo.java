package C10_Java;

public class Boyo implements Doctor,Engineer{

    @Override
    public void treatPatient() {
        System.out.println("i treat patients");

    }

    @Override
    public void prescribeDrugs() {
        System.out.println("i prescribe drugs");

    }

    @Override
    public void buildCars() {
        System.out.println("i build cars");

    }

    @Override
    public void repairDevices() {
        System.out.println("i repair devices");
    }
}
