import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

public class BurgerGetReceiptTest {

    @Test
    public void burgerGetReceiptTest01() {
        Burger burger = new Burger();
        Bun bun = new Bun("С повидлом", 48.4F);
        burger.setBuns(bun);
        burger.addIngredient(new Ingredient(IngredientType.SAUCE, "Оливковый", 54.3F));
        Assert.assertEquals(burger.getReceipt(), String.format("(==== %s ====)%n", bun.getName())
                + String.format("= %s %s =%n", IngredientType.SAUCE.toString().toLowerCase(), "Оливковый")
                + String.format("(==== %s ====)%n", bun.getName())
                + String.format("%nPrice: %f%n", burger.getPrice()));
    }

    @Test
    public void burgerGetReceiptTest02() {
        Burger burger = new Burger();
        Bun bun = new Bun("С маком", 48.4F);
        burger.setBuns(bun);
        burger.addIngredient(new Ingredient(IngredientType.FILLING, "Томатная", 40.2F));
        Assert.assertEquals(burger.getReceipt(), String.format("(==== %s ====)%n", bun.getName())
                + String.format("= %s %s =%n", IngredientType.FILLING.toString().toLowerCase(), "Томатная")
                + String.format("(==== %s ====)%n", bun.getName())
                + String.format("%nPrice: %f%n", burger.getPrice()));
    }

}
