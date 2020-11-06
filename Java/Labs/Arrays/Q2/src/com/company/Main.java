package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	//using normal array
        /* int[] arr = new int[6];
        for (int i = 0; i < 6; i++){
        arr[i] = (int) (Math.random() * 49);
        System.out.println(arr[i]);
        } */

        //using Arraylist
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 6; i++){
            arr.add((int) (Math.random() * 49));
            Collections.sort(arr);
        }
        for(int i : arr){
            System.out.println(i);
        }
        System.out.println("=======");

        //using Set
        Set<Integer> arr1 = new TreeSet<>();
        for(int i = 0; i < 6; i++){
            arr1.add((int) (Math.random() * 49));
        }
        for(int i : arr1){
            System.out.println(i);
        }
            }
}
