package com.cicdlectures.menuserver.dto;

import com.cicdlectures.menuserver.model.Dish;
import com.cicdlectures.menuserver.model.Menu;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenuDtoTest {


    @Test
    public void TestfromDto() {
        Menu menu = new Menu(Long.valueOf(1), "Christmas menu", new HashSet<>(Arrays.asList(new Dish(Long.valueOf(1), "Turkey", null), new Dish(Long.valueOf(2), "Pecan Pie", null))));

        MenuDto newMenu = new MenuDtoTest(Long.valueOf(1), "Christmas menu",
                new HashSet<DishDtoTest>(Arrays.asList(new DishDtoTest(Long.valueOf(1), "Turkey"), new DishDtoTest(Long.valueOf(2), "Pecan Pie"))));
        Menu menu2 =menu.fromDto(newMenu);
        assertEquals(menu.getName(), menu2.getName());

    }

}
