import java.util.Scanner;

public class try_catch {
    public static void main(String[] args){


        int arr[]={5,4,2,9};

//        System.out.println(4/arr[2]);
//
//        try {
//            System.out.println(4 / arr[5]);
//        }
//        catch (Exception e)
//        {
//            assert System.out != null;
//            System.out.print(e);
//        }


        for(int i=0;i<5;i++)
        {
            try{
                System.out.println(13/arr[i]);

            } catch (Exception e) {
                break;
            }
            finally {
                System.out.println("breaking loop");
            }
        }




    }
}
