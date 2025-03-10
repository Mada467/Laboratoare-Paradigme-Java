package ro.ulbs.paradigme.lab2;

import ro.ulbs.paradigme.lab2.simplechained.SimpleChainedList;
import ro.ulbs.paradigme.lab2.doublechained.DoubleChainedList;

public class Application {
    public static void main(String[] args) {
        // Lista simplu înlănțuită
        SimpleChainedList simpleList = new SimpleChainedList();
        for (int i = 1; i <= 10; i++) {
            simpleList.addValue(i);
        }
        simpleList.listNodes();
        System.out.println("Suma listei simplu înlănțuite: " + simpleList.sumValues());
        System.out.println("Lista simplu înlănțuită este sortată? " + simpleList.isSorted());

        // Lista dublu înlănțuită
        DoubleChainedList doubleList = new DoubleChainedList();
        for (int i = 1; i <= 10; i++) {
            doubleList.addValue(i);
        }
        doubleList.listNodes();
        System.out.println("Suma listei dublu înlănțuite: " + doubleList.sumValues());
        System.out.println("Lista dublu înlănțuită este sortată? " + doubleList.isSorted());
    }
}
