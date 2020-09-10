package com.david.sodergren.reader;

import com.david.sodergren.model.BreakfastMenu;
import com.david.sodergren.model.Menu;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.IOException;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JsonFileReader {

    public static BreakfastMenu getMenuFromFile(String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(JsonFileReader.class.getResourceAsStream(fileName), Menu.class).getBreakfastMenu();
    }

}
