package ru.vsu.cs.course1;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task {
    public static List<Integer> Process(List<Integer> list) {
        int n = list.get(list.size()-1);
        list.remove(list.size()-1);
        return createNewList(list,n);
        }
    public static List<Integer> createNewList(List<Integer> list,int n) {
        List<Integer> newList = new ArrayList<>();
        list = new ArrayList<>(new HashSet<>(list));
        for(int i = 0;i<n && i<list.size();i++){
            newList.add(list.get(i));
        }
        return newList;
    }
}

