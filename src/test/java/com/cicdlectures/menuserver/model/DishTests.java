package com.cicdlectures.menuserver.model;

import com.cicdlectures.menuserver.dto.DishDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DishTests {

    @Test
    public void TestfromDto() {
        Dish dish = new Dish(null, "Turkey", null);
        DishDto dto = new DishDto(null, "Turkey");
        Dish dish2 = dish.fromDto(dto);
        assertEquals(dish.getName(), dish2.getName());


    }
}
