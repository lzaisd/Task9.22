package ru.vsu.cs.sidorovaei.logics;

import java.util.ArrayList;
import java.util.List;

public class Logic {
    public static boolean checkIfListIsEmpty(List<Integer> list) {
        return list.size() == 0;
    }

    public static int[] listToArray(List<Integer> list) {
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
    public static List<Integer> arrayToList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(i, arr[i]);
        }
        return list;
    }

    public static List<Integer> createNewList(List<Integer> list) {
        int first = 0;
        int last;
        int finalFirst = 0;
        int finalLast = 0;
        int sum = list.get(0);
        int maxSum = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) >= list.get(i-1)) {
                last = i;
                sum += list.get(i);
            } else {
                first = i;
                last = i;
                sum = list.get(i);
            }
            if (last - first > finalLast - finalFirst) {
                finalFirst = first;
                finalLast = last;
            }
            if (last - first == finalLast - finalFirst && sum > maxSum) {
                finalFirst = first;
                finalLast = last;
                maxSum =sum;
            }
        }
        return getFinalList(list, finalFirst, finalLast);
    }

    public static List<Integer> getFinalList(List<Integer> list, int first, int last) {
        ArrayList<Integer> listResult = new ArrayList<>();
        int indexResult = 0;
        if (first == last) {                               //максимальной неубывающей последовательностью является одно число
            listResult.add(0, list.get(0));
        } else {
            for (int i = first; i <= last; i++) {
                listResult.add(indexResult, list.get(i));
                indexResult++;
            }
        }
        return listResult;
    }
}