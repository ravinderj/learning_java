package com.step.window;

abstract class WindowDecorator implements Window {
    private final Window windowToBeDecorated;

    public WindowDecorator(Window windowToBeDecorated) {
        this.windowToBeDecorated = windowToBeDecorated;
    }

    @Override
    public String draw() {
        return windowToBeDecorated.draw();
    }

    @Override
    public String description() {
        return windowToBeDecorated.description();
    }
}
