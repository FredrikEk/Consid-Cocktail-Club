package nu.drinkapp.auth;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import nu.drinkapp.auth.Groups;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-03-07T15:54:35")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> username;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, String> password;
    public static volatile ListAttribute<User, Groups> groups;

}