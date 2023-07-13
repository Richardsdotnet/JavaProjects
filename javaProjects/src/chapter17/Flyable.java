package chapter17;


@FunctionalInterface
public interface Flyable {
    void fly();

    static int calculateSpeed(){
        return 2 * 2;
    }

    default int getAge(){
        return 20;
    }
}
