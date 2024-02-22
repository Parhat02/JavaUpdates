package tasks.day44.question1;

public class AppleWeight implements PrintApple{

    @Override
    public String prettyPrint(Apple apple) {
        return "An apple of "+apple.getWeight()+"g";
    }
}
