import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.ArrayList;

@RunWith(MockitoJUnitRunner.class)
public class BurgerGetPriceTest {

    @Mock
    Bun bun;

    @Test
    public void burgerGetPriceEmptyTest() {
        Burger burger = new Burger();
        burger.setBuns(bun);
        Mockito.when(bun.getPrice()).thenReturn(14.5F);
        Assert.assertEquals(29F, burger.getPrice(), 0);
    }

    @Test
    public void burgerGetPriceWithDataTest() {
        Burger burger = new Burger();
        burger.setBuns(bun);
        Mockito.when(bun.getPrice()).thenReturn(14.5F);
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        burger.addIngredient(new Ingredient(IngredientType.FILLING, "Булочка с маком", 15.5F));
        Assert.assertEquals(44.5F, burger.getPrice(), 0);
    }

}
