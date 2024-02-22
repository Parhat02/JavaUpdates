package tasks.day44.question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManagerTest {

    public static void main(String[] args) {

        Members member1 = new Members("Alex", 19, Gender.MALE);
        Members member2 = new Members("Max", 18, Gender.MALE);
        Members member3 = new Members("Walter", 15, Gender.MALE);
        Members member4 = new Members("Sophie", 22, Gender.MALE);
        Members member5 = new Members("Aelita", 26, Gender.MALE);

        ArrayList<Members> members = new ArrayList<>(Arrays.asList(member1, member2, member3, member4, member5));

        ManagerAction action = member -> {if (member.getGender().equals(Gender.MALE) && (member.getAge()>= 18 && member.getAge() <= 25)){
            System.out.println("Sending message to " + member.getName());}
        };
        sendMessage(members, action);


        System.out.println("-------------------------------");

        Manager manager = new Manager();
        manager.sendMessage(members);

    }


    public static void sendMessage(List<Members> members, ManagerAction action){
        for (Members member: members){
            action.sendMessage(member);
        }
    }
}
