package Laborator2Paradigme;

public class DoubleChainedNode implements Node {
    private int value;
    private DoubleChainedNode nextNode;
    private DoubleChainedNode prevNode;

    public DoubleChainedNode(int value) {
        this.value = value;
        this.nextNode = null;
        this.prevNode = null;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    public void setNextNode(DoubleChainedNode nextNode) {
        this.nextNode = nextNode;
    }

    public DoubleChainedNode getNextNode() {
        return nextNode;
    }

    public void setPrevNode(DoubleChainedNode prevNode) {
        this.prevNode = prevNode;
    }

    public DoubleChainedNode getPrevNode() {
        return prevNode;
    }
}