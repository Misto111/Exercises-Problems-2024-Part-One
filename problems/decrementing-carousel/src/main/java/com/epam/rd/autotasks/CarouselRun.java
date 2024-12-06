package com.epam.rd.autotasks;

public class CarouselRun {

    private final int[] elements;
    private final int size;
    private int currentIndex = 0;
    private int remainingElements;

    public CarouselRun(int[] elements, int size) {
        this.elements = elements.clone();
        this.size = size;
        this.remainingElements = size;
    }

    public int next() {
        if (isFinished()) {
            return -1;
        }

        while (elements[currentIndex] == 0) {
            currentIndex = (currentIndex + 1) % size;
        }

        int currentValue = elements[currentIndex];
        elements[currentIndex]--;

        if (elements[currentIndex] == 0) {
            remainingElements--;
        }

        currentIndex = (currentIndex + 1) % size;
        return currentValue;
    }

    public boolean isFinished() {
        return remainingElements == 0;
    }
}

