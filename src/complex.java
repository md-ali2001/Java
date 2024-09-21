class complex {

    complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    complex addComplex(complex c1, complex c2) {
        complex result = new complex(0, 0);
        result.real = c1.real + c2.real;
        result.imaginary = c1.imaginary + c2.imaginary;
        return result;

    }

    void printNumber() {
        System.out.println(real + "+" + imaginary + "i");
    }

    public int real;
    public int imaginary;
}
