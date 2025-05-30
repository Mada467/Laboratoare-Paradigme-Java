package Laborator2Paradigme;

public class Application {
    public static void main(String[] args) {
        System.out.println("Lista simplu inlantuita:");

        SimpleChainedList simpleList = new SimpleChainedList();
        for (int i = 1; i <= 10; i++) {
            simpleList.addValue(i);
        }

        simpleList.removeNodeByValue(4);
        simpleList.removeNodeByValue(6);
        simpleList.removeNodeByValue(8);
        simpleList.removeNodeByValue(10);

        simpleList.listNodes();
        System.out.println("Suma simple list: " + simpleList.getSum());
        System.out.println("Simple list în ordine crescătoare: " + simpleList.isAscendingOrder());

        System.out.println("\nLista dublu inlantuita");

        DoubleChainedList doubleList = new DoubleChainedList();
        for (int i = 1; i <= 10; i++) {
            doubleList.addValue(i);
        }

        doubleList.removeNodeByValue(1);
        doubleList.removeNodeByValue(2);
        doubleList.removeNodeByValue(3);

        doubleList.listNodes();
        System.out.println("Suma double list: " + doubleList.getSum());
        System.out.println("Double list în ordine crescătoare: " + doubleList.isAscendingOrder());
    }
}