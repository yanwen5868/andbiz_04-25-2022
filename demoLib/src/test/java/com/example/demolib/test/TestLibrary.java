package com.example.demolib.test;

import static org.junit.Assert.assertEquals;

import com.example.demolib.LibraryMain;

import org.junit.Test;

public class TestLibrary {
    @Test
    public void add_is_correct() {
        assertEquals(4, LibraryMain.add(2,2));
    }

    @Test
    public void mul_is_correct() {
        assertEquals(4, LibraryMain.add(2,2));
    }
}
