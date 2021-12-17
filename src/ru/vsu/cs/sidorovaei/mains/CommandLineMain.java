package ru.vsu.cs.sidorovaei.mains;

import ru.vsu.cs.sidorovaei.logics.ArgsParser;
import ru.vsu.cs.sidorovaei.logics.Logic;
import ru.vsu.cs.sidorovaei.util.ArrayUtils;

import java.io.FileNotFoundException;

public class CommandLineMain {
    public static void runInCommandLineMode(String[] args) throws FileNotFoundException {
        ArgsParser argsParser = new ArgsParser(args);

        String inputFile = argsParser.getArgumentValue("-i", "--input-file");
        String outputFile = argsParser.getArgumentValue("-o", "--output-file");

        int[] arr = ArrayUtils.readIntArrayFromFile(inputFile);
        if (Logic.checkIfListIsEmpty(Logic.arrayToList(arr))) {
            System.out.println("Список пустой");
            System.err.println(1);
        }
        ArrayUtils.writeArrayToFile(outputFile, Logic.listToArray(Logic.createNewList(Logic.arrayToList(arr))));
    }
}
