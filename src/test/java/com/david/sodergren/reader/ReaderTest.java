package com.david.sodergren.reader;

import com.david.sodergren.enums.FileType;
import com.david.sodergren.model.BreakfastMenu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ReaderTest {

    private final String fileNameXml = "/menu.xml";
    private final String fileNameJson = "/menu.json";
    private final FileType fileTypeJson = FileType.JSON;
    private final FileType fileTypeXml = FileType.XML;

    @Test
    void getMenuFromFileJson() {
        BreakfastMenu breakfastMenu = assertDoesNotThrow(() -> Reader.getMenuFromFile(fileNameJson, fileTypeJson));
        Assertions.assertNotNull(breakfastMenu);
    }
    @Test
    void getMenuFromFileFail() {
        BreakfastMenu breakfastMenu = assertDoesNotThrow(() -> Reader.getMenuFromFile(fileNameXml, fileTypeXml));
        Assertions.assertNotNull(breakfastMenu);
    }

}