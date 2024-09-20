

class phone{
    void turnOn(){
        System.out.println("turning on phone");
    }
};
interface camera{
    void takeSnap();
    void recordVideo();
}

interface music{
    void playmusic();
    void stopmusic();
}



class smartphone extends phone implements camera,music {

    @Override
    void turnOn(){
        System.out.println("turning on smartphone");
    }


    @Override
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video");

    }

    @Override
    public void playmusic() {
        System.out.println("Playing music");
    }

    @Override
    public void stopmusic() {
        System.out.println("Stopping music");
    }
};


public class Main {
    public static void main(String[] args) {

        smartphone sm=new smartphone();
        sm.playmusic();


        }
    }
