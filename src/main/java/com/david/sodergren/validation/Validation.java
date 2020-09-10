package com.david.sodergren.validation;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Validation {

    public static boolean isFileNameValid(String fileName){
        return (fileName.equalsIgnoreCase("menu.json") || fileName.equalsIgnoreCase("menu.xml"));
    }

    public static boolean isSortingOrderValid(String sortingOrder){
        return (sortingOrder.equalsIgnoreCase("asc") || sortingOrder.equalsIgnoreCase("desc"));
    }
}
