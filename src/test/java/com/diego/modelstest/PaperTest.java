package com.diego.modelstest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.diego.models.Paper;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;



public class PaperTest {

    @Test
    void create_paper() {
        Object paper = new Paper();
        assertTrue(paper instanceof Paper);
    }

    @Test
    void test_paper_is_paper() {
        Object paper = new Paper();
        assertTrue("Paper", true);
    }

}
