package com.david.sodergren.reader;

import com.david.sodergren.exception.XmlFileNotValidException;
import com.david.sodergren.model.BreakfastMenu;
import com.david.sodergren.validation.XmlValidation;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.IOException;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class XmlFileReader {

    public static BreakfastMenu getMenuFromFile(String fileName) throws IOException, XmlFileNotValidException {
        ObjectMapper objectMapper = new XmlMapper();
        if(XmlValidation.isXmlFileValid(fileName, "/menu.xsd")) {
            return objectMapper.readValue(XmlFileReader.class.getResourceAsStream(fileName), BreakfastMenu.class);
        }
        else throw new XmlFileNotValidException("The xmlfile " + fileName + " was not valid according to menu.xsd");
    }
}
