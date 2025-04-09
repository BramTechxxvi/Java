package assignments.mycollection;
public class MyQueue {
    private int first;
    private int last;
    private final int[] list;

    public MyQueue(int size) {
        list = new int[size];
        first = -1;
        last = -1;
    }
    public boolean isEmpty() { return last == -1;}

    public void enqueue (int value) {
        if (last == list.length - 1) {
            System.out.println("Queue is full");
        } else {
            list[++last] = value;
        }
        if (first == -1) first++;
    }
    public boolean isFull() { return last == list.length-1;}
    public int dequeue() {
        int x = -1;
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }else {
            x = list[first++];
        } return x;
    }
    public int peek() { return list[first++];}
}
