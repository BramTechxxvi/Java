package assignments.mycollection;
public class MyStack {
    private int [] list;
    private int top;

    public MyStack(int size) {
        list = new int[size];
        top = -1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public void push(int number) {
        list[++top] = number;
    }
    public void peek(int i) {
    }
}
