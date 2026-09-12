import java.io.*;
import java.util.*;

// 1. Define the generic Printer class here (do not make it public)
class Printer {
    // Write a single generic method that can print elements of any array type
    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (java.lang.reflect.Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray")) count++;
        }

        if(count > 1) System.out.println("Method overloading is not allowed!");
      
    }
}


output

  Expected Output
1
2
3
Hello
World
