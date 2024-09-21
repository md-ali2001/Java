interface engine{
    void start();
    void stop();
    void repair();

    default void status() {
        System.out.println("engine testing");
    }
}


class car implements engine{

//    public void status() {
//System.out.println("car testing");
//    }


    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }


    @Override
    public void repair() {

    }
}


public class Interfaces {

    public static void main(String[] args)
    {
car c1=new car();
c1.status();
    }
}
