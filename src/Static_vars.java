class Parent {
    public static int objectCount=0;

}


public class Static_vars {
    public static void main(String[] args) {

        Parent p1=new Parent();
        Parent.objectCount++;
        Parent p2=new Parent();
        Parent.objectCount++;
        Parent p3=new Parent();


        System.out.println(Parent.objectCount);
        System.out.println(p3.objectCount);



    }
}
