package PartVI;

public class InstanceCounter
{
    private static int instanceCounter = 0; // private because we don't want it to be modified outside the class

    public InstanceCounter() {
        incrementCount();
        System.out.println("Instance created. Current instance count: " + getInstanceCount());
    }

    public static void incrementCount() {
        instanceCounter++; // private because it should only be modified within the class
    }

    public static int getInstanceCount() {
        return instanceCounter; // public because we want to allow access to the count from outside the class
    }
    public static void main(String[] args) {
        InstanceCounter obj1 = new InstanceCounter();
        InstanceCounter obj2 = new InstanceCounter();
        InstanceCounter obj3 = new InstanceCounter();

        System.out.println("Total instance count: " + InstanceCounter.getInstanceCount());
    }
}
