package dataStructures;

import java.lang.reflect.Array;
import java.util.*;

public class DataStructures {

    //Array
    int[] array = new int[6];

    //ArrayList
    ArrayList<Integer> list = new ArrayList<>();

    //Map
    //Set

    //////////////
    //LinkedList
    //Stack
    //Queue
    //Tree
    public void doStuff(){

        //Array
        int[] array = new int[6];
        array[0] =5;


        //ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        //list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(0,100);

        //System.out.println(list.get(0));

        list.remove(0);

        List<String> strings = new ArrayList<>();
        //ArrayList
        ArrayList<String> listString = new ArrayList<>();

        listString.add("dog");
        listString.add("cat");
        listString.add("goat");

        //Remove
      //listString.remove(0);
      //  listString.remove("goat");

       // System.out.println(listString);

        for(String animal: listString){
          //  System.out.println(animal);
        }

        //Set

       // Set<String> animalSet = new Set<>();
        //   Set<String> animalSet = new HashSet<String>();


        HashSet<String> animals = new HashSet<>();

        animals.add("Goat");
        animals.add("goat");
        animals.add("Cow");
        animals.add("Ram");


        System.out.println(animals);

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(2);
        System.out.println(numbers);

        //Map

      //System.out.println(Arrays.toString(array));
        //System.out.println(list);
    }

}
