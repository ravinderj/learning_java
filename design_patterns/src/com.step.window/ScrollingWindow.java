package com.step.window;

public class ScrollingWindow implements Window {
    @Override
    public String draw() {
        return "drawn a scrolling window";
    }

    @Override
    public String description() {
        return "a scrolling window";
    }
}
