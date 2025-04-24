package assignments.mycollection;

public class MyArrayList {
    private int size;
    private int[] list;

    public MyArrayList () {
        list = new int[10];
        size = 0;
    }

    public boolean isEmpty() { return size == 0; }

    public void add(int value) {
        if (size == list.length) increaseSize();
        else list[size++] = value;
        }

    private void increaseSize() {
        int[] newList = new int[list.length * 2];
        for (int index = 0; index < list.length; index++) newList[index] = list[index];
        list = newList;
    }

}
