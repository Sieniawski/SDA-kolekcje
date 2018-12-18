package pl.bae.kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// podstawowe kolekcje


        List<String> stringList = new ArrayList<>();
        stringList.add("jeden");
        stringList.add("dwa");
        stringList.add("trzy");

        stringList.size();
        stringList.isEmpty();
        stringList.remove(2);
        //stringList.get(2);

        Person person1 = new Person("Jan", "Kowalski",22);
        Person person2 = new Person("Mietek", "Jankowski",55);

        List<Person> personList = new ArrayList<Person>();
        personList.add(person1);
        personList.add(person2);

        for (Person p: personList){
            System.out.println(p.getName());
        }


    }
}
