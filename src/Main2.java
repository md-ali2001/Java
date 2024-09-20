
class programming extends Thread{

    @Override
    public void run() {
        for(int i=0;i<5;i++)
            System.out.println("programming");
    }
};

class chatting extends Thread{

    @Override
    public void run() {
        for(int i=0;i<5;i++)
            System.out.println("chatting");
    }
};


public class Main2 {
    public static void main(String[] args) {

       programming pr=new programming();
       chatting ch=new chatting();
       pr.start();
       ch.start();


    }
}
