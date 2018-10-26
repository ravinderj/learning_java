package com.step.window;

class SimpleWindow implements Window {
    @Override
    public String draw() {
        return "drawn a simple window";
    }

    @Override
    public String description() {
        return "a simple window";
    }
}