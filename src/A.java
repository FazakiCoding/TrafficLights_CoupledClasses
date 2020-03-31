


public class A extends trafficLight{
    private int ID;
    private B b;
    private C c;



    public A(Boolean green, Boolean red, Boolean yellow, int ID) {
        super(green, red, yellow);
        this.ID = ID;
    }
    public void start(){
        if((getGreen() && !getRed() && !getYellow())||
        (!getGreen() && getRed() && !getYellow())||
                (!getGreen() && !getRed() && getYellow())){
            System.out.println("The lights A have successfully started!!");
        }
    }
    public void turnGreenOn(){
        turnOnGreen();
        b.turnOffGreen();
        c.turnOffGreen();
        System.out.println("A's green is turned on!!");
    }
    public void turnYellowOn(){
        turnOnYellow();
        System.out.println("A's yellow is turned on!!");
    }
    public void turnRedOn(){
        turnOnRed();
        b.turnOnGreen();
        c.turnOnGreen();
        System.out.println("A's Red is turned on!!");
    }
    public void turnGreenOff(){
        turnOnRed();
        b.turnOnGreen();
        c.turnOnGreen();
        System.out.println("A's green is turned off!!");
    }
    public void turnYellowOff(){
        turnOnRed();
        b.turnOnGreen();
        c.turnOnGreen();
        System.out.println("A's yellow is turned off!!");
    }
    public void turnRedOff(){
        turnOnGreen();
        b.turnOnRed();
        c.turnOnRed();
        System.out.println("A's Red is turned off!!");
    }
    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "A{" +
                "ID=" + ID +
                "green" + getGreen() +
                "red" + getRed() +
                "yellow"+getYellow();
    }
}
