package com.david.sodergren.reader;

import com.david.sodergren.model.BreakfastMenu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonFileReaderTest {

    private final String correct = "/menu.json";
    private final String incorrect = "/menu";

    @Test
    void getMenuFromFileSuccess() {
        BreakfastMenu breakfastMenu = assertDoesNotThrow(() -> JsonFileReader.getMenuFromFile(correct));
        Assertions.assertNotNull(breakfastMenu);
    }
    @Test
    void getMenuFromFileFail() {
        assertThrows(Exception.class, () -> JsonFileReader.getMenuFromFile(incorrect));
    }

}