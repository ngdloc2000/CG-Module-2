package arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    public Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapa();
        }

        for (int i = 0; i < elements.length; i++) {
            if (i == index) {
                for (int j = elements.length - 1; j > index; j--) {
                    elements[j] = elements[j - 1];
                }
                elements[i] = element;
            }
        }
    }

    public E remove(int index) {
        for (int i = 0; i < elements.length - 1; i++) {
            if (i == index) {
                for (int j = index; j < elements.length - 1; j++) {
                    elements[j] = elements[j + 1];
                }
            }
        }
        return (E) elements[index];
    }

    public E get(int i) {
        if (i >= elements.length || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public E clone1() {
        Object[] arrNew = new Object[elements.length];
        for (int i = 0; i < elements.length; i++) {
            arrNew[i] = elements[i];
        }
        return (E) arrNew;
    }

    public boolean contains(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        int index = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                index = i;
            }
        }
        return index;
    }
}
