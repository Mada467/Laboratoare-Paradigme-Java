package ro.ulbs.paradigme.lab2.simplechained;

import ro.ulbs.paradigme.lab2.api.SortableList;

public class SimpleChainedList implements SortableList {
    private SimpleChainedNode head;

    public SimpleChainedList() {
        this.head = null;
    }

    public void addValue(int value) {
        SimpleChainedNode newNode = new SimpleChainedNode(value);
        if (head == null) {
            head = newNode;
        } else {
            SimpleChainedNode temp = head;
            while (temp.getNextNode() != null) {
                temp = temp.getNextNode();
            }
            temp.setNextNode(newNode);
        }
    }

    public int sumValues() {
        int sum = 0;
        SimpleChainedNode temp = head;
        while (temp != null) {
            sum += temp.getValue();
            temp = temp.getNextNode();
        }
        return sum;
    }

    @Override
    public boolean isSorted() {
        if (head == null) return true;
        SimpleChainedNode temp = head;
        while (temp.getNextNode() != null) {
            if (temp.getValue() > temp.getNextNode().getValue()) {
                return false;
            }
            temp = temp.getNextNode();
        }
        return true;
    }

    public void listNodes() {
        SimpleChainedNode temp = head;
        while (temp != null) {
            System.out.print(temp.getValue() + " ");
            temp = temp.getNextNode();
        }
        System.out.println();
    }
}
