package ro.ulbs.paradigme.lab2.doublechained;

import ro.ulbs.paradigme.lab2.api.SortableList;

public class DoubleChainedList implements SortableList {
    private DoubleChainedNode head;
    private DoubleChainedNode tail;

    public DoubleChainedList() {
        this.head = null;
        this.tail = null;
    }

    public void addValue(int value) {
        DoubleChainedNode newNode = new DoubleChainedNode(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNextNode(newNode);
            newNode.setPrevNode(tail);
            tail = newNode;
        }
    }

    public int sumValues() {
        int sum = 0;
        DoubleChainedNode temp = head;
        while (temp != null) {
            sum += temp.getValue();
            temp = temp.getNextNode();
        }
        return sum;
    }

    @Override
    public boolean isSorted() {
        if (head == null) return true;
        DoubleChainedNode temp = head;
        while (temp.getNextNode() != null) {
            if (temp.getValue() > temp.getNextNode().getValue()) {
                return false;
            }
            temp = temp.getNextNode();
        }
        return true;
    }

    public void listNodes() {
        DoubleChainedNode temp = head;
        while (temp != null) {
            System.out.print(temp.getValue() + " ");
            temp = temp.getNextNode();
        }
        System.out.println();
    }
}
