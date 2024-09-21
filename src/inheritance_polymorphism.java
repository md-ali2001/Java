
class Animal{

    public String nasal;
    Animal(String nasal)
    {
        this.nasal=nasal;
    }
    Animal()
    {

    }

    void showData()
    {
System.out.println("Nasal:"+nasal);
    }
}



class lion extends Animal{

    public int height;
    public String color;

    lion(){}
    lion(String nasal,int height,String color)
    {
        super(nasal);
        this.height=height;
        this.color=color;
    }


    void Eat()
    {
        System.out.println(nasal+" is eating");
    }

    void showData()
    {
        super.showData();
        System.out.println("height:"+height);
        System.out.println("color:"+color);
    }
}


public class inheritance_polymorphism {

    public static void main(String[] args)
    {
        lion l1=new lion("lion",7,"brown");
        l1.showData();
    }
}
