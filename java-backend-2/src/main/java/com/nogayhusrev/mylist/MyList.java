package com.nogayhusrev.mylist;

import java.util.Arrays;

public class MyList<E> {
    private E[] elements;

    private int CAPACITY = 10;
    private int size;

    public MyList() {
        this(10);
    }

    public MyList(int CAPACITY) {
        this.size = 0;
        this.CAPACITY = CAPACITY;
        this.elements = (E[]) new Object[CAPACITY];
    }

    private void ensureCapacity() {
        int newCAPACITY = CAPACITY * 2;

        E[] newElements = (E[]) new Object[newCAPACITY];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    public int getCAPACITY() {
        return CAPACITY;
    }

    public int getSize() {
        return size;
    }

    public void add(E element) {

        if (this.size >= this.CAPACITY) {
            ensureCapacity();
        } else {
            elements[size++] = element;
        }

    }

    public E get(int index) {

        if (index < 0 || index > size)
            return null;

        return elements[index];
    }

    public void remove(int index) {

        if (index < 0 || index > size)
            return;

        elements[index] = null;

        System.arraycopy(elements, index + 1, elements, index, elements.length - index);


    }

    public void set(int index, E element) {
        if (index < 0 || index > size)
            return;

        elements[index] = element;


    }

    public int indexOf(E element) {
        int currIndex = 0;

        while (currIndex < size) {
            if (elements[currIndex] == element)
                return currIndex;
            currIndex++;
        }
        return -1;

    }

    public int lastIndexOf(E element) {
        int currIndex = size - 1;

        while (currIndex >= 0) {
            if (elements[currIndex] == element)
                return currIndex;
            currIndex--;
        }
        return -1;

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E[] toArray() {

        E[] returnElements = (E[]) new Object[size];

        for (int i = 0; i < size - 1; i++) {
            returnElements[i] = elements[i];
        }

        return returnElements;

    }

    public void clear() {
        size = 0;
        elements = (E[]) new Object[CAPACITY];
    }

    public MyList<E> sublist(int start, int finish) {
        if (start < 0 || start > size || finish < 0 || finish > size)
            return null;


        MyList<E> returnedList = new MyList<>(finish - start);

        for (int i = start; i < finish; i++) {
            returnedList.add(elements[i]);
        }

        return returnedList;

    }

    public boolean contains(E element) {
        return indexOf(element) != -1;
    }


    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
