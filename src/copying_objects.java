

class complex2 {


    complex2(complex2 complx)
    {
        real=complx.real;
        imaginary=complx.imaginary;
    }
    complex2(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }



    void printNumber() {
        System.out.println(real + "+" + imaginary + "i");
    }

    public int real;
    public int imaginary;
}
public class copying_objects {
    public static void main(String[] args)
    {
        complex2 c4=new complex2(8,9);

        System.out.println("copying reference");
        complex2 c5=c4;

        
        c4.printNumber();
        c5.real=6;
        c4.printNumber();

        System.out.println("copy constructor");
        complex2 c9=new complex2(3,4);
        complex2 c10=new complex2(c9);
        c9.printNumber();
        c10.real=7;
        c9.printNumber();

    }
}
