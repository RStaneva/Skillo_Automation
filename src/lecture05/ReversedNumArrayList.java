package lecture05;

import java.util.LinkedList;

public class ReversedNumArrayList {
    public static void main(String args []){
        //Reverse the order of the elements in a LinkedList using algorithm
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("WV");

        System.out.println(cars);

        //Algorithm:
        // 1. Create a linked list with n elements
        // 2. Run the loop for n/2 times where ‘n’ is the number of elements in the LinkedList.
        // 3. In the first pass, Swap the first and nth element
        // 4. In the second pass, Swap the second and (n-1)th element and so on till you reach the mid of the linked list.
        // 5. Return the linked list after loop termination.
        for (int i = 0; i < cars.size() / 2; i++) {
            String temp = cars.get(i);
            cars.set(i, cars.get(cars.size() - i - 1));
            cars.set(cars.size() - i - 1, temp);
        }

        System.out.println(cars);
    }
    }

