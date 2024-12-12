package com.epam.rd.autotasks;

public class CarouselRun {

    protected final int[] elements;
    protected int currentIndex = 0;

    public CarouselRun(int[] elements) {
        this.elements = elements.clone();
    }

    public int next() {
        while (currentIndex < elements.length) {
            if (elements[currentIndex] > 0) {
                int value = elements[currentIndex];
                elements[currentIndex]--;
                currentIndex = (currentIndex + 1) % elements.length;
                return value;
            }
            currentIndex = (currentIndex + 1) % elements.length;
        }
        return -1;
    }

    public boolean isFinished() {
        for (int element : elements) {
            if (element > 0) {
                return false;
            }
        }
        return true;
    }
}
