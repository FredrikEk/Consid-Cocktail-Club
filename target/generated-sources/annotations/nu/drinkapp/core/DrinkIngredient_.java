package nu.drinkapp.core;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import nu.drinkapp.core.Drink;
import nu.drinkapp.core.Ingredient;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-03-07T15:54:36")
@StaticMetamodel(DrinkIngredient.class)
public class DrinkIngredient_ { 

    public static volatile SingularAttribute<DrinkIngredient, Drink> drink;
    public static volatile SingularAttribute<DrinkIngredient, Ingredient> ingredient;
    public static volatile SingularAttribute<DrinkIngredient, String> quantity;

}