package com.david.sodergren.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Food {

    @NonNull
    private String name;
    private String price;
    private String description;
    private short calories;
}
