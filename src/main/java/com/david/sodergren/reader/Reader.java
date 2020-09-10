package com.david.sodergren.reader;

import com.david.sodergren.enums.FileType;
import com.david.sodergren.exception.FileTypeNotSupportedException;
import com.david.sodergren.exception.XmlFileNotValidException;
import com.david.sodergren.model.BreakfastMenu;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.IOException;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Reader {

    public static BreakfastMenu getMenuFromFile(String fileName, FileType fileType) throws IOException, FileTypeNotSupportedException, XmlFileNotValidException {
        switch(fileType) {
            case JSON:
                return JsonFileReader.getMenuFromFile(fileName);
            case XML:
                return XmlFileReader.getMenuFromFile(fileName);
            default:
                throw new FileTypeNotSupportedException("Incorrect file type, the file type should be json/xml but was: " + fileName);
        }
    }

}
