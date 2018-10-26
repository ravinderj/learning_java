package com.step.window;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WindowDecoratorTest {
    @Test
    public void testDrawWithHorizontalScrollBarDecorator() {
        Window simpleWindow = new SimpleWindow();
        Window decoratedWindow = new HorizontalWindowDecorator(simpleWindow);
        assertEquals("drawn a simple window, with horizontal scroll bar", decoratedWindow.draw());
    }

    @Test
    public void testHorizontalScrollBarDecoratorDescription() {
        Window simpleWindow = new SimpleWindow();
        Window decoratedWindow = new HorizontalWindowDecorator(simpleWindow);
        assertEquals("a simple window, with horizontal scroll bar", decoratedWindow.description());
    }

    @Test
    public void testDrawVerticalScrollBarDecorator() {
        Window simpleWindow = new SimpleWindow();
        Window decoratedWindow = new VerticalWindowDecorator(simpleWindow);
        assertEquals("drawn a simple window, with vertical scroll bar", decoratedWindow.draw());
    }

    @Test
    public void testVerticalScrollBarDecoratorDescription() {
        Window simpleWindow = new SimpleWindow();
        Window decoratedWindow = new VerticalWindowDecorator(simpleWindow);
        assertEquals("a simple window, with vertical scroll bar", decoratedWindow.description());
    }

    @Test
    public void testDrawWindowWithBorder() {
        Window simpleWindow = new SimpleWindow();
        Window decoratedWindow = new WindowWithBorderDecorator(simpleWindow);
        assertEquals("drawn a simple window, with border", decoratedWindow.draw());
    }

    @Test
    public void testWindowWithBorderDescription() {
        Window simpleWindow = new SimpleWindow();
        Window decoratedWindow = new WindowWithBorderDecorator(simpleWindow);
        assertEquals("a simple window, with border", decoratedWindow.description());
    }
}
