package creational_patterns.example_factory_method.list_factory;

import java.util.List;

public class ListFactoryDemo {
    public static void main(String[] args) {
        // Create Arraylist implicit call with Factory method and usage
        List<String> myColorArrayList = ListFactory.newArrayList();
        myColorArrayList.add("red");
        myColorArrayList.add("pink");
        myColorArrayList.add("yellow");
        myColorArrayList.add("orange");
        myColorArrayList.add("blue");

        System.out.println("My ArrayList of colors contains:");
        for(String i : myColorArrayList) {
            System.out.print(i + "\n");
        }

        // Create LinkedList explicit call with Factory method and usage
        List<Integer> myNumberLinkedList = ListFactory.<Integer>newLinkedList();

        myNumberLinkedList.add(1);
        myNumberLinkedList.add(2);
        myNumberLinkedList.add(3);
        myNumberLinkedList.add(4);
        myNumberLinkedList.add(5);

        System.out.println("My LinkedList of numbers contains:");
        for(int i : myNumberLinkedList) {
            System.out.print(i + "\n");
        }
    }
}
