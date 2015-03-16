package nu.drinkapp.core;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import nu.drinkapp.core.DrinkIngredient;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-03-07T15:54:35")
@StaticMetamodel(Ingredient.class)
public class Ingredient_ { 

    public static volatile SingularAttribute<Ingredient, String> name;
    public static volatile ListAttribute<Ingredient, DrinkIngredient> drinks;

}