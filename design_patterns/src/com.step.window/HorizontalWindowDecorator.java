package com.step.window;

class HorizontalWindowDecorator extends WindowDecorator {
    HorizontalWindowDecorator(Window windowToBeDecorated) {
        super(windowToBeDecorated);
    }

    @Override
    public String draw() {
        return super.draw() + ", with horizontal scroll bar";
    }

    @Override
    public String description() {
        return super.description() + ", with horizontal scroll bar";
    }
}
