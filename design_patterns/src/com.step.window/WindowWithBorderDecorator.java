package com.step.window;

public class WindowWithBorderDecorator extends WindowDecorator {
    public WindowWithBorderDecorator(Window windowToBeDecorated) {
        super(windowToBeDecorated);
    }

    @Override
    public String draw() {
        return super.draw() + ", with border";
    }

    @Override
    public String description() {
        return super.description() + ", with border";
    }
}
