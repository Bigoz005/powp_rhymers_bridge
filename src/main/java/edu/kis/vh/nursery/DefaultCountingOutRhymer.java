package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntLinkedList;
import edu.kis.vh.nursery.storage.IntStorageInterface;

public class DefaultCountingOutRhymer {

    IntStorageInterface intStorageInterface = new IntLinkedList();

    public DefaultCountingOutRhymer() {}

    public DefaultCountingOutRhymer(IntStorageInterface intStorageInterface) {
        this.intStorageInterface = intStorageInterface;
    }

    public void countIn(int in) {
        intStorageInterface.push(in);
    }

    public boolean callCheck() {
        return intStorageInterface.isEmpty();
    }

    public boolean isFull() {
        return intStorageInterface.isFull();
    }

    public int peekaboo() {
        return intStorageInterface.top();
    }

    public int countOut() {
        return intStorageInterface.pop();
    }

    public int getTotal() {
        return intStorageInterface.getSize();
    }

}