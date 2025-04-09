package assignments.mycollection;
public class MyStack {
    private final int[] list;
    private int top;
    private final int capacity;

    public MyStack(int size) {
        list = new int[size];
        top = -1;
        capacity = size;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public void push(int number) {
        if (top == capacity - 1) {
            System.out.println("Stack is full");
        }else {
            list[++top] = number;
        }}
    public int peek() {
        if (top == -1) {
            return -1;
        } return list[top];
    }
    public void viewStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for (int index: list) {
            System.out.print(index +" ");
    }}}
    public int pop() { return list[top--];}
    public boolean isFull() { return top == capacity - 1;}}