

public class TestClass {
    public static void main(String[] args){

        System.out.println("Welcome to traffic light program");
        A a=new A(true,false,false,1);
        B b=new B(false,true,false,2);
        C c=new C(false,true,false,3);

        a.start();
        b.start();
        c.start();

        a.setB(b);
        a.setC(c);

        b.setA(a);
        b.setC(c);

        c.setA(a);
        c.setB(b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        a.turnGreenOff();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
