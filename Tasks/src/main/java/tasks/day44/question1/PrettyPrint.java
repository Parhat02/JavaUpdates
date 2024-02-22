package tasks.day44.question1;

import java.util.ArrayList;
import java.util.List;

public class PrettyPrint {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(80,Color.GREEN));
        inventory.add(new Apple(155,Color.RED));
        inventory.add(new Apple(120,Color.GREEN));

        prettyPrintApple(inventory, new AppleColor());
        prettyPrintApple(inventory, new AppleWeight());

        System.out.println("-------------------------------------------------");

        PrintApple printApple = apple -> "An apple of "+apple.getWeight()+"g";
        prettyPrintApple(inventory, printApple);

    }

    public static void prettyPrintApple(List<Apple> inventory, PrintApple printApple){
        for (Apple apple : inventory){
            String outPut = printApple.prettyPrint(apple);
            System.out.println(outPut);
        }
    }

}
