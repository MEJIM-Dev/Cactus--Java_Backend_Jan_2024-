package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {

    private ArrayList<String> items;

    private Scanner scanner;

    public ShoppingList(){
        items = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addItem (){
        System.out.println("Enter The name of Item");
        String item = scanner.nextLine();
        items.add(item);
    }

    public int removeItem(){
        if(items.isEmpty()){
            System.out.println("No Available items on the list");
            return 0;
        }
        System.out.println("What Position will you like to remove");
        //Add exception Handling
        int itemPosition = scanner.nextInt();
        if(itemPosition<=0){
            System.out.println("Invalid Position");
            return items.size();
        }
        if(itemPosition>items.size()){
            System.out.println("No such item exist");
            return items.size();
        }
        int itemIndex = itemPosition - 1;
        items.remove(itemIndex);
        return items.size();
    }

    public void displayItems(){
        System.out.println("items= "+items);
    }
}
