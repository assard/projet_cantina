package com.cicdlectures.menuserver.model;

import com.cicdlectures.menuserver.dto.DishDto;
import com.cicdlectures.menuserver.dto.MenuDto;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenuTest {

    @Test
    public void TestfromDto() {
        Menu menu = new Menu(Long.valueOf(1), "Christmas menu", new HashSet<>(Arrays.asList(new Dish(Long.valueOf(1), "Turkey", null), new Dish(Long.valueOf(2), "Pecan Pie", null))));

        MenuDto newMenu = new MenuDto(Long.valueOf(1), "Christmas menu",
                new HashSet<DishDto>(Arrays.asList(new DishDto(Long.valueOf(1), "Turkey"), new DishDto(Long.valueOf(2), "Pecan Pie"))));
        Menu menu2 =menu.fromDto(newMenu);
        assertEquals(menu.getName(), menu2.getName());

    }



}
