package com.david.sodergren.helper;

import com.david.sodergren.enums.SortingOrder;
import com.david.sodergren.model.Food;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Comparator;
import java.util.function.Function;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Sorter {

    public static <T extends Comparable<T>> Comparator<Food> getSortingComparator(SortingOrder sortOrder, Function<Food, T> sortingField) {
        switch(sortOrder) {
            case ASC:
                return (firstFood, secondFood) -> sortingField.apply(firstFood).compareTo(sortingField.apply(secondFood));
            case DESC:
                return (firstFood, secondFood) -> sortingField.apply(secondFood).compareTo(sortingField.apply(firstFood));
            default:
                throw new IllegalArgumentException("Illegal argument for sorting the list. Accepted SortingOrder is: 'ASC'/'DESC'");
        }
    }
}
