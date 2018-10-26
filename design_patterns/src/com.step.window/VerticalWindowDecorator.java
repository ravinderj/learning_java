package com.step.window;

public class VerticalWindowDecorator extends WindowDecorator {
    public VerticalWindowDecorator(Window windowTobeDecorated) {
        super(windowTobeDecorated);
    }

    @Override
    public String draw() {
        return super.draw() + ", with vertical scroll bar";
    }

    @Override
    public String description() {
        return super.description() + ", with vertical scroll bar";
    }
}
