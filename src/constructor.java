class complex{

    complex(int real,int imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;
    }

    complex addComplex(complex c1,complex c2){
        complex result=new complex(0,0);
        result.real=c1.real+c2.real;
        result.imaginary=c1.imaginary+c2.imaginary;
        return result;

    }

    void printNumber()
    {
        System.out.println(real+"+"+imaginary+"i");
    }
    public int real;
    public int imaginary;
}

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