package nu.drinkapp.core;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import nu.drinkapp.auth.User;
import nu.drinkapp.core.Drink;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-03-07T15:54:36")
@StaticMetamodel(Rating.class)
public class Rating_ { 

    public static volatile SingularAttribute<Rating, Drink> drink;
    public static volatile SingularAttribute<Rating, Integer> rating;
    public static volatile SingularAttribute<Rating, User> ratingUser;

}