package com.david.sodergren.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BreakfastMenu {

    @JsonProperty("food")
    @JacksonXmlElementWrapper(localName = "breakfast_menu", useWrapping = false)
    private List<Food> foodList;
}
