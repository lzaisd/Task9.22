package ru.vsu.cs.sidorovaei.mains;

import ru.vsu.cs.sidorovaei.logics.Logic;
import ru.vsu.cs.sidorovaei.util.ArrayUtils;

public class testsMain {
    public static void runTests() {
        int[] arr1 = ArrayUtils.readIntArrayFromFile("input1.txt");
        int[] answer1 = new int[] {1, 2, 3, 5};
        test(Logic.listToArray(Logic.createNewList(Logic.arrayToList(arr1))), answer1);
        int[] arr2 = ArrayUtils.readIntArrayFromFile("input2.txt");
        int[] answer2 = new int[] {1, 1, 1, 1};
        test(Logic.listToArray(Logic.createNewList(Logic.arrayToList(arr2))), answer2);
        int[] arr3 = ArrayUtils.readIntArrayFromFile("input3.txt");
        int[] answer3 = new int[] {9};
        test(Logic.listToArray(Logic.createNewList(Logic.arrayToList(arr3))), answer3);
        int[] arr4 = ArrayUtils.readIntArrayFromFile("input4.txt");
        int[] answer4 = new int[] {1, 100};
        test(Logic.listToArray(Logic.createNewList(Logic.arrayToList(arr4))), answer4);
        int[] arr5 = ArrayUtils.readIntArrayFromFile("input5.txt");
        int[] answer5 = new int[] {3, 5};
        test(Logic.listToArray(Logic.createNewList(Logic.arrayToList(arr5))), answer5);
    }
    public static void test(int[] arr, int[] answer) {
        System.out.print("Полученный ответ: ");
        for (int i: arr) {
            System.out.printf("%s ", i);
        }
        System.out.println();
        System.out.print("Верный ответ: ");
        for (int j: answer) {
            System.out.printf("%s ", j);
        }
        System.out.println();
        System.out.println();
    }
}