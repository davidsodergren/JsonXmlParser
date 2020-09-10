package com.david.sodergren;

import com.david.sodergren.enums.FileType;
import com.david.sodergren.enums.SortingOrder;
import com.david.sodergren.exception.FileTypeNotSupportedException;
import com.david.sodergren.exception.XmlFileNotValidException;
import com.david.sodergren.helper.Sorter;
import com.david.sodergren.model.BreakfastMenu;
import com.david.sodergren.model.Food;
import com.david.sodergren.reader.Reader;
import com.david.sodergren.validation.Validation;

import java.io.IOException;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        if(args.length != 2){
            System.out.println("Invalid input, there can be maximum 2 arguments");
            System.exit(0);
        } else if (!Validation.isFileNameValid(args[0]) || !Validation.isSortingOrderValid(args[1])) {
            System.out.println("Invalid input, input should be: menu.xml/menu.json asc/desc");
            System.exit(0);
        }

        String fileName = "/" + args[0];
        String sortingCommand = args[1];
        String typeOfFile = fileName.substring(fileName.indexOf('.') + 1).toUpperCase();

        SortingOrder sortingOrder = SortingOrder.valueOf(sortingCommand.toUpperCase());
        FileType fileType = FileType.valueOf(typeOfFile);

        try {
            BreakfastMenu breakfastMenu = Reader.getMenuFromFile(fileName, fileType);

            Comparator<Food> sortingByName = Sorter.getSortingComparator(sortingOrder, Food::getName);
            breakfastMenu.getFoodList().sort(sortingByName);

            breakfastMenu.getFoodList().forEach(System.out::println);

        } catch (FileTypeNotSupportedException | IOException | IllegalArgumentException | XmlFileNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}
