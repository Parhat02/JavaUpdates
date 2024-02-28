package tasks.day48;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StateTest {

    public static void main(String[] args) {

        State state = new State();
        state.addCity("New York");
        state.addCity("Taxes");
        state.addCity("Florida");
        state.addCity("Washington DC");
        state.addCity("Las Vegas");

        state.getCities().stream()
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------");

        State va = new State();
        va.addCity("McLean");
        va.addCity("Arlington");
        va.addCity("Fairfax");
        va.addCity("FallsChurch");

        State tx= new State();
        tx.addCity("Dallas");
        tx.addCity("Plano");
        tx.addCity("Austin");
        tx.addCity("Houston");

        List<State> list = Arrays.asList(va, tx);

        //list.stream().map(p-> p.getCities()).forEach(System.out::println);
        list.stream().map(State::getCities).forEach(System.out::println);

        System.out.println("-----------------------------------------------");

        list.stream().flatMap(p-> p.getCities().stream()).forEach(System.out::println);

        System.out.println("-----------------------------------------------");

        list.stream().map(State::getCities)
                //.flatMap(p->p.stream()).forEach(System.out::println);
                .flatMap(Collection::stream).forEach(System.out::println);


    }




}
