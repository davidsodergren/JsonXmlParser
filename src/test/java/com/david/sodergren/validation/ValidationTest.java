package com.david.sodergren.validation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationTest {

    private final String correctFileNameJson = "menu.json";
    private final String correctFileNameXml = "menu.xml";
    private final String incorrectFileName = "men.json";
    private final String correctSortingAsc = "asc";
    private final String correctSortingDesc = "desc";
    private boolean valid;

    @Test
    void isFileNameValidWithCorrectInputs() {

        valid = Validation.isFileNameValid(correctFileNameJson);
        assertTrue(valid);
        valid = Validation.isFileNameValid(correctFileNameXml);
        assertTrue(valid);
    }

    @Test
    void isFileNameValidWithIncorrectInputs() {
        valid = Validation.isFileNameValid(incorrectFileName);
        assertFalse(valid);
    }

    @Test
    void isSortingOrderValidWithCorrectInputs() {
        valid = Validation.isSortingOrderValid(correctSortingAsc);
        assertTrue(valid);
        valid = Validation.isSortingOrderValid(correctSortingDesc);
        assertTrue(valid);
    }

    @Test
    void isSortingOrderValidWithIncorrectInputs() {
        String incorrectSorting = "as";
        valid = Validation.isFileNameValid(incorrectSorting);
        assertFalse(valid);
    }
}