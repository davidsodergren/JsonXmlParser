package com.david.sodergren.reader;

import com.david.sodergren.model.BreakfastMenu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XmlFileReaderTest {

    private final String correct = "/menu.xml";
    private final String incorrect = "/menu";

    @Test
    void getMenuFromFileSuccess() {
        BreakfastMenu breakfastMenu = assertDoesNotThrow(() -> XmlFileReader.getMenuFromFile(correct));
        Assertions.assertNotNull(breakfastMenu);
    }
    @Test
    void getMenuFromFileFail() {
        assertThrows(Exception.class, () -> XmlFileReader.getMenuFromFile(incorrect));
    }
}