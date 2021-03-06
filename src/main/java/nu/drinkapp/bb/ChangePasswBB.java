package nu.drinkapp.bb;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

/**
 * The back bean of chaning password
 */

@Named
@RequestScoped
public class ChangePasswBB implements Serializable{

    @NotNull
    private String password;
    @NotNull
    private String newPassword;
    @NotNull
    private String confirmPassword;
    
    public void setPassword(String password){
        this.password = password;
    }
    public void setNewPassword(String newPassword){
        this.newPassword = newPassword;
    }
    public void setConfirmPassword(String confirmPassword){
        this.confirmPassword = confirmPassword;
    }
    public String getPassword(){
        return password;
    }
    public String getNewPassword(){
        return newPassword;
    }
    public String getConfirmPassword(){
        return confirmPassword;
    }
    public String getHashedPassword() {
        return BCrypt.hashpw(newPassword, BCrypt.gensalt());
    }
}
