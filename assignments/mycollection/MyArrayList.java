package assignments.mycollection;

public class MyArrayList {
    private int size;
    private int[] list;

    public MyArrayList (int capacity) {
        list = new int[capacity];
        size = 0;
    }

    public boolean isEmpty() { return size == 0; }

    public void add(int value) {
        if (size == list.length) increaseSize();
        else list[size++] = value;
        }

    private void increaseSize() {
        int[] newList = new int[list.length + 1];
        for (int index = 0; index < list.length; index++) newList[index] = list[index];
        list = newList;
    }

    public int getSize() { return size; }

    public void addAll(int[] otherList) {
        for (int index: otherList) add(index);
    }

    public int remove(int index) { return index == size ? list[index] : list[index--]; }


    }


