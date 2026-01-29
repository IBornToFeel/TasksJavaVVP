package ru.vsu.cs.volkov;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Task {
    public static void process(int[][] arr) {
        List<int[]> list = new ArrayList<>();
        int poz = 0;
        for (int i = 0; i < arr.length; i++){
            if (test(arr[i])){
                list.add(poz,arr[i]);
                poz+=1;
            }else list.add(arr[i]);
        }
        list.toArray(arr);
    }
    public static boolean test(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (!(arr[i-1]<=arr[i])){
                return false;
            }
        }
        return true;
    }

}
