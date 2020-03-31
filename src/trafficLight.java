

public class trafficLight {

    private Boolean Green;
    private Boolean Red;
    private Boolean Yellow;

    public void turnOnGreen(){this.Green=true;this.Yellow=false;this.Red=false;}
    public void turnOnYellow(){this.Green=false;this.Yellow=true;this.Red=false;}
    public void turnOnRed(){this.Green=false;this.Yellow=false;this.Red=true;}

    public void turnOffGreen(){this.Green=false;this.Yellow=true;this.Red=false;}
    public void turnOffYellow(){this.Green=false;this.Yellow=false;this.Red=true;}
    public void turnOffRed(){this.Green=true;this.Yellow=false;this.Red=false;}

    public trafficLight(Boolean green, Boolean red, Boolean yellow) {
        Green = green;
        Red = red;
        Yellow = yellow;
    }

    public Boolean getGreen() {
        return Green;
    }

    public void setGreen(Boolean green) {
        Green = green;
    }

    public Boolean getRed() {
        return Red;
    }

    public void setRed(Boolean red) {
        Red = red;
    }

    public Boolean getYellow() {
        return Yellow;
    }

    public void setYellow(Boolean yellow) {
        Yellow = yellow;
    }
}
