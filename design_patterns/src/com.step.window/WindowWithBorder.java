package com.step.window;

public class WindowWithBorder implements Window {
    @Override
    public String draw() {
        return "drawn window with border";
    }

    @Override
    public String description() {
        return "a window with border";
    }
}
