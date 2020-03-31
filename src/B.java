

public class B extends trafficLight{
    private int ID;
    private A a;
    private C c;

    public B(Boolean green, Boolean red, Boolean yellow, int ID) {
        super(green, red, yellow);
        this.ID = ID;
    }
    public void start(){
        if((getGreen() && !getRed() && !getYellow())||
                (!getGreen() && getRed() && !getYellow())||
                (!getGreen() && !getRed() && getYellow())){
            System.out.println("The lights B have successfully started!!");
        }else{
            System.out.println("KO!!");
        }
    }
    public void turnGreenOn(){
        turnOnGreen();
        a.turnOffGreen();
        c.turnOffGreen();
        System.out.println("B's green is turned on!!");
    }
    public void turnYellowOn(){
        turnOnYellow();
        System.out.println("B's yellow is turned on!!");
    }
    public void turnRedOn(){
        turnOnRed();
        a.turnOnGreen();
        c.turnOnGreen();
        System.out.println("B's Red is turned on!!");
    }
    public void turnGreenOff(){
        turnOnRed();
        a.turnOnGreen();
        c.turnOnGreen();
        System.out.println("B's green is turned off!!");
    }
    public void turnYellowOff(){
        turnOnRed();
        a.turnOnGreen();
        c.turnOnGreen();
        System.out.println("B's yellow is turned off!!");
    }
    public void turnRedOff(){
        turnOnGreen();
        a.turnOnRed();
        c.turnOnRed();
        System.out.println("B's Red is turned off!!");
    }
    @Override
    public String toString() {
        return "B{" +
                "ID=" + ID +
                "green" + getGreen() +
                "red" + getRed() +
                "yellow"+getYellow();
    }
    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }
}
