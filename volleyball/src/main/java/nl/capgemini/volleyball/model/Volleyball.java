package nl.capgemini.volleyball.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Volleyball {

    @Id
    @GeneratedValue
    private int id;
    private double pressure;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
}
