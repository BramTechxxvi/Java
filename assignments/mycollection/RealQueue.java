package assignments.mycollection;
public class RealQueue {
    private int first;
    private int last;
    private final int[] list;

    public RealQueue(int size) {
        list = new int[size];
        first = -1;
        last = -1;
    }

    public boolean isEmpty() {
        return first == -1;
    }

    public void enqueue(int value) {
        if (last == list.length - 1) throw new IllegalArgumentException("Queue is full");
        else list[++last] = value;
        if (first == -1) ++first;
    }

    public boolean isFull() {
        return last == list.length - 1;
    }

    public int dequeue() {
        int index = list[first];
        if (isEmpty()) throw new IllegalArgumentException("Queue is empty");
        if (first == 0) index--;
        return index;
    }

    public void viewQueue() {
        for (int count = 0; count <= list.length; count++) System.out.print(list[count] + " ");
    }

    public int peek() {
        if (isEmpty()) throw new IllegalArgumentException("Queue is empty");

        else return list[first];
    }
}
