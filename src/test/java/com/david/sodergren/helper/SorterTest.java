package com.david.sodergren.helper;

import com.david.sodergren.enums.SortingOrder;
import com.david.sodergren.model.Food;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class SorterTest {

    private List<Food> unsortedList;

    @BeforeEach
    public void setUp(){
        unsortedList = Arrays.asList(new Food("a"), new Food("c"), new Food("b"));
    }

    @Test
    void sortFoodByNameAsc() {
        List<Food> sortedListAsc = Arrays.asList(new Food("a"), new Food("b"), new Food("c"));
        unsortedList.sort(Sorter.getSortingComparator(SortingOrder.ASC, Food::getName));
        for (int i = 0; i < unsortedList.size(); i++) {
            assertEquals(sortedListAsc.get(i), unsortedList.get(i));
        }
    }

    @Test
    void sortFoodByNameDesc() {
        List<Food> sortedListDesc = Arrays.asList(new Food("c"), new Food("b"), new Food("a"));
        unsortedList.sort(Sorter.getSortingComparator(SortingOrder.DESC, Food::getName));
        for (int i = 0; i < unsortedList.size(); i++) {
            assertEquals(sortedListDesc.get(i), unsortedList.get(i));
        }
    }

}