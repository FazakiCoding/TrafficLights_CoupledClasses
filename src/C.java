

public class C extends trafficLight{
    private int ID;
    private A a;
    private B b;

    public C(Boolean green, Boolean red, Boolean yellow, int ID) {
        super(green, red, yellow);
        this.ID = ID;
    }
    public void start(){
        if((getGreen() && !getRed() && !getYellow())||
                (!getGreen() && getRed() && !getYellow())||
                (!getGreen() && !getRed() && getYellow())){
            System.out.println("The lights C have successfully started!!");
        }else{
            System.out.println("KO!!");
        }
    }
    public void turnGreenOn(){
        turnOnGreen();
        a.turnOffGreen();
        b.turnOffGreen();
        System.out.println("C's green is turned on!!");
    }
    public void turnYellowOn(){
        turnOnYellow();
        System.out.println("C's yellow is turned on!!");
    }
    public void turnRedOn(){
        turnOnRed();
        a.turnOnGreen();
        b.turnOnGreen();
        System.out.println("C's Red is turned on!!");
    }
    public void turnGreenOff(){
        turnOnRed();
        a.turnOnGreen();
        b.turnOnGreen();
        System.out.println("C's green is turned off!!");
    }
    public void turnYellowOff(){
        turnOnRed();
        a.turnOnGreen();
       b.turnOnGreen();
        System.out.println("C's yellow is turned off!!");
    }
    public void turnRedOff(){
        turnOnGreen();
        a.turnOnRed();
        b.turnOnRed();
        System.out.println("C's Red is turned off!!");
    }
    @Override
    public String toString() {
        return "C{" +
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

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
