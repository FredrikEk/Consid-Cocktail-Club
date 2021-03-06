package nu.drinkapp.core;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/*
 * The Step model. Stores the different steps of how to make a certain drink.
 */

@Entity @IdClass(DrinkStepId.class)
@NamedQueries({@NamedQuery(name="Step.deletAllByDrink", query="DELETE FROM Step s WHERE s.drink = :drink")})
public class Step implements Serializable, Comparable<Step> {
    
    @Column
    @Id
    private int stepNr;
    @Column
    private String description;
    @ManyToOne
    @Id
    private Drink drink;
    
    public Step(){
        this.description = "";
        this.stepNr = 0;
        this.drink = new Drink();
    }
    
    public Step(String description, int stepNr, Drink drink) {
        this.description = description;
        this.stepNr = stepNr;
        this.drink = drink;
    }
    
    public int getStepNr() {
        return stepNr;
    }
    
    public Drink getDrink() {
        return drink;
    }
    
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Ingredient{ stepNr=" + stepNr + ", description=" + description + '}';
    }

	@Override
	public int compareTo(Step s) {
		return Integer.compare(stepNr, s.stepNr);
	}
}
