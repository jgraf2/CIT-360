package com.myjava.listiterator;
 
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
 
public class MyListIterator {
    public static void main(String a[]){
    	//creates a new list of integers and puts them in an array
        List<Integer> li = new ArrayList<Integer>();
        ListIterator<Integer> litr = null;
        li.add(23);
        li.add(98);
        li.add(29);
        li.add(71);
        li.add(5);
        //returns the list iterator elements in proper order
        litr=li.listIterator();
        //prints the elements out in a forward directions
        System.out.println("Elements in forward direction");
        while(litr.hasNext()){
            System.out.println(litr.next());
        }
        //prints the elements out in a backward directions
        System.out.println("Elements in backward direction");
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
}
