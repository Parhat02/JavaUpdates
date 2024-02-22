package tasks.day44.question2;

import java.util.List;

public class Manager {
    public void sendMessage(List<Members> members){
        for (Members member: members){
            if (member.getGender().equals(Gender.MALE) && (member.getAge()>= 18 && member.getAge() <= 25)){
                System.out.println("Sending message to " + member.getName());
            }
        }
    }
}
