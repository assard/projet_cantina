package com.cicdlectures.menuserver.dto;

import com.cicdlectures.menuserver.model.Dish;
import com.cicdlectures.menuserver.model.Menu;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenuDtoTest {


    @Test
    public void TestfrommodelMenu() {
        Menu menu = new Menu(Long.valueOf(1), "Christmas menu", new HashSet<>(Arrays.asList(new Dish(Long.valueOf(1), "Turkey", null), new Dish(Long.valueOf(2), "Pecan Pie", null))));

        MenuDto newMenu = new MenuDto(Long.valueOf(1), "Christmas menu",
                new HashSet<DishDto>(Arrays.asList(new DishDto(Long.valueOf(1), "Turkey"), new DishDto(Long.valueOf(2), "Pecan Pie"))));
        MenuDto menudto  = newMenu.fromModel(menu);
        assertEquals(menudto.getName(), newMenu.getName());

    }

}
