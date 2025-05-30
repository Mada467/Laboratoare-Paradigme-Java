package Laborator2Paradigme;

public class SimpleChainedNode implements Node {
    private int value;
    private SimpleChainedNode nextNode;

    public SimpleChainedNode(int value) {
        this.value = value;
        this.nextNode = null;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    public void setNextNode(SimpleChainedNode nextNode) {
        this.nextNode = nextNode;
    }

    public SimpleChainedNode getNextNode() {
        return nextNode;
    }
}
