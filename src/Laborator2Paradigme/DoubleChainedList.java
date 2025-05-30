package Laborator2Paradigme;

public class DoubleChainedList implements OrderChecker {
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

    public DoubleChainedNode getNodeByValue(int value) {
        DoubleChainedNode current = head;
        while (current != null) {
            if (current.getValue() == value) {
                return current;
            }
            current = current.getNextNode();
        }
        return null;
    }

    public void removeNodeByValue(int value) {
        DoubleChainedNode nodeToRemove = getNodeByValue(value);
        if (nodeToRemove == null) return;

        if (head == tail) {
            head = null;
            tail = null;
        }
        else if (nodeToRemove == head) {
            head = head.getNextNode();
            head.setPrevNode(null);
        }
        else if (nodeToRemove == tail) {
            tail = tail.getPrevNode();
            tail.setNextNode(null);
        }
        else {
            nodeToRemove.getPrevNode().setNextNode(nodeToRemove.getNextNode());
            nodeToRemove.getNextNode().setPrevNode(nodeToRemove.getPrevNode());
        }
    }

    public void listNodes() {
        DoubleChainedNode current = head;
        System.out.print("Double List: ");
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNextNode();
        }
        System.out.println();
    }

    public int getSum() {
        int sum = 0;
        DoubleChainedNode current = head;
        while (current != null) {
            sum += current.getValue();
            current = current.getNextNode();
        }
        return sum;
    }

    @Override
    public boolean isAscendingOrder() {
        if (head == null || head.getNextNode() == null) {
            return true;
        }

        DoubleChainedNode current = head;
        while (current.getNextNode() != null) {
            if (current.getValue() > current.getNextNode().getValue()) {
                return false;
            }
            current = current.getNextNode();
        }
        return true;
    }
}
