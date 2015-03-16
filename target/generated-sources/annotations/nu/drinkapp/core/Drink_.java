package nu.drinkapp.core;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import nu.drinkapp.auth.User;
import nu.drinkapp.core.DrinkIngredient;
import nu.drinkapp.core.Step;
import nu.drinkapp.core.Type;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-03-07T15:54:35")
@StaticMetamodel(Drink.class)
public class Drink_ { 

    public static volatile ListAttribute<Drink, DrinkIngredient> ingredients;
    public static volatile SingularAttribute<Drink, String> drinkname;
    public static volatile ListAttribute<Drink, Step> steps;
    public static volatile ListAttribute<Drink, Type> types;
    public static volatile SingularAttribute<Drink, String> comment;
    public static volatile SingularAttribute<Drink, User> user;

}