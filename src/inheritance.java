 class grandfather
{
private String name="ABC";

public void speak ()
{
    System.out.println("grandfather is speaking");
}


}

class father extends grandfather                           
{
private String name="ABC2";
// public void speak ()
// {
//     System.out.println("father is speaking");
// }
}

class child extends father
{
    private String name;
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
}

class child1 extends father
{
    private String name;
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
}

public class Main
{
	public static void main(String[] args) {
		
		child child1 = new child();
		System.out.println(child1.getName());  // null
	//	child1.speak();
		//System.out.println(child1.getName());
		child1.setName("Ali");
		System.out.println(child1.getName());   // ali
		
		
		child child2 = new child();
		System.out.println(child2.getName());   // null   child2 is in different memory
		
	}
	
}
