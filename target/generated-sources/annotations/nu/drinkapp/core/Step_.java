package nu.drinkapp.core;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import nu.drinkapp.core.Drink;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-03-07T15:54:35")
@StaticMetamodel(Step.class)
public class Step_ { 

    public static volatile SingularAttribute<Step, Integer> stepNr;
    public static volatile SingularAttribute<Step, String> description;
    public static volatile SingularAttribute<Step, Drink> drink;

}