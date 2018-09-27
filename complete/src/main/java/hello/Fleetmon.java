package hello;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Fleetmon {

    @Column(name = "imonumber")
    private @Id @GeneratedValue int imonumber;

    @Column(name = "etatime")
    private String etatime;

    @Column(name = "nextport")
    private String nextport;

    public Fleetmon(){

    }

    public int getImonumber() {
        return imonumber;
    }

    public void setImonumber(int imonumber) {
        this.imonumber = imonumber;
    }

    public String getEtatime() {
        return etatime;
    }

    public void setEtatime(String etatime) {
        this.etatime = etatime;
    }

    public String getNextport() {
        return nextport;
    }

    public void setNextport(String nextport) {
        this.nextport = nextport;
    }

    @Override
    public String toString() {
        return "Fleetmon{" +
                " imonumber=" + imonumber + + '\'' +
                ", etatime=" + etatime +
                '}';
    }

}