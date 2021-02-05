package com.cicdlectures.menuserver.dto;


import com.cicdlectures.menuserver.dto.DishDto;
import com.cicdlectures.menuserver.model.Dish;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DishDtoTest {
    @Test
    public void testfrommodelDish(){
        Dish dish = new Dish(null, "Turkey", null);
        DishDto dto = new DishDto(null, "Turkey");
        DishDto dto2 = dto.fromModel(dish);
        assertEquals(dto.getName(), dto2.getName());
    }



}
