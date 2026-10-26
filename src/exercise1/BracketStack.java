package exercise1;

public class BracketStack {

    private class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public BracketStack() {
        top = null;
    }

    // Adds the element to the top of the stack
    public void push(char value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    // Removes and returns the top element
    public char pop() {
        if (isEmpty()) {
            return '\0';
        }
        char poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    // Returns the top element without removing it
    public char peek() {
        if (isEmpty()) {
            return '\0';
        }
        return top.data;
    }

    // Checks whether the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}
