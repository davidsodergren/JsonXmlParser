package com.david.sodergren.validation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XmlValidationTest {

    private final String correctFileNameXml = "/menu.xml";
    private final String schemaFile = "/menu.xsd";
    private boolean valid;

    @Test
    void isXmlFileValid() {
        valid = XmlValidation.isXmlFileValid(correctFileNameXml, schemaFile);
        assertTrue(valid);
    }
}