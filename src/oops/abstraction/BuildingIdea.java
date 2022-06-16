package oops.abstraction;

public abstract class BuildingIdea {

    // abstract class can only have ideas
    // cannot contain implementations

    protected abstract void buildPool();
    abstract void buildLawn();

    public void basicBldg() {
        System.out.println("walls, floors, roof");
    }

}
