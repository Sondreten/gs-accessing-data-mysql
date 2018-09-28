package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@JsonIgnoreProperties(ignoreUnknown = true)
public class FleetmonTemp {

    private int imonumber;

    private String etatime;

    private String nextport;

    public FleetmonTemp(){

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

}
