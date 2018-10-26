package com.step.window;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WindowTest {
    @Test
    public void testShouldDrawWindow() {
        Window window = new SimpleWindow();
        assertEquals("drawn a simple window", window.draw());
    }

    @Test
    public void testShouldGetDescription() {
        Window window = new SimpleWindow();
        assertEquals("a simple window", window.description());
    }

    @Test
    public void testDrawScrollingWindow() {
        Window scrollingWindow = new ScrollingWindow();
        assertEquals("drawn a scrolling window", scrollingWindow.draw());
    }

    @Test
    public void testScrollingWindowDescription() {
        Window scrollingWindow = new ScrollingWindow();
        assertEquals("a scrolling window", scrollingWindow.description());
    }
}
