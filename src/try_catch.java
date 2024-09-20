import java.util.Scanner;

public class try_catch {
    public static void main(String[] args){


        int arr[]={5,4,2,9};

        System.out.println(4/arr[2]);

        try {
            System.out.println(4 / arr[5]);
        }
        catch (Exception e)
        {
            assert System.out != null;
            System.out.print(e);
        }




    }
}
