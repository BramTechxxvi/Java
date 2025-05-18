package assignments.mycollection;

import java.util.NoSuchElementException;

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
        if (top == capacity - 1) throw new IllegalArgumentException("Stack is full");
        else list[++top] = number;
    }

    public int peek() {
        if (isEmpty()) throw new NoSuchElementException("Stack is empty");
        else return list[top];
    }

    public void viewStack() {
        if (isEmpty()) System.out.println("Stack is empty");
        else {
            for (int index: list) System.out.print(index +" ");
    }}

    public int pop() {
        if (isEmpty()) throw new IndexOutOfBoundsException("Stack is empty");
        else return list[top--];
    }

    public boolean isFull() { return top == capacity - 1;}}