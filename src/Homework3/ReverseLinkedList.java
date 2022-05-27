package Homework3;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {

        LinkedList<String> veggiesList = new LinkedList<String>();

        veggiesList.add("tomato");
        veggiesList.add("potato");
        veggiesList.add("cucumber");
        veggiesList.add("pumpkin");
        veggiesList.add("onion");

        Collections.reverse(veggiesList);

        System.out.println(veggiesList);
    }
}
