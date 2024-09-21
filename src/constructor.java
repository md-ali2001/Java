public class constructor {

    public static void main(String[]args)
    {
        complex c1=new complex(2,4);
        complex c2=new complex(4,8);
        complex c3=new complex(0,0);
        c3=c3.addComplex(c1,c2);
c3.printNumber();

    }
}
;