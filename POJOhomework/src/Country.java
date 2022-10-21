public class Country {

    private String name;
    private int humans;
    private double kmdouble;
    private String capital;
    private boolean sea;

    public Country(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public int getHumans() {

        return humans;
    }

    public double getKmdouble() {
        return kmdouble;
    }

    public String getCapital() {

        return capital;
    }

    public boolean getSea() {

        return sea;
    }

    public void setName (String name) {

        this.name = name;
    }

    public void setHumans (int humans) {

        this.humans = humans;
    }
    public void setKmdouble (double kmdouble) {

        this.kmdouble = kmdouble;
    }
    public void setCapital (String capital) {

        this.capital = capital;
    }
    public void setSea (boolean sea) {

        this.sea = sea;
    }


}
