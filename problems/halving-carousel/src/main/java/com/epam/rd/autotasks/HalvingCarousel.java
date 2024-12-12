package com.epam.rd.autotasks;

public class HalvingCarousel extends DecrementingCarousel {
    public HalvingCarousel(int capacity) {
        super(capacity);
    }

    @Override
    public CarouselRun run() {
        if (isRunning) {
            return null;
        }
        isRunning = true;

        return new CarouselRun(elements) {
            @Override
            public int next() {
                while (currentIndex < elements.length) {
                    if (elements[currentIndex] > 0) {
                        int value = elements[currentIndex];
                        elements[currentIndex] /= 2;
                        currentIndex = (currentIndex + 1) % elements.length;
                        return value;
                    }
                    currentIndex = (currentIndex + 1) % elements.length;
                }
                return -1;
            }
        };
    }
}