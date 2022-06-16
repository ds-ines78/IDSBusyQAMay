package oops.abstraction;

public class Residential extends BuildingIdea {
    @Override
    protected void buildPool() {
        System.out.println("20ft x 30ft pool");
    }

    @Override
    void buildLawn() {
        System.out.println("grass");
    }
}
