package hello;


import javax.persistence.*;

@Entity
public class Fleetmon {

    @Id
    @Column(name = "imonumber")
    private  int imonumber;

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


}