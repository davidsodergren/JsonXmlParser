package com.david.sodergren.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Menu {

    @JsonProperty("breakfast_menu")
    private BreakfastMenu breakfastMenu;
}
