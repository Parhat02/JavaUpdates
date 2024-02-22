package tasks.day44.question1;

public class AppleColor implements PrintApple{

    @Override
    public String prettyPrint(Apple apple) {
        String result = null;
        if (apple.getColor().equals(Color.GREEN)){
            result = "A Light GREEN apple";
        }
        if (apple.getColor().equals(Color.RED)){
            result = "A Light RED apple";
        }
        return result;
    }
}
