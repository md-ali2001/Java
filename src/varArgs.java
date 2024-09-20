

public class varArgs {

    static int add(int... arr)
    {
        int result=0;
        for (int a:arr)
            result+=a;
        return result;

    }
    public static void main(String[] args){

        System.out.println(add(9,0));
        System.out.println(add(9,0,2,1));
    };
}
